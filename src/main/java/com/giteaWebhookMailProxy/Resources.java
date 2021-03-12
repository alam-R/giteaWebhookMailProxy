package com.giteaWebhookMailProxy;

import java.nio.charset.StandardCharsets;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Resources {
    private final Logger log = LoggerFactory.getLogger(Resources.class);

    @Autowired
    private JavaMailSender emailSender;

    @Value("${mail.recipients}")
    private String recipients;

    @Value("${mail.sender}")
    private String sender;

    /**
     * {@code POST  /webhooktomail} : map a post push webhook to mail
     *
     * @param PostBody the webhook post body
     */


    @PostMapping("/webhooktomail")
    public ResponseEntity webhooktomail(@RequestBody PostBody body) {

        if (body.getPusher() != null) {
            log.debug("Sending mail");

            StringBuilder shas = new StringBuilder("");
            
            body.getCommits().forEach(
                e-> shas.append(e.getId() + " " + e.getMessage())
            );
            String[] ref = body.getRef().split("/");
            
            String content = body.getPusher().getUsername() + " pushed to " + ref[ref.length-1] + " at " + body.getRepository().getName()+ " \r\n" +
            shas.toString();
            // Prepare message using a Spring helper
            final MimeMessage mimeMessage = emailSender.createMimeMessage();
            try {
                final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, false,
                        StandardCharsets.UTF_8.name());
                
                String[] recipientsArray = recipients.split(",");
                message.setFrom(sender);
                message.setSubject("Push event");
                message.setText(content);

                for (String r: recipientsArray) {           
                    log.debug("Sending mail to: "+r);
                    message.setTo(r);
                    emailSender.send(mimeMessage);
                }
                return ResponseEntity.ok().build();

            } catch (MailException | MessagingException e) {
                log.error(e.toString());
                log.error("Email could not be sent to user");
                return ResponseEntity.badRequest().body(e.toString());
            }
        }
        else {
            return ResponseEntity.badRequest().body("Only Push is supported at the moment");
        }
    }
}


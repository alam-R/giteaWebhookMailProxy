# giteaWebhookMailProxy

A java microservice which receives a push webhook from gitea and send it via mail.
Gitea will send a POST request when someone pushed in a branch of a repo.
This is received by giteaWebhookMailProxy and is forwarded as a mail to custom recipients (configured by application.properties).
giteaWebhookMailProxy assumes that mail service is configured and run localhost, port is configurable (configured by application.properties).

Mail format is fixed at the moment:
<user_pusher> pushed to <branch> at <repo> 
<sha> <message>
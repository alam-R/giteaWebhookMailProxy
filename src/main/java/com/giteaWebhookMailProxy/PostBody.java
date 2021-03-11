package com.giteaWebhookMailProxy;

import java.util.List;

public class PostBody {


    private String secret;
    private String ref;
    private String before;
    private String after;
    private String compare_url;
    private String head_commit;
    private List<Commit> commits;
    private Pusher pusher;
    private Repository repository;
    private Sender sender;

    

    @Override
    public String toString() {
        return "PostBody [after=" + after + ", before=" + before + ", commits=" + commits + ", compare_url="
                + compare_url + ", head_commit=" + head_commit + ", pusher=" + pusher + ", ref=" + ref + ", repository="
                + repository + ", secret=" + secret + ", sender=" + sender + "]";
    }



    public String getSecret() {
        return secret;
    }



    public void setSecret(String secret) {
        this.secret = secret;
    }



    public String getRef() {
        return ref;
    }



    public void setRef(String ref) {
        this.ref = ref;
    }



    public String getBefore() {
        return before;
    }



    public void setBefore(String before) {
        this.before = before;
    }



    public String getAfter() {
        return after;
    }



    public void setAfter(String after) {
        this.after = after;
    }



    public String getCompare_url() {
        return compare_url;
    }



    public void setCompare_url(String compare_url) {
        this.compare_url = compare_url;
    }



    public String getHead_commit() {
        return head_commit;
    }



    public void setHead_commit(String head_commit) {
        this.head_commit = head_commit;
    }



    public List<Commit> getCommits() {
        return commits;
    }



    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }



    public Pusher getPusher() {
        return pusher;
    }



    public void setPusher(Pusher pusher) {
        this.pusher = pusher;
    }



    public Repository getRepository() {
        return repository;
    }



    public void setRepository(Repository repository) {
        this.repository = repository;
    }



    public Sender getSender() {
        return sender;
    }



    public void setSender(Sender sender) {
        this.sender = sender;
    }


    

}

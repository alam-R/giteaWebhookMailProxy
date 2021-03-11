
package com.giteaWebhookMailProxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "message",
    "url",
    "author",
    "committer",
    "verification",
    "timestamp",
    "added",
    "removed",
    "modified"
})
public class Commit {

    @JsonProperty("id")
    private String id;
    @JsonProperty("message")
    private String message;
    @JsonProperty("url")
    private String url;
    @JsonProperty("author")
    private Author author;
    @JsonProperty("committer")
    private Committer committer;
    @JsonProperty("verification")
    private String verification;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("added")
    private List<String> added = null;
    @JsonProperty("removed")
    private List<String> removed = null;
    @JsonProperty("modified")
    private List<String> modified = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    @JsonProperty("committer")
    public Committer getCommitter() {
        return committer;
    }

    @JsonProperty("committer")
    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    @JsonProperty("verification")
    public Object getVerification() {
        return verification;
    }

    @JsonProperty("verification")
    public void setVerification(String verification) {
        this.verification = verification;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("added")
    public List<String> getAdded() {
        return added;
    }

    @JsonProperty("added")
    public void setAdded(List<String> added) {
        this.added = added;
    }

    @JsonProperty("removed")
    public List<String> getRemoved() {
        return removed;
    }

    @JsonProperty("removed")
    public void setRemoved(List<String> removed) {
        this.removed = removed;
    }

    @JsonProperty("modified")
    public List<String> getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(List<String> modified) {
        this.modified = modified;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

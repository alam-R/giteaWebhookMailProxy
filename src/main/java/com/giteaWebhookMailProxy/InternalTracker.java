
package com.giteaWebhookMailProxy;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enable_time_tracker",
    "allow_only_contributors_to_track_time",
    "enable_issue_dependencies"
})
public class InternalTracker {

    @JsonProperty("enable_time_tracker")
    private Boolean enableTimeTracker;
    @JsonProperty("allow_only_contributors_to_track_time")
    private Boolean allowOnlyContributorsToTrackTime;
    @JsonProperty("enable_issue_dependencies")
    private Boolean enableIssueDependencies;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("enable_time_tracker")
    public Boolean getEnableTimeTracker() {
        return enableTimeTracker;
    }

    @JsonProperty("enable_time_tracker")
    public void setEnableTimeTracker(Boolean enableTimeTracker) {
        this.enableTimeTracker = enableTimeTracker;
    }

    @JsonProperty("allow_only_contributors_to_track_time")
    public Boolean getAllowOnlyContributorsToTrackTime() {
        return allowOnlyContributorsToTrackTime;
    }

    @JsonProperty("allow_only_contributors_to_track_time")
    public void setAllowOnlyContributorsToTrackTime(Boolean allowOnlyContributorsToTrackTime) {
        this.allowOnlyContributorsToTrackTime = allowOnlyContributorsToTrackTime;
    }

    @JsonProperty("enable_issue_dependencies")
    public Boolean getEnableIssueDependencies() {
        return enableIssueDependencies;
    }

    @JsonProperty("enable_issue_dependencies")
    public void setEnableIssueDependencies(Boolean enableIssueDependencies) {
        this.enableIssueDependencies = enableIssueDependencies;
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

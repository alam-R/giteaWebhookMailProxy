
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
    "id",
    "owner",
    "name",
    "full_name",
    "description",
    "empty",
    "private",
    "fork",
    "template",
    "parent",
    "mirror",
    "size",
    "html_url",
    "ssh_url",
    "clone_url",
    "original_url",
    "website",
    "stars_count",
    "forks_count",
    "watchers_count",
    "open_issues_count",
    "open_pr_counter",
    "release_counter",
    "default_branch",
    "archived",
    "created_at",
    "updated_at",
    "permissions",
    "has_issues",
    "internal_tracker",
    "has_wiki",
    "has_pull_requests",
    "has_projects",
    "ignore_whitespace_conflicts",
    "allow_merge_commits",
    "allow_rebase",
    "allow_rebase_explicit",
    "allow_squash_merge",
    "avatar_url",
    "internal"
})
public class Repository {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("empty")
    private Boolean empty;
    @JsonProperty("private")
    private Boolean _private;
    @JsonProperty("fork")
    private Boolean fork;
    @JsonProperty("template")
    private Boolean template;
    @JsonProperty("parent")
    private Object parent;
    @JsonProperty("mirror")
    private Boolean mirror;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("ssh_url")
    private String sshUrl;
    @JsonProperty("clone_url")
    private String cloneUrl;
    @JsonProperty("original_url")
    private String originalUrl;
    @JsonProperty("website")
    private String website;
    @JsonProperty("stars_count")
    private Integer starsCount;
    @JsonProperty("forks_count")
    private Integer forksCount;
    @JsonProperty("watchers_count")
    private Integer watchersCount;
    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;
    @JsonProperty("open_pr_counter")
    private Integer openPrCounter;
    @JsonProperty("release_counter")
    private Integer releaseCounter;
    @JsonProperty("default_branch")
    private String defaultBranch;
    @JsonProperty("archived")
    private Boolean archived;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("permissions")
    private Permissions permissions;
    @JsonProperty("has_issues")
    private Boolean hasIssues;
    @JsonProperty("internal_tracker")
    private InternalTracker internalTracker;
    @JsonProperty("has_wiki")
    private Boolean hasWiki;
    @JsonProperty("has_pull_requests")
    private Boolean hasPullRequests;
    @JsonProperty("has_projects")
    private Boolean hasProjects;
    @JsonProperty("ignore_whitespace_conflicts")
    private Boolean ignoreWhitespaceConflicts;
    @JsonProperty("allow_merge_commits")
    private Boolean allowMergeCommits;
    @JsonProperty("allow_rebase")
    private Boolean allowRebase;
    @JsonProperty("allow_rebase_explicit")
    private Boolean allowRebaseExplicit;
    @JsonProperty("allow_squash_merge")
    private Boolean allowSquashMerge;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("internal")
    private Boolean internal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("empty")
    public Boolean getEmpty() {
        return empty;
    }

    @JsonProperty("empty")
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    @JsonProperty("private")
    public Boolean getPrivate() {
        return _private;
    }

    @JsonProperty("private")
    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    @JsonProperty("fork")
    public Boolean getFork() {
        return fork;
    }

    @JsonProperty("fork")
    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    @JsonProperty("template")
    public Boolean getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(Boolean template) {
        this.template = template;
    }

    @JsonProperty("parent")
    public Object getParent() {
        return parent;
    }

    @JsonProperty("parent")
    public void setParent(Object parent) {
        this.parent = parent;
    }

    @JsonProperty("mirror")
    public Boolean getMirror() {
        return mirror;
    }

    @JsonProperty("mirror")
    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("ssh_url")
    public String getSshUrl() {
        return sshUrl;
    }

    @JsonProperty("ssh_url")
    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    @JsonProperty("clone_url")
    public String getCloneUrl() {
        return cloneUrl;
    }

    @JsonProperty("clone_url")
    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    @JsonProperty("original_url")
    public String getOriginalUrl() {
        return originalUrl;
    }

    @JsonProperty("original_url")
    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("stars_count")
    public Integer getStarsCount() {
        return starsCount;
    }

    @JsonProperty("stars_count")
    public void setStarsCount(Integer starsCount) {
        this.starsCount = starsCount;
    }

    @JsonProperty("forks_count")
    public Integer getForksCount() {
        return forksCount;
    }

    @JsonProperty("forks_count")
    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    @JsonProperty("watchers_count")
    public Integer getWatchersCount() {
        return watchersCount;
    }

    @JsonProperty("watchers_count")
    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    @JsonProperty("open_issues_count")
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    @JsonProperty("open_issues_count")
    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    @JsonProperty("open_pr_counter")
    public Integer getOpenPrCounter() {
        return openPrCounter;
    }

    @JsonProperty("open_pr_counter")
    public void setOpenPrCounter(Integer openPrCounter) {
        this.openPrCounter = openPrCounter;
    }

    @JsonProperty("release_counter")
    public Integer getReleaseCounter() {
        return releaseCounter;
    }

    @JsonProperty("release_counter")
    public void setReleaseCounter(Integer releaseCounter) {
        this.releaseCounter = releaseCounter;
    }

    @JsonProperty("default_branch")
    public String getDefaultBranch() {
        return defaultBranch;
    }

    @JsonProperty("default_branch")
    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("has_issues")
    public Boolean getHasIssues() {
        return hasIssues;
    }

    @JsonProperty("has_issues")
    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    @JsonProperty("internal_tracker")
    public InternalTracker getInternalTracker() {
        return internalTracker;
    }

    @JsonProperty("internal_tracker")
    public void setInternalTracker(InternalTracker internalTracker) {
        this.internalTracker = internalTracker;
    }

    @JsonProperty("has_wiki")
    public Boolean getHasWiki() {
        return hasWiki;
    }

    @JsonProperty("has_wiki")
    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    @JsonProperty("has_pull_requests")
    public Boolean getHasPullRequests() {
        return hasPullRequests;
    }

    @JsonProperty("has_pull_requests")
    public void setHasPullRequests(Boolean hasPullRequests) {
        this.hasPullRequests = hasPullRequests;
    }

    @JsonProperty("has_projects")
    public Boolean getHasProjects() {
        return hasProjects;
    }

    @JsonProperty("has_projects")
    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    @JsonProperty("ignore_whitespace_conflicts")
    public Boolean getIgnoreWhitespaceConflicts() {
        return ignoreWhitespaceConflicts;
    }

    @JsonProperty("ignore_whitespace_conflicts")
    public void setIgnoreWhitespaceConflicts(Boolean ignoreWhitespaceConflicts) {
        this.ignoreWhitespaceConflicts = ignoreWhitespaceConflicts;
    }

    @JsonProperty("allow_merge_commits")
    public Boolean getAllowMergeCommits() {
        return allowMergeCommits;
    }

    @JsonProperty("allow_merge_commits")
    public void setAllowMergeCommits(Boolean allowMergeCommits) {
        this.allowMergeCommits = allowMergeCommits;
    }

    @JsonProperty("allow_rebase")
    public Boolean getAllowRebase() {
        return allowRebase;
    }

    @JsonProperty("allow_rebase")
    public void setAllowRebase(Boolean allowRebase) {
        this.allowRebase = allowRebase;
    }

    @JsonProperty("allow_rebase_explicit")
    public Boolean getAllowRebaseExplicit() {
        return allowRebaseExplicit;
    }

    @JsonProperty("allow_rebase_explicit")
    public void setAllowRebaseExplicit(Boolean allowRebaseExplicit) {
        this.allowRebaseExplicit = allowRebaseExplicit;
    }

    @JsonProperty("allow_squash_merge")
    public Boolean getAllowSquashMerge() {
        return allowSquashMerge;
    }

    @JsonProperty("allow_squash_merge")
    public void setAllowSquashMerge(Boolean allowSquashMerge) {
        this.allowSquashMerge = allowSquashMerge;
    }

    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonProperty("internal")
    public Boolean getInternal() {
        return internal;
    }

    @JsonProperty("internal")
    public void setInternal(Boolean internal) {
        this.internal = internal;
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

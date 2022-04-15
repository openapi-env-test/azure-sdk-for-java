package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Deployment metadata. */
@Fluent
public final class Deployment {
    /*
     * The deployment identifier.
     */
    @JsonProperty(value = "deploymentId", required = true)
    private String deploymentId;

    /*
     * The deployment start datetime.
     */
    @JsonProperty(value = "startDateTime", required = true)
    private OffsetDateTime startDateTime;

    /*
     * Update identity.
     */
    @JsonProperty(value = "updateId", required = true)
    private UpdateId updateId;

    /*
     * The group identity
     */
    @JsonProperty(value = "groupId", required = true)
    private String groupId;

    /*
     * Boolean flag indicating whether the deployment was canceled.
     */
    @JsonProperty(value = "isCanceled")
    private Boolean isCanceled;

    /*
     * Boolean flag indicating whether the deployment has been retried.
     */
    @JsonProperty(value = "isRetried")
    private Boolean isRetried;

    /**
     * Get the deploymentId property: The deployment identifier.
     *
     * @return the deploymentId value.
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * Set the deploymentId property: The deployment identifier.
     *
     * @param deploymentId the deploymentId value to set.
     * @return the Deployment object itself.
     */
    public Deployment setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Get the startDateTime property: The deployment start datetime.
     *
     * @return the startDateTime value.
     */
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * Set the startDateTime property: The deployment start datetime.
     *
     * @param startDateTime the startDateTime value to set.
     * @return the Deployment object itself.
     */
    public Deployment setStartDateTime(OffsetDateTime startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Get the updateId property: Update identity.
     *
     * @return the updateId value.
     */
    public UpdateId getUpdateId() {
        return this.updateId;
    }

    /**
     * Set the updateId property: Update identity.
     *
     * @param updateId the updateId value to set.
     * @return the Deployment object itself.
     */
    public Deployment setUpdateId(UpdateId updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * Get the groupId property: The group identity.
     *
     * @return the groupId value.
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The group identity.
     *
     * @param groupId the groupId value to set.
     * @return the Deployment object itself.
     */
    public Deployment setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the isCanceled property: Boolean flag indicating whether the deployment was canceled.
     *
     * @return the isCanceled value.
     */
    public Boolean isCanceled() {
        return this.isCanceled;
    }

    /**
     * Set the isCanceled property: Boolean flag indicating whether the deployment was canceled.
     *
     * @param isCanceled the isCanceled value to set.
     * @return the Deployment object itself.
     */
    public Deployment setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
        return this;
    }

    /**
     * Get the isRetried property: Boolean flag indicating whether the deployment has been retried.
     *
     * @return the isRetried value.
     */
    public Boolean isRetried() {
        return this.isRetried;
    }

    /**
     * Set the isRetried property: Boolean flag indicating whether the deployment has been retried.
     *
     * @param isRetried the isRetried value to set.
     * @return the Deployment object itself.
     */
    public Deployment setIsRetried(Boolean isRetried) {
        this.isRetried = isRetried;
        return this;
    }
}

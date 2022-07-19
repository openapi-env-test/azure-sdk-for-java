// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Network Manager Deployment Status. */
@Fluent
public final class NetworkManagerDeploymentStatus {
    /*
     * Commit Time.
     */
    @JsonProperty(value = "commitTime")
    private OffsetDateTime commitTime;

    /*
     * Region Name.
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * Deployment Status.
     */
    @JsonProperty(value = "deploymentStatus")
    private DeploymentStatus deploymentStatus;

    /*
     * List of configuration ids.
     */
    @JsonProperty(value = "configurationIds")
    private List<String> configurationIds;

    /*
     * Configuration Deployment Type.
     */
    @JsonProperty(value = "deploymentType")
    private ConfigurationType deploymentType;

    /*
     * Error Message.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get the commitTime property: Commit Time.
     *
     * @return the commitTime value.
     */
    public OffsetDateTime commitTime() {
        return this.commitTime;
    }

    /**
     * Set the commitTime property: Commit Time.
     *
     * @param commitTime the commitTime value to set.
     * @return the NetworkManagerDeploymentStatus object itself.
     */
    public NetworkManagerDeploymentStatus withCommitTime(OffsetDateTime commitTime) {
        this.commitTime = commitTime;
        return this;
    }

    /**
     * Get the region property: Region Name.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Region Name.
     *
     * @param region the region value to set.
     * @return the NetworkManagerDeploymentStatus object itself.
     */
    public NetworkManagerDeploymentStatus withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the deploymentStatus property: Deployment Status.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Set the deploymentStatus property: Deployment Status.
     *
     * @param deploymentStatus the deploymentStatus value to set.
     * @return the NetworkManagerDeploymentStatus object itself.
     */
    public NetworkManagerDeploymentStatus withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * Get the configurationIds property: List of configuration ids.
     *
     * @return the configurationIds value.
     */
    public List<String> configurationIds() {
        return this.configurationIds;
    }

    /**
     * Set the configurationIds property: List of configuration ids.
     *
     * @param configurationIds the configurationIds value to set.
     * @return the NetworkManagerDeploymentStatus object itself.
     */
    public NetworkManagerDeploymentStatus withConfigurationIds(List<String> configurationIds) {
        this.configurationIds = configurationIds;
        return this;
    }

    /**
     * Get the deploymentType property: Configuration Deployment Type.
     *
     * @return the deploymentType value.
     */
    public ConfigurationType deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: Configuration Deployment Type.
     *
     * @param deploymentType the deploymentType value to set.
     * @return the NetworkManagerDeploymentStatus object itself.
     */
    public NetworkManagerDeploymentStatus withDeploymentType(ConfigurationType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the errorMessage property: Error Message.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: Error Message.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the NetworkManagerDeploymentStatus object itself.
     */
    public NetworkManagerDeploymentStatus withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

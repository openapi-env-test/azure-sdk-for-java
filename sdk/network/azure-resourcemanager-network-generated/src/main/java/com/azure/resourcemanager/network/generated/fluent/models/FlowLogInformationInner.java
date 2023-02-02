// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.generated.models.RetentionPolicyParameters;
import com.azure.resourcemanager.network.generated.models.TrafficAnalyticsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information on the configuration of flow log and traffic analytics (optional) . */
@Fluent
public final class FlowLogInformationInner {
    /*
     * The ID of the resource to configure for flow log and traffic analytics (optional) .
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * Properties of the flow log.
     */
    @JsonProperty(value = "properties", required = true)
    private FlowLogProperties innerProperties = new FlowLogProperties();

    /*
     * Parameters that define the configuration of traffic analytics.
     */
    @JsonProperty(value = "flowAnalyticsConfiguration")
    private TrafficAnalyticsProperties flowAnalyticsConfiguration;

    /** Creates an instance of FlowLogInformationInner class. */
    public FlowLogInformationInner() {
    }

    /**
     * Get the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the resource to configure for flow log and traffic analytics
     * (optional) .
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the flow log.
     *
     * @return the innerProperties value.
     */
    private FlowLogProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @return the flowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.flowAnalyticsConfiguration;
    }

    /**
     * Set the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @param flowAnalyticsConfiguration the flowAnalyticsConfiguration value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFlowAnalyticsConfiguration(
        TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        this.flowAnalyticsConfiguration = flowAnalyticsConfiguration;
        return this;
    }

    /**
     * Get the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageId();
    }

    /**
     * Set the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withStorageId(String storageId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withStorageId(storageId);
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable flow logging.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.innerProperties() == null ? false : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withEnabled(boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionPolicy();
    }

    /**
     * Set the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withRetentionPolicy(retentionPolicy);
        return this;
    }

    /**
     * Get the format property: Parameters that define the flow log format.
     *
     * @return the format value.
     */
    public FlowLogFormatParameters format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Set the format property: Parameters that define the flow log format.
     *
     * @param format the format value to set.
     * @return the FlowLogInformationInner object itself.
     */
    public FlowLogInformationInner withFormat(FlowLogFormatParameters format) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogProperties();
        }
        this.innerProperties().withFormat(format);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model FlowLogInformationInner"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model FlowLogInformationInner"));
        } else {
            innerProperties().validate();
        }
        if (flowAnalyticsConfiguration() != null) {
            flowAnalyticsConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FlowLogInformationInner.class);
}

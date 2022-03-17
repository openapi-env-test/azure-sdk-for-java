// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.generated.models.RetentionPolicyParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the configuration of flow log. */
@Fluent
public final class FlowLogProperties {
    /*
     * ID of the storage account which is used to store the flow log.
     */
    @JsonProperty(value = "storageId", required = true)
    private String storageId;

    /*
     * Flag to enable/disable flow logging.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * Parameters that define the retention policy for flow log.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicyParameters retentionPolicy;

    /*
     * Parameters that define the flow log format.
     */
    @JsonProperty(value = "format")
    private FlowLogFormatParameters format;

    /**
     * Get the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set.
     * @return the FlowLogProperties object itself.
     */
    public FlowLogProperties withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable flow logging.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set.
     * @return the FlowLogProperties object itself.
     */
    public FlowLogProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the FlowLogProperties object itself.
     */
    public FlowLogProperties withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Get the format property: Parameters that define the flow log format.
     *
     * @return the format value.
     */
    public FlowLogFormatParameters format() {
        return this.format;
    }

    /**
     * Set the format property: Parameters that define the flow log format.
     *
     * @param format the format value to set.
     * @return the FlowLogProperties object itself.
     */
    public FlowLogProperties withFormat(FlowLogFormatParameters format) {
        this.format = format;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property storageId in model FlowLogProperties"));
        }
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
        if (format() != null) {
            format().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FlowLogProperties.class);
}

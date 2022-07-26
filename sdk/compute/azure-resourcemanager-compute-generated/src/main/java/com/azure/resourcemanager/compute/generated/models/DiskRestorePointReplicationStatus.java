// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The instance view of a disk restore point. */
@Fluent
public final class DiskRestorePointReplicationStatus {
    /*
     * The resource status information.
     */
    @JsonProperty(value = "status")
    private InstanceViewStatus status;

    /*
     * Replication completion percentage.
     */
    @JsonProperty(value = "completionPercent")
    private Integer completionPercent;

    /**
     * Get the status property: The resource status information.
     *
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The resource status information.
     *
     * @param status the status value to set.
     * @return the DiskRestorePointReplicationStatus object itself.
     */
    public DiskRestorePointReplicationStatus withStatus(InstanceViewStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the completionPercent property: Replication completion percentage.
     *
     * @return the completionPercent value.
     */
    public Integer completionPercent() {
        return this.completionPercent;
    }

    /**
     * Set the completionPercent property: Replication completion percentage.
     *
     * @param completionPercent the completionPercent value to set.
     * @return the DiskRestorePointReplicationStatus object itself.
     */
    public DiskRestorePointReplicationStatus withCompletionPercent(Integer completionPercent) {
        this.completionPercent = completionPercent;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() != null) {
            status().validate();
        }
    }
}

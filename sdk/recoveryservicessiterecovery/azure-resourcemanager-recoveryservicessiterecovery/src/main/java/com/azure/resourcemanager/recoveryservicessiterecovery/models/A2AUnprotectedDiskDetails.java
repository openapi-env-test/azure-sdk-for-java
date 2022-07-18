// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A2A unprotected disk details. */
@Fluent
public final class A2AUnprotectedDiskDetails {
    /*
     * The source lun Id for the data disk.
     */
    @JsonProperty(value = "diskLunId")
    private Integer diskLunId;

    /*
     * A value indicating whether the disk auto protection is enabled.
     */
    @JsonProperty(value = "diskAutoProtectionStatus")
    private AutoProtectionOfDataDisk diskAutoProtectionStatus;

    /**
     * Get the diskLunId property: The source lun Id for the data disk.
     *
     * @return the diskLunId value.
     */
    public Integer diskLunId() {
        return this.diskLunId;
    }

    /**
     * Set the diskLunId property: The source lun Id for the data disk.
     *
     * @param diskLunId the diskLunId value to set.
     * @return the A2AUnprotectedDiskDetails object itself.
     */
    public A2AUnprotectedDiskDetails withDiskLunId(Integer diskLunId) {
        this.diskLunId = diskLunId;
        return this;
    }

    /**
     * Get the diskAutoProtectionStatus property: A value indicating whether the disk auto protection is enabled.
     *
     * @return the diskAutoProtectionStatus value.
     */
    public AutoProtectionOfDataDisk diskAutoProtectionStatus() {
        return this.diskAutoProtectionStatus;
    }

    /**
     * Set the diskAutoProtectionStatus property: A value indicating whether the disk auto protection is enabled.
     *
     * @param diskAutoProtectionStatus the diskAutoProtectionStatus value to set.
     * @return the A2AUnprotectedDiskDetails object itself.
     */
    public A2AUnprotectedDiskDetails withDiskAutoProtectionStatus(AutoProtectionOfDataDisk diskAutoProtectionStatus) {
        this.diskAutoProtectionStatus = diskAutoProtectionStatus;
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

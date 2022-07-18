// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Agent disk details. */
@Immutable
public final class AgentDiskDetails {
    /*
     * The disk Id.
     */
    @JsonProperty(value = "diskId", access = JsonProperty.Access.WRITE_ONLY)
    private String diskId;

    /*
     * The disk name.
     */
    @JsonProperty(value = "diskName", access = JsonProperty.Access.WRITE_ONLY)
    private String diskName;

    /*
     * A value indicating whether the disk is the OS disk.
     */
    @JsonProperty(value = "isOSDisk", access = JsonProperty.Access.WRITE_ONLY)
    private String isOSDisk;

    /*
     * The disk capacity in bytes.
     */
    @JsonProperty(value = "capacityInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long capacityInBytes;

    /*
     * The lun of disk.
     */
    @JsonProperty(value = "lunId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lunId;

    /**
     * Get the diskId property: The disk Id.
     *
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Get the diskName property: The disk name.
     *
     * @return the diskName value.
     */
    public String diskName() {
        return this.diskName;
    }

    /**
     * Get the isOSDisk property: A value indicating whether the disk is the OS disk.
     *
     * @return the isOSDisk value.
     */
    public String isOSDisk() {
        return this.isOSDisk;
    }

    /**
     * Get the capacityInBytes property: The disk capacity in bytes.
     *
     * @return the capacityInBytes value.
     */
    public Long capacityInBytes() {
        return this.capacityInBytes;
    }

    /**
     * Get the lunId property: The lun of disk.
     *
     * @return the lunId value.
     */
    public Integer lunId() {
        return this.lunId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

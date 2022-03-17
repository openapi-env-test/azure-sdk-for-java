// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataBox Disk Copy Progress. */
@Immutable
public final class DataBoxDiskCopyProgress {
    /*
     * The serial number of the disk
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /*
     * Bytes copied during the copy of disk.
     */
    @JsonProperty(value = "bytesCopied", access = JsonProperty.Access.WRITE_ONLY)
    private Long bytesCopied;

    /*
     * Indicates the percentage completed for the copy of the disk.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /*
     * The Status of the copy
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CopyStatus status;

    /**
     * Get the serialNumber property: The serial number of the disk.
     *
     * @return the serialNumber value.
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the bytesCopied property: Bytes copied during the copy of disk.
     *
     * @return the bytesCopied value.
     */
    public Long bytesCopied() {
        return this.bytesCopied;
    }

    /**
     * Get the percentComplete property: Indicates the percentage completed for the copy of the disk.
     *
     * @return the percentComplete value.
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the status property: The Status of the copy.
     *
     * @return the status value.
     */
    public CopyStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

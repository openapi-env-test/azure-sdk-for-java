// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This is the disk image encryption base class. */
@Fluent
public class DiskImageEncryption {
    /*
     * A relative URI containing the resource ID of the disk encryption set.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /**
     * Get the diskEncryptionSetId property: A relative URI containing the resource ID of the disk encryption set.
     *
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: A relative URI containing the resource ID of the disk encryption set.
     *
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the DiskImageEncryption object itself.
     */
    public DiskImageEncryption withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for the service task to upload an OCI driver. */
@Fluent
public final class UploadOciDriverTaskInput {
    /*
     * File share information for the OCI driver archive.
     */
    @JsonProperty(value = "driverShare")
    private FileShare driverShare;

    /** Creates an instance of UploadOciDriverTaskInput class. */
    public UploadOciDriverTaskInput() {
    }

    /**
     * Get the driverShare property: File share information for the OCI driver archive.
     *
     * @return the driverShare value.
     */
    public FileShare driverShare() {
        return this.driverShare;
    }

    /**
     * Set the driverShare property: File share information for the OCI driver archive.
     *
     * @param driverShare the driverShare value to set.
     * @return the UploadOciDriverTaskInput object itself.
     */
    public UploadOciDriverTaskInput withDriverShare(FileShare driverShare) {
        this.driverShare = driverShare;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (driverShare() != null) {
            driverShare().validate();
        }
    }
}

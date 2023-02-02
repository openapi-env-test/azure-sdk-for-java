// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output for the service task to upload an OCI driver. */
@Immutable
public final class UploadOciDriverTaskOutput {
    /*
     * The name of the driver package that was validated and uploaded.
     */
    @JsonProperty(value = "driverPackageName", access = JsonProperty.Access.WRITE_ONLY)
    private String driverPackageName;

    /*
     * Validation errors
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /** Creates an instance of UploadOciDriverTaskOutput class. */
    public UploadOciDriverTaskOutput() {
    }

    /**
     * Get the driverPackageName property: The name of the driver package that was validated and uploaded.
     *
     * @return the driverPackageName value.
     */
    public String driverPackageName() {
        return this.driverPackageName;
    }

    /**
     * Get the validationErrors property: Validation errors.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}

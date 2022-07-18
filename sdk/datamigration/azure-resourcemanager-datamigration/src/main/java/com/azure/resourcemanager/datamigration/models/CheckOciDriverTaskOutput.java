// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output for the service task to check for OCI drivers. */
@Fluent
public final class CheckOciDriverTaskOutput {
    /*
     * Information about the installed driver if found and valid.
     */
    @JsonProperty(value = "installedDriver")
    private OracleOciDriverInfo installedDriver;

    /*
     * Validation errors
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get the installedDriver property: Information about the installed driver if found and valid.
     *
     * @return the installedDriver value.
     */
    public OracleOciDriverInfo installedDriver() {
        return this.installedDriver;
    }

    /**
     * Set the installedDriver property: Information about the installed driver if found and valid.
     *
     * @param installedDriver the installedDriver value to set.
     * @return the CheckOciDriverTaskOutput object itself.
     */
    public CheckOciDriverTaskOutput withInstalledDriver(OracleOciDriverInfo installedDriver) {
        this.installedDriver = installedDriver;
        return this;
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
        if (installedDriver() != null) {
            installedDriver().validate();
        }
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}

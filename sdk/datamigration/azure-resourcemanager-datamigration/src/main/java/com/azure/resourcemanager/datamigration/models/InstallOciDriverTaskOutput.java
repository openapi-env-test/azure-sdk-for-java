// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output for the service task to install an OCI driver. */
@Immutable
public final class InstallOciDriverTaskOutput {
    /*
     * Validation errors
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /** Creates an instance of InstallOciDriverTaskOutput class. */
    public InstallOciDriverTaskOutput() {
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

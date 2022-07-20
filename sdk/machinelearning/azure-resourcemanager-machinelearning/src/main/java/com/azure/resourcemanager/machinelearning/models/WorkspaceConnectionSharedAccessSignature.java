// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkspaceConnectionSharedAccessSignature model. */
@Fluent
public final class WorkspaceConnectionSharedAccessSignature {
    /*
     * The sas property.
     */
    @JsonProperty(value = "sas")
    private String sas;

    /**
     * Get the sas property: The sas property.
     *
     * @return the sas value.
     */
    public String sas() {
        return this.sas;
    }

    /**
     * Set the sas property: The sas property.
     *
     * @param sas the sas value to set.
     * @return the WorkspaceConnectionSharedAccessSignature object itself.
     */
    public WorkspaceConnectionSharedAccessSignature withSas(String sas) {
        this.sas = sas;
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

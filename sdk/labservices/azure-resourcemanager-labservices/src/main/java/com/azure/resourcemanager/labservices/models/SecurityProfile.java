// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The lab security profile. */
@Fluent
public final class SecurityProfile {
    /*
     * The registration code for the lab.
     */
    @JsonProperty(value = "registrationCode", access = JsonProperty.Access.WRITE_ONLY)
    private String registrationCode;

    /*
     * Whether any user or only specified users can register to a lab.
     */
    @JsonProperty(value = "openAccess")
    private EnableState openAccess;

    /**
     * Get the registrationCode property: The registration code for the lab.
     *
     * @return the registrationCode value.
     */
    public String registrationCode() {
        return this.registrationCode;
    }

    /**
     * Get the openAccess property: Whether any user or only specified users can register to a lab.
     *
     * @return the openAccess value.
     */
    public EnableState openAccess() {
        return this.openAccess;
    }

    /**
     * Set the openAccess property: Whether any user or only specified users can register to a lab.
     *
     * @param openAccess the openAccess value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withOpenAccess(EnableState openAccess) {
        this.openAccess = openAccess;
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

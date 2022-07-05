// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.adp.models.CheckNameAvailabilityReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The checkNameAvailability operation response. */
@Immutable
public final class CheckNameAvailabilityResultInner {
    /*
     * Gets a boolean value that indicates whether the name is available for
     * you to use. If true, the name is available. If false, the name has
     * already been taken or is invalid and cannot be used
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * Gets the reason that an account name could not be used. The reason
     * element is only returned if nameAvailable is false
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private CheckNameAvailabilityReason reason;

    /*
     * Gets an error message explaining the reason value in more detail
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the nameAvailable property: Gets a boolean value that indicates whether the name is available for you to use.
     * If true, the name is available. If false, the name has already been taken or is invalid and cannot be used.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason property: Gets the reason that an account name could not be used. The reason element is only
     * returned if nameAvailable is false.
     *
     * @return the reason value.
     */
    public CheckNameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Get the message property: Gets an error message explaining the reason value in more detail.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

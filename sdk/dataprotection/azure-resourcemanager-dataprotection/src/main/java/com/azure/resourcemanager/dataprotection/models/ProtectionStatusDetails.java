// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ProtectionStatusDetails Protection status details. */
@Fluent
public final class ProtectionStatusDetails {
    /*
     * Specifies the protection status error of the resource
     */
    @JsonProperty(value = "errorDetails")
    private UserFacingError errorDetails;

    /*
     * Specifies the protection status of the resource
     */
    @JsonProperty(value = "status")
    private Status status;

    /**
     * Get the errorDetails property: Specifies the protection status error of the resource.
     *
     * @return the errorDetails value.
     */
    public UserFacingError errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails property: Specifies the protection status error of the resource.
     *
     * @param errorDetails the errorDetails value to set.
     * @return the ProtectionStatusDetails object itself.
     */
    public ProtectionStatusDetails withErrorDetails(UserFacingError errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get the status property: Specifies the protection status of the resource.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Specifies the protection status of the resource.
     *
     * @param status the status value to set.
     * @return the ProtectionStatusDetails object itself.
     */
    public ProtectionStatusDetails withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorDetails() != null) {
            errorDetails().validate();
        }
    }
}

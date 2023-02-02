// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.keyvault.generated.models.Reason;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CheckMhsmNameAvailability operation response. */
@Immutable
public final class CheckMhsmNameAvailabilityResultInner {
    /*
     * A boolean value that indicates whether the name is available for you to use. If true, the name is available. If
     * false, the name has already been taken or is invalid and cannot be used.
     */
    @JsonProperty(value = "nameAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean nameAvailable;

    /*
     * The reason that a managed hsm name could not be used. The reason element is only returned if NameAvailable is
     * false.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private Reason reason;

    /*
     * An error message explaining the Reason value in more detail.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of CheckMhsmNameAvailabilityResultInner class. */
    public CheckMhsmNameAvailabilityResultInner() {
    }

    /**
     * Get the nameAvailable property: A boolean value that indicates whether the name is available for you to use. If
     * true, the name is available. If false, the name has already been taken or is invalid and cannot be used.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Get the reason property: The reason that a managed hsm name could not be used. The reason element is only
     * returned if NameAvailable is false.
     *
     * @return the reason value.
     */
    public Reason reason() {
        return this.reason;
    }

    /**
     * Get the message property: An error message explaining the Reason value in more detail.
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

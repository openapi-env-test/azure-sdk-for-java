// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datamigration.models.NameCheckFailureReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Indicates whether a proposed resource name is available. */
@Fluent
public final class NameAvailabilityResponseInner {
    /*
     * If true, the name is valid and available. If false, 'reason' describes
     * why not.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * The reason why the name is not available, if nameAvailable is false
     */
    @JsonProperty(value = "reason")
    private NameCheckFailureReason reason;

    /*
     * The localized reason why the name is not available, if nameAvailable is
     * false
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the nameAvailable property: If true, the name is valid and available. If false, 'reason' describes why not.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: If true, the name is valid and available. If false, 'reason' describes why not.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the NameAvailabilityResponseInner object itself.
     */
    public NameAvailabilityResponseInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: The reason why the name is not available, if nameAvailable is false.
     *
     * @return the reason value.
     */
    public NameCheckFailureReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason why the name is not available, if nameAvailable is false.
     *
     * @param reason the reason value to set.
     * @return the NameAvailabilityResponseInner object itself.
     */
    public NameAvailabilityResponseInner withReason(NameCheckFailureReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: The localized reason why the name is not available, if nameAvailable is false.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The localized reason why the name is not available, if nameAvailable is false.
     *
     * @param message the message value to set.
     * @return the NameAvailabilityResponseInner object itself.
     */
    public NameAvailabilityResponseInner withMessage(String message) {
        this.message = message;
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

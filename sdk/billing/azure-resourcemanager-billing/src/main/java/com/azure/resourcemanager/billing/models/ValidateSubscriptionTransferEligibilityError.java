// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details of the transfer eligibility validation. */
@Fluent
public final class ValidateSubscriptionTransferEligibilityError {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ValidateSubscriptionTransferEligibilityError.class);

    /*
     * Error code for the product transfer validation.
     */
    @JsonProperty(value = "code")
    private SubscriptionTransferValidationErrorCode code;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Detailed error message explaining the error.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get the code property: Error code for the product transfer validation.
     *
     * @return the code value.
     */
    public SubscriptionTransferValidationErrorCode code() {
        return this.code;
    }

    /**
     * Set the code property: Error code for the product transfer validation.
     *
     * @param code the code value to set.
     * @return the ValidateSubscriptionTransferEligibilityError object itself.
     */
    public ValidateSubscriptionTransferEligibilityError withCode(SubscriptionTransferValidationErrorCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the ValidateSubscriptionTransferEligibilityError object itself.
     */
    public ValidateSubscriptionTransferEligibilityError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: Detailed error message explaining the error.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: Detailed error message explaining the error.
     *
     * @param details the details value to set.
     * @return the ValidateSubscriptionTransferEligibilityError object itself.
     */
    public ValidateSubscriptionTransferEligibilityError withDetails(String details) {
        this.details = details;
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

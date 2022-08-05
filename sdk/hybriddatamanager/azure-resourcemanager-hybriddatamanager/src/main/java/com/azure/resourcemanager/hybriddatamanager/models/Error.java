// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Top level error for the job. */
@Fluent
public final class Error {
    /*
     * Error code that can be used to programmatically identify the error.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Describes the error in detail and provides debugging information.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: Error code that can be used to programmatically identify the error.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code that can be used to programmatically identify the error.
     *
     * @param code the code value to set.
     * @return the Error object itself.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Describes the error in detail and provides debugging information.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Describes the error in detail and provides debugging information.
     *
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (code() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property code in model Error"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Error.class);
}

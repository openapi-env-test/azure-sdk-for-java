// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The validation item for a linker. */
@Fluent
public final class ValidationResultItem {
    /*
     * The validation item name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display name of validation item
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The result of validation
     */
    @JsonProperty(value = "result")
    private ValidationResultStatus result;

    /*
     * The error message of validation result
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /*
     * The error code of validation result
     */
    @JsonProperty(value = "errorCode")
    private String errorCode;

    /** Creates an instance of ValidationResultItem class. */
    public ValidationResultItem() {
    }

    /**
     * Get the name property: The validation item name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The validation item name.
     *
     * @param name the name value to set.
     * @return the ValidationResultItem object itself.
     */
    public ValidationResultItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: The display name of validation item.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The display name of validation item.
     *
     * @param description the description value to set.
     * @return the ValidationResultItem object itself.
     */
    public ValidationResultItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the result property: The result of validation.
     *
     * @return the result value.
     */
    public ValidationResultStatus result() {
        return this.result;
    }

    /**
     * Set the result property: The result of validation.
     *
     * @param result the result value to set.
     * @return the ValidationResultItem object itself.
     */
    public ValidationResultItem withResult(ValidationResultStatus result) {
        this.result = result;
        return this;
    }

    /**
     * Get the errorMessage property: The error message of validation result.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: The error message of validation result.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the ValidationResultItem object itself.
     */
    public ValidationResultItem withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get the errorCode property: The error code of validation result.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The error code of validation result.
     *
     * @param errorCode the errorCode value to set.
     * @return the ValidationResultItem object itself.
     */
    public ValidationResultItem withErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

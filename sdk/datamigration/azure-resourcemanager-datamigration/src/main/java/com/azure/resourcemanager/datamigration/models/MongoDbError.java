// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an error or warning that occurred during a MongoDB migration. */
@Fluent
public final class MongoDbError {
    /*
     * The non-localized, machine-readable code that describes the error or warning
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The number of times the error or warning has occurred
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * The localized, human-readable message that describes the error or warning
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The type of error or warning
     */
    @JsonProperty(value = "type")
    private MongoDbErrorType type;

    /** Creates an instance of MongoDbError class. */
    public MongoDbError() {
    }

    /**
     * Get the code property: The non-localized, machine-readable code that describes the error or warning.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The non-localized, machine-readable code that describes the error or warning.
     *
     * @param code the code value to set.
     * @return the MongoDbError object itself.
     */
    public MongoDbError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the count property: The number of times the error or warning has occurred.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: The number of times the error or warning has occurred.
     *
     * @param count the count value to set.
     * @return the MongoDbError object itself.
     */
    public MongoDbError withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the message property: The localized, human-readable message that describes the error or warning.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The localized, human-readable message that describes the error or warning.
     *
     * @param message the message value to set.
     * @return the MongoDbError object itself.
     */
    public MongoDbError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the type property: The type of error or warning.
     *
     * @return the type value.
     */
    public MongoDbErrorType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of error or warning.
     *
     * @param type the type value to set.
     * @return the MongoDbError object itself.
     */
    public MongoDbError withType(MongoDbErrorType type) {
        this.type = type;
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

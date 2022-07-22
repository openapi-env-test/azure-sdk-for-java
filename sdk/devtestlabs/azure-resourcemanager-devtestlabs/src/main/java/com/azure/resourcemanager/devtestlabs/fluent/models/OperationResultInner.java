// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.models.HttpStatusCode;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Operation Result. */
@Fluent
public final class OperationResultInner {
    /*
     * The operation status.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The status code for the operation.
     */
    @JsonProperty(value = "statusCode")
    private HttpStatusCode statusCode;

    /*
     * Error details for the operation in case of a failure.
     */
    @JsonProperty(value = "error")
    private OperationError innerError;

    /**
     * Get the status property: The operation status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The operation status.
     *
     * @param status the status value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusCode property: The status code for the operation.
     *
     * @return the statusCode value.
     */
    public HttpStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the statusCode property: The status code for the operation.
     *
     * @param statusCode the statusCode value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get the innerError property: Error details for the operation in case of a failure.
     *
     * @return the innerError value.
     */
    private OperationError innerError() {
        return this.innerError;
    }

    /**
     * Get the code property: The error code of the operation error.
     *
     * @return the code value.
     */
    public String code() {
        return this.innerError() == null ? null : this.innerError().code();
    }

    /**
     * Set the code property: The error code of the operation error.
     *
     * @param code the code value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withCode(String code) {
        if (this.innerError() == null) {
            this.innerError = new OperationError();
        }
        this.innerError().withCode(code);
        return this;
    }

    /**
     * Get the message property: The error message of the operation error.
     *
     * @return the message value.
     */
    public String message() {
        return this.innerError() == null ? null : this.innerError().message();
    }

    /**
     * Set the message property: The error message of the operation error.
     *
     * @param message the message value to set.
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withMessage(String message) {
        if (this.innerError() == null) {
            this.innerError = new OperationError();
        }
        this.innerError().withMessage(message);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerError() != null) {
            innerError().validate();
        }
    }
}

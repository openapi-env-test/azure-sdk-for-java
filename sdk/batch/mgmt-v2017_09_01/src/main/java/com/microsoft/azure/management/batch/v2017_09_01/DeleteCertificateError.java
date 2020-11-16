/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response from the Batch service.
 */
public class DeleteCertificateError {
    /**
     * An identifier for the error. Codes are invariant and are intended to be
     * consumed programmatically.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * A message describing the error, intended to be suitable for display in a
     * user interface.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * The target of the particular error. For example, the name of the
     * property in error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * A list of additional details about the error.
     */
    @JsonProperty(value = "details")
    private List<DeleteCertificateError> details;

    /**
     * Get an identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set an identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     *
     * @param code the code value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get a message describing the error, intended to be suitable for display in a user interface.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set a message describing the error, intended to be suitable for display in a user interface.
     *
     * @param message the message value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target of the particular error. For example, the name of the property in error.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target of the particular error. For example, the name of the property in error.
     *
     * @param target the target value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get a list of additional details about the error.
     *
     * @return the details value
     */
    public List<DeleteCertificateError> details() {
        return this.details;
    }

    /**
     * Set a list of additional details about the error.
     *
     * @param details the details value to set
     * @return the DeleteCertificateError object itself.
     */
    public DeleteCertificateError withDetails(List<DeleteCertificateError> details) {
        this.details = details;
        return this;
    }

}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.resourcemanager.devtestlabs.fluent.models.OperationResultInner;

/** An immutable client-side representation of OperationResult. */
public interface OperationResult {
    /**
     * Gets the status property: The operation status.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the statusCode property: The status code for the operation.
     *
     * @return the statusCode value.
     */
    HttpStatusCode statusCode();

    /**
     * Gets the code property: The error code of the operation error.
     *
     * @return the code value.
     */
    String code();

    /**
     * Gets the message property: The error message of the operation error.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.OperationResultInner object.
     *
     * @return the inner object.
     */
    OperationResultInner innerModel();
}

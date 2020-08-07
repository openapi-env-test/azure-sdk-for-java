/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The error response that indicates why an operation has failed.
 */
public class ErrorResponse {
    /**
     * The error detail that describes why an operation has failed.
     */
    @JsonProperty(value = "error")
    private ErrorDetail error;

    /**
     * Get the error detail that describes why an operation has failed.
     *
     * @return the error value
     */
    public ErrorDetail error() {
        return this.error;
    }

    /**
     * Set the error detail that describes why an operation has failed.
     *
     * @param error the error value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withError(ErrorDetail error) {
        this.error = error;
        return this;
    }

}

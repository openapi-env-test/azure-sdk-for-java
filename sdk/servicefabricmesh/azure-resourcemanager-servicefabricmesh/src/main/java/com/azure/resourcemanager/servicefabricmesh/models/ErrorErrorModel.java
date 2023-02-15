// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The error details. */
@Immutable
public final class ErrorErrorModel extends ManagementError {
    /*
     * The innerError property.
     */
    @JsonProperty(value = "innerError", access = JsonProperty.Access.WRITE_ONLY)
    private String innerError;

    /** Creates an instance of ErrorErrorModel class. */
    public ErrorErrorModel() {
    }

    /**
     * Get the innerError property: The innerError property.
     *
     * @return the innerError value.
     */
    public String getInnerError() {
        return this.innerError;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Arm async operation class. Ref:
 * https://docs.microsoft.com/en-us/azure/azure-resource-manager/management/async-operations.
 */
@Fluent
public final class ArmAsyncOperationInner {
    /*
     * Status of the async operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /** Creates an instance of ArmAsyncOperationInner class. */
    public ArmAsyncOperationInner() {
    }

    /**
     * Get the status property: Status of the async operation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the async operation.
     *
     * @param status the status value to set.
     * @return the ArmAsyncOperationInner object itself.
     */
    public ArmAsyncOperationInner withStatus(String status) {
        this.status = status;
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

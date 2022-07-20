// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.support.fluent.models.OperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of operations supported by Microsoft Support resource provider. */
@Fluent
public final class OperationsListResult {
    /*
     * The list of operations supported by Microsoft Support resource provider.
     */
    @JsonProperty(value = "value")
    private List<OperationInner> value;

    /**
     * Get the value property: The list of operations supported by Microsoft Support resource provider.
     *
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of operations supported by Microsoft Support resource provider.
     *
     * @param value the value value to set.
     * @return the OperationsListResult object itself.
     */
    public OperationsListResult withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

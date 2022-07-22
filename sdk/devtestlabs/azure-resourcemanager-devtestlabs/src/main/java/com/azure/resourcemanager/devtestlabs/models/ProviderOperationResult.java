// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.fluent.models.OperationMetadataInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the request to list REST API operations. */
@Fluent
public final class ProviderOperationResult {
    /*
     * List of operations supported by the resource provider.
     */
    @JsonProperty(value = "value")
    private List<OperationMetadataInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of operations supported by the resource provider.
     *
     * @return the value value.
     */
    public List<OperationMetadataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of operations supported by the resource provider.
     *
     * @param value the value value to set.
     * @return the ProviderOperationResult object itself.
     */
    public ProviderOperationResult withValue(List<OperationMetadataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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

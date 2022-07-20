// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.singularity.fluent.models.OperationResultInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the result of the request to list Singularity operations. */
@Immutable
public final class OperationListResult {
    /*
     * List of operations supported by the Singularity resource provider.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationResultInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of operations supported by the Singularity resource provider.
     *
     * @return the value value.
     */
    public List<OperationResultInner> value() {
        return this.value;
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

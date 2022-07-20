// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.singularity.fluent.models.NetworkResourceDescriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A pageable list of network resources. */
@Immutable
public final class NetworkResourceDescriptionList {
    /*
     * One page of the list.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkResourceDescriptionInner> value;

    /*
     * URI to fetch the next page of the list.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: One page of the list.
     *
     * @return the value value.
     */
    public List<NetworkResourceDescriptionInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URI to fetch the next page of the list.
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

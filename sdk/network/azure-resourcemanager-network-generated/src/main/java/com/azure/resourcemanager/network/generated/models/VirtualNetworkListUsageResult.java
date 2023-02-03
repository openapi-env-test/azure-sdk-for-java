// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkUsageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for the virtual networks GetUsage API service call. */
@Fluent
public final class VirtualNetworkListUsageResult {
    /*
     * VirtualNetwork usage stats.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualNetworkUsageInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of VirtualNetworkListUsageResult class. */
    public VirtualNetworkListUsageResult() {
    }

    /**
     * Get the value property: VirtualNetwork usage stats.
     *
     * @return the value value.
     */
    public List<VirtualNetworkUsageInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualNetworkListUsageResult object itself.
     */
    public VirtualNetworkListUsageResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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

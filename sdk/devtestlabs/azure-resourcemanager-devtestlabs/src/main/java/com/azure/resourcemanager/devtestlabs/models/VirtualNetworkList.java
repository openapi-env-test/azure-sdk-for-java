// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.fluent.models.VirtualNetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Contains a list of virtualNetworks and their properties. */
@Fluent
public final class VirtualNetworkList {
    /*
     * List of virtualNetworks and their properties
     */
    @JsonProperty(value = "value")
    private List<VirtualNetworkInner> value;

    /*
     * URL to get the next set of operation list results if there are any
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of virtualNetworks and their properties.
     *
     * @return the value value.
     */
    public List<VirtualNetworkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of virtualNetworks and their properties.
     *
     * @param value the value value to set.
     * @return the VirtualNetworkList object itself.
     */
    public VirtualNetworkList withValue(List<VirtualNetworkInner> value) {
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
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualNetworkList object itself.
     */
    public VirtualNetworkList withNextLink(String nextLink) {
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

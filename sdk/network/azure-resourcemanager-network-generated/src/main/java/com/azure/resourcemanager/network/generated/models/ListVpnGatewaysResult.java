// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.VpnGatewayInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list VpnGateways. It contains a list of VpnGateways and a URL nextLink to get the next set
 * of results.
 */
@Fluent
public final class ListVpnGatewaysResult {
    /*
     * List of VpnGateways.
     */
    @JsonProperty(value = "value")
    private List<VpnGatewayInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ListVpnGatewaysResult class. */
    public ListVpnGatewaysResult() {
    }

    /**
     * Get the value property: List of VpnGateways.
     *
     * @return the value value.
     */
    public List<VpnGatewayInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VpnGateways.
     *
     * @param value the value value to set.
     * @return the ListVpnGatewaysResult object itself.
     */
    public ListVpnGatewaysResult withValue(List<VpnGatewayInner> value) {
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
     * @return the ListVpnGatewaysResult object itself.
     */
    public ListVpnGatewaysResult withNextLink(String nextLink) {
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

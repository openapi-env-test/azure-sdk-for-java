// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualApplianceSiteInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListNetworkVirtualApplianceSites API service call. */
@Fluent
public final class NetworkVirtualApplianceSiteListResult {
    /*
     * List of Network Virtual Appliance sites.
     */
    @JsonProperty(value = "value")
    private List<VirtualApplianceSiteInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Network Virtual Appliance sites.
     *
     * @return the value value.
     */
    public List<VirtualApplianceSiteInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Network Virtual Appliance sites.
     *
     * @param value the value value to set.
     * @return the NetworkVirtualApplianceSiteListResult object itself.
     */
    public NetworkVirtualApplianceSiteListResult withValue(List<VirtualApplianceSiteInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkVirtualApplianceSiteListResult object itself.
     */
    public NetworkVirtualApplianceSiteListResult withNextLink(String nextLink) {
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

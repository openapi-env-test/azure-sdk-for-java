// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the request to list VpnSiteLinks. It contains a list of VpnSiteLinks and a URL nextLink to get the next set
 * of results.
 */
@Fluent
public final class ListVpnSiteLinksResult {
    /*
     * List of VpnSitesLinks.
     */
    @JsonProperty(value = "value")
    private List<VpnSiteLinkInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of VpnSitesLinks.
     *
     * @return the value value.
     */
    public List<VpnSiteLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of VpnSitesLinks.
     *
     * @param value the value value to set.
     * @return the ListVpnSiteLinksResult object itself.
     */
    public ListVpnSiteLinksResult withValue(List<VpnSiteLinkInner> value) {
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
     * @return the ListVpnSiteLinksResult object itself.
     */
    public ListVpnSiteLinksResult withNextLink(String nextLink) {
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

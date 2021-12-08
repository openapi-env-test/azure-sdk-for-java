// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortsLocationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ExpressRoutePorts Location List Result Response for ListExpressRoutePortsLocations API service call. */
@Fluent
public final class ExpressRoutePortsLocationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRoutePortsLocationListResult.class);

    /*
     * The list of all ExpressRoutePort peering locations.
     */
    @JsonProperty(value = "value")
    private List<ExpressRoutePortsLocationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of all ExpressRoutePort peering locations.
     *
     * @return the value value.
     */
    public List<ExpressRoutePortsLocationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of all ExpressRoutePort peering locations.
     *
     * @param value the value value to set.
     * @return the ExpressRoutePortsLocationListResult object itself.
     */
    public ExpressRoutePortsLocationListResult withValue(List<ExpressRoutePortsLocationInner> value) {
        this.value = value;
        return this;
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
     * @return the ExpressRoutePortsLocationListResult object itself.
     */
    public ExpressRoutePortsLocationListResult withNextLink(String nextLink) {
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

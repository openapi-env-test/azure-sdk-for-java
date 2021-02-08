// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListExpressRouteCircuit Api service call. */
@Fluent
public final class ExpressRouteCircuitListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitListResult.class);

    /*
     * Gets a list of ExpressRouteCircuits in a resource group
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteCircuitInner> value;

    /*
     * Gets the URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets a list of ExpressRouteCircuits in a resource group.
     *
     * @return the value value.
     */
    public List<ExpressRouteCircuitInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets a list of ExpressRouteCircuits in a resource group.
     *
     * @param value the value value to set.
     * @return the ExpressRouteCircuitListResult object itself.
     */
    public ExpressRouteCircuitListResult withValue(List<ExpressRouteCircuitInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteCircuitListResult object itself.
     */
    public ExpressRouteCircuitListResult withNextLink(String nextLink) {
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

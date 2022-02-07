// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Route Filter Resource. */
@Fluent
public final class RouteFilterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteFilterInner.class);

    /*
     * Properties of the route filter.
     */
    @JsonProperty(value = "properties")
    private RouteFilterPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the route filter.
     *
     * @return the innerProperties value.
     */
    private RouteFilterPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RouteFilterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RouteFilterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value.
     */
    public List<RouteFilterRuleInner> rules() {
        return this.innerProperties() == null ? null : this.innerProperties().rules();
    }

    /**
     * Set the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @param rules the rules value to set.
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withRules(List<RouteFilterRuleInner> rules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RouteFilterPropertiesFormat();
        }
        this.innerProperties().withRules(rules);
        return this;
    }

    /**
     * Get the peerings property: A collection of references to express route circuit peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().peerings();
    }

    /**
     * Get the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings.
     *
     * @return the ipv6Peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> ipv6Peerings() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv6Peerings();
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

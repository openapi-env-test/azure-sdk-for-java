// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsLocationBandwidths;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * ExpressRoutePorts Peering Location
 *
 * <p>Definition of the ExpressRoutePorts peering location resource.
 */
@Fluent
public final class ExpressRoutePortsLocationInner extends Resource {
    /*
     * ExpressRoutePorts Location Properties
     *
     * ExpressRoutePort peering location properties.
     */
    @JsonProperty(value = "properties")
    private ExpressRoutePortsLocationPropertiesFormat innerProperties;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of ExpressRoutePortsLocationInner class. */
    public ExpressRoutePortsLocationInner() {
    }

    /**
     * Get the innerProperties property: ExpressRoutePorts Location Properties
     *
     * <p>ExpressRoutePort peering location properties.
     *
     * @return the innerProperties value.
     */
    private ExpressRoutePortsLocationPropertiesFormat innerProperties() {
        return this.innerProperties;
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
     * @return the ExpressRoutePortsLocationInner object itself.
     */
    public ExpressRoutePortsLocationInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRoutePortsLocationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRoutePortsLocationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the address property: Address of peering location.
     *
     * @return the address value.
     */
    public String address() {
        return this.innerProperties() == null ? null : this.innerProperties().address();
    }

    /**
     * Get the contact property: Contact details of peering locations.
     *
     * @return the contact value.
     */
    public String contact() {
        return this.innerProperties() == null ? null : this.innerProperties().contact();
    }

    /**
     * Get the availableBandwidths property: The inventory of available ExpressRoutePort bandwidths.
     *
     * @return the availableBandwidths value.
     */
    public List<ExpressRoutePortsLocationBandwidths> availableBandwidths() {
        return this.innerProperties() == null ? null : this.innerProperties().availableBandwidths();
    }

    /**
     * Set the availableBandwidths property: The inventory of available ExpressRoutePort bandwidths.
     *
     * @param availableBandwidths the availableBandwidths value to set.
     * @return the ExpressRoutePortsLocationInner object itself.
     */
    public ExpressRoutePortsLocationInner withAvailableBandwidths(
        List<ExpressRoutePortsLocationBandwidths> availableBandwidths) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRoutePortsLocationPropertiesFormat();
        }
        this.innerProperties().withAvailableBandwidths(availableBandwidths);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route port location resource.
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

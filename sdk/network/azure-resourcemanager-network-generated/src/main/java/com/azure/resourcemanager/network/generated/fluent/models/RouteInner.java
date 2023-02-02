// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RouteNextHopType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Route resource. */
@Fluent
public final class RouteInner extends SubResource {
    /*
     * Properties of the route.
     */
    @JsonProperty(value = "properties")
    private RoutePropertiesFormat innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /** Creates an instance of RouteInner class. */
    public RouteInner() {
    }

    /**
     * Get the innerProperties property: Properties of the route.
     *
     * @return the innerProperties value.
     */
    private RoutePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withName(String name) {
        this.name = name;
        return this;
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
     * Get the type property: The type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the resource.
     *
     * @param type the type value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withType(String type) {
        this.type = type;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RouteInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the addressPrefix property: The destination CIDR to which the route applies.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Set the addressPrefix property: The destination CIDR to which the route applies.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withAddressPrefix(String addressPrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutePropertiesFormat();
        }
        this.innerProperties().withAddressPrefix(addressPrefix);
        return this;
    }

    /**
     * Get the nextHopType property: The type of Azure hop the packet should be sent to.
     *
     * @return the nextHopType value.
     */
    public RouteNextHopType nextHopType() {
        return this.innerProperties() == null ? null : this.innerProperties().nextHopType();
    }

    /**
     * Set the nextHopType property: The type of Azure hop the packet should be sent to.
     *
     * @param nextHopType the nextHopType value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withNextHopType(RouteNextHopType nextHopType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutePropertiesFormat();
        }
        this.innerProperties().withNextHopType(nextHopType);
        return this;
    }

    /**
     * Get the nextHopIpAddress property: The IP address packets should be forwarded to. Next hop values are only
     * allowed in routes where the next hop type is VirtualAppliance.
     *
     * @return the nextHopIpAddress value.
     */
    public String nextHopIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().nextHopIpAddress();
    }

    /**
     * Set the nextHopIpAddress property: The IP address packets should be forwarded to. Next hop values are only
     * allowed in routes where the next hop type is VirtualAppliance.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withNextHopIpAddress(String nextHopIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutePropertiesFormat();
        }
        this.innerProperties().withNextHopIpAddress(nextHopIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the hasBgpOverride property: A value indicating whether this route overrides overlapping BGP routes
     * regardless of LPM.
     *
     * @return the hasBgpOverride value.
     */
    public Boolean hasBgpOverride() {
        return this.innerProperties() == null ? null : this.innerProperties().hasBgpOverride();
    }

    /**
     * Set the hasBgpOverride property: A value indicating whether this route overrides overlapping BGP routes
     * regardless of LPM.
     *
     * @param hasBgpOverride the hasBgpOverride value to set.
     * @return the RouteInner object itself.
     */
    public RouteInner withHasBgpOverride(Boolean hasBgpOverride) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoutePropertiesFormat();
        }
        this.innerProperties().withHasBgpOverride(hasBgpOverride);
        return this;
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

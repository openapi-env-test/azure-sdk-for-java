// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The virtual network properties. */
@Fluent
public final class VirtualNetworkProfile {
    /*
     * The ID of the virtual network.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the subnet.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * Get the id property: The ID of the virtual network.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the virtual network.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the subnet property: The name of the subnet.
     *
     * @return the subnet value.
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The name of the subnet.
     *
     * @param subnet the subnet value to set.
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

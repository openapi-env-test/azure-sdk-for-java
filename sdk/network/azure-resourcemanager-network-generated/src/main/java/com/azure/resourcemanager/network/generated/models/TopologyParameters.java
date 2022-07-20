// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the representation of topology. */
@Fluent
public final class TopologyParameters {
    /*
     * The name of the target resource group to perform topology on.
     */
    @JsonProperty(value = "targetResourceGroupName")
    private String targetResourceGroupName;

    /*
     * The reference to the Virtual Network resource.
     */
    @JsonProperty(value = "targetVirtualNetwork")
    private SubResource targetVirtualNetwork;

    /*
     * The reference to the Subnet resource.
     */
    @JsonProperty(value = "targetSubnet")
    private SubResource targetSubnet;

    /**
     * Get the targetResourceGroupName property: The name of the target resource group to perform topology on.
     *
     * @return the targetResourceGroupName value.
     */
    public String targetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    /**
     * Set the targetResourceGroupName property: The name of the target resource group to perform topology on.
     *
     * @param targetResourceGroupName the targetResourceGroupName value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }

    /**
     * Get the targetVirtualNetwork property: The reference to the Virtual Network resource.
     *
     * @return the targetVirtualNetwork value.
     */
    public SubResource targetVirtualNetwork() {
        return this.targetVirtualNetwork;
    }

    /**
     * Set the targetVirtualNetwork property: The reference to the Virtual Network resource.
     *
     * @param targetVirtualNetwork the targetVirtualNetwork value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetVirtualNetwork(SubResource targetVirtualNetwork) {
        this.targetVirtualNetwork = targetVirtualNetwork;
        return this;
    }

    /**
     * Get the targetSubnet property: The reference to the Subnet resource.
     *
     * @return the targetSubnet value.
     */
    public SubResource targetSubnet() {
        return this.targetSubnet;
    }

    /**
     * Set the targetSubnet property: The reference to the Subnet resource.
     *
     * @param targetSubnet the targetSubnet value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetSubnet(SubResource targetSubnet) {
        this.targetSubnet = targetSubnet;
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

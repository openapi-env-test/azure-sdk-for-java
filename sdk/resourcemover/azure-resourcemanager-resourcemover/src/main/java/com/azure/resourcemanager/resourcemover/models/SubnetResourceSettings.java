// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the virtual network subnets resource settings. */
@Fluent
public final class SubnetResourceSettings {
    /*
     * Gets or sets the Subnet name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets address prefix for the subnet.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * Defines reference to NSG.
     */
    @JsonProperty(value = "networkSecurityGroup")
    private NsgReference networkSecurityGroup;

    /**
     * Get the name property: Gets or sets the Subnet name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the Subnet name.
     *
     * @param name the name value to set.
     * @return the SubnetResourceSettings object itself.
     */
    public SubnetResourceSettings withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the addressPrefix property: Gets or sets address prefix for the subnet.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Gets or sets address prefix for the subnet.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the SubnetResourceSettings object itself.
     */
    public SubnetResourceSettings withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: Defines reference to NSG.
     *
     * @return the networkSecurityGroup value.
     */
    public NsgReference networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: Defines reference to NSG.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the SubnetResourceSettings object itself.
     */
    public SubnetResourceSettings withNetworkSecurityGroup(NsgReference networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkSecurityGroup() != null) {
            networkSecurityGroup().validate();
        }
    }
}

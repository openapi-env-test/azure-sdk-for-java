// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.RoleInstanceNetworkProfile;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Role instance properties. */
@Fluent
public final class RoleInstancePropertiesInner {
    /*
     * Describes the network profile for the role instance.
     */
    @JsonProperty(value = "networkProfile")
    private RoleInstanceNetworkProfile networkProfile;

    /*
     * The instance view of the role instance.
     */
    @JsonProperty(value = "instanceView")
    private RoleInstanceViewInner instanceView;

    /**
     * Get the networkProfile property: Describes the network profile for the role instance.
     *
     * @return the networkProfile value.
     */
    public RoleInstanceNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Describes the network profile for the role instance.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the RoleInstancePropertiesInner object itself.
     */
    public RoleInstancePropertiesInner withNetworkProfile(RoleInstanceNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the instanceView property: The instance view of the role instance.
     *
     * @return the instanceView value.
     */
    public RoleInstanceViewInner instanceView() {
        return this.instanceView;
    }

    /**
     * Set the instanceView property: The instance view of the role instance.
     *
     * @param instanceView the instanceView value to set.
     * @return the RoleInstancePropertiesInner object itself.
     */
    public RoleInstancePropertiesInner withInstanceView(RoleInstanceViewInner instanceView) {
        this.instanceView = instanceView;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}

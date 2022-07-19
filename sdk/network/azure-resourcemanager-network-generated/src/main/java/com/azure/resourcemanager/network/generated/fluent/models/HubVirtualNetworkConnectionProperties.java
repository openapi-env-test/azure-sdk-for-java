// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for HubVirtualNetworkConnection. */
@Fluent
public final class HubVirtualNetworkConnectionProperties {
    /*
     * Reference to the remote virtual network.
     */
    @JsonProperty(value = "remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /*
     * Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     */
    @JsonProperty(value = "allowHubToRemoteVnetTransit")
    private Boolean allowHubToRemoteVnetTransit;

    /*
     * Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     */
    @JsonProperty(value = "allowRemoteVnetToUseHubVnetGateways")
    private Boolean allowRemoteVnetToUseHubVnetGateways;

    /*
     * Enable internet security.
     */
    @JsonProperty(value = "enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     */
    @JsonProperty(value = "routingConfiguration")
    private RoutingConfiguration routingConfiguration;

    /*
     * The provisioning state of the hub virtual network connection resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the remoteVirtualNetwork property: Reference to the remote virtual network.
     *
     * @return the remoteVirtualNetwork value.
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set the remoteVirtualNetwork property: Reference to the remote virtual network.
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set.
     * @return the HubVirtualNetworkConnectionProperties object itself.
     */
    public HubVirtualNetworkConnectionProperties withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get the allowHubToRemoteVnetTransit property: Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     *
     * @return the allowHubToRemoteVnetTransit value.
     */
    public Boolean allowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit;
    }

    /**
     * Set the allowHubToRemoteVnetTransit property: Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     *
     * @param allowHubToRemoteVnetTransit the allowHubToRemoteVnetTransit value to set.
     * @return the HubVirtualNetworkConnectionProperties object itself.
     */
    public HubVirtualNetworkConnectionProperties withAllowHubToRemoteVnetTransit(Boolean allowHubToRemoteVnetTransit) {
        this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
        return this;
    }

    /**
     * Get the allowRemoteVnetToUseHubVnetGateways property: Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @return the allowRemoteVnetToUseHubVnetGateways value.
     */
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways;
    }

    /**
     * Set the allowRemoteVnetToUseHubVnetGateways property: Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @param allowRemoteVnetToUseHubVnetGateways the allowRemoteVnetToUseHubVnetGateways value to set.
     * @return the HubVirtualNetworkConnectionProperties object itself.
     */
    public HubVirtualNetworkConnectionProperties withAllowRemoteVnetToUseHubVnetGateways(
        Boolean allowRemoteVnetToUseHubVnetGateways) {
        this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the HubVirtualNetworkConnectionProperties object itself.
     */
    public HubVirtualNetworkConnectionProperties withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the HubVirtualNetworkConnectionProperties object itself.
     */
    public HubVirtualNetworkConnectionProperties withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the hub virtual network connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routingConfiguration() != null) {
            routingConfiguration().validate();
        }
    }
}

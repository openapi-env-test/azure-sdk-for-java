// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeeringState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Peerings in a virtual network resource. */
@JsonFlatten
@Fluent
public class VirtualNetworkPeeringInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkPeeringInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     */
    @JsonProperty(value = "properties.allowVirtualNetworkAccess")
    private Boolean allowVirtualNetworkAccess;

    /*
     * Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     */
    @JsonProperty(value = "properties.allowForwardedTraffic")
    private Boolean allowForwardedTraffic;

    /*
     * If gateway links can be used in remote virtual networking to link to
     * this virtual network.
     */
    @JsonProperty(value = "properties.allowGatewayTransit")
    private Boolean allowGatewayTransit;

    /*
     * If remote gateways can be used on this virtual network. If the flag is
     * set to true, and allowGatewayTransit on remote peering is also true,
     * virtual network will use gateways of remote virtual network for transit.
     * Only one peering can have this flag set to true. This flag cannot be set
     * if virtual network already has a gateway.
     */
    @JsonProperty(value = "properties.useRemoteGateways")
    private Boolean useRemoteGateways;

    /*
     * The reference of the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register
     * for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     */
    @JsonProperty(value = "properties.remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /*
     * The reference of the remote virtual network address space.
     */
    @JsonProperty(value = "properties.remoteAddressSpace")
    private AddressSpace remoteAddressSpace;

    /*
     * The status of the virtual network peering.
     */
    @JsonProperty(value = "properties.peeringState")
    private VirtualNetworkPeeringState peeringState;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

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
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withName(String name) {
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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @return the allowVirtualNetworkAccess value.
     */
    public Boolean allowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess;
    }

    /**
     * Set the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @param allowVirtualNetworkAccess the allowVirtualNetworkAccess value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        return this;
    }

    /**
     * Get the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @return the allowForwardedTraffic value.
     */
    public Boolean allowForwardedTraffic() {
        return this.allowForwardedTraffic;
    }

    /**
     * Set the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @param allowForwardedTraffic the allowForwardedTraffic value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        return this;
    }

    /**
     * Get the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @return the allowGatewayTransit value.
     */
    public Boolean allowGatewayTransit() {
        return this.allowGatewayTransit;
    }

    /**
     * Set the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @param allowGatewayTransit the allowGatewayTransit value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowGatewayTransit(Boolean allowGatewayTransit) {
        this.allowGatewayTransit = allowGatewayTransit;
        return this;
    }

    /**
     * Get the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set to
     * true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual
     * network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network
     * already has a gateway.
     *
     * @return the useRemoteGateways value.
     */
    public Boolean useRemoteGateways() {
        return this.useRemoteGateways;
    }

    /**
     * Set the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set to
     * true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual
     * network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network
     * already has a gateway.
     *
     * @param useRemoteGateways the useRemoteGateways value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withUseRemoteGateways(Boolean useRemoteGateways) {
        this.useRemoteGateways = useRemoteGateways;
        return this;
    }

    /**
     * Get the remoteVirtualNetwork property: The reference of the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @return the remoteVirtualNetwork value.
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set the remoteVirtualNetwork property: The reference of the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get the remoteAddressSpace property: The reference of the remote virtual network address space.
     *
     * @return the remoteAddressSpace value.
     */
    public AddressSpace remoteAddressSpace() {
        return this.remoteAddressSpace;
    }

    /**
     * Set the remoteAddressSpace property: The reference of the remote virtual network address space.
     *
     * @param remoteAddressSpace the remoteAddressSpace value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        this.remoteAddressSpace = remoteAddressSpace;
        return this;
    }

    /**
     * Get the peeringState property: The status of the virtual network peering.
     *
     * @return the peeringState value.
     */
    public VirtualNetworkPeeringState peeringState() {
        return this.peeringState;
    }

    /**
     * Set the peeringState property: The status of the virtual network peering.
     *
     * @param peeringState the peeringState value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withPeeringState(VirtualNetworkPeeringState peeringState) {
        this.peeringState = peeringState;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkPeeringInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (remoteAddressSpace() != null) {
            remoteAddressSpace().validate();
        }
    }
}

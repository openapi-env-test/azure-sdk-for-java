// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkBgpCommunities;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkEncryption;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeeringLevel;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkPeeringState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Peerings in a virtual network resource. */
@Fluent
public final class VirtualNetworkPeeringInner extends SubResource {
    /*
     * Properties of the virtual network peering.
     */
    @JsonProperty(value = "properties")
    private VirtualNetworkPeeringPropertiesFormat innerProperties;

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
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /** Creates an instance of VirtualNetworkPeeringInner class. */
    public VirtualNetworkPeeringInner() {
    }

    /**
     * Get the innerProperties property: Properties of the virtual network peering.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkPeeringPropertiesFormat innerProperties() {
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
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withType(String type) {
        this.type = type;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkPeeringInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @return the allowVirtualNetworkAccess value.
     */
    public Boolean allowVirtualNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowVirtualNetworkAccess();
    }

    /**
     * Set the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @param allowVirtualNetworkAccess the allowVirtualNetworkAccess value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withAllowVirtualNetworkAccess(allowVirtualNetworkAccess);
        return this;
    }

    /**
     * Get the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @return the allowForwardedTraffic value.
     */
    public Boolean allowForwardedTraffic() {
        return this.innerProperties() == null ? null : this.innerProperties().allowForwardedTraffic();
    }

    /**
     * Set the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @param allowForwardedTraffic the allowForwardedTraffic value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowForwardedTraffic(Boolean allowForwardedTraffic) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withAllowForwardedTraffic(allowForwardedTraffic);
        return this;
    }

    /**
     * Get the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @return the allowGatewayTransit value.
     */
    public Boolean allowGatewayTransit() {
        return this.innerProperties() == null ? null : this.innerProperties().allowGatewayTransit();
    }

    /**
     * Set the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @param allowGatewayTransit the allowGatewayTransit value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withAllowGatewayTransit(Boolean allowGatewayTransit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withAllowGatewayTransit(allowGatewayTransit);
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
        return this.innerProperties() == null ? null : this.innerProperties().useRemoteGateways();
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
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withUseRemoteGateways(useRemoteGateways);
        return this;
    }

    /**
     * Get the remoteVirtualNetwork property: The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @return the remoteVirtualNetwork value.
     */
    public SubResource remoteVirtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteVirtualNetwork();
    }

    /**
     * Set the remoteVirtualNetwork property: The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withRemoteVirtualNetwork(remoteVirtualNetwork);
        return this;
    }

    /**
     * Get the remoteAddressSpace property: The reference to the address space peered with the remote virtual network.
     *
     * @return the remoteAddressSpace value.
     */
    public AddressSpace remoteAddressSpace() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteAddressSpace();
    }

    /**
     * Set the remoteAddressSpace property: The reference to the address space peered with the remote virtual network.
     *
     * @param remoteAddressSpace the remoteAddressSpace value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteAddressSpace(AddressSpace remoteAddressSpace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withRemoteAddressSpace(remoteAddressSpace);
        return this;
    }

    /**
     * Get the remoteVirtualNetworkAddressSpace property: The reference to the current address space of the remote
     * virtual network.
     *
     * @return the remoteVirtualNetworkAddressSpace value.
     */
    public AddressSpace remoteVirtualNetworkAddressSpace() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteVirtualNetworkAddressSpace();
    }

    /**
     * Set the remoteVirtualNetworkAddressSpace property: The reference to the current address space of the remote
     * virtual network.
     *
     * @param remoteVirtualNetworkAddressSpace the remoteVirtualNetworkAddressSpace value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteVirtualNetworkAddressSpace(
        AddressSpace remoteVirtualNetworkAddressSpace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withRemoteVirtualNetworkAddressSpace(remoteVirtualNetworkAddressSpace);
        return this;
    }

    /**
     * Get the remoteBgpCommunities property: The reference to the remote virtual network's Bgp Communities.
     *
     * @return the remoteBgpCommunities value.
     */
    public VirtualNetworkBgpCommunities remoteBgpCommunities() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteBgpCommunities();
    }

    /**
     * Set the remoteBgpCommunities property: The reference to the remote virtual network's Bgp Communities.
     *
     * @param remoteBgpCommunities the remoteBgpCommunities value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withRemoteBgpCommunities(remoteBgpCommunities);
        return this;
    }

    /**
     * Get the remoteVirtualNetworkEncryption property: The reference to the remote virtual network's encryption.
     *
     * @return the remoteVirtualNetworkEncryption value.
     */
    public VirtualNetworkEncryption remoteVirtualNetworkEncryption() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteVirtualNetworkEncryption();
    }

    /**
     * Get the peeringState property: The status of the virtual network peering.
     *
     * @return the peeringState value.
     */
    public VirtualNetworkPeeringState peeringState() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringState();
    }

    /**
     * Set the peeringState property: The status of the virtual network peering.
     *
     * @param peeringState the peeringState value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withPeeringState(VirtualNetworkPeeringState peeringState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withPeeringState(peeringState);
        return this;
    }

    /**
     * Get the peeringSyncLevel property: The peering sync status of the virtual network peering.
     *
     * @return the peeringSyncLevel value.
     */
    public VirtualNetworkPeeringLevel peeringSyncLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().peeringSyncLevel();
    }

    /**
     * Set the peeringSyncLevel property: The peering sync status of the virtual network peering.
     *
     * @param peeringSyncLevel the peeringSyncLevel value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withPeeringSyncLevel(VirtualNetworkPeeringLevel peeringSyncLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withPeeringSyncLevel(peeringSyncLevel);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network peering resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the remote gateway.
     *
     * @return the doNotVerifyRemoteGateways value.
     */
    public Boolean doNotVerifyRemoteGateways() {
        return this.innerProperties() == null ? null : this.innerProperties().doNotVerifyRemoteGateways();
    }

    /**
     * Set the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the remote gateway.
     *
     * @param doNotVerifyRemoteGateways the doNotVerifyRemoteGateways value to set.
     * @return the VirtualNetworkPeeringInner object itself.
     */
    public VirtualNetworkPeeringInner withDoNotVerifyRemoteGateways(Boolean doNotVerifyRemoteGateways) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkPeeringPropertiesFormat();
        }
        this.innerProperties().withDoNotVerifyRemoteGateways(doNotVerifyRemoteGateways);
        return this;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the Virtual Network peering resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
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

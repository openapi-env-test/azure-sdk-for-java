// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Virtual Network Tap resource. */
@JsonFlatten
@Fluent
public class VirtualNetworkTapInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkTapInner.class);

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Specifies the list of resource IDs for the network interface IP
     * configuration that needs to be tapped.
     */
    @JsonProperty(value = "properties.networkInterfaceTapConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations;

    /*
     * The resourceGuid property of the virtual network tap.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network tap. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The reference to the private IP Address of the collector nic that will
     * receive the tap
     */
    @JsonProperty(value = "properties.destinationNetworkInterfaceIPConfiguration")
    private NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration;

    /*
     * The reference to the private IP address on the internal Load Balancer
     * that will receive the tap
     */
    @JsonProperty(value = "properties.destinationLoadBalancerFrontEndIPConfiguration")
    private FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration;

    /*
     * The VXLAN destination port that will receive the tapped traffic.
     */
    @JsonProperty(value = "properties.destinationPort")
    private Integer destinationPort;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the networkInterfaceTapConfigurations property: Specifies the list of resource IDs for the network interface
     * IP configuration that needs to be tapped.
     *
     * @return the networkInterfaceTapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> networkInterfaceTapConfigurations() {
        return this.networkInterfaceTapConfigurations;
    }

    /**
     * Get the resourceGuid property: The resourceGuid property of the virtual network tap.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network tap. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     *
     * @return the destinationNetworkInterfaceIpConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration() {
        return this.destinationNetworkInterfaceIpConfiguration;
    }

    /**
     * Set the destinationNetworkInterfaceIpConfiguration property: The reference to the private IP Address of the
     * collector nic that will receive the tap.
     *
     * @param destinationNetworkInterfaceIpConfiguration the destinationNetworkInterfaceIpConfiguration value to set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationNetworkInterfaceIpConfiguration(
        NetworkInterfaceIpConfigurationInner destinationNetworkInterfaceIpConfiguration) {
        this.destinationNetworkInterfaceIpConfiguration = destinationNetworkInterfaceIpConfiguration;
        return this;
    }

    /**
     * Get the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     *
     * @return the destinationLoadBalancerFrontEndIpConfiguration value.
     */
    public FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration() {
        return this.destinationLoadBalancerFrontEndIpConfiguration;
    }

    /**
     * Set the destinationLoadBalancerFrontEndIpConfiguration property: The reference to the private IP address on the
     * internal Load Balancer that will receive the tap.
     *
     * @param destinationLoadBalancerFrontEndIpConfiguration the destinationLoadBalancerFrontEndIpConfiguration value to
     *     set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationLoadBalancerFrontEndIpConfiguration(
        FrontendIpConfigurationInner destinationLoadBalancerFrontEndIpConfiguration) {
        this.destinationLoadBalancerFrontEndIpConfiguration = destinationLoadBalancerFrontEndIpConfiguration;
        return this;
    }

    /**
     * Get the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     *
     * @return the destinationPort value.
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destinationPort property: The VXLAN destination port that will receive the tapped traffic.
     *
     * @param destinationPort the destinationPort value to set.
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
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
     * @return the VirtualNetworkTapInner object itself.
     */
    public VirtualNetworkTapInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkTapInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkTapInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaceTapConfigurations() != null) {
            networkInterfaceTapConfigurations().forEach(e -> e.validate());
        }
        if (destinationNetworkInterfaceIpConfiguration() != null) {
            destinationNetworkInterfaceIpConfiguration().validate();
        }
        if (destinationLoadBalancerFrontEndIpConfiguration() != null) {
            destinationLoadBalancerFrontEndIpConfiguration().validate();
        }
    }
}

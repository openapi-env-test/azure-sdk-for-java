// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.generated.models.BackendAddressPool;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IPConfiguration in a network interface. */
@JsonFlatten
@Fluent
public class NetworkInterfaceIpConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceIpConfigurationInner.class);

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
     * The reference of ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "properties.applicationGatewayBackendAddressPools")
    private List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools;

    /*
     * The reference of LoadBalancerBackendAddressPool resource.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddressPools")
    private List<BackendAddressPool> loadBalancerBackendAddressPools;

    /*
     * A list of references of LoadBalancerInboundNatRules.
     */
    @JsonProperty(value = "properties.loadBalancerInboundNatRules")
    private List<InboundNatRuleInner> loadBalancerInboundNatRules;

    /*
     * The privateIPAddress property.
     */
    @JsonProperty(value = "properties.privateIPAddress")
    private String privateIpAddress;

    /*
     * Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'.
     */
    @JsonProperty(value = "properties.privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * Available from Api-Version 2016-03-30 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "properties.privateIPAddressVersion")
    private IpVersion privateIpAddressVersion;

    /*
     * Subnet in a virtual network resource.
     */
    @JsonProperty(value = "properties.subnet")
    private SubnetInner subnet;

    /*
     * Gets whether this is a primary customer address on the network
     * interface.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /*
     * Public IP address resource.
     */
    @JsonProperty(value = "properties.publicIPAddress")
    private PublicIpAddressInner publicIpAddress;

    /*
     * The provisioningState property.
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
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withName(String name) {
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
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: The reference of ApplicationGatewayBackendAddressPool
     * resource.
     *
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools() {
        return this.applicationGatewayBackendAddressPools;
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: The reference of ApplicationGatewayBackendAddressPool
     * resource.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withApplicationGatewayBackendAddressPools(
        List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools) {
        this.applicationGatewayBackendAddressPools = applicationGatewayBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: The reference of LoadBalancerBackendAddressPool resource.
     *
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<BackendAddressPool> loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * Set the loadBalancerBackendAddressPools property: The reference of LoadBalancerBackendAddressPool resource.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withLoadBalancerBackendAddressPools(
        List<BackendAddressPool> loadBalancerBackendAddressPools) {
        this.loadBalancerBackendAddressPools = loadBalancerBackendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancerInboundNatRules property: A list of references of LoadBalancerInboundNatRules.
     *
     * @return the loadBalancerInboundNatRules value.
     */
    public List<InboundNatRuleInner> loadBalancerInboundNatRules() {
        return this.loadBalancerInboundNatRules;
    }

    /**
     * Set the loadBalancerInboundNatRules property: A list of references of LoadBalancerInboundNatRules.
     *
     * @param loadBalancerInboundNatRules the loadBalancerInboundNatRules value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withLoadBalancerInboundNatRules(
        List<InboundNatRuleInner> loadBalancerInboundNatRules) {
        this.loadBalancerInboundNatRules = loadBalancerInboundNatRules;
        return this;
    }

    /**
     * Get the privateIpAddress property: The privateIPAddress property.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The privateIPAddress property.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2016-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.privateIpAddressVersion;
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2016-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        this.privateIpAddressVersion = privateIpAddressVersion;
        return this;
    }

    /**
     * Get the subnet property: Subnet in a virtual network resource.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: Subnet in a virtual network resource.
     *
     * @param subnet the subnet value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withSubnet(SubnetInner subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the primary property: Gets whether this is a primary customer address on the network interface.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Gets whether this is a primary customer address on the network interface.
     *
     * @param primary the primary value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the publicIpAddress property: Public IP address resource.
     *
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: Public IP address resource.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioningState property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkInterfaceIpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationGatewayBackendAddressPools() != null) {
            applicationGatewayBackendAddressPools().forEach(e -> e.validate());
        }
        if (loadBalancerBackendAddressPools() != null) {
            loadBalancerBackendAddressPools().forEach(e -> e.validate());
        }
        if (loadBalancerInboundNatRules() != null) {
            loadBalancerInboundNatRules().forEach(e -> e.validate());
        }
        if (subnet() != null) {
            subnet().validate();
        }
        if (publicIpAddress() != null) {
            publicIpAddress().validate();
        }
    }
}

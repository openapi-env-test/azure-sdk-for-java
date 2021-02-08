// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import java.util.List;

/** An immutable client-side representation of NetworkInterfaceIpConfiguration. */
public interface NetworkInterfaceIpConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the applicationGatewayBackendAddressPools property: The reference of ApplicationGatewayBackendAddressPool
     * resource.
     *
     * @return the applicationGatewayBackendAddressPools value.
     */
    List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools();

    /**
     * Gets the loadBalancerBackendAddressPools property: The reference of LoadBalancerBackendAddressPool resource.
     *
     * @return the loadBalancerBackendAddressPools value.
     */
    List<BackendAddressPool> loadBalancerBackendAddressPools();

    /**
     * Gets the loadBalancerInboundNatRules property: A list of references of LoadBalancerInboundNatRules.
     *
     * @return the loadBalancerInboundNatRules value.
     */
    List<InboundNatRule> loadBalancerInboundNatRules();

    /**
     * Gets the privateIpAddress property: Private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the privateIpAddressVersion property: Available from Api-Version 2016-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the privateIpAddressVersion value.
     */
    IpVersion privateIpAddressVersion();

    /**
     * Gets the subnet property: Subnet bound to the IP configuration.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the primary property: Gets whether this is a primary customer address on the network interface.
     *
     * @return the primary value.
     */
    Boolean primary();

    /**
     * Gets the publicIpAddress property: Public IP address bound to the IP configuration.
     *
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the applicationSecurityGroups property: Application security groups in which the IP configuration is
     * included.
     *
     * @return the applicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> applicationSecurityGroups();

    /**
     * Gets the provisioningState property: The provisioning state of the network interface IP configuration. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner
     * object.
     *
     * @return the inner object.
     */
    NetworkInterfaceIpConfigurationInner innerModel();
}

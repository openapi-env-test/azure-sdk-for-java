// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationPropertiesFormatInner;
import java.util.List;

/** An immutable client-side representation of FrontendIpConfigurationPropertiesFormat. */
public interface FrontendIpConfigurationPropertiesFormat {
    /**
     * Gets the inboundNatRules property: An array of references to inbound rules that use this frontend IP.
     *
     * @return the inboundNatRules value.
     */
    List<SubResource> inboundNatRules();

    /**
     * Gets the inboundNatPools property: An array of references to inbound pools that use this frontend IP.
     *
     * @return the inboundNatPools value.
     */
    List<SubResource> inboundNatPools();

    /**
     * Gets the outboundRules property: An array of references to outbound rules that use this frontend IP.
     *
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * Gets the loadBalancingRules property: An array of references to load balancing rules that use this frontend IP.
     *
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * Gets the privateIpAddress property: The private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The Private IP allocation method.
     *
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the privateIpAddressVersion property: Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken
     * as IPv4.
     *
     * @return the privateIpAddressVersion value.
     */
    IpVersion privateIpAddressVersion();

    /**
     * Gets the subnet property: The reference to the subnet resource.
     *
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the publicIpAddress property: The reference to the Public IP resource.
     *
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the publicIpPrefix property: The reference to the Public IP Prefix resource.
     *
     * @return the publicIpPrefix value.
     */
    SubResource publicIpPrefix();

    /**
     * Gets the gatewayLoadBalancer property: The reference to gateway load balancer frontend IP.
     *
     * @return the gatewayLoadBalancer value.
     */
    SubResource gatewayLoadBalancer();

    /**
     * Gets the provisioningState property: The provisioning state of the frontend IP configuration resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationPropertiesFormatInner object.
     *
     * @return the inner object.
     */
    FrontendIpConfigurationPropertiesFormatInner innerModel();
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionPropertiesFormatInner;
import java.util.List;

/** An immutable client-side representation of VirtualNetworkGatewayConnectionPropertiesFormat. */
public interface VirtualNetworkGatewayConnectionPropertiesFormat {
    /**
     * Gets the authorizationKey property: The authorizationKey.
     *
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * Gets the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway1 value.
     */
    VirtualNetworkGateway virtualNetworkGateway1();

    /**
     * Gets the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway2 value.
     */
    VirtualNetworkGateway virtualNetworkGateway2();

    /**
     * Gets the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @return the localNetworkGateway2 value.
     */
    LocalNetworkGateway localNetworkGateway2();

    /**
     * Gets the ingressNatRules property: List of ingress NatRules.
     *
     * @return the ingressNatRules value.
     */
    List<SubResource> ingressNatRules();

    /**
     * Gets the egressNatRules property: List of egress NatRules.
     *
     * @return the egressNatRules value.
     */
    List<SubResource> egressNatRules();

    /**
     * Gets the connectionType property: Gateway connection type.
     *
     * @return the connectionType value.
     */
    VirtualNetworkGatewayConnectionType connectionType();

    /**
     * Gets the connectionProtocol property: Connection protocol used for this connection.
     *
     * @return the connectionProtocol value.
     */
    VirtualNetworkGatewayConnectionProtocol connectionProtocol();

    /**
     * Gets the routingWeight property: The routing weight.
     *
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * Gets the dpdTimeoutSeconds property: The dead peer detection timeout of this connection in seconds.
     *
     * @return the dpdTimeoutSeconds value.
     */
    Integer dpdTimeoutSeconds();

    /**
     * Gets the connectionMode property: The connection mode for this connection.
     *
     * @return the connectionMode value.
     */
    VirtualNetworkGatewayConnectionMode connectionMode();

    /**
     * Gets the sharedKey property: The IPSec shared key.
     *
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * Gets the connectionStatus property: Virtual Network Gateway connection status.
     *
     * @return the connectionStatus value.
     */
    VirtualNetworkGatewayConnectionStatus connectionStatus();

    /**
     * Gets the tunnelConnectionStatus property: Collection of all tunnels' connection health status.
     *
     * @return the tunnelConnectionStatus value.
     */
    List<TunnelConnectionHealth> tunnelConnectionStatus();

    /**
     * Gets the egressBytesTransferred property: The egress bytes transferred in this connection.
     *
     * @return the egressBytesTransferred value.
     */
    Long egressBytesTransferred();

    /**
     * Gets the ingressBytesTransferred property: The ingress bytes transferred in this connection.
     *
     * @return the ingressBytesTransferred value.
     */
    Long ingressBytesTransferred();

    /**
     * Gets the peer property: The reference to peerings resource.
     *
     * @return the peer value.
     */
    SubResource peer();

    /**
     * Gets the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    Boolean enableBgp();

    /**
     * Gets the gatewayCustomBgpIpAddresses property: GatewayCustomBgpIpAddresses to be used for virtual network gateway
     * Connection.
     *
     * @return the gatewayCustomBgpIpAddresses value.
     */
    List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses();

    /**
     * Gets the useLocalAzureIpAddress property: Use private local Azure IP for the connection.
     *
     * @return the useLocalAzureIpAddress value.
     */
    Boolean useLocalAzureIpAddress();

    /**
     * Gets the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    Boolean usePolicyBasedTrafficSelectors();

    /**
     * Gets the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    List<IpsecPolicy> ipsecPolicies();

    /**
     * Gets the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    List<TrafficSelectorPolicy> trafficSelectorPolicies();

    /**
     * Gets the resourceGuid property: The resource GUID property of the virtual network gateway connection resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network gateway connection resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @return the expressRouteGatewayBypass value.
     */
    Boolean expressRouteGatewayBypass();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayConnectionPropertiesFormatInner
     * object.
     *
     * @return the inner object.
     */
    VirtualNetworkGatewayConnectionPropertiesFormatInner innerModel();
}

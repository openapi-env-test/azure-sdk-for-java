// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.GatewayCustomBgpIpAddressIpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.generated.models.TunnelConnectionHealth;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkConnectionGatewayReference;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionMode;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionStatus;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VirtualNetworkGatewayConnection properties. */
@Fluent
public final class VirtualNetworkGatewayConnectionListEntityPropertiesFormat {
    /*
     * The authorizationKey.
     */
    @JsonProperty(value = "authorizationKey")
    private String authorizationKey;

    /*
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "virtualNetworkGateway1", required = true)
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway1;

    /*
     * The reference to virtual network gateway resource.
     */
    @JsonProperty(value = "virtualNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference virtualNetworkGateway2;

    /*
     * The reference to local network gateway resource.
     */
    @JsonProperty(value = "localNetworkGateway2")
    private VirtualNetworkConnectionGatewayReference localNetworkGateway2;

    /*
     * Gateway connection type.
     */
    @JsonProperty(value = "connectionType", required = true)
    private VirtualNetworkGatewayConnectionType connectionType;

    /*
     * Connection protocol used for this connection.
     */
    @JsonProperty(value = "connectionProtocol")
    private VirtualNetworkGatewayConnectionProtocol connectionProtocol;

    /*
     * The routing weight.
     */
    @JsonProperty(value = "routingWeight")
    private Integer routingWeight;

    /*
     * The connection mode for this connection.
     */
    @JsonProperty(value = "connectionMode")
    private VirtualNetworkGatewayConnectionMode connectionMode;

    /*
     * The IPSec shared key.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /*
     * Virtual Network Gateway connection status.
     */
    @JsonProperty(value = "connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualNetworkGatewayConnectionStatus connectionStatus;

    /*
     * Collection of all tunnels' connection health status.
     */
    @JsonProperty(value = "tunnelConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<TunnelConnectionHealth> tunnelConnectionStatus;

    /*
     * The egress bytes transferred in this connection.
     */
    @JsonProperty(value = "egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * The ingress bytes transferred in this connection.
     */
    @JsonProperty(value = "ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * The reference to peerings resource.
     */
    @JsonProperty(value = "peer")
    private SubResource peer;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "enableBgp")
    private Boolean enableBgp;

    /*
     * GatewayCustomBgpIpAddresses to be used for virtual network gateway
     * Connection.
     */
    @JsonProperty(value = "gatewayCustomBgpIpAddresses")
    private List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * The Traffic Selector Policies to be considered by this connection.
     */
    @JsonProperty(value = "trafficSelectorPolicies")
    private List<TrafficSelectorPolicy> trafficSelectorPolicies;

    /*
     * The resource GUID property of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network gateway connection
     * resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Bypass ExpressRoute Gateway for data forwarding.
     */
    @JsonProperty(value = "expressRouteGatewayBypass")
    private Boolean expressRouteGatewayBypass;

    /**
     * Get the authorizationKey property: The authorizationKey.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway1 value.
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }

    /**
     * Set the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withVirtualNetworkGateway1(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway1) {
        this.virtualNetworkGateway1 = virtualNetworkGateway1;
        return this;
    }

    /**
     * Get the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.virtualNetworkGateway2;
    }

    /**
     * Set the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withVirtualNetworkGateway2(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway2) {
        this.virtualNetworkGateway2 = virtualNetworkGateway2;
        return this;
    }

    /**
     * Get the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @return the localNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.localNetworkGateway2;
    }

    /**
     * Set the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withLocalNetworkGateway2(
        VirtualNetworkConnectionGatewayReference localNetworkGateway2) {
        this.localNetworkGateway2 = localNetworkGateway2;
        return this;
    }

    /**
     * Get the connectionType property: Gateway connection type.
     *
     * @return the connectionType value.
     */
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: Gateway connection type.
     *
     * @param connectionType the connectionType value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withConnectionType(
        VirtualNetworkGatewayConnectionType connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the connectionProtocol property: Connection protocol used for this connection.
     *
     * @return the connectionProtocol value.
     */
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.connectionProtocol;
    }

    /**
     * Set the connectionProtocol property: Connection protocol used for this connection.
     *
     * @param connectionProtocol the connectionProtocol value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withConnectionProtocol(
        VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        this.connectionProtocol = connectionProtocol;
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: The routing weight.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the connectionMode property: The connection mode for this connection.
     *
     * @return the connectionMode value.
     */
    public VirtualNetworkGatewayConnectionMode connectionMode() {
        return this.connectionMode;
    }

    /**
     * Set the connectionMode property: The connection mode for this connection.
     *
     * @param connectionMode the connectionMode value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withConnectionMode(
        VirtualNetworkGatewayConnectionMode connectionMode) {
        this.connectionMode = connectionMode;
        return this;
    }

    /**
     * Get the sharedKey property: The IPSec shared key.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The IPSec shared key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the connectionStatus property: Virtual Network Gateway connection status.
     *
     * @return the connectionStatus value.
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the tunnelConnectionStatus property: Collection of all tunnels' connection health status.
     *
     * @return the tunnelConnectionStatus value.
     */
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }

    /**
     * Get the egressBytesTransferred property: The egress bytes transferred in this connection.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the ingressBytesTransferred property: The ingress bytes transferred in this connection.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the peer property: The reference to peerings resource.
     *
     * @return the peer value.
     */
    public SubResource peer() {
        return this.peer;
    }

    /**
     * Set the peer property: The reference to peerings resource.
     *
     * @param peer the peer value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withPeer(SubResource peer) {
        this.peer = peer;
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the gatewayCustomBgpIpAddresses property: GatewayCustomBgpIpAddresses to be used for virtual network gateway
     * Connection.
     *
     * @return the gatewayCustomBgpIpAddresses value.
     */
    public List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses() {
        return this.gatewayCustomBgpIpAddresses;
    }

    /**
     * Set the gatewayCustomBgpIpAddresses property: GatewayCustomBgpIpAddresses to be used for virtual network gateway
     * Connection.
     *
     * @param gatewayCustomBgpIpAddresses the gatewayCustomBgpIpAddresses value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withGatewayCustomBgpIpAddresses(
        List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses) {
        this.gatewayCustomBgpIpAddresses = gatewayCustomBgpIpAddresses;
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withUsePolicyBasedTrafficSelectors(
        Boolean usePolicyBasedTrafficSelectors) {
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withIpsecPolicies(
        List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }

    /**
     * Set the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withTrafficSelectorPolicies(
        List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway connection resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }

    /**
     * Set the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityPropertiesFormat withExpressRouteGatewayBypass(
        Boolean expressRouteGatewayBypass) {
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkGateway1() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetworkGateway1 in model"
                            + " VirtualNetworkGatewayConnectionListEntityPropertiesFormat"));
        } else {
            virtualNetworkGateway1().validate();
        }
        if (virtualNetworkGateway2() != null) {
            virtualNetworkGateway2().validate();
        }
        if (localNetworkGateway2() != null) {
            localNetworkGateway2().validate();
        }
        if (connectionType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property connectionType in model"
                            + " VirtualNetworkGatewayConnectionListEntityPropertiesFormat"));
        }
        if (tunnelConnectionStatus() != null) {
            tunnelConnectionStatus().forEach(e -> e.validate());
        }
        if (gatewayCustomBgpIpAddresses() != null) {
            gatewayCustomBgpIpAddresses().forEach(e -> e.validate());
        }
        if (ipsecPolicies() != null) {
            ipsecPolicies().forEach(e -> e.validate());
        }
        if (trafficSelectorPolicies() != null) {
            trafficSelectorPolicies().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER =
        new ClientLogger(VirtualNetworkGatewayConnectionListEntityPropertiesFormat.class);
}

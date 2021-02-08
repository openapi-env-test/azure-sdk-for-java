// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VpnConnectionStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VpnConnection Resource. */
@JsonFlatten
@Fluent
public class VpnConnectionInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnConnectionInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Id of the connected vpn site.
     */
    @JsonProperty(value = "properties.remoteVpnSite")
    private SubResource remoteVpnSite;

    /*
     * Routing weight for vpn connection.
     */
    @JsonProperty(value = "properties.routingWeight")
    private Integer routingWeight;

    /*
     * The connection status.
     */
    @JsonProperty(value = "properties.connectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private VpnConnectionStatus connectionStatus;

    /*
     * Connection protocol used for this connection.
     */
    @JsonProperty(value = "properties.vpnConnectionProtocolType")
    private VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType;

    /*
     * Ingress bytes transferred.
     */
    @JsonProperty(value = "properties.ingressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long ingressBytesTransferred;

    /*
     * Egress bytes transferred.
     */
    @JsonProperty(value = "properties.egressBytesTransferred", access = JsonProperty.Access.WRITE_ONLY)
    private Long egressBytesTransferred;

    /*
     * Expected bandwidth in MBPS.
     */
    @JsonProperty(value = "properties.connectionBandwidth")
    private Integer connectionBandwidth;

    /*
     * SharedKey for the vpn connection.
     */
    @JsonProperty(value = "properties.sharedKey")
    private String sharedKey;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableBgp")
    private Boolean enableBgp;

    /*
     * Enable policy-based traffic selectors.
     */
    @JsonProperty(value = "properties.usePolicyBasedTrafficSelectors")
    private Boolean usePolicyBasedTrafficSelectors;

    /*
     * The IPSec Policies to be considered by this connection.
     */
    @JsonProperty(value = "properties.ipsecPolicies")
    private List<IpsecPolicy> ipsecPolicies;

    /*
     * EnableBgp flag.
     */
    @JsonProperty(value = "properties.enableRateLimiting")
    private Boolean enableRateLimiting;

    /*
     * Enable internet security.
     */
    @JsonProperty(value = "properties.enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * Use local azure ip to initiate connection.
     */
    @JsonProperty(value = "properties.useLocalAzureIpAddress")
    private Boolean useLocalAzureIpAddress;

    /*
     * The provisioning state of the VPN connection resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * List of all vpn site link connections to the gateway.
     */
    @JsonProperty(value = "properties.vpnLinkConnections")
    private List<VpnSiteLinkConnectionInner> vpnLinkConnections;

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
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withName(String name) {
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
     * Get the remoteVpnSite property: Id of the connected vpn site.
     *
     * @return the remoteVpnSite value.
     */
    public SubResource remoteVpnSite() {
        return this.remoteVpnSite;
    }

    /**
     * Set the remoteVpnSite property: Id of the connected vpn site.
     *
     * @param remoteVpnSite the remoteVpnSite value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRemoteVpnSite(SubResource remoteVpnSite) {
        this.remoteVpnSite = remoteVpnSite;
        return this;
    }

    /**
     * Get the routingWeight property: Routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: Routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.connectionStatus;
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.vpnConnectionProtocolType;
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withVpnConnectionProtocolType(
        VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.egressBytesTransferred;
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.connectionBandwidth;
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withConnectionBandwidth(Integer connectionBandwidth) {
        this.connectionBandwidth = connectionBandwidth;
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
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
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
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
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
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
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        this.ipsecPolicies = ipsecPolicies;
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.enableRateLimiting;
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableRateLimiting(Boolean enableRateLimiting) {
        this.enableRateLimiting = enableRateLimiting;
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
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @return the useLocalAzureIpAddress value.
     */
    public Boolean useLocalAzureIpAddress() {
        return this.useLocalAzureIpAddress;
    }

    /**
     * Set the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @param useLocalAzureIpAddress the useLocalAzureIpAddress value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     *
     * @return the vpnLinkConnections value.
     */
    public List<VpnSiteLinkConnectionInner> vpnLinkConnections() {
        return this.vpnLinkConnections;
    }

    /**
     * Set the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     *
     * @param vpnLinkConnections the vpnLinkConnections value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withVpnLinkConnections(List<VpnSiteLinkConnectionInner> vpnLinkConnections) {
        this.vpnLinkConnections = vpnLinkConnections;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipsecPolicies() != null) {
            ipsecPolicies().forEach(e -> e.validate());
        }
        if (vpnLinkConnections() != null) {
            vpnLinkConnections().forEach(e -> e.validate());
        }
    }
}

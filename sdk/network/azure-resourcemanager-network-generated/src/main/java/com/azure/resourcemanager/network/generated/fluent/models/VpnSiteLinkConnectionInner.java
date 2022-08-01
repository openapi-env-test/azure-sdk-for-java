// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.GatewayCustomBgpIpAddressIpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpsecPolicy;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VpnConnectionStatus;
import com.azure.resourcemanager.network.generated.models.VpnLinkConnectionMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VpnSiteLinkConnection Resource. */
@Fluent
public final class VpnSiteLinkConnectionInner extends SubResource {
    /*
     * Properties of the VPN site link connection.
     */
    @JsonProperty(value = "properties")
    private VpnSiteLinkConnectionProperties innerProperties;

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
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the VPN site link connection.
     *
     * @return the innerProperties value.
     */
    private VpnSiteLinkConnectionProperties innerProperties() {
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
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withName(String name) {
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

    /** {@inheritDoc} */
    @Override
    public VpnSiteLinkConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the vpnSiteLink property: Id of the connected vpn site link.
     *
     * @return the vpnSiteLink value.
     */
    public SubResource vpnSiteLink() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnSiteLink();
    }

    /**
     * Set the vpnSiteLink property: Id of the connected vpn site link.
     *
     * @param vpnSiteLink the vpnSiteLink value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withVpnSiteLink(SubResource vpnSiteLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withVpnSiteLink(vpnSiteLink);
        return this;
    }

    /**
     * Get the routingWeight property: Routing weight for vpn connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().routingWeight();
    }

    /**
     * Set the routingWeight property: Routing weight for vpn connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withRoutingWeight(Integer routingWeight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withRoutingWeight(routingWeight);
        return this;
    }

    /**
     * Get the vpnLinkConnectionMode property: Vpn link connection mode.
     *
     * @return the vpnLinkConnectionMode value.
     */
    public VpnLinkConnectionMode vpnLinkConnectionMode() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnLinkConnectionMode();
    }

    /**
     * Set the vpnLinkConnectionMode property: Vpn link connection mode.
     *
     * @param vpnLinkConnectionMode the vpnLinkConnectionMode value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withVpnLinkConnectionMode(VpnLinkConnectionMode vpnLinkConnectionMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withVpnLinkConnectionMode(vpnLinkConnectionMode);
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     *
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStatus();
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnConnectionProtocolType();
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     *
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withVpnConnectionProtocolType(
        VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withVpnConnectionProtocolType(vpnConnectionProtocolType);
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressBytesTransferred();
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().egressBytesTransferred();
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionBandwidth();
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     *
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withConnectionBandwidth(Integer connectionBandwidth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withConnectionBandwidth(connectionBandwidth);
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedKey();
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withSharedKey(String sharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withSharedKey(sharedKey);
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgp();
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withEnableBgp(Boolean enableBgp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withEnableBgp(enableBgp);
        return this;
    }

    /**
     * Get the vpnGatewayCustomBgpAddresses property: vpnGatewayCustomBgpAddresses used by this connection.
     *
     * @return the vpnGatewayCustomBgpAddresses value.
     */
    public List<GatewayCustomBgpIpAddressIpConfiguration> vpnGatewayCustomBgpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnGatewayCustomBgpAddresses();
    }

    /**
     * Set the vpnGatewayCustomBgpAddresses property: vpnGatewayCustomBgpAddresses used by this connection.
     *
     * @param vpnGatewayCustomBgpAddresses the vpnGatewayCustomBgpAddresses value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withVpnGatewayCustomBgpAddresses(
        List<GatewayCustomBgpIpAddressIpConfiguration> vpnGatewayCustomBgpAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withVpnGatewayCustomBgpAddresses(vpnGatewayCustomBgpAddresses);
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerProperties() == null ? null : this.innerProperties().usePolicyBasedTrafficSelectors();
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withUsePolicyBasedTrafficSelectors(usePolicyBasedTrafficSelectors);
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().ipsecPolicies();
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     *
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.innerProperties() == null ? null : this.innerProperties().enableRateLimiting();
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     *
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withEnableRateLimiting(Boolean enableRateLimiting) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withEnableRateLimiting(enableRateLimiting);
        return this;
    }

    /**
     * Get the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @return the useLocalAzureIpAddress value.
     */
    public Boolean useLocalAzureIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().useLocalAzureIpAddress();
    }

    /**
     * Set the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     *
     * @param useLocalAzureIpAddress the useLocalAzureIpAddress value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withUseLocalAzureIpAddress(useLocalAzureIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site link connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the ingressNatRules property: List of ingress NatRules.
     *
     * @return the ingressNatRules value.
     */
    public List<SubResource> ingressNatRules() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressNatRules();
    }

    /**
     * Set the ingressNatRules property: List of ingress NatRules.
     *
     * @param ingressNatRules the ingressNatRules value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withIngressNatRules(List<SubResource> ingressNatRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withIngressNatRules(ingressNatRules);
        return this;
    }

    /**
     * Get the egressNatRules property: List of egress NatRules.
     *
     * @return the egressNatRules value.
     */
    public List<SubResource> egressNatRules() {
        return this.innerProperties() == null ? null : this.innerProperties().egressNatRules();
    }

    /**
     * Set the egressNatRules property: List of egress NatRules.
     *
     * @param egressNatRules the egressNatRules value to set.
     * @return the VpnSiteLinkConnectionInner object itself.
     */
    public VpnSiteLinkConnectionInner withEgressNatRules(List<SubResource> egressNatRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnSiteLinkConnectionProperties();
        }
        this.innerProperties().withEgressNatRules(egressNatRules);
        return this;
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.generated.models.VpnClientConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnGatewayGeneration;
import com.azure.resourcemanager.network.generated.models.VpnType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A common class for general resource information. */
@Fluent
public final class VirtualNetworkGatewayInner extends Resource {
    /*
     * Properties of the virtual network gateway.
     */
    @JsonProperty(value = "properties", required = true)
    private VirtualNetworkGatewayPropertiesFormat innerProperties = new VirtualNetworkGatewayPropertiesFormat();

    /*
     * The extended location of type local virtual network gateway.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the virtual network gateway.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkGatewayPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extendedLocation property: The extended location of type local virtual network gateway.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of type local virtual network gateway.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
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
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configurations for virtual network gateway.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualNetworkGatewayIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: IP configurations for virtual network gateway.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withIpConfigurations(
        List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the gatewayType property: The type of this virtual network gateway.
     *
     * @return the gatewayType value.
     */
    public VirtualNetworkGatewayType gatewayType() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayType();
    }

    /**
     * Set the gatewayType property: The type of this virtual network gateway.
     *
     * @param gatewayType the gatewayType value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withGatewayType(VirtualNetworkGatewayType gatewayType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withGatewayType(gatewayType);
        return this;
    }

    /**
     * Get the vpnType property: The type of this virtual network gateway.
     *
     * @return the vpnType value.
     */
    public VpnType vpnType() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnType();
    }

    /**
     * Set the vpnType property: The type of this virtual network gateway.
     *
     * @param vpnType the vpnType value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnType(VpnType vpnType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withVpnType(vpnType);
        return this;
    }

    /**
     * Get the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     *
     * @return the vpnGatewayGeneration value.
     */
    public VpnGatewayGeneration vpnGatewayGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnGatewayGeneration();
    }

    /**
     * Set the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     *
     * @param vpnGatewayGeneration the vpnGatewayGeneration value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withVpnGatewayGeneration(vpnGatewayGeneration);
        return this;
    }

    /**
     * Get the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgp();
    }

    /**
     * Set the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEnableBgp(Boolean enableBgp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withEnableBgp(enableBgp);
        return this;
    }

    /**
     * Get the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     *
     * @return the enablePrivateIpAddress value.
     */
    public Boolean enablePrivateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().enablePrivateIpAddress();
    }

    /**
     * Set the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     *
     * @param enablePrivateIpAddress the enablePrivateIpAddress value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withEnablePrivateIpAddress(enablePrivateIpAddress);
        return this;
    }

    /**
     * Get the active property: ActiveActive flag.
     *
     * @return the active value.
     */
    public Boolean active() {
        return this.innerProperties() == null ? null : this.innerProperties().active();
    }

    /**
     * Set the active property: ActiveActive flag.
     *
     * @param active the active value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withActive(Boolean active) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withActive(active);
        return this;
    }

    /**
     * Get the disableIpSecReplayProtection property: disableIPSecReplayProtection flag.
     *
     * @return the disableIpSecReplayProtection value.
     */
    public Boolean disableIpSecReplayProtection() {
        return this.innerProperties() == null ? null : this.innerProperties().disableIpSecReplayProtection();
    }

    /**
     * Set the disableIpSecReplayProtection property: disableIPSecReplayProtection flag.
     *
     * @param disableIpSecReplayProtection the disableIpSecReplayProtection value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withDisableIpSecReplayProtection(Boolean disableIpSecReplayProtection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withDisableIpSecReplayProtection(disableIpSecReplayProtection);
        return this;
    }

    /**
     * Get the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @return the gatewayDefaultSite value.
     */
    public SubResource gatewayDefaultSite() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayDefaultSite();
    }

    /**
     * Set the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     *
     * @param gatewayDefaultSite the gatewayDefaultSite value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withGatewayDefaultSite(gatewayDefaultSite);
        return this;
    }

    /**
     * Get the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     *
     * @return the sku value.
     */
    public VirtualNetworkGatewaySku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     *
     * @param sku the sku value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withSku(VirtualNetworkGatewaySku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     *
     * @return the vpnClientConfiguration value.
     */
    public VpnClientConfiguration vpnClientConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientConfiguration();
    }

    /**
     * Set the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     *
     * @param vpnClientConfiguration the vpnClientConfiguration value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withVpnClientConfiguration(vpnClientConfiguration);
        return this;
    }

    /**
     * Get the bgpSettings property: Virtual network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpSettings();
    }

    /**
     * Set the bgpSettings property: Virtual network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withBgpSettings(bgpSettings);
        return this;
    }

    /**
     * Get the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     *
     * @return the customRoutes value.
     */
    public AddressSpace customRoutes() {
        return this.innerProperties() == null ? null : this.innerProperties().customRoutes();
    }

    /**
     * Set the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     *
     * @param customRoutes the customRoutes value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withCustomRoutes(AddressSpace customRoutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withCustomRoutes(customRoutes);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     *
     * @return the enableDnsForwarding value.
     */
    public Boolean enableDnsForwarding() {
        return this.innerProperties() == null ? null : this.innerProperties().enableDnsForwarding();
    }

    /**
     * Set the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     *
     * @param enableDnsForwarding the enableDnsForwarding value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEnableDnsForwarding(Boolean enableDnsForwarding) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withEnableDnsForwarding(enableDnsForwarding);
        return this;
    }

    /**
     * Get the inboundDnsForwardingEndpoint property: The IP address allocated by the gateway to which dns requests can
     * be sent.
     *
     * @return the inboundDnsForwardingEndpoint value.
     */
    public String inboundDnsForwardingEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().inboundDnsForwardingEndpoint();
    }

    /**
     * Get the vNetExtendedLocationResourceId property: Customer vnet resource id. VirtualNetworkGateway of type local
     * gateway is associated with the customer vnet.
     *
     * @return the vNetExtendedLocationResourceId value.
     */
    public String vNetExtendedLocationResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().vNetExtendedLocationResourceId();
    }

    /**
     * Set the vNetExtendedLocationResourceId property: Customer vnet resource id. VirtualNetworkGateway of type local
     * gateway is associated with the customer vnet.
     *
     * @param vNetExtendedLocationResourceId the vNetExtendedLocationResourceId value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withVNetExtendedLocationResourceId(String vNetExtendedLocationResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withVNetExtendedLocationResourceId(vNetExtendedLocationResourceId);
        return this;
    }

    /**
     * Get the natRules property: NatRules for virtual network gateway.
     *
     * @return the natRules value.
     */
    public List<VirtualNetworkGatewayNatRuleInner> natRules() {
        return this.innerProperties() == null ? null : this.innerProperties().natRules();
    }

    /**
     * Set the natRules property: NatRules for virtual network gateway.
     *
     * @param natRules the natRules value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withNatRules(List<VirtualNetworkGatewayNatRuleInner> natRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withNatRules(natRules);
        return this;
    }

    /**
     * Get the enableBgpRouteTranslationForNat property: EnableBgpRouteTranslationForNat flag.
     *
     * @return the enableBgpRouteTranslationForNat value.
     */
    public Boolean enableBgpRouteTranslationForNat() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgpRouteTranslationForNat();
    }

    /**
     * Set the enableBgpRouteTranslationForNat property: EnableBgpRouteTranslationForNat flag.
     *
     * @param enableBgpRouteTranslationForNat the enableBgpRouteTranslationForNat value to set.
     * @return the VirtualNetworkGatewayInner object itself.
     */
    public VirtualNetworkGatewayInner withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayPropertiesFormat();
        }
        this.innerProperties().withEnableBgpRouteTranslationForNat(enableBgpRouteTranslationForNat);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model VirtualNetworkGatewayInner"));
        } else {
            innerProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkGatewayInner.class);
}

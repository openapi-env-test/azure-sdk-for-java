// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for VirtualNetworkGatewayNatRule. */
@Fluent
public final class VirtualNetworkGatewayNatRuleProperties {
    /*
     * The provisioning state of the NAT Rule resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The type of NAT rule for VPN NAT.
     */
    @JsonProperty(value = "type")
    private VpnNatRuleType type;

    /*
     * The Source NAT direction of a VPN NAT.
     */
    @JsonProperty(value = "mode")
    private VpnNatRuleMode mode;

    /*
     * The private IP address internal mapping for NAT.
     */
    @JsonProperty(value = "internalMappings")
    private List<VpnNatRuleMapping> internalMappings;

    /*
     * The private IP address external mapping for NAT.
     */
    @JsonProperty(value = "externalMappings")
    private List<VpnNatRuleMapping> externalMappings;

    /*
     * The IP Configuration ID this NAT rule applies to.
     */
    @JsonProperty(value = "ipConfigurationId")
    private String ipConfigurationId;

    /**
     * Get the provisioningState property: The provisioning state of the NAT Rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the type property: The type of NAT rule for VPN NAT.
     *
     * @return the type value.
     */
    public VpnNatRuleType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of NAT rule for VPN NAT.
     *
     * @param type the type value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withType(VpnNatRuleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the mode property: The Source NAT direction of a VPN NAT.
     *
     * @return the mode value.
     */
    public VpnNatRuleMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: The Source NAT direction of a VPN NAT.
     *
     * @param mode the mode value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withMode(VpnNatRuleMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the internalMappings property: The private IP address internal mapping for NAT.
     *
     * @return the internalMappings value.
     */
    public List<VpnNatRuleMapping> internalMappings() {
        return this.internalMappings;
    }

    /**
     * Set the internalMappings property: The private IP address internal mapping for NAT.
     *
     * @param internalMappings the internalMappings value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withInternalMappings(List<VpnNatRuleMapping> internalMappings) {
        this.internalMappings = internalMappings;
        return this;
    }

    /**
     * Get the externalMappings property: The private IP address external mapping for NAT.
     *
     * @return the externalMappings value.
     */
    public List<VpnNatRuleMapping> externalMappings() {
        return this.externalMappings;
    }

    /**
     * Set the externalMappings property: The private IP address external mapping for NAT.
     *
     * @param externalMappings the externalMappings value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withExternalMappings(List<VpnNatRuleMapping> externalMappings) {
        this.externalMappings = externalMappings;
        return this;
    }

    /**
     * Get the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     *
     * @return the ipConfigurationId value.
     */
    public String ipConfigurationId() {
        return this.ipConfigurationId;
    }

    /**
     * Set the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     *
     * @param ipConfigurationId the ipConfigurationId value to set.
     * @return the VirtualNetworkGatewayNatRuleProperties object itself.
     */
    public VirtualNetworkGatewayNatRuleProperties withIpConfigurationId(String ipConfigurationId) {
        this.ipConfigurationId = ipConfigurationId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (internalMappings() != null) {
            internalMappings().forEach(e -> e.validate());
        }
        if (externalMappings() != null) {
            externalMappings().forEach(e -> e.validate());
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VirtualNetworkGatewayNatRule Resource. */
@Fluent
public final class VirtualNetworkGatewayNatRuleInner extends SubResource {
    /*
     * Properties of the Virtual Network Gateway NAT rule.
     */
    @JsonProperty(value = "properties")
    private VirtualNetworkGatewayNatRuleProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
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

    /** Creates an instance of VirtualNetworkGatewayNatRuleInner class. */
    public VirtualNetworkGatewayNatRuleInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Virtual Network Gateway NAT rule.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkGatewayNatRuleProperties innerProperties() {
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
     * @return the VirtualNetworkGatewayNatRuleInner object itself.
     */
    public VirtualNetworkGatewayNatRuleInner withName(String name) {
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
    public VirtualNetworkGatewayNatRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT Rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the type property: The type of NAT rule for VPN NAT.
     *
     * @return the type value.
     */
    public VpnNatRuleType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The type of NAT rule for VPN NAT.
     *
     * @param type the type value to set.
     * @return the VirtualNetworkGatewayNatRuleInner object itself.
     */
    public VirtualNetworkGatewayNatRuleInner withTypePropertiesType(VpnNatRuleType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayNatRuleProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the mode property: The Source NAT direction of a VPN NAT.
     *
     * @return the mode value.
     */
    public VpnNatRuleMode mode() {
        return this.innerProperties() == null ? null : this.innerProperties().mode();
    }

    /**
     * Set the mode property: The Source NAT direction of a VPN NAT.
     *
     * @param mode the mode value to set.
     * @return the VirtualNetworkGatewayNatRuleInner object itself.
     */
    public VirtualNetworkGatewayNatRuleInner withMode(VpnNatRuleMode mode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayNatRuleProperties();
        }
        this.innerProperties().withMode(mode);
        return this;
    }

    /**
     * Get the internalMappings property: The private IP address internal mapping for NAT.
     *
     * @return the internalMappings value.
     */
    public List<VpnNatRuleMapping> internalMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().internalMappings();
    }

    /**
     * Set the internalMappings property: The private IP address internal mapping for NAT.
     *
     * @param internalMappings the internalMappings value to set.
     * @return the VirtualNetworkGatewayNatRuleInner object itself.
     */
    public VirtualNetworkGatewayNatRuleInner withInternalMappings(List<VpnNatRuleMapping> internalMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayNatRuleProperties();
        }
        this.innerProperties().withInternalMappings(internalMappings);
        return this;
    }

    /**
     * Get the externalMappings property: The private IP address external mapping for NAT.
     *
     * @return the externalMappings value.
     */
    public List<VpnNatRuleMapping> externalMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().externalMappings();
    }

    /**
     * Set the externalMappings property: The private IP address external mapping for NAT.
     *
     * @param externalMappings the externalMappings value to set.
     * @return the VirtualNetworkGatewayNatRuleInner object itself.
     */
    public VirtualNetworkGatewayNatRuleInner withExternalMappings(List<VpnNatRuleMapping> externalMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayNatRuleProperties();
        }
        this.innerProperties().withExternalMappings(externalMappings);
        return this;
    }

    /**
     * Get the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     *
     * @return the ipConfigurationId value.
     */
    public String ipConfigurationId() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurationId();
    }

    /**
     * Set the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     *
     * @param ipConfigurationId the ipConfigurationId value to set.
     * @return the VirtualNetworkGatewayNatRuleInner object itself.
     */
    public VirtualNetworkGatewayNatRuleInner withIpConfigurationId(String ipConfigurationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayNatRuleProperties();
        }
        this.innerProperties().withIpConfigurationId(ipConfigurationId);
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

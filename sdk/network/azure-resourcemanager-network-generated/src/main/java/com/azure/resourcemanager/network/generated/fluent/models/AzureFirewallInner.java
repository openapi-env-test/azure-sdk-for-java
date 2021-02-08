// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallSku;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.HubIpAddresses;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Azure Firewall resource. */
@JsonFlatten
@Fluent
public class AzureFirewallInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallInner.class);

    /*
     * A list of availability zones denoting where the resource needs to come
     * from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Collection of application rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.applicationRuleCollections")
    private List<AzureFirewallApplicationRuleCollection> applicationRuleCollections;

    /*
     * Collection of NAT rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.natRuleCollections")
    private List<AzureFirewallNatRuleCollection> natRuleCollections;

    /*
     * Collection of network rule collections used by Azure Firewall.
     */
    @JsonProperty(value = "properties.networkRuleCollections")
    private List<AzureFirewallNetworkRuleCollection> networkRuleCollections;

    /*
     * IP configuration of the Azure Firewall resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<AzureFirewallIpConfiguration> ipConfigurations;

    /*
     * The provisioning state of the Azure firewall resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The operation mode for Threat Intelligence.
     */
    @JsonProperty(value = "properties.threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /*
     * The virtualHub to which the firewall belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * The firewallPolicy associated with this azure firewall.
     */
    @JsonProperty(value = "properties.firewallPolicy")
    private SubResource firewallPolicy;

    /*
     * IP addresses associated with AzureFirewall.
     */
    @JsonProperty(value = "properties.hubIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private HubIpAddresses hubIpAddresses;

    /*
     * The Azure Firewall Resource SKU.
     */
    @JsonProperty(value = "properties.sku")
    private AzureFirewallSku sku;

    /*
     * The additional properties used to further config this azure firewall.
     */
    @JsonProperty(value = "properties.additionalProperties")
    private Map<String, String> additionalProperties;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @param zones the zones value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withZones(List<String> zones) {
        this.zones = zones;
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
     * Get the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     *
     * @return the applicationRuleCollections value.
     */
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.applicationRuleCollections;
    }

    /**
     * Set the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     *
     * @param applicationRuleCollections the applicationRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withApplicationRuleCollections(
        List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.applicationRuleCollections = applicationRuleCollections;
        return this;
    }

    /**
     * Get the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     *
     * @return the natRuleCollections value.
     */
    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        return this.natRuleCollections;
    }

    /**
     * Set the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     *
     * @param natRuleCollections the natRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.natRuleCollections = natRuleCollections;
        return this;
    }

    /**
     * Get the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     *
     * @return the networkRuleCollections value.
     */
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.networkRuleCollections;
    }

    /**
     * Set the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     *
     * @param networkRuleCollections the networkRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNetworkRuleCollections(
        List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.networkRuleCollections = networkRuleCollections;
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Azure Firewall resource.
     *
     * @return the ipConfigurations value.
     */
    public List<AzureFirewallIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Azure Firewall resource.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withIpConfigurations(List<AzureFirewallIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Azure firewall resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the virtualHub property: The virtualHub to which the firewall belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The virtualHub to which the firewall belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     *
     * @return the firewallPolicy value.
     */
    public SubResource firewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * Set the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     *
     * @param firewallPolicy the firewallPolicy value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withFirewallPolicy(SubResource firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    /**
     * Get the hubIpAddresses property: IP addresses associated with AzureFirewall.
     *
     * @return the hubIpAddresses value.
     */
    public HubIpAddresses hubIpAddresses() {
        return this.hubIpAddresses;
    }

    /**
     * Get the sku property: The Azure Firewall Resource SKU.
     *
     * @return the sku value.
     */
    public AzureFirewallSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Azure Firewall Resource SKU.
     *
     * @param sku the sku value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withSku(AzureFirewallSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the additionalProperties property: The additional properties used to further config this azure firewall.
     *
     * @return the additionalProperties value.
     */
    public Map<String, String> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The additional properties used to further config this azure firewall.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withAdditionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
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
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFirewallInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureFirewallInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationRuleCollections() != null) {
            applicationRuleCollections().forEach(e -> e.validate());
        }
        if (natRuleCollections() != null) {
            natRuleCollections().forEach(e -> e.validate());
        }
        if (networkRuleCollections() != null) {
            networkRuleCollections().forEach(e -> e.validate());
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (hubIpAddresses() != null) {
            hubIpAddresses().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}

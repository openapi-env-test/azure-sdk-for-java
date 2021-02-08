// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRuleCollection;
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
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
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
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
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
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
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
    }
}

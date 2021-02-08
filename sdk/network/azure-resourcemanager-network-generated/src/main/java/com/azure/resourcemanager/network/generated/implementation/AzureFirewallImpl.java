// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.AzureFirewallInner;
import com.azure.resourcemanager.network.generated.models.AzureFirewall;
import com.azure.resourcemanager.network.generated.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNetworkRuleCollection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AzureFirewallImpl implements AzureFirewall, AzureFirewall.Definition, AzureFirewall.Update {
    private AzureFirewallInner innerObject;

    private final NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        List<AzureFirewallApplicationRuleCollection> inner = this.innerModel().applicationRuleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        List<AzureFirewallNatRuleCollection> inner = this.innerModel().natRuleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        List<AzureFirewallNetworkRuleCollection> inner = this.innerModel().networkRuleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFirewallIpConfiguration> ipConfigurations() {
        List<AzureFirewallIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AzureFirewallInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String azureFirewallName;

    public AzureFirewallImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AzureFirewall create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .createOrUpdate(resourceGroupName, azureFirewallName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureFirewall create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .createOrUpdate(resourceGroupName, azureFirewallName, this.innerModel(), context);
        return this;
    }

    AzureFirewallImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new AzureFirewallInner();
        this.serviceManager = serviceManager;
        this.azureFirewallName = name;
    }

    public AzureFirewallImpl update() {
        return this;
    }

    public AzureFirewall apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .createOrUpdate(resourceGroupName, azureFirewallName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureFirewall apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .createOrUpdate(resourceGroupName, azureFirewallName, this.innerModel(), context);
        return this;
    }

    AzureFirewallImpl(AzureFirewallInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.azureFirewallName = Utils.getValueFromIdByName(innerObject.id(), "azureFirewalls");
    }

    public AzureFirewall refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, Context.NONE)
                .getValue();
        return this;
    }

    public AzureFirewall refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, context)
                .getValue();
        return this;
    }

    public AzureFirewallImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AzureFirewallImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AzureFirewallImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AzureFirewallImpl withApplicationRuleCollections(
        List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.innerModel().withApplicationRuleCollections(applicationRuleCollections);
        return this;
    }

    public AzureFirewallImpl withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.innerModel().withNatRuleCollections(natRuleCollections);
        return this;
    }

    public AzureFirewallImpl withNetworkRuleCollections(
        List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.innerModel().withNetworkRuleCollections(networkRuleCollections);
        return this;
    }

    public AzureFirewallImpl withIpConfigurations(List<AzureFirewallIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public AzureFirewallImpl withProvisioningState(ProvisioningState provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }
}

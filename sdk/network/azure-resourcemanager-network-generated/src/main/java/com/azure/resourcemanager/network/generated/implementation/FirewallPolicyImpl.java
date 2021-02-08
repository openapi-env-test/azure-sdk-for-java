// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyInner;
import com.azure.resourcemanager.network.generated.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.generated.models.FirewallPolicy;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class FirewallPolicyImpl implements FirewallPolicy, FirewallPolicy.Definition, FirewallPolicy.Update {
    private FirewallPolicyInner innerObject;

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

    public List<SubResource> ruleGroups() {
        List<SubResource> inner = this.innerModel().ruleGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SubResource basePolicy() {
        return this.innerModel().basePolicy();
    }

    public List<SubResource> firewalls() {
        List<SubResource> inner = this.innerModel().firewalls();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> childPolicies() {
        List<SubResource> inner = this.innerModel().childPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.innerModel().threatIntelMode();
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

    public FirewallPolicyInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String firewallPolicyName;

    private TagsObject updateFirewallPolicyParameters;

    public FirewallPolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public FirewallPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicies()
                .createOrUpdate(resourceGroupName, firewallPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public FirewallPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicies()
                .createOrUpdate(resourceGroupName, firewallPolicyName, this.innerModel(), context);
        return this;
    }

    FirewallPolicyImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new FirewallPolicyInner();
        this.serviceManager = serviceManager;
        this.firewallPolicyName = name;
    }

    public FirewallPolicyImpl update() {
        this.updateFirewallPolicyParameters = new TagsObject();
        return this;
    }

    public FirewallPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicies()
                .updateTagsWithResponse(
                    resourceGroupName, firewallPolicyName, updateFirewallPolicyParameters, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicies()
                .updateTagsWithResponse(resourceGroupName, firewallPolicyName, updateFirewallPolicyParameters, context)
                .getValue();
        return this;
    }

    FirewallPolicyImpl(FirewallPolicyInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.firewallPolicyName = Utils.getValueFromIdByName(innerObject.id(), "firewallPolicies");
    }

    public FirewallPolicy refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, firewallPolicyName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public FirewallPolicy refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFirewallPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, firewallPolicyName, localExpand, context)
                .getValue();
        return this;
    }

    public FirewallPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FirewallPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FirewallPolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateFirewallPolicyParameters.withTags(tags);
            return this;
        }
    }

    public FirewallPolicyImpl withBasePolicy(SubResource basePolicy) {
        this.innerModel().withBasePolicy(basePolicy);
        return this;
    }

    public FirewallPolicyImpl withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.innerModel().withThreatIntelMode(threatIntelMode);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

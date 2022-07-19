// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import com.azure.resourcemanager.network.generated.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SecurityRule;
import com.azure.resourcemanager.network.generated.models.SecurityRuleAccess;
import com.azure.resourcemanager.network.generated.models.SecurityRuleDirection;
import com.azure.resourcemanager.network.generated.models.SecurityRuleProtocol;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class SecurityRuleImpl implements SecurityRule, SecurityRule.Definition, SecurityRule.Update {
    private SecurityRuleInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public SecurityRuleProtocol protocol() {
        return this.innerModel().protocol();
    }

    public String sourcePortRange() {
        return this.innerModel().sourcePortRange();
    }

    public String destinationPortRange() {
        return this.innerModel().destinationPortRange();
    }

    public String sourceAddressPrefix() {
        return this.innerModel().sourceAddressPrefix();
    }

    public List<String> sourceAddressPrefixes() {
        List<String> inner = this.innerModel().sourceAddressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationSecurityGroup> sourceApplicationSecurityGroups() {
        List<ApplicationSecurityGroupInner> inner = this.innerModel().sourceApplicationSecurityGroups();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationSecurityGroupImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String destinationAddressPrefix() {
        return this.innerModel().destinationAddressPrefix();
    }

    public List<String> destinationAddressPrefixes() {
        List<String> inner = this.innerModel().destinationAddressPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationSecurityGroup> destinationApplicationSecurityGroups() {
        List<ApplicationSecurityGroupInner> inner = this.innerModel().destinationApplicationSecurityGroups();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationSecurityGroupImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> sourcePortRanges() {
        List<String> inner = this.innerModel().sourcePortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> destinationPortRanges() {
        List<String> inner = this.innerModel().destinationPortRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SecurityRuleAccess access() {
        return this.innerModel().access();
    }

    public Integer priority() {
        return this.innerModel().priority();
    }

    public SecurityRuleDirection direction() {
        return this.innerModel().direction();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SecurityRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkSecurityGroupName;

    private String securityRuleName;

    public SecurityRuleImpl withExistingNetworkSecurityGroup(
        String resourceGroupName, String networkSecurityGroupName) {
        this.resourceGroupName = resourceGroupName;
        this.networkSecurityGroupName = networkSecurityGroupName;
        return this;
    }

    public SecurityRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityRules()
                .createOrUpdate(
                    resourceGroupName, networkSecurityGroupName, securityRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public SecurityRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityRules()
                .createOrUpdate(
                    resourceGroupName, networkSecurityGroupName, securityRuleName, this.innerModel(), context);
        return this;
    }

    SecurityRuleImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new SecurityRuleInner();
        this.serviceManager = serviceManager;
        this.securityRuleName = name;
    }

    public SecurityRuleImpl update() {
        return this;
    }

    public SecurityRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityRules()
                .createOrUpdate(
                    resourceGroupName, networkSecurityGroupName, securityRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public SecurityRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityRules()
                .createOrUpdate(
                    resourceGroupName, networkSecurityGroupName, securityRuleName, this.innerModel(), context);
        return this;
    }

    SecurityRuleImpl(
        SecurityRuleInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkSecurityGroupName = Utils.getValueFromIdByName(innerObject.id(), "networkSecurityGroups");
        this.securityRuleName = Utils.getValueFromIdByName(innerObject.id(), "securityRules");
    }

    public SecurityRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityRules()
                .getWithResponse(resourceGroupName, networkSecurityGroupName, securityRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public SecurityRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityRules()
                .getWithResponse(resourceGroupName, networkSecurityGroupName, securityRuleName, context)
                .getValue();
        return this;
    }

    public SecurityRuleImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public SecurityRuleImpl withType(String type) {
        this.innerModel().withType(type);
        return this;
    }

    public SecurityRuleImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public SecurityRuleImpl withProtocol(SecurityRuleProtocol protocol) {
        this.innerModel().withProtocol(protocol);
        return this;
    }

    public SecurityRuleImpl withSourcePortRange(String sourcePortRange) {
        this.innerModel().withSourcePortRange(sourcePortRange);
        return this;
    }

    public SecurityRuleImpl withDestinationPortRange(String destinationPortRange) {
        this.innerModel().withDestinationPortRange(destinationPortRange);
        return this;
    }

    public SecurityRuleImpl withSourceAddressPrefix(String sourceAddressPrefix) {
        this.innerModel().withSourceAddressPrefix(sourceAddressPrefix);
        return this;
    }

    public SecurityRuleImpl withSourceAddressPrefixes(List<String> sourceAddressPrefixes) {
        this.innerModel().withSourceAddressPrefixes(sourceAddressPrefixes);
        return this;
    }

    public SecurityRuleImpl withSourceApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> sourceApplicationSecurityGroups) {
        this.innerModel().withSourceApplicationSecurityGroups(sourceApplicationSecurityGroups);
        return this;
    }

    public SecurityRuleImpl withDestinationAddressPrefix(String destinationAddressPrefix) {
        this.innerModel().withDestinationAddressPrefix(destinationAddressPrefix);
        return this;
    }

    public SecurityRuleImpl withDestinationAddressPrefixes(List<String> destinationAddressPrefixes) {
        this.innerModel().withDestinationAddressPrefixes(destinationAddressPrefixes);
        return this;
    }

    public SecurityRuleImpl withDestinationApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> destinationApplicationSecurityGroups) {
        this.innerModel().withDestinationApplicationSecurityGroups(destinationApplicationSecurityGroups);
        return this;
    }

    public SecurityRuleImpl withSourcePortRanges(List<String> sourcePortRanges) {
        this.innerModel().withSourcePortRanges(sourcePortRanges);
        return this;
    }

    public SecurityRuleImpl withDestinationPortRanges(List<String> destinationPortRanges) {
        this.innerModel().withDestinationPortRanges(destinationPortRanges);
        return this;
    }

    public SecurityRuleImpl withAccess(SecurityRuleAccess access) {
        this.innerModel().withAccess(access);
        return this;
    }

    public SecurityRuleImpl withPriority(Integer priority) {
        this.innerModel().withPriority(priority);
        return this;
    }

    public SecurityRuleImpl withDirection(SecurityRuleDirection direction) {
        this.innerModel().withDirection(direction);
        return this;
    }
}

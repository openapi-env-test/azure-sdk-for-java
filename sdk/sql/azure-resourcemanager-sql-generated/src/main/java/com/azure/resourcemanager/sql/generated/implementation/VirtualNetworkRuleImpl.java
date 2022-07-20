// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.fluent.models.VirtualNetworkRuleInner;
import com.azure.resourcemanager.sql.generated.models.VirtualNetworkRule;
import com.azure.resourcemanager.sql.generated.models.VirtualNetworkRuleState;

public final class VirtualNetworkRuleImpl
    implements VirtualNetworkRule, VirtualNetworkRule.Definition, VirtualNetworkRule.Update {
    private VirtualNetworkRuleInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String virtualNetworkSubnetId() {
        return this.innerModel().virtualNetworkSubnetId();
    }

    public Boolean ignoreMissingVnetServiceEndpoint() {
        return this.innerModel().ignoreMissingVnetServiceEndpoint();
    }

    public VirtualNetworkRuleState state() {
        return this.innerModel().state();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualNetworkRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String virtualNetworkRuleName;

    public VirtualNetworkRuleImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public VirtualNetworkRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkRuleImpl(String name, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = new VirtualNetworkRuleInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkRuleName = name;
    }

    public VirtualNetworkRuleImpl update() {
        return this;
    }

    public VirtualNetworkRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualNetworkRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .createOrUpdate(resourceGroupName, serverName, virtualNetworkRuleName, this.innerModel(), context);
        return this;
    }

    VirtualNetworkRuleImpl(
        VirtualNetworkRuleInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.virtualNetworkRuleName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkRules");
    }

    public VirtualNetworkRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkRules()
                .getWithResponse(resourceGroupName, serverName, virtualNetworkRuleName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkRuleImpl withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.innerModel().withVirtualNetworkSubnetId(virtualNetworkSubnetId);
        return this;
    }

    public VirtualNetworkRuleImpl withIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        this.innerModel().withIgnoreMissingVnetServiceEndpoint(ignoreMissingVnetServiceEndpoint);
        return this;
    }
}

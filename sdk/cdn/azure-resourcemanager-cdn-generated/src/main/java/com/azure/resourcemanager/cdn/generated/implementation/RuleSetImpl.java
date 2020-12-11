// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.models.RuleSetInner;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.RuleSet;
import com.azure.resourcemanager.cdn.generated.models.SystemData;

public final class RuleSetImpl implements RuleSet, RuleSet.Definition {
    private RuleSetInner innerObject;

    private final CdnManager serviceManager;

    public RuleSetImpl(RuleSetInner innerObject, CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AfdProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DeploymentStatus deploymentStatus() {
        return this.innerModel().deploymentStatus();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public RuleSetInner innerModel() {
        return this.innerObject;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String profileName;

    private String ruleSetName;

    public RuleSetImpl withExistingProfile(String resourceGroupName, String profileName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        return this;
    }

    public RuleSet create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRuleSets()
                .create(resourceGroupName, profileName, ruleSetName, this.innerModel(), Context.NONE);
        return this;
    }

    public RuleSet create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRuleSets()
                .create(resourceGroupName, profileName, ruleSetName, this.innerModel(), context);
        return this;
    }

    public RuleSetImpl(String name, CdnManager serviceManager) {
        this.innerObject = new RuleSetInner();
        this.serviceManager = serviceManager;
        this.ruleSetName = name;
    }

    public RuleSet refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRuleSets()
                .getWithResponse(resourceGroupName, profileName, ruleSetName, Context.NONE)
                .getValue();
        return this;
    }

    public RuleSet refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRuleSets()
                .getWithResponse(resourceGroupName, profileName, ruleSetName, context)
                .getValue();
        return this;
    }
}

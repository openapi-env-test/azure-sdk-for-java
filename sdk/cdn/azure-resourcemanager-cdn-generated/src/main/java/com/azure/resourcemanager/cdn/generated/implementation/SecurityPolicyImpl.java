// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.models.SecurityPolicyInner;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicy;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicyParameters;
import com.azure.resourcemanager.cdn.generated.models.SecurityPolicyProperties;
import com.azure.resourcemanager.cdn.generated.models.SystemData;

public final class SecurityPolicyImpl implements SecurityPolicy, SecurityPolicy.Definition, SecurityPolicy.Update {
    private SecurityPolicyInner innerObject;

    private final CdnManager serviceManager;

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

    public SecurityPolicyParameters parameters() {
        return this.innerModel().parameters();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SecurityPolicyInner innerModel() {
        return this.innerObject;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String profileName;

    private String securityPolicyName;

    private SecurityPolicyProperties updateSecurityPolicyProperties;

    public SecurityPolicyImpl withExistingProfile(String resourceGroupName, String profileName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        return this;
    }

    public SecurityPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPolicies()
                .create(resourceGroupName, profileName, securityPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public SecurityPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPolicies()
                .create(resourceGroupName, profileName, securityPolicyName, this.innerModel(), context);
        return this;
    }

    SecurityPolicyImpl(String name, CdnManager serviceManager) {
        this.innerObject = new SecurityPolicyInner();
        this.serviceManager = serviceManager;
        this.securityPolicyName = name;
    }

    public SecurityPolicyImpl update() {
        this.updateSecurityPolicyProperties = new SecurityPolicyProperties();
        return this;
    }

    public SecurityPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPolicies()
                .patch(
                    resourceGroupName, profileName, securityPolicyName, updateSecurityPolicyProperties, Context.NONE);
        return this;
    }

    public SecurityPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPolicies()
                .patch(resourceGroupName, profileName, securityPolicyName, updateSecurityPolicyProperties, context);
        return this;
    }

    SecurityPolicyImpl(SecurityPolicyInner innerObject, CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.profileName = Utils.getValueFromIdByName(innerObject.id(), "profiles");
        this.securityPolicyName = Utils.getValueFromIdByName(innerObject.id(), "securityPolicies");
    }

    public SecurityPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPolicies()
                .getWithResponse(resourceGroupName, profileName, securityPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public SecurityPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSecurityPolicies()
                .getWithResponse(resourceGroupName, profileName, securityPolicyName, context)
                .getValue();
        return this;
    }

    public SecurityPolicyImpl withParameters(SecurityPolicyParameters parameters) {
        if (isInCreateMode()) {
            this.innerModel().withParameters(parameters);
            return this;
        } else {
            this.updateSecurityPolicyProperties.withParameters(parameters);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

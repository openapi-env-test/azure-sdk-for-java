// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.PolicyInner;
import com.azure.resourcemanager.devtestlabs.models.Policy;
import com.azure.resourcemanager.devtestlabs.models.PolicyEvaluatorType;
import com.azure.resourcemanager.devtestlabs.models.PolicyFactName;
import com.azure.resourcemanager.devtestlabs.models.PolicyFragment;
import com.azure.resourcemanager.devtestlabs.models.PolicyStatus;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class PolicyImpl implements Policy, Policy.Definition, Policy.Update {
    private PolicyInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public PolicyStatus status() {
        return this.innerModel().status();
    }

    public PolicyFactName factName() {
        return this.innerModel().factName();
    }

    public String factData() {
        return this.innerModel().factData();
    }

    public String threshold() {
        return this.innerModel().threshold();
    }

    public PolicyEvaluatorType evaluatorType() {
        return this.innerModel().evaluatorType();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String policySetName;

    private String name;

    private PolicyFragment updatePolicy;

    public PolicyImpl withExistingPolicyset(String resourceGroupName, String labName, String policySetName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.policySetName = policySetName;
        return this;
    }

    public Policy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, labName, policySetName, name, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Policy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .createOrUpdateWithResponse(resourceGroupName, labName, policySetName, name, this.innerModel(), context)
                .getValue();
        return this;
    }

    PolicyImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new PolicyInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public PolicyImpl update() {
        this.updatePolicy = new PolicyFragment();
        return this;
    }

    public Policy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .updateWithResponse(resourceGroupName, labName, policySetName, name, updatePolicy, Context.NONE)
                .getValue();
        return this;
    }

    public Policy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .updateWithResponse(resourceGroupName, labName, policySetName, name, updatePolicy, context)
                .getValue();
        return this;
    }

    PolicyImpl(PolicyInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.policySetName = Utils.getValueFromIdByName(innerObject.id(), "policysets");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "policies");
    }

    public Policy refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .getWithResponse(resourceGroupName, labName, policySetName, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public Policy refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicies()
                .getWithResponse(resourceGroupName, labName, policySetName, name, localExpand, context)
                .getValue();
        return this;
    }

    public PolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePolicy.withTags(tags);
            return this;
        }
    }

    public PolicyImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public PolicyImpl withStatus(PolicyStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public PolicyImpl withFactName(PolicyFactName factName) {
        this.innerModel().withFactName(factName);
        return this;
    }

    public PolicyImpl withFactData(String factData) {
        this.innerModel().withFactData(factData);
        return this;
    }

    public PolicyImpl withThreshold(String threshold) {
        this.innerModel().withThreshold(threshold);
        return this;
    }

    public PolicyImpl withEvaluatorType(PolicyEvaluatorType evaluatorType) {
        this.innerModel().withEvaluatorType(evaluatorType);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

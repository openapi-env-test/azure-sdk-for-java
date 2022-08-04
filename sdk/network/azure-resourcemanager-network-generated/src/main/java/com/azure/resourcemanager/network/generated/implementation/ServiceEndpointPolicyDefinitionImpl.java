// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicyDefinition;
import java.util.Collections;
import java.util.List;

public final class ServiceEndpointPolicyDefinitionImpl
    implements ServiceEndpointPolicyDefinition,
        ServiceEndpointPolicyDefinition.Definition,
        ServiceEndpointPolicyDefinition.Update {
    private ServiceEndpointPolicyDefinitionInner innerObject;

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

    public String service() {
        return this.innerModel().service();
    }

    public List<String> serviceResources() {
        List<String> inner = this.innerModel().serviceResources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ServiceEndpointPolicyDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceEndpointPolicyName;

    private String serviceEndpointPolicyDefinitionName;

    public ServiceEndpointPolicyDefinitionImpl withExistingServiceEndpointPolicy(
        String resourceGroupName, String serviceEndpointPolicyName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceEndpointPolicyName = serviceEndpointPolicyName;
        return this;
    }

    public ServiceEndpointPolicyDefinition create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicyDefinitions()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public ServiceEndpointPolicyDefinition create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicyDefinitions()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    this.innerModel(),
                    context);
        return this;
    }

    ServiceEndpointPolicyDefinitionImpl(
        String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new ServiceEndpointPolicyDefinitionInner();
        this.serviceManager = serviceManager;
        this.serviceEndpointPolicyDefinitionName = name;
    }

    public ServiceEndpointPolicyDefinitionImpl update() {
        return this;
    }

    public ServiceEndpointPolicyDefinition apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicyDefinitions()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public ServiceEndpointPolicyDefinition apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicyDefinitions()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    this.innerModel(),
                    context);
        return this;
    }

    ServiceEndpointPolicyDefinitionImpl(
        ServiceEndpointPolicyDefinitionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceEndpointPolicyName = Utils.getValueFromIdByName(innerObject.id(), "serviceEndpointPolicies");
        this.serviceEndpointPolicyDefinitionName =
            Utils.getValueFromIdByName(innerObject.id(), "serviceEndpointPolicyDefinitions");
    }

    public ServiceEndpointPolicyDefinition refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicyDefinitions()
                .getWithResponse(
                    resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceEndpointPolicyDefinition refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicyDefinitions()
                .getWithResponse(
                    resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context)
                .getValue();
        return this;
    }

    public ServiceEndpointPolicyDefinitionImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public ServiceEndpointPolicyDefinitionImpl withType(String type) {
        this.innerModel().withType(type);
        return this;
    }

    public ServiceEndpointPolicyDefinitionImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ServiceEndpointPolicyDefinitionImpl withService(String service) {
        this.innerModel().withService(service);
        return this;
    }

    public ServiceEndpointPolicyDefinitionImpl withServiceResources(List<String> serviceResources) {
        this.innerModel().withServiceResources(serviceResources);
        return this;
    }
}

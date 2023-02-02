// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.PipelineRunInner;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRun;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunResponse;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;

public final class PipelineRunImpl implements PipelineRun, PipelineRun.Definition {
    private PipelineRunInner innerObject;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    PipelineRunImpl(
        PipelineRunInner innerObject,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PipelineRunRequest request() {
        return this.innerModel().request();
    }

    public PipelineRunResponse response() {
        return this.innerModel().response();
    }

    public String forceUpdateTag() {
        return this.innerModel().forceUpdateTag();
    }

    public PipelineRunInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String registryName;

    private String pipelineRunName;

    public PipelineRunImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    public PipelineRun create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPipelineRuns()
                .create(resourceGroupName, registryName, pipelineRunName, this.innerModel(), Context.NONE);
        return this;
    }

    public PipelineRun create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPipelineRuns()
                .create(resourceGroupName, registryName, pipelineRunName, this.innerModel(), context);
        return this;
    }

    PipelineRunImpl(
        String name, com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = new PipelineRunInner();
        this.serviceManager = serviceManager;
        this.pipelineRunName = name;
    }

    public PipelineRun refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPipelineRuns()
                .getWithResponse(resourceGroupName, registryName, pipelineRunName, Context.NONE)
                .getValue();
        return this;
    }

    public PipelineRun refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPipelineRuns()
                .getWithResponse(resourceGroupName, registryName, pipelineRunName, context)
                .getValue();
        return this;
    }

    public PipelineRunImpl withRequest(PipelineRunRequest request) {
        this.innerModel().withRequest(request);
        return this;
    }

    public PipelineRunImpl withForceUpdateTag(String forceUpdateTag) {
        this.innerModel().withForceUpdateTag(forceUpdateTag);
        return this;
    }
}

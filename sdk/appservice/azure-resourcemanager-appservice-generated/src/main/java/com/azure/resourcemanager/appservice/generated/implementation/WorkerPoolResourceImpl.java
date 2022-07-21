// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkerPoolResourceInner;
import com.azure.resourcemanager.appservice.generated.models.ComputeModeOptions;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.azure.resourcemanager.appservice.generated.models.WorkerPoolResource;
import java.util.Collections;
import java.util.List;

public final class WorkerPoolResourceImpl
    implements WorkerPoolResource, WorkerPoolResource.Definition, WorkerPoolResource.Update {
    private WorkerPoolResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public SkuDescription sku() {
        return this.innerModel().sku();
    }

    public Integer workerSizeId() {
        return this.innerModel().workerSizeId();
    }

    public ComputeModeOptions computeMode() {
        return this.innerModel().computeMode();
    }

    public String workerSize() {
        return this.innerModel().workerSize();
    }

    public Integer workerCount() {
        return this.innerModel().workerCount();
    }

    public List<String> instanceNames() {
        List<String> inner = this.innerModel().instanceNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public WorkerPoolResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String workerPoolName;

    public WorkerPoolResourceImpl withExistingHostingEnvironment(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public WorkerPoolResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .createOrUpdateWorkerPool(resourceGroupName, name, workerPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public WorkerPoolResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .createOrUpdateWorkerPool(resourceGroupName, name, workerPoolName, this.innerModel(), context);
        return this;
    }

    WorkerPoolResourceImpl(
        String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new WorkerPoolResourceInner();
        this.serviceManager = serviceManager;
        this.workerPoolName = name;
    }

    public WorkerPoolResourceImpl update() {
        return this;
    }

    public WorkerPoolResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .updateWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public WorkerPoolResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .updateWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, this.innerModel(), context)
                .getValue();
        return this;
    }

    WorkerPoolResourceImpl(
        WorkerPoolResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "hostingEnvironments");
        this.workerPoolName = Utils.getValueFromIdByName(innerObject.id(), "workerPools");
    }

    public WorkerPoolResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .getWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public WorkerPoolResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .getWorkerPoolWithResponse(resourceGroupName, name, workerPoolName, context)
                .getValue();
        return this;
    }

    public WorkerPoolResourceImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public WorkerPoolResourceImpl withSku(SkuDescription sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public WorkerPoolResourceImpl withWorkerSizeId(Integer workerSizeId) {
        this.innerModel().withWorkerSizeId(workerSizeId);
        return this;
    }

    public WorkerPoolResourceImpl withComputeMode(ComputeModeOptions computeMode) {
        this.innerModel().withComputeMode(computeMode);
        return this;
    }

    public WorkerPoolResourceImpl withWorkerSize(String workerSize) {
        this.innerModel().withWorkerSize(workerSize);
        return this;
    }

    public WorkerPoolResourceImpl withWorkerCount(Integer workerCount) {
        this.innerModel().withWorkerCount(workerCount);
        return this;
    }
}

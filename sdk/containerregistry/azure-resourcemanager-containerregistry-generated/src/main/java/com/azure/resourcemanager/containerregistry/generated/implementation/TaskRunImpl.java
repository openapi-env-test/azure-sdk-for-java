// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RunInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.TaskRunInner;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.Run;
import com.azure.resourcemanager.containerregistry.generated.models.RunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.TaskRun;
import com.azure.resourcemanager.containerregistry.generated.models.TaskRunUpdateParameters;
import java.util.Map;

public final class TaskRunImpl implements TaskRun, TaskRun.Definition, TaskRun.Update {
    private TaskRunInner innerObject;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public IdentityProperties identity() {
        return this.innerModel().identity();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RunRequest runRequest() {
        return this.innerModel().runRequest();
    }

    public Run runResult() {
        RunInner inner = this.innerModel().runResult();
        if (inner != null) {
            return new RunImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String forceUpdateTag() {
        return this.innerModel().forceUpdateTag();
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

    public TaskRunInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String registryName;

    private String taskRunName;

    private TaskRunUpdateParameters updateUpdateParameters;

    public TaskRunImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    public TaskRun create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTaskRuns()
                .create(resourceGroupName, registryName, taskRunName, this.innerModel(), Context.NONE);
        return this;
    }

    public TaskRun create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTaskRuns()
                .create(resourceGroupName, registryName, taskRunName, this.innerModel(), context);
        return this;
    }

    TaskRunImpl(
        String name, com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = new TaskRunInner();
        this.serviceManager = serviceManager;
        this.taskRunName = name;
    }

    public TaskRunImpl update() {
        this.updateUpdateParameters = new TaskRunUpdateParameters();
        return this;
    }

    public TaskRun apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTaskRuns()
                .update(resourceGroupName, registryName, taskRunName, updateUpdateParameters, Context.NONE);
        return this;
    }

    public TaskRun apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTaskRuns()
                .update(resourceGroupName, registryName, taskRunName, updateUpdateParameters, context);
        return this;
    }

    TaskRunImpl(
        TaskRunInner innerObject,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.registryName = Utils.getValueFromIdByName(innerObject.id(), "registries");
        this.taskRunName = Utils.getValueFromIdByName(innerObject.id(), "taskRuns");
    }

    public TaskRun refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTaskRuns()
                .getWithResponse(resourceGroupName, registryName, taskRunName, Context.NONE)
                .getValue();
        return this;
    }

    public TaskRun refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTaskRuns()
                .getWithResponse(resourceGroupName, registryName, taskRunName, context)
                .getValue();
        return this;
    }

    public Response<TaskRun> getDetailsWithResponse(Context context) {
        return serviceManager.taskRuns().getDetailsWithResponse(resourceGroupName, registryName, taskRunName, context);
    }

    public TaskRun getDetails() {
        return serviceManager.taskRuns().getDetails(resourceGroupName, registryName, taskRunName);
    }

    public TaskRunImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public TaskRunImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public TaskRunImpl withIdentity(IdentityProperties identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public TaskRunImpl withRunRequest(RunRequest runRequest) {
        if (isInCreateMode()) {
            this.innerModel().withRunRequest(runRequest);
            return this;
        } else {
            this.updateUpdateParameters.withRunRequest(runRequest);
            return this;
        }
    }

    public TaskRunImpl withForceUpdateTag(String forceUpdateTag) {
        if (isInCreateMode()) {
            this.innerModel().withForceUpdateTag(forceUpdateTag);
            return this;
        } else {
            this.updateUpdateParameters.withForceUpdateTag(forceUpdateTag);
            return this;
        }
    }

    public TaskRunImpl withTags(Map<String, String> tags) {
        this.updateUpdateParameters.withTags(tags);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

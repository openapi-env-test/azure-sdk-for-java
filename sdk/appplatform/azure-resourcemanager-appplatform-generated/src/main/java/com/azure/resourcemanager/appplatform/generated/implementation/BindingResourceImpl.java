// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.BindingResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.BindingResource;
import com.azure.resourcemanager.appplatform.generated.models.BindingResourceProperties;

public final class BindingResourceImpl implements BindingResource, BindingResource.Definition, BindingResource.Update {
    private BindingResourceInner innerObject;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public BindingResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public BindingResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String appName;

    private String bindingName;

    public BindingResourceImpl withExistingApp(String resourceGroupName, String serviceName, String appName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.appName = appName;
        return this;
    }

    public BindingResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBindings()
                .createOrUpdate(resourceGroupName, serviceName, appName, bindingName, this.innerModel(), Context.NONE);
        return this;
    }

    public BindingResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBindings()
                .createOrUpdate(resourceGroupName, serviceName, appName, bindingName, this.innerModel(), context);
        return this;
    }

    BindingResourceImpl(
        String name, com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerObject = new BindingResourceInner();
        this.serviceManager = serviceManager;
        this.bindingName = name;
    }

    public BindingResourceImpl update() {
        return this;
    }

    public BindingResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBindings()
                .update(resourceGroupName, serviceName, appName, bindingName, this.innerModel(), Context.NONE);
        return this;
    }

    public BindingResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBindings()
                .update(resourceGroupName, serviceName, appName, bindingName, this.innerModel(), context);
        return this;
    }

    BindingResourceImpl(
        BindingResourceInner innerObject,
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "Spring");
        this.appName = Utils.getValueFromIdByName(innerObject.id(), "apps");
        this.bindingName = Utils.getValueFromIdByName(innerObject.id(), "bindings");
    }

    public BindingResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBindings()
                .getWithResponse(resourceGroupName, serviceName, appName, bindingName, Context.NONE)
                .getValue();
        return this;
    }

    public BindingResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getBindings()
                .getWithResponse(resourceGroupName, serviceName, appName, bindingName, context)
                .getValue();
        return this;
    }

    public BindingResourceImpl withProperties(BindingResourceProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}

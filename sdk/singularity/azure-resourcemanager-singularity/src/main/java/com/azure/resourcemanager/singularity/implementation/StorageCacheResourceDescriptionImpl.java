// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.singularity.fluent.models.StorageCacheResourceDescriptionInner;
import com.azure.resourcemanager.singularity.models.ResourceSystemData;
import com.azure.resourcemanager.singularity.models.StorageCachePropertiesBase;
import com.azure.resourcemanager.singularity.models.StorageCacheResourceDescription;
import java.util.Collections;
import java.util.Map;

public final class StorageCacheResourceDescriptionImpl
    implements StorageCacheResourceDescription,
        StorageCacheResourceDescription.Definition,
        StorageCacheResourceDescription.Update {
    private StorageCacheResourceDescriptionInner innerObject;

    private final com.azure.resourcemanager.singularity.SingularityManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public StorageCachePropertiesBase properties() {
        return this.innerModel().properties();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceSystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public StorageCacheResourceDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.singularity.SingularityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String storageCacheResourceName;

    public StorageCacheResourceDescriptionImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public StorageCacheResourceDescription create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageCaches()
                .createOrUpdate(
                    resourceGroupName, accountName, storageCacheResourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageCacheResourceDescription create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageCaches()
                .createOrUpdate(resourceGroupName, accountName, storageCacheResourceName, this.innerModel(), context);
        return this;
    }

    StorageCacheResourceDescriptionImpl(
        String name, com.azure.resourcemanager.singularity.SingularityManager serviceManager) {
        this.innerObject = new StorageCacheResourceDescriptionInner();
        this.serviceManager = serviceManager;
        this.storageCacheResourceName = name;
    }

    public StorageCacheResourceDescriptionImpl update() {
        return this;
    }

    public StorageCacheResourceDescription apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageCaches()
                .update(resourceGroupName, accountName, storageCacheResourceName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageCacheResourceDescription apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageCaches()
                .update(resourceGroupName, accountName, storageCacheResourceName, this.innerModel(), context);
        return this;
    }

    StorageCacheResourceDescriptionImpl(
        StorageCacheResourceDescriptionInner innerObject,
        com.azure.resourcemanager.singularity.SingularityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "accounts");
        this.storageCacheResourceName = Utils.getValueFromIdByName(innerObject.id(), "storagecontainers");
    }

    public StorageCacheResourceDescription refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageCaches()
                .getWithResponse(resourceGroupName, accountName, storageCacheResourceName, Context.NONE)
                .getValue();
        return this;
    }

    public StorageCacheResourceDescription refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStorageCaches()
                .getWithResponse(resourceGroupName, accountName, storageCacheResourceName, context)
                .getValue();
        return this;
    }

    public StorageCacheResourceDescription resume() {
        return serviceManager.storageCaches().resume(resourceGroupName, accountName, storageCacheResourceName);
    }

    public StorageCacheResourceDescription resume(Context context) {
        return serviceManager.storageCaches().resume(resourceGroupName, accountName, storageCacheResourceName, context);
    }

    public StorageCacheResourceDescription suspend() {
        return serviceManager.storageCaches().suspend(resourceGroupName, accountName, storageCacheResourceName);
    }

    public StorageCacheResourceDescription suspend(Context context) {
        return serviceManager
            .storageCaches()
            .suspend(resourceGroupName, accountName, storageCacheResourceName, context);
    }

    public StorageCacheResourceDescriptionImpl withProperties(StorageCachePropertiesBase properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public StorageCacheResourceDescriptionImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public StorageCacheResourceDescriptionImpl withSystemData(ResourceSystemData systemData) {
        this.innerModel().withSystemData(systemData);
        return this;
    }
}

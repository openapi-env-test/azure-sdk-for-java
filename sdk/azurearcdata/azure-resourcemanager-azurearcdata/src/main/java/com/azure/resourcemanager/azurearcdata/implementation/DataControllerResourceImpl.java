// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurearcdata.fluent.models.DataControllerResourceInner;
import com.azure.resourcemanager.azurearcdata.models.DataControllerProperties;
import com.azure.resourcemanager.azurearcdata.models.DataControllerResource;
import com.azure.resourcemanager.azurearcdata.models.DataControllerUpdate;
import com.azure.resourcemanager.azurearcdata.models.ExtendedLocation;
import java.util.Collections;
import java.util.Map;

public final class DataControllerResourceImpl
    implements DataControllerResource, DataControllerResource.Definition, DataControllerResource.Update {
    private DataControllerResourceInner innerObject;

    private final com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager;

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

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public DataControllerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
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

    public DataControllerResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String dataControllerName;

    private DataControllerUpdate updateDataControllerResource;

    public DataControllerResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public DataControllerResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataControllers()
                .putDataController(resourceGroupName, dataControllerName, this.innerModel(), Context.NONE);
        return this;
    }

    public DataControllerResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataControllers()
                .putDataController(resourceGroupName, dataControllerName, this.innerModel(), context);
        return this;
    }

    DataControllerResourceImpl(String name, com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager) {
        this.innerObject = new DataControllerResourceInner();
        this.serviceManager = serviceManager;
        this.dataControllerName = name;
    }

    public DataControllerResourceImpl update() {
        this.updateDataControllerResource = new DataControllerUpdate();
        return this;
    }

    public DataControllerResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataControllers()
                .patchDataController(resourceGroupName, dataControllerName, updateDataControllerResource, Context.NONE);
        return this;
    }

    public DataControllerResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataControllers()
                .patchDataController(resourceGroupName, dataControllerName, updateDataControllerResource, context);
        return this;
    }

    DataControllerResourceImpl(
        DataControllerResourceInner innerObject,
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.dataControllerName = Utils.getValueFromIdByName(innerObject.id(), "dataControllers");
    }

    public DataControllerResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataControllers()
                .getByResourceGroupWithResponse(resourceGroupName, dataControllerName, Context.NONE)
                .getValue();
        return this;
    }

    public DataControllerResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDataControllers()
                .getByResourceGroupWithResponse(resourceGroupName, dataControllerName, context)
                .getValue();
        return this;
    }

    public DataControllerResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DataControllerResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DataControllerResourceImpl withProperties(DataControllerProperties properties) {
        if (isInCreateMode()) {
            this.innerModel().withProperties(properties);
            return this;
        } else {
            this.updateDataControllerResource.withProperties(properties);
            return this;
        }
    }

    public DataControllerResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateDataControllerResource.withTags(tags);
            return this;
        }
    }

    public DataControllerResourceImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

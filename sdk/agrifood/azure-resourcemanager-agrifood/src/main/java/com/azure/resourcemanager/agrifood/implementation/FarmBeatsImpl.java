// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsInner;
import com.azure.resourcemanager.agrifood.models.FarmBeats;
import com.azure.resourcemanager.agrifood.models.FarmBeatsUpdateRequestModel;
import com.azure.resourcemanager.agrifood.models.ProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class FarmBeatsImpl implements FarmBeats, FarmBeats.Definition, FarmBeats.Update {
    private FarmBeatsInner innerObject;

    private final com.azure.resourcemanager.agrifood.AgrifoodManager serviceManager;

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

    public String instanceUri() {
        return this.innerModel().instanceUri();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
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

    public FarmBeatsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.agrifood.AgrifoodManager manager() {
        return this.serviceManager;
    }

    private String farmBeatsResourceName;

    private String resourceGroupName;

    private FarmBeatsUpdateRequestModel updateBody;

    public FarmBeatsImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public FarmBeats create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFarmBeatsModels()
                .createOrUpdateWithResponse(farmBeatsResourceName, resourceGroupName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public FarmBeats create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFarmBeatsModels()
                .createOrUpdateWithResponse(farmBeatsResourceName, resourceGroupName, this.innerModel(), context)
                .getValue();
        return this;
    }

    FarmBeatsImpl(String name, com.azure.resourcemanager.agrifood.AgrifoodManager serviceManager) {
        this.innerObject = new FarmBeatsInner();
        this.serviceManager = serviceManager;
        this.farmBeatsResourceName = name;
    }

    public FarmBeatsImpl update() {
        this.updateBody = new FarmBeatsUpdateRequestModel();
        return this;
    }

    public FarmBeats apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFarmBeatsModels()
                .updateWithResponse(farmBeatsResourceName, resourceGroupName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public FarmBeats apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFarmBeatsModels()
                .updateWithResponse(farmBeatsResourceName, resourceGroupName, updateBody, context)
                .getValue();
        return this;
    }

    FarmBeatsImpl(FarmBeatsInner innerObject, com.azure.resourcemanager.agrifood.AgrifoodManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.farmBeatsResourceName = Utils.getValueFromIdByName(innerObject.id(), "farmBeats");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public FarmBeats refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFarmBeatsModels()
                .getByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, Context.NONE)
                .getValue();
        return this;
    }

    public FarmBeats refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getFarmBeatsModels()
                .getByResourceGroupWithResponse(resourceGroupName, farmBeatsResourceName, context)
                .getValue();
        return this;
    }

    public FarmBeatsImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public FarmBeatsImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public FarmBeatsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

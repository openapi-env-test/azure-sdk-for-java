// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.CdnManager;
import com.azure.resourcemanager.cdn.generated.fluent.models.OriginGroupInner;
import com.azure.resourcemanager.cdn.generated.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.generated.models.OriginGroup;
import com.azure.resourcemanager.cdn.generated.models.OriginGroupResourceState;
import com.azure.resourcemanager.cdn.generated.models.OriginGroupUpdateParameters;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.ResponseBasedOriginErrorDetectionParameters;
import com.azure.resourcemanager.cdn.generated.models.SystemData;
import java.util.Collections;
import java.util.List;

public final class OriginGroupImpl implements OriginGroup, OriginGroup.Definition, OriginGroup.Update {
    private OriginGroupInner innerObject;

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

    public HealthProbeParameters healthProbeSettings() {
        return this.innerModel().healthProbeSettings();
    }

    public List<ResourceReference> origins() {
        List<ResourceReference> inner = this.innerModel().origins();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.innerModel().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.innerModel().responseBasedOriginErrorDetectionSettings();
    }

    public OriginGroupResourceState resourceState() {
        return this.innerModel().resourceState();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OriginGroupInner innerModel() {
        return this.innerObject;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String profileName;

    private String endpointName;

    private String originGroupName;

    private OriginGroupUpdateParameters updateOriginGroupUpdateProperties;

    public OriginGroupImpl withExistingEndpoint(String resourceGroupName, String profileName, String endpointName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        this.endpointName = endpointName;
        return this;
    }

    public OriginGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOriginGroups()
                .create(resourceGroupName, profileName, endpointName, originGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public OriginGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOriginGroups()
                .create(resourceGroupName, profileName, endpointName, originGroupName, this.innerModel(), context);
        return this;
    }

    OriginGroupImpl(String name, CdnManager serviceManager) {
        this.innerObject = new OriginGroupInner();
        this.serviceManager = serviceManager;
        this.originGroupName = name;
    }

    public OriginGroupImpl update() {
        this.updateOriginGroupUpdateProperties = new OriginGroupUpdateParameters();
        return this;
    }

    public OriginGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOriginGroups()
                .update(
                    resourceGroupName,
                    profileName,
                    endpointName,
                    originGroupName,
                    updateOriginGroupUpdateProperties,
                    Context.NONE);
        return this;
    }

    public OriginGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOriginGroups()
                .update(
                    resourceGroupName,
                    profileName,
                    endpointName,
                    originGroupName,
                    updateOriginGroupUpdateProperties,
                    context);
        return this;
    }

    OriginGroupImpl(OriginGroupInner innerObject, CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.profileName = Utils.getValueFromIdByName(innerObject.id(), "profiles");
        this.endpointName = Utils.getValueFromIdByName(innerObject.id(), "endpoints");
        this.originGroupName = Utils.getValueFromIdByName(innerObject.id(), "originGroups");
    }

    public OriginGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOriginGroups()
                .getWithResponse(resourceGroupName, profileName, endpointName, originGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public OriginGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOriginGroups()
                .getWithResponse(resourceGroupName, profileName, endpointName, originGroupName, context)
                .getValue();
        return this;
    }

    public OriginGroupImpl withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (isInCreateMode()) {
            this.innerModel().withHealthProbeSettings(healthProbeSettings);
            return this;
        } else {
            this.updateOriginGroupUpdateProperties.withHealthProbeSettings(healthProbeSettings);
            return this;
        }
    }

    public OriginGroupImpl withOrigins(List<ResourceReference> origins) {
        if (isInCreateMode()) {
            this.innerModel().withOrigins(origins);
            return this;
        } else {
            this.updateOriginGroupUpdateProperties.withOrigins(origins);
            return this;
        }
    }

    public OriginGroupImpl withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (isInCreateMode()) {
            this
                .innerModel()
                .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                    trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
            return this;
        } else {
            this
                .updateOriginGroupUpdateProperties
                .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                    trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
            return this;
        }
    }

    public OriginGroupImpl withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        if (isInCreateMode()) {
            this.innerModel().withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
            return this;
        } else {
            this
                .updateOriginGroupUpdateProperties
                .withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

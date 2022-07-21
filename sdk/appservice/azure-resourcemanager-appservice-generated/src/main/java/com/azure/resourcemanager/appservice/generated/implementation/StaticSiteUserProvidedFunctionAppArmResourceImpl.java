// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserProvidedFunctionAppArmResourceInner;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserProvidedFunctionAppArmResource;
import java.time.OffsetDateTime;

public final class StaticSiteUserProvidedFunctionAppArmResourceImpl
    implements StaticSiteUserProvidedFunctionAppArmResource,
        StaticSiteUserProvidedFunctionAppArmResource.Definition,
        StaticSiteUserProvidedFunctionAppArmResource.Update {
    private StaticSiteUserProvidedFunctionAppArmResourceInner innerObject;

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

    public String functionAppResourceId() {
        return this.innerModel().functionAppResourceId();
    }

    public String functionAppRegion() {
        return this.innerModel().functionAppRegion();
    }

    public OffsetDateTime createdOn() {
        return this.innerModel().createdOn();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public StaticSiteUserProvidedFunctionAppArmResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String environmentName;

    private String functionAppName;

    private Boolean createIsForced;

    private Boolean updateIsForced;

    public StaticSiteUserProvidedFunctionAppArmResourceImpl withExistingBuild(
        String resourceGroupName, String name, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.environmentName = environmentName;
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .registerUserProvidedFunctionAppWithStaticSiteBuild(
                    resourceGroupName,
                    name,
                    environmentName,
                    functionAppName,
                    this.innerModel(),
                    createIsForced,
                    Context.NONE);
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .registerUserProvidedFunctionAppWithStaticSiteBuild(
                    resourceGroupName,
                    name,
                    environmentName,
                    functionAppName,
                    this.innerModel(),
                    createIsForced,
                    context);
        return this;
    }

    StaticSiteUserProvidedFunctionAppArmResourceImpl(
        String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new StaticSiteUserProvidedFunctionAppArmResourceInner();
        this.serviceManager = serviceManager;
        this.functionAppName = name;
        this.createIsForced = null;
    }

    public StaticSiteUserProvidedFunctionAppArmResourceImpl update() {
        this.updateIsForced = null;
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .registerUserProvidedFunctionAppWithStaticSiteBuild(
                    resourceGroupName,
                    name,
                    environmentName,
                    functionAppName,
                    this.innerModel(),
                    updateIsForced,
                    Context.NONE);
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .registerUserProvidedFunctionAppWithStaticSiteBuild(
                    resourceGroupName,
                    name,
                    environmentName,
                    functionAppName,
                    this.innerModel(),
                    updateIsForced,
                    context);
        return this;
    }

    StaticSiteUserProvidedFunctionAppArmResourceImpl(
        StaticSiteUserProvidedFunctionAppArmResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "staticSites");
        this.environmentName = Utils.getValueFromIdByName(innerObject.id(), "builds");
        this.functionAppName = Utils.getValueFromIdByName(innerObject.id(), "userProvidedFunctionApps");
    }

    public StaticSiteUserProvidedFunctionAppArmResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getUserProvidedFunctionAppForStaticSiteBuildWithResponse(
                    resourceGroupName, name, environmentName, functionAppName, Context.NONE)
                .getValue();
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getUserProvidedFunctionAppForStaticSiteBuildWithResponse(
                    resourceGroupName, name, environmentName, functionAppName, context)
                .getValue();
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResourceImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResourceImpl withFunctionAppResourceId(String functionAppResourceId) {
        this.innerModel().withFunctionAppResourceId(functionAppResourceId);
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResourceImpl withFunctionAppRegion(String functionAppRegion) {
        this.innerModel().withFunctionAppRegion(functionAppRegion);
        return this;
    }

    public StaticSiteUserProvidedFunctionAppArmResourceImpl withIsForced(Boolean isForced) {
        if (isInCreateMode()) {
            this.createIsForced = isForced;
            return this;
        } else {
            this.updateIsForced = isForced;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.generated.fluent.models.SupportedBuildpackResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.SupportedBuildpackResource;
import com.azure.resourcemanager.appplatform.generated.models.SupportedBuildpackResourceProperties;

public final class SupportedBuildpackResourceImpl implements SupportedBuildpackResource {
    private SupportedBuildpackResourceInner innerObject;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    SupportedBuildpackResourceImpl(
        SupportedBuildpackResourceInner innerObject,
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
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

    public SupportedBuildpackResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SupportedBuildpackResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }
}

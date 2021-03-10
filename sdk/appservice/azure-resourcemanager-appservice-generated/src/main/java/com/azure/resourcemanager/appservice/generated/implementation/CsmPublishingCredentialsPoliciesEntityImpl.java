// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CsmPublishingCredentialsPoliciesEntityInner;
import com.azure.resourcemanager.appservice.generated.models.CsmPublishingCredentialsPoliciesEntity;
import com.azure.resourcemanager.appservice.generated.models.SystemData;

public final class CsmPublishingCredentialsPoliciesEntityImpl implements CsmPublishingCredentialsPoliciesEntity {
    private CsmPublishingCredentialsPoliciesEntityInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    CsmPublishingCredentialsPoliciesEntityImpl(
        CsmPublishingCredentialsPoliciesEntityInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Boolean allow() {
        return this.innerModel().allow();
    }

    public CsmPublishingCredentialsPoliciesEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}

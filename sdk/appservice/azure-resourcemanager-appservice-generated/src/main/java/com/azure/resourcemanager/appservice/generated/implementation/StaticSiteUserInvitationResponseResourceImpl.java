// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserInvitationResponseResourceInner;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteUserInvitationResponseResource;
import com.azure.resourcemanager.appservice.generated.models.SystemData;
import java.time.OffsetDateTime;

public final class StaticSiteUserInvitationResponseResourceImpl implements StaticSiteUserInvitationResponseResource {
    private StaticSiteUserInvitationResponseResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    StaticSiteUserInvitationResponseResourceImpl(
        StaticSiteUserInvitationResponseResourceInner innerObject,
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

    public OffsetDateTime expiresOn() {
        return this.innerModel().expiresOn();
    }

    public String invitationUrl() {
        return this.innerModel().invitationUrl();
    }

    public StaticSiteUserInvitationResponseResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}

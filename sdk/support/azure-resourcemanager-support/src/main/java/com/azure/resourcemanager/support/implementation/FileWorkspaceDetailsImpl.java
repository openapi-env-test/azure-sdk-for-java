// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.support.fluent.models.FileWorkspaceDetailsInner;
import com.azure.resourcemanager.support.models.FileWorkspaceDetails;
import java.time.OffsetDateTime;

public final class FileWorkspaceDetailsImpl implements FileWorkspaceDetails {
    private FileWorkspaceDetailsInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    FileWorkspaceDetailsImpl(
        FileWorkspaceDetailsInner innerObject, com.azure.resourcemanager.support.SupportManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime createdOn() {
        return this.innerModel().createdOn();
    }

    public OffsetDateTime expirationTime() {
        return this.innerModel().expirationTime();
    }

    public FileWorkspaceDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.resources.generated.ResourcesManager;
import com.azure.resourcemanager.resources.generated.fluent.models.ResourceGroupExportResultInner;
import com.azure.resourcemanager.resources.generated.models.ResourceGroupExportResult;

public final class ResourceGroupExportResultImpl implements ResourceGroupExportResult {
    private ResourceGroupExportResultInner innerObject;

    private final ResourcesManager serviceManager;

    ResourceGroupExportResultImpl(ResourceGroupExportResultInner innerObject, ResourcesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Object template() {
        return this.innerModel().template();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public ResourceGroupExportResultInner innerModel() {
        return this.innerObject;
    }

    private ResourcesManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.RunCommandDocumentBaseInner;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.RunCommandDocumentBase;

public final class RunCommandDocumentBaseImpl implements RunCommandDocumentBase {
    private RunCommandDocumentBaseInner innerObject;

    private final ComputeManager serviceManager;

    public RunCommandDocumentBaseImpl(RunCommandDocumentBaseInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String schema() {
        return this.innerModel().schema();
    }

    public String id() {
        return this.innerModel().id();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public String label() {
        return this.innerModel().label();
    }

    public String description() {
        return this.innerModel().description();
    }

    public RunCommandDocumentBaseInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}

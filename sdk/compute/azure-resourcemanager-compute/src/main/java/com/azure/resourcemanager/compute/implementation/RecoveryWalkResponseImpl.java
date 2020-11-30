// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.RecoveryWalkResponseInner;
import com.azure.resourcemanager.compute.models.RecoveryWalkResponse;

public final class RecoveryWalkResponseImpl implements RecoveryWalkResponse {
    private RecoveryWalkResponseInner innerObject;

    private final ComputeManager serviceManager;

    public RecoveryWalkResponseImpl(RecoveryWalkResponseInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean walkPerformed() {
        return this.innerModel().walkPerformed();
    }

    public Integer nextPlatformUpdateDomain() {
        return this.innerModel().nextPlatformUpdateDomain();
    }

    public RecoveryWalkResponseInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}

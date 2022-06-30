// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.storage.generated.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.storage.generated.models.Reason;

public final class CheckNameAvailabilityResultImpl implements CheckNameAvailabilityResult {
    private CheckNameAvailabilityResultInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    CheckNameAvailabilityResultImpl(
        CheckNameAvailabilityResultInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public Reason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.releaseplannertest.implementation;

import com.azure.resourcemanager.releaseplannertest.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.releaseplannertest.models.CheckNameAvailabilityReason;
import com.azure.resourcemanager.releaseplannertest.models.CheckNameAvailabilityResponse;

public final class CheckNameAvailabilityResponseImpl implements CheckNameAvailabilityResponse {
    private CheckNameAvailabilityResponseInner innerObject;

    private final com.azure.resourcemanager.releaseplannertest.AgriFoodManager serviceManager;

    CheckNameAvailabilityResponseImpl(
        CheckNameAvailabilityResponseInner innerObject,
        com.azure.resourcemanager.releaseplannertest.AgriFoodManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean nameAvailable() {
        return this.innerModel().nameAvailable();
    }

    public CheckNameAvailabilityReason reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public CheckNameAvailabilityResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.releaseplannertest.AgriFoodManager manager() {
        return this.serviceManager;
    }
}

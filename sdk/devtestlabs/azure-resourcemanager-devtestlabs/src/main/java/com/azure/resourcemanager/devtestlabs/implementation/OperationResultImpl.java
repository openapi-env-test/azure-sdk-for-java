// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.resourcemanager.devtestlabs.fluent.models.OperationResultInner;
import com.azure.resourcemanager.devtestlabs.models.HttpStatusCode;
import com.azure.resourcemanager.devtestlabs.models.OperationResult;

public final class OperationResultImpl implements OperationResult {
    private OperationResultInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    OperationResultImpl(
        OperationResultInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String status() {
        return this.innerModel().status();
    }

    public HttpStatusCode statusCode() {
        return this.innerModel().statusCode();
    }

    public String code() {
        return this.innerModel().code();
    }

    public String message() {
        return this.innerModel().message();
    }

    public OperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}

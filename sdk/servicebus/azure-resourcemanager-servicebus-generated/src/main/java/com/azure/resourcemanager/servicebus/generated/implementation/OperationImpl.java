// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.resourcemanager.servicebus.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.servicebus.generated.models.Operation;
import com.azure.resourcemanager.servicebus.generated.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager;

    OperationImpl(
        OperationInner innerObject, com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.implementation;

import com.azure.resourcemanager.workloadmonitor.WorkloadMonitorManager;
import com.azure.resourcemanager.workloadmonitor.fluent.models.OperationInner;
import com.azure.resourcemanager.workloadmonitor.models.Operation;
import com.azure.resourcemanager.workloadmonitor.models.OperationDisplay;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final WorkloadMonitorManager serviceManager;

    OperationImpl(OperationInner innerObject, WorkloadMonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private WorkloadMonitorManager manager() {
        return this.serviceManager;
    }
}

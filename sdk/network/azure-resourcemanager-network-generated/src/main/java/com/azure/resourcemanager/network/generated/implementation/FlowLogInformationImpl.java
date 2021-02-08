// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;
import com.azure.resourcemanager.network.generated.models.FlowLogInformation;
import com.azure.resourcemanager.network.generated.models.RetentionPolicyParameters;

public final class FlowLogInformationImpl implements FlowLogInformation {
    private FlowLogInformationInner innerObject;

    private final NetworkManager serviceManager;

    FlowLogInformationImpl(FlowLogInformationInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String targetResourceId() {
        return this.innerModel().targetResourceId();
    }

    public String storageId() {
        return this.innerModel().storageId();
    }

    public boolean enabled() {
        return this.innerModel().enabled();
    }

    public RetentionPolicyParameters retentionPolicy() {
        return this.innerModel().retentionPolicy();
    }

    public FlowLogInformationInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}

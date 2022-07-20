// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.AvailablePrivateEndpointTypeInner;
import com.azure.resourcemanager.network.generated.models.AvailablePrivateEndpointType;

public final class AvailablePrivateEndpointTypeImpl implements AvailablePrivateEndpointType {
    private AvailablePrivateEndpointTypeInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    AvailablePrivateEndpointTypeImpl(
        AvailablePrivateEndpointTypeInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String resourceName() {
        return this.innerModel().resourceName();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public AvailablePrivateEndpointTypeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}

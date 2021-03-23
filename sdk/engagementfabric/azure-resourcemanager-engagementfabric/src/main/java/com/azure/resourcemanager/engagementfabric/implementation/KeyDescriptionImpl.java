// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.engagementfabric.implementation;

import com.azure.resourcemanager.engagementfabric.fluent.models.KeyDescriptionInner;
import com.azure.resourcemanager.engagementfabric.models.KeyDescription;
import com.azure.resourcemanager.engagementfabric.models.KeyRank;

public final class KeyDescriptionImpl implements KeyDescription {
    private KeyDescriptionInner innerObject;

    private final com.azure.resourcemanager.engagementfabric.EngagementFabricManager serviceManager;

    KeyDescriptionImpl(
        KeyDescriptionInner innerObject,
        com.azure.resourcemanager.engagementfabric.EngagementFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public KeyRank rank() {
        return this.innerModel().rank();
    }

    public String value() {
        return this.innerModel().value();
    }

    public KeyDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.engagementfabric.EngagementFabricManager manager() {
        return this.serviceManager;
    }
}

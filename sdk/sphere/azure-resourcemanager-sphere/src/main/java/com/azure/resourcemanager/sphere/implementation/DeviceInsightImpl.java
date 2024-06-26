// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.implementation;

import com.azure.resourcemanager.sphere.fluent.models.DeviceInsightInner;
import com.azure.resourcemanager.sphere.models.DeviceInsight;
import java.time.OffsetDateTime;

public final class DeviceInsightImpl implements DeviceInsight {
    private DeviceInsightInner innerObject;

    private final com.azure.resourcemanager.sphere.AzureSphereManager serviceManager;

    DeviceInsightImpl(
        DeviceInsightInner innerObject, com.azure.resourcemanager.sphere.AzureSphereManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String deviceId() {
        return this.innerModel().deviceId();
    }

    public String description() {
        return this.innerModel().description();
    }

    public OffsetDateTime startTimestampUtc() {
        return this.innerModel().startTimestampUtc();
    }

    public OffsetDateTime endTimestampUtc() {
        return this.innerModel().endTimestampUtc();
    }

    public String eventCategory() {
        return this.innerModel().eventCategory();
    }

    public String eventClass() {
        return this.innerModel().eventClass();
    }

    public String eventType() {
        return this.innerModel().eventType();
    }

    public int eventCount() {
        return this.innerModel().eventCount();
    }

    public DeviceInsightInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sphere.AzureSphereManager manager() {
        return this.serviceManager;
    }
}

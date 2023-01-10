// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.databoxedge.fluent.models.DeviceCapacityInfoInner;
import com.azure.resourcemanager.databoxedge.models.ClusterCapacityViewData;
import com.azure.resourcemanager.databoxedge.models.ClusterStorageViewData;
import com.azure.resourcemanager.databoxedge.models.DeviceCapacityInfo;
import com.azure.resourcemanager.databoxedge.models.HostCapacity;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class DeviceCapacityInfoImpl implements DeviceCapacityInfo {
    private DeviceCapacityInfoInner innerObject;

    private final com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager;

    DeviceCapacityInfoImpl(
        DeviceCapacityInfoInner innerObject, com.azure.resourcemanager.databoxedge.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public ClusterStorageViewData clusterStorageCapacityInfo() {
        return this.innerModel().clusterStorageCapacityInfo();
    }

    public ClusterCapacityViewData clusterComputeCapacityInfo() {
        return this.innerModel().clusterComputeCapacityInfo();
    }

    public Map<String, HostCapacity> nodeCapacityInfos() {
        Map<String, HostCapacity> inner = this.innerModel().nodeCapacityInfos();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public DeviceCapacityInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}

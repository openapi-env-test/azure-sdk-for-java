// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.NetworkVirtualApplianceSkuInner;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSku;
import com.azure.resourcemanager.network.generated.models.NetworkVirtualApplianceSkuInstances;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkVirtualApplianceSkuImpl implements NetworkVirtualApplianceSku {
    private NetworkVirtualApplianceSkuInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    NetworkVirtualApplianceSkuImpl(
        NetworkVirtualApplianceSkuInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String vendor() {
        return this.innerModel().vendor();
    }

    public List<String> availableVersions() {
        List<String> inner = this.innerModel().availableVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<NetworkVirtualApplianceSkuInstances> availableScaleUnits() {
        List<NetworkVirtualApplianceSkuInstances> inner = this.innerModel().availableScaleUnits();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkVirtualApplianceSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}

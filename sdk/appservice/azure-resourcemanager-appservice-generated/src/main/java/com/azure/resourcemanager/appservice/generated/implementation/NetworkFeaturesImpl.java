// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.models.NetworkFeaturesInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.RelayServiceConnectionEntityInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetInfoInner;
import com.azure.resourcemanager.appservice.generated.models.NetworkFeatures;
import com.azure.resourcemanager.appservice.generated.models.RelayServiceConnectionEntity;
import com.azure.resourcemanager.appservice.generated.models.VnetInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class NetworkFeaturesImpl implements NetworkFeatures {
    private NetworkFeaturesInner innerObject;

    private final WebSiteManager serviceManager;

    NetworkFeaturesImpl(NetworkFeaturesInner innerObject, WebSiteManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
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

    public String virtualNetworkName() {
        return this.innerModel().virtualNetworkName();
    }

    public VnetInfo virtualNetworkConnection() {
        VnetInfoInner inner = this.innerModel().virtualNetworkConnection();
        if (inner != null) {
            return new VnetInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<RelayServiceConnectionEntity> hybridConnections() {
        List<RelayServiceConnectionEntityInner> inner = this.innerModel().hybridConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new RelayServiceConnectionEntityImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String kind() {
        return this.innerModel().kind();
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

    public NetworkFeaturesInner innerModel() {
        return this.innerObject;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }
}

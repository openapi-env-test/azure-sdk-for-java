// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionListInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteConnection;
import com.azure.resourcemanager.network.generated.models.ExpressRouteConnectionList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ExpressRouteConnectionListImpl implements ExpressRouteConnectionList {
    private ExpressRouteConnectionListInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ExpressRouteConnectionListImpl(
        ExpressRouteConnectionListInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ExpressRouteConnection> value() {
        List<ExpressRouteConnectionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ExpressRouteConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ExpressRouteConnectionListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}

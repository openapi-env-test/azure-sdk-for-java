// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableGremlinResourcesGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinResourcesGetResult;
import java.util.Collections;
import java.util.List;

public final class RestorableGremlinResourcesGetResultImpl implements RestorableGremlinResourcesGetResult {
    private RestorableGremlinResourcesGetResultInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    RestorableGremlinResourcesGetResultImpl(
        RestorableGremlinResourcesGetResultInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
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

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public List<String> graphNames() {
        List<String> inner = this.innerModel().graphNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RestorableGremlinResourcesGetResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}

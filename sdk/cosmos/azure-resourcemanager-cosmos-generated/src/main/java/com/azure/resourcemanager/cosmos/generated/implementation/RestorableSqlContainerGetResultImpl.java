// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableSqlContainerGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlContainerGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlContainerPropertiesResource;

public final class RestorableSqlContainerGetResultImpl implements RestorableSqlContainerGetResult {
    private RestorableSqlContainerGetResultInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    RestorableSqlContainerGetResultImpl(
        RestorableSqlContainerGetResultInner innerObject,
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

    public RestorableSqlContainerPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public RestorableSqlContainerGetResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}

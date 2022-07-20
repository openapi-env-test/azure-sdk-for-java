// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableGremlinResourcesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableGremlinResourcesGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinResources;
import com.azure.resourcemanager.cosmos.generated.models.RestorableGremlinResourcesGetResult;

public final class RestorableGremlinResourcesImpl implements RestorableGremlinResources {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableGremlinResourcesImpl.class);

    private final RestorableGremlinResourcesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableGremlinResourcesImpl(
        RestorableGremlinResourcesClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableGremlinResourcesGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableGremlinResourcesGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new RestorableGremlinResourcesGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableGremlinResourcesGetResult> list(
        String location, String instanceId, String restoreLocation, String restoreTimestampInUtc, Context context) {
        PagedIterable<RestorableGremlinResourcesGetResultInner> inner =
            this.serviceClient().list(location, instanceId, restoreLocation, restoreTimestampInUtc, context);
        return Utils.mapPage(inner, inner1 -> new RestorableGremlinResourcesGetResultImpl(inner1, this.manager()));
    }

    private RestorableGremlinResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}

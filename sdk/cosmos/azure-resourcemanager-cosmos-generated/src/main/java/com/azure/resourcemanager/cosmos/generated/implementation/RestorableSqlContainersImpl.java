// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableSqlContainersClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableSqlContainerGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlContainerGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableSqlContainers;

public final class RestorableSqlContainersImpl implements RestorableSqlContainers {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableSqlContainersImpl.class);

    private final RestorableSqlContainersClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableSqlContainersImpl(
        RestorableSqlContainersClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableSqlContainerGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableSqlContainerGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new RestorableSqlContainerGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableSqlContainerGetResult> list(
        String location,
        String instanceId,
        String restorableSqlDatabaseRid,
        String startTime,
        String endTime,
        Context context) {
        PagedIterable<RestorableSqlContainerGetResultInner> inner =
            this.serviceClient().list(location, instanceId, restorableSqlDatabaseRid, startTime, endTime, context);
        return Utils.mapPage(inner, inner1 -> new RestorableSqlContainerGetResultImpl(inner1, this.manager()));
    }

    private RestorableSqlContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}

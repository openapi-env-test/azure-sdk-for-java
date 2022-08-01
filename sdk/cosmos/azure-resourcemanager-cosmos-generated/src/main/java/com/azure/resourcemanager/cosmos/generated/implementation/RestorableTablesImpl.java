// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableTablesClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableTableGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableTableGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableTables;

public final class RestorableTablesImpl implements RestorableTables {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableTablesImpl.class);

    private final RestorableTablesClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableTablesImpl(
        RestorableTablesClient innerClient, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableTableGetResult> list(String location, String instanceId) {
        PagedIterable<RestorableTableGetResultInner> inner = this.serviceClient().list(location, instanceId);
        return Utils.mapPage(inner, inner1 -> new RestorableTableGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableTableGetResult> list(
        String location, String instanceId, String startTime, String endTime, Context context) {
        PagedIterable<RestorableTableGetResultInner> inner =
            this.serviceClient().list(location, instanceId, startTime, endTime, context);
        return Utils.mapPage(inner, inner1 -> new RestorableTableGetResultImpl(inner1, this.manager()));
    }

    private RestorableTablesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.RestorableDatabaseAccountsClient;
import com.azure.resourcemanager.cosmos.generated.fluent.models.RestorableDatabaseAccountGetResultInner;
import com.azure.resourcemanager.cosmos.generated.models.RestorableDatabaseAccountGetResult;
import com.azure.resourcemanager.cosmos.generated.models.RestorableDatabaseAccounts;

public final class RestorableDatabaseAccountsImpl implements RestorableDatabaseAccounts {
    private static final ClientLogger LOGGER = new ClientLogger(RestorableDatabaseAccountsImpl.class);

    private final RestorableDatabaseAccountsClient innerClient;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public RestorableDatabaseAccountsImpl(
        RestorableDatabaseAccountsClient innerClient,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<RestorableDatabaseAccountGetResult> listByLocation(String location) {
        PagedIterable<RestorableDatabaseAccountGetResultInner> inner = this.serviceClient().listByLocation(location);
        return Utils.mapPage(inner, inner1 -> new RestorableDatabaseAccountGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableDatabaseAccountGetResult> listByLocation(String location, Context context) {
        PagedIterable<RestorableDatabaseAccountGetResultInner> inner =
            this.serviceClient().listByLocation(location, context);
        return Utils.mapPage(inner, inner1 -> new RestorableDatabaseAccountGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableDatabaseAccountGetResult> list() {
        PagedIterable<RestorableDatabaseAccountGetResultInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new RestorableDatabaseAccountGetResultImpl(inner1, this.manager()));
    }

    public PagedIterable<RestorableDatabaseAccountGetResult> list(Context context) {
        PagedIterable<RestorableDatabaseAccountGetResultInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new RestorableDatabaseAccountGetResultImpl(inner1, this.manager()));
    }

    public RestorableDatabaseAccountGetResult getByLocation(String location, String instanceId) {
        RestorableDatabaseAccountGetResultInner inner = this.serviceClient().getByLocation(location, instanceId);
        if (inner != null) {
            return new RestorableDatabaseAccountGetResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RestorableDatabaseAccountGetResult> getByLocationWithResponse(
        String location, String instanceId, Context context) {
        Response<RestorableDatabaseAccountGetResultInner> inner =
            this.serviceClient().getByLocationWithResponse(location, instanceId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RestorableDatabaseAccountGetResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private RestorableDatabaseAccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }
}

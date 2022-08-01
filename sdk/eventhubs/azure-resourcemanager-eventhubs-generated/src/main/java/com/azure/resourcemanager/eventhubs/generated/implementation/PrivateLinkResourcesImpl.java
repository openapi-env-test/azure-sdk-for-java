// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.PrivateLinkResourcesListResultInner;
import com.azure.resourcemanager.eventhubs.generated.models.PrivateLinkResources;
import com.azure.resourcemanager.eventhubs.generated.models.PrivateLinkResourcesListResult;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PrivateLinkResourcesListResult get(String resourceGroupName, String namespaceName) {
        PrivateLinkResourcesListResultInner inner = this.serviceClient().get(resourceGroupName, namespaceName);
        if (inner != null) {
            return new PrivateLinkResourcesListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResourcesListResult> getWithResponse(
        String resourceGroupName, String namespaceName, Context context) {
        Response<PrivateLinkResourcesListResultInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, namespaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourcesListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager() {
        return this.serviceManager;
    }
}

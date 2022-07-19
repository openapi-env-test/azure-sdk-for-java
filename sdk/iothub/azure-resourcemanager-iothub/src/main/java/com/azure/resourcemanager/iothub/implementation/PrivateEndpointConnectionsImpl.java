// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.iothub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.iothub.models.PrivateEndpointConnection;
import com.azure.resourcemanager.iothub.models.PrivateEndpointConnections;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.iothub.IotHubManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient, com.azure.resourcemanager.iothub.IotHubManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public List<PrivateEndpointConnection> list(String resourceGroupName, String resourceName) {
        List<PrivateEndpointConnectionInner> inner = this.serviceClient().list(resourceGroupName, resourceName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<PrivateEndpointConnection>> listWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<List<PrivateEndpointConnectionInner>> inner =
            this.serviceClient().listWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection get(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().get(resourceGroupName, resourceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, resourceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, resourceName, privateEndpointConnectionName, privateEndpointConnection);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection update(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .update(
                    resourceGroupName, resourceName, privateEndpointConnectionName, privateEndpointConnection, context);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection delete(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().delete(resourceGroupName, resourceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection delete(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().delete(resourceGroupName, resourceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.iothub.IotHubManager manager() {
        return this.serviceManager;
    }
}

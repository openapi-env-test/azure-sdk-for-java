// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCircuitConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitConnection;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExpressRouteCircuitConnectionsImpl implements ExpressRouteCircuitConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitConnectionsImpl.class);

    private final ExpressRouteCircuitConnectionsClient innerClient;

    private final NetworkManager serviceManager;

    public ExpressRouteCircuitConnectionsImpl(
        ExpressRouteCircuitConnectionsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, circuitName, peeringName, connectionName);
    }

    public void delete(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, circuitName, peeringName, connectionName, context);
    }

    public ExpressRouteCircuitConnection get(
        String resourceGroupName, String circuitName, String peeringName, String connectionName) {
        ExpressRouteCircuitConnectionInner inner =
            this.serviceClient().get(resourceGroupName, circuitName, peeringName, connectionName);
        if (inner != null) {
            return new ExpressRouteCircuitConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCircuitConnection> getWithResponse(
        String resourceGroupName, String circuitName, String peeringName, String connectionName, Context context) {
        Response<ExpressRouteCircuitConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, circuitName, peeringName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteCircuitConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitConnection createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters) {
        ExpressRouteCircuitConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    circuitName,
                    peeringName,
                    connectionName,
                    expressRouteCircuitConnectionParameters);
        if (inner != null) {
            return new ExpressRouteCircuitConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitConnection createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        String connectionName,
        ExpressRouteCircuitConnectionInner expressRouteCircuitConnectionParameters,
        Context context) {
        ExpressRouteCircuitConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    circuitName,
                    peeringName,
                    connectionName,
                    expressRouteCircuitConnectionParameters,
                    context);
        if (inner != null) {
            return new ExpressRouteCircuitConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExpressRouteCircuitConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}

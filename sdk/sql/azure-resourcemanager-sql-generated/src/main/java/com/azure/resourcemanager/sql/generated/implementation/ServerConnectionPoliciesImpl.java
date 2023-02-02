// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.ServerConnectionPoliciesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerConnectionPolicyInner;
import com.azure.resourcemanager.sql.generated.models.ConnectionPolicyName;
import com.azure.resourcemanager.sql.generated.models.ServerConnectionPolicies;
import com.azure.resourcemanager.sql.generated.models.ServerConnectionPolicy;

public final class ServerConnectionPoliciesImpl implements ServerConnectionPolicies {
    private static final ClientLogger LOGGER = new ClientLogger(ServerConnectionPoliciesImpl.class);

    private final ServerConnectionPoliciesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public ServerConnectionPoliciesImpl(
        ServerConnectionPoliciesClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServerConnectionPolicy> getWithResponse(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context) {
        Response<ServerConnectionPolicyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, connectionPolicyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerConnectionPolicyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerConnectionPolicy get(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
        ServerConnectionPolicyInner inner =
            this.serviceClient().get(resourceGroupName, serverName, connectionPolicyName);
        if (inner != null) {
            return new ServerConnectionPolicyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServerConnectionPolicy> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerConnectionPolicyInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerConnectionPolicyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerConnectionPolicy> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerConnectionPolicyInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerConnectionPolicyImpl(inner1, this.manager()));
    }

    public ServerConnectionPolicy getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String connectionPolicyNameLocal = Utils.getValueFromIdByName(id, "connectionPolicies");
        if (connectionPolicyNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectionPolicies'.", id)));
        }
        ConnectionPolicyName connectionPolicyName = ConnectionPolicyName.fromString(connectionPolicyNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, connectionPolicyName, Context.NONE).getValue();
    }

    public Response<ServerConnectionPolicy> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String connectionPolicyNameLocal = Utils.getValueFromIdByName(id, "connectionPolicies");
        if (connectionPolicyNameLocal == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectionPolicies'.", id)));
        }
        ConnectionPolicyName connectionPolicyName = ConnectionPolicyName.fromString(connectionPolicyNameLocal);
        return this.getWithResponse(resourceGroupName, serverName, connectionPolicyName, context);
    }

    private ServerConnectionPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public ServerConnectionPolicyImpl define(ConnectionPolicyName name) {
        return new ServerConnectionPolicyImpl(name, this.manager());
    }
}

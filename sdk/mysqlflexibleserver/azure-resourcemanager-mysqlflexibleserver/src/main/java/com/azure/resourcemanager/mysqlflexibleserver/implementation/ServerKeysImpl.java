// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.ServerKeysClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ServerKeyInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerKey;
import com.azure.resourcemanager.mysqlflexibleserver.models.ServerKeys;

public final class ServerKeysImpl implements ServerKeys {
    private static final ClientLogger LOGGER = new ClientLogger(ServerKeysImpl.class);

    private final ServerKeysClient innerClient;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    public ServerKeysImpl(
        ServerKeysClient innerClient, com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ServerKey> list(String resourceGroupName, String serverName) {
        PagedIterable<ServerKeyInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerKeyImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerKey> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerKeyInner> inner = this.serviceClient().list(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerKeyImpl(inner1, this.manager()));
    }

    public ServerKey get(String resourceGroupName, String serverName, String keyName) {
        ServerKeyInner inner = this.serviceClient().get(resourceGroupName, serverName, keyName);
        if (inner != null) {
            return new ServerKeyImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerKey> getWithResponse(
        String resourceGroupName, String serverName, String keyName, Context context) {
        Response<ServerKeyInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, keyName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerKeyImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String serverName, String keyName, String resourceGroupName) {
        this.serviceClient().delete(serverName, keyName, resourceGroupName);
    }

    public void delete(String serverName, String keyName, String resourceGroupName, Context context) {
        this.serviceClient().delete(serverName, keyName, resourceGroupName, context);
    }

    public ServerKey getById(String id) {
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
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, keyName, Context.NONE).getValue();
    }

    public Response<ServerKey> getByIdWithResponse(String id, Context context) {
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
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, keyName, context);
    }

    public void deleteById(String id) {
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(serverName, keyName, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String keyName = Utils.getValueFromIdByName(id, "keys");
        if (keyName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'keys'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(serverName, keyName, resourceGroupName, context);
    }

    private ServerKeysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }

    public ServerKeyImpl define(String name) {
        return new ServerKeyImpl(name, this.manager());
    }
}

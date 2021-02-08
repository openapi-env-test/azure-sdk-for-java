// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.ServerAzureADAdministratorsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.ServerAzureADAdministratorInner;
import com.azure.resourcemanager.sql.generated.models.ServerAzureADAdministrator;
import com.azure.resourcemanager.sql.generated.models.ServerAzureADAdministrators;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServerAzureADAdministratorsImpl implements ServerAzureADAdministrators {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAzureADAdministratorsImpl.class);

    private final ServerAzureADAdministratorsClient innerClient;

    private final SqlManager serviceManager;

    public ServerAzureADAdministratorsImpl(ServerAzureADAdministratorsClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerAzureADAdministrator deleteByResourceGroup(String resourceGroupName, String serverName) {
        ServerAzureADAdministratorInner inner = this.serviceClient().delete(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerAzureADAdministratorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerAzureADAdministrator delete(String resourceGroupName, String serverName, Context context) {
        ServerAzureADAdministratorInner inner = this.serviceClient().delete(resourceGroupName, serverName, context);
        if (inner != null) {
            return new ServerAzureADAdministratorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerAzureADAdministrator get(String resourceGroupName, String serverName) {
        ServerAzureADAdministratorInner inner = this.serviceClient().get(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerAzureADAdministratorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerAzureADAdministrator> getWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<ServerAzureADAdministratorInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerAzureADAdministratorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ServerAzureADAdministrator> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerAzureADAdministratorInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new ServerAzureADAdministratorImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerAzureADAdministrator> listByServer(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerAzureADAdministratorInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new ServerAzureADAdministratorImpl(inner1, this.manager()));
    }

    public ServerAzureADAdministrator getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, Context.NONE).getValue();
    }

    public Response<ServerAzureADAdministrator> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, context);
    }

    public ServerAzureADAdministrator deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        return this.delete(resourceGroupName, serverName, Context.NONE);
    }

    public ServerAzureADAdministrator deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        return this.delete(resourceGroupName, serverName, context);
    }

    private ServerAzureADAdministratorsClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public ServerAzureADAdministratorImpl define() {
        return new ServerAzureADAdministratorImpl(this.manager());
    }
}

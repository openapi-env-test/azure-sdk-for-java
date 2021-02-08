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
import com.azure.resourcemanager.sql.generated.fluent.DatabasesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseInner;
import com.azure.resourcemanager.sql.generated.models.Database;
import com.azure.resourcemanager.sql.generated.models.Databases;
import com.azure.resourcemanager.sql.generated.models.ResourceMoveDefinition;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DatabasesImpl implements Databases {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasesImpl.class);

    private final DatabasesClient innerClient;

    private final SqlManager serviceManager;

    public DatabasesImpl(DatabasesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Database> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<DatabaseInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return inner.mapPage(inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<Database> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<DatabaseInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return inner.mapPage(inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public Database get(String resourceGroupName, String serverName, String databaseName) {
        DatabaseInner inner = this.serviceClient().get(resourceGroupName, serverName, databaseName);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Database> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        Response<DatabaseInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, databaseName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String databaseName) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName);
    }

    public void delete(String resourceGroupName, String serverName, String databaseName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, context);
    }

    public PagedIterable<Database> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName) {
        PagedIterable<DatabaseInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName);
        return inner.mapPage(inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<Database> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        PagedIterable<DatabaseInner> inner =
            this.serviceClient().listByElasticPool(resourceGroupName, serverName, elasticPoolName, context);
        return inner.mapPage(inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public Database pause(String resourceGroupName, String serverName, String databaseName) {
        DatabaseInner inner = this.serviceClient().pause(resourceGroupName, serverName, databaseName);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database pause(String resourceGroupName, String serverName, String databaseName, Context context) {
        DatabaseInner inner = this.serviceClient().pause(resourceGroupName, serverName, databaseName, context);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database resume(String resourceGroupName, String serverName, String databaseName) {
        DatabaseInner inner = this.serviceClient().resume(resourceGroupName, serverName, databaseName);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database resume(String resourceGroupName, String serverName, String databaseName, Context context) {
        DatabaseInner inner = this.serviceClient().resume(resourceGroupName, serverName, databaseName, context);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void upgradeDataWarehouse(String resourceGroupName, String serverName, String databaseName) {
        this.serviceClient().upgradeDataWarehouse(resourceGroupName, serverName, databaseName);
    }

    public void upgradeDataWarehouse(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        this.serviceClient().upgradeDataWarehouse(resourceGroupName, serverName, databaseName, context);
    }

    public void rename(
        String resourceGroupName, String serverName, String databaseName, ResourceMoveDefinition parameters) {
        this.serviceClient().rename(resourceGroupName, serverName, databaseName, parameters);
    }

    public Response<Void> renameWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        ResourceMoveDefinition parameters,
        Context context) {
        return this
            .serviceClient()
            .renameWithResponse(resourceGroupName, serverName, databaseName, parameters, context);
    }

    public Database getById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, Context.NONE).getValue();
    }

    public Response<Database> getByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, context);
    }

    public void deleteById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        this.delete(resourceGroupName, serverName, databaseName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        this.delete(resourceGroupName, serverName, databaseName, context);
    }

    private DatabasesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    public DatabaseImpl define(String name) {
        return new DatabaseImpl(name, this.manager());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.KustoPoolDatabasesClient;
import com.azure.resourcemanager.synapse.fluent.models.DatabaseInner;
import com.azure.resourcemanager.synapse.models.Database;
import com.azure.resourcemanager.synapse.models.KustoPoolDatabases;

public final class KustoPoolDatabasesImpl implements KustoPoolDatabases {
    private static final ClientLogger LOGGER = new ClientLogger(KustoPoolDatabasesImpl.class);

    private final KustoPoolDatabasesClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public KustoPoolDatabasesImpl(
        KustoPoolDatabasesClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Database> listByKustoPool(
        String resourceGroupName, String workspaceName, String kustoPoolName) {
        PagedIterable<DatabaseInner> inner =
            this.serviceClient().listByKustoPool(resourceGroupName, workspaceName, kustoPoolName);
        return Utils.mapPage(inner, inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public PagedIterable<Database> listByKustoPool(
        String resourceGroupName, String workspaceName, String kustoPoolName, Context context) {
        PagedIterable<DatabaseInner> inner =
            this.serviceClient().listByKustoPool(resourceGroupName, workspaceName, kustoPoolName, context);
        return Utils.mapPage(inner, inner1 -> new DatabaseImpl(inner1, this.manager()));
    }

    public Response<Database> getWithResponse(
        String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName, Context context) {
        Response<DatabaseInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, kustoPoolName, databaseName, context);
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

    public Database get(String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName) {
        DatabaseInner inner = this.serviceClient().get(resourceGroupName, workspaceName, kustoPoolName, databaseName);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters) {
        DatabaseInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, workspaceName, kustoPoolName, databaseName, parameters);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters,
        Context context) {
        DatabaseInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, workspaceName, kustoPoolName, databaseName, parameters, context);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database update(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters) {
        DatabaseInner inner =
            this.serviceClient().update(resourceGroupName, workspaceName, kustoPoolName, databaseName, parameters);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Database update(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters,
        Context context) {
        DatabaseInner inner =
            this
                .serviceClient()
                .update(resourceGroupName, workspaceName, kustoPoolName, databaseName, parameters, context);
        if (inner != null) {
            return new DatabaseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, kustoPoolName, databaseName);
    }

    public void delete(
        String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, kustoPoolName, databaseName, context);
    }

    private KustoPoolDatabasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}

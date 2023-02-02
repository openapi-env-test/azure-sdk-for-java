// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.MaintenanceWindowsOperationsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.MaintenanceWindowsInner;
import com.azure.resourcemanager.sql.generated.models.MaintenanceWindows;
import com.azure.resourcemanager.sql.generated.models.MaintenanceWindowsOperations;

public final class MaintenanceWindowsOperationsImpl implements MaintenanceWindowsOperations {
    private static final ClientLogger LOGGER = new ClientLogger(MaintenanceWindowsOperationsImpl.class);

    private final MaintenanceWindowsOperationsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public MaintenanceWindowsOperationsImpl(
        MaintenanceWindowsOperationsClient innerClient,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<MaintenanceWindows> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String maintenanceWindowName,
        Context context) {
        Response<MaintenanceWindowsInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, maintenanceWindowName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MaintenanceWindowsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MaintenanceWindows get(
        String resourceGroupName, String serverName, String databaseName, String maintenanceWindowName) {
        MaintenanceWindowsInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, maintenanceWindowName);
        if (inner != null) {
            return new MaintenanceWindowsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String maintenanceWindowName,
        MaintenanceWindowsInner parameters,
        Context context) {
        return this
            .serviceClient()
            .createOrUpdateWithResponse(
                resourceGroupName, serverName, databaseName, maintenanceWindowName, parameters, context);
    }

    public void createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String maintenanceWindowName,
        MaintenanceWindowsInner parameters) {
        this
            .serviceClient()
            .createOrUpdate(resourceGroupName, serverName, databaseName, maintenanceWindowName, parameters);
    }

    private MaintenanceWindowsOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

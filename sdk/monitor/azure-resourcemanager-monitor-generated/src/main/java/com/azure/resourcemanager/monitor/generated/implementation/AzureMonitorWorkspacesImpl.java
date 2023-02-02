// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.AzureMonitorWorkspacesClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.MonitoringAccountResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AzureMonitorWorkspaces;
import com.azure.resourcemanager.monitor.generated.models.MonitoringAccountResource;

public final class AzureMonitorWorkspacesImpl implements AzureMonitorWorkspaces {
    private static final ClientLogger LOGGER = new ClientLogger(AzureMonitorWorkspacesImpl.class);

    private final AzureMonitorWorkspacesClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public AzureMonitorWorkspacesImpl(
        AzureMonitorWorkspacesClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MonitoringAccountResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<MonitoringAccountResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new MonitoringAccountResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoringAccountResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<MonitoringAccountResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new MonitoringAccountResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoringAccountResource> list() {
        PagedIterable<MonitoringAccountResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new MonitoringAccountResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<MonitoringAccountResource> list(Context context) {
        PagedIterable<MonitoringAccountResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new MonitoringAccountResourceImpl(inner1, this.manager()));
    }

    public Response<MonitoringAccountResource> getByResourceGroupWithResponse(
        String resourceGroupName, String monitoringAccountName, Context context) {
        Response<MonitoringAccountResourceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, monitoringAccountName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MonitoringAccountResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MonitoringAccountResource getByResourceGroup(String resourceGroupName, String monitoringAccountName) {
        MonitoringAccountResourceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, monitoringAccountName);
        if (inner != null) {
            return new MonitoringAccountResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(
        String resourceGroupName, String monitoringAccountName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, monitoringAccountName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String monitoringAccountName) {
        this.serviceClient().delete(resourceGroupName, monitoringAccountName);
    }

    public MonitoringAccountResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitoringAccountName = Utils.getValueFromIdByName(id, "accounts");
        if (monitoringAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, monitoringAccountName, Context.NONE).getValue();
    }

    public Response<MonitoringAccountResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitoringAccountName = Utils.getValueFromIdByName(id, "accounts");
        if (monitoringAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, monitoringAccountName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitoringAccountName = Utils.getValueFromIdByName(id, "accounts");
        if (monitoringAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, monitoringAccountName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitoringAccountName = Utils.getValueFromIdByName(id, "accounts");
        if (monitoringAccountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, monitoringAccountName, context);
    }

    private AzureMonitorWorkspacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    public MonitoringAccountResourceImpl define(String name) {
        return new MonitoringAccountResourceImpl(name, this.manager());
    }
}

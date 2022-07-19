// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.FlowLogsClient;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInner;
import com.azure.resourcemanager.network.generated.models.FlowLog;
import com.azure.resourcemanager.network.generated.models.FlowLogs;

public final class FlowLogsImpl implements FlowLogs {
    private static final ClientLogger LOGGER = new ClientLogger(FlowLogsImpl.class);

    private final FlowLogsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public FlowLogsImpl(
        FlowLogsClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public FlowLog get(String resourceGroupName, String networkWatcherName, String flowLogName) {
        FlowLogInner inner = this.serviceClient().get(resourceGroupName, networkWatcherName, flowLogName);
        if (inner != null) {
            return new FlowLogImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FlowLog> getWithResponse(
        String resourceGroupName, String networkWatcherName, String flowLogName, Context context) {
        Response<FlowLogInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, networkWatcherName, flowLogName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FlowLogImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkWatcherName, String flowLogName) {
        this.serviceClient().delete(resourceGroupName, networkWatcherName, flowLogName);
    }

    public void delete(String resourceGroupName, String networkWatcherName, String flowLogName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkWatcherName, flowLogName, context);
    }

    public PagedIterable<FlowLog> list(String resourceGroupName, String networkWatcherName) {
        PagedIterable<FlowLogInner> inner = this.serviceClient().list(resourceGroupName, networkWatcherName);
        return Utils.mapPage(inner, inner1 -> new FlowLogImpl(inner1, this.manager()));
    }

    public PagedIterable<FlowLog> list(String resourceGroupName, String networkWatcherName, Context context) {
        PagedIterable<FlowLogInner> inner = this.serviceClient().list(resourceGroupName, networkWatcherName, context);
        return Utils.mapPage(inner, inner1 -> new FlowLogImpl(inner1, this.manager()));
    }

    public FlowLog getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        String flowLogName = Utils.getValueFromIdByName(id, "flowLogs");
        if (flowLogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'flowLogs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkWatcherName, flowLogName, Context.NONE).getValue();
    }

    public Response<FlowLog> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        String flowLogName = Utils.getValueFromIdByName(id, "flowLogs");
        if (flowLogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'flowLogs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkWatcherName, flowLogName, context);
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
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        String flowLogName = Utils.getValueFromIdByName(id, "flowLogs");
        if (flowLogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'flowLogs'.", id)));
        }
        this.delete(resourceGroupName, networkWatcherName, flowLogName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkWatcherName = Utils.getValueFromIdByName(id, "networkWatchers");
        if (networkWatcherName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkWatchers'.", id)));
        }
        String flowLogName = Utils.getValueFromIdByName(id, "flowLogs");
        if (flowLogName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'flowLogs'.", id)));
        }
        this.delete(resourceGroupName, networkWatcherName, flowLogName, context);
    }

    private FlowLogsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public FlowLogImpl define(String name) {
        return new FlowLogImpl(name, this.manager());
    }
}

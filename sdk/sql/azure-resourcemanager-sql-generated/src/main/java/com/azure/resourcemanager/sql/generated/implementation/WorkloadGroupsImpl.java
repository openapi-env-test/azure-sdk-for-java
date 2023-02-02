// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.WorkloadGroupsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.WorkloadGroupInner;
import com.azure.resourcemanager.sql.generated.models.WorkloadGroup;
import com.azure.resourcemanager.sql.generated.models.WorkloadGroups;

public final class WorkloadGroupsImpl implements WorkloadGroups {
    private static final ClientLogger LOGGER = new ClientLogger(WorkloadGroupsImpl.class);

    private final WorkloadGroupsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public WorkloadGroupsImpl(
        WorkloadGroupsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<WorkloadGroup> getWithResponse(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName, Context context) {
        Response<WorkloadGroupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkloadGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkloadGroup get(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        WorkloadGroupInner inner =
            this.serviceClient().get(resourceGroupName, serverName, databaseName, workloadGroupName);
        if (inner != null) {
            return new WorkloadGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serverName, String databaseName, String workloadGroupName) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, workloadGroupName);
    }

    public void delete(
        String resourceGroupName, String serverName, String databaseName, String workloadGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, databaseName, workloadGroupName, context);
    }

    public PagedIterable<WorkloadGroup> listByDatabase(
        String resourceGroupName, String serverName, String databaseName) {
        PagedIterable<WorkloadGroupInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName);
        return Utils.mapPage(inner, inner1 -> new WorkloadGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkloadGroup> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        PagedIterable<WorkloadGroupInner> inner =
            this.serviceClient().listByDatabase(resourceGroupName, serverName, databaseName, context);
        return Utils.mapPage(inner, inner1 -> new WorkloadGroupImpl(inner1, this.manager()));
    }

    public WorkloadGroup getById(String id) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName, Context.NONE)
            .getValue();
    }

    public Response<WorkloadGroup> getByIdWithResponse(String id, Context context) {
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
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, databaseName, workloadGroupName, context);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        this.delete(resourceGroupName, serverName, databaseName, workloadGroupName, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String databaseName = Utils.getValueFromIdByName(id, "databases");
        if (databaseName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'databases'.", id)));
        }
        String workloadGroupName = Utils.getValueFromIdByName(id, "workloadGroups");
        if (workloadGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'workloadGroups'.", id)));
        }
        this.delete(resourceGroupName, serverName, databaseName, workloadGroupName, context);
    }

    private WorkloadGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public WorkloadGroupImpl define(String name) {
        return new WorkloadGroupImpl(name, this.manager());
    }
}

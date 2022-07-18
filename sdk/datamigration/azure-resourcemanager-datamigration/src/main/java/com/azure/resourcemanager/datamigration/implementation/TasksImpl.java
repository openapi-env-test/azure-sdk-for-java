// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.fluent.TasksClient;
import com.azure.resourcemanager.datamigration.fluent.models.CommandPropertiesInner;
import com.azure.resourcemanager.datamigration.fluent.models.ProjectTaskInner;
import com.azure.resourcemanager.datamigration.models.CommandProperties;
import com.azure.resourcemanager.datamigration.models.ProjectTask;
import com.azure.resourcemanager.datamigration.models.Tasks;

public final class TasksImpl implements Tasks {
    private static final ClientLogger LOGGER = new ClientLogger(TasksImpl.class);

    private final TasksClient innerClient;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public TasksImpl(
        TasksClient innerClient, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProjectTask> list(String groupName, String serviceName, String projectName) {
        PagedIterable<ProjectTaskInner> inner = this.serviceClient().list(groupName, serviceName, projectName);
        return Utils.mapPage(inner, inner1 -> new ProjectTaskImpl(inner1, this.manager()));
    }

    public PagedIterable<ProjectTask> list(
        String groupName, String serviceName, String projectName, String taskType, Context context) {
        PagedIterable<ProjectTaskInner> inner =
            this.serviceClient().list(groupName, serviceName, projectName, taskType, context);
        return Utils.mapPage(inner, inner1 -> new ProjectTaskImpl(inner1, this.manager()));
    }

    public ProjectTask get(String groupName, String serviceName, String projectName, String taskName) {
        ProjectTaskInner inner = this.serviceClient().get(groupName, serviceName, projectName, taskName);
        if (inner != null) {
            return new ProjectTaskImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProjectTask> getWithResponse(
        String groupName, String serviceName, String projectName, String taskName, String expand, Context context) {
        Response<ProjectTaskInner> inner =
            this.serviceClient().getWithResponse(groupName, serviceName, projectName, taskName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProjectTaskImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String groupName, String serviceName, String projectName, String taskName) {
        this.serviceClient().delete(groupName, serviceName, projectName, taskName);
    }

    public Response<Void> deleteWithResponse(
        String groupName,
        String serviceName,
        String projectName,
        String taskName,
        Boolean deleteRunningTasks,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(groupName, serviceName, projectName, taskName, deleteRunningTasks, context);
    }

    public ProjectTask cancel(String groupName, String serviceName, String projectName, String taskName) {
        ProjectTaskInner inner = this.serviceClient().cancel(groupName, serviceName, projectName, taskName);
        if (inner != null) {
            return new ProjectTaskImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProjectTask> cancelWithResponse(
        String groupName, String serviceName, String projectName, String taskName, Context context) {
        Response<ProjectTaskInner> inner =
            this.serviceClient().cancelWithResponse(groupName, serviceName, projectName, taskName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProjectTaskImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CommandProperties command(
        String groupName, String serviceName, String projectName, String taskName, CommandPropertiesInner parameters) {
        CommandPropertiesInner inner =
            this.serviceClient().command(groupName, serviceName, projectName, taskName, parameters);
        if (inner != null) {
            return new CommandPropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CommandProperties> commandWithResponse(
        String groupName,
        String serviceName,
        String projectName,
        String taskName,
        CommandPropertiesInner parameters,
        Context context) {
        Response<CommandPropertiesInner> inner =
            this
                .serviceClient()
                .commandWithResponse(groupName, serviceName, projectName, taskName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CommandPropertiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProjectTask getById(String id) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String taskName = Utils.getValueFromIdByName(id, "tasks");
        if (taskName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tasks'.", id)));
        }
        String localExpand = null;
        return this
            .getWithResponse(groupName, serviceName, projectName, taskName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<ProjectTask> getByIdWithResponse(String id, String expand, Context context) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String taskName = Utils.getValueFromIdByName(id, "tasks");
        if (taskName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tasks'.", id)));
        }
        return this.getWithResponse(groupName, serviceName, projectName, taskName, expand, context);
    }

    public void deleteById(String id) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String taskName = Utils.getValueFromIdByName(id, "tasks");
        if (taskName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tasks'.", id)));
        }
        Boolean localDeleteRunningTasks = null;
        this.deleteWithResponse(groupName, serviceName, projectName, taskName, localDeleteRunningTasks, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Boolean deleteRunningTasks, Context context) {
        String groupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (groupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String taskName = Utils.getValueFromIdByName(id, "tasks");
        if (taskName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tasks'.", id)));
        }
        return this.deleteWithResponse(groupName, serviceName, projectName, taskName, deleteRunningTasks, context);
    }

    private TasksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    public ProjectTaskImpl define(String name) {
        return new ProjectTaskImpl(name, this.manager());
    }
}

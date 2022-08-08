// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagemover.fluent.ProjectsClient;
import com.azure.resourcemanager.storagemover.fluent.models.ProjectInner;
import com.azure.resourcemanager.storagemover.models.Project;
import com.azure.resourcemanager.storagemover.models.Projects;

public final class ProjectsImpl implements Projects {
    private static final ClientLogger LOGGER = new ClientLogger(ProjectsImpl.class);

    private final ProjectsClient innerClient;

    private final com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager;

    public ProjectsImpl(
        ProjectsClient innerClient, com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Project> list(String resourceGroupName, String storageMoverName) {
        PagedIterable<ProjectInner> inner = this.serviceClient().list(resourceGroupName, storageMoverName);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public PagedIterable<Project> list(String resourceGroupName, String storageMoverName, Context context) {
        PagedIterable<ProjectInner> inner = this.serviceClient().list(resourceGroupName, storageMoverName, context);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public Project get(String resourceGroupName, String storageMoverName, String projectName) {
        ProjectInner inner = this.serviceClient().get(resourceGroupName, storageMoverName, projectName);
        if (inner != null) {
            return new ProjectImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Project> getWithResponse(
        String resourceGroupName, String storageMoverName, String projectName, Context context) {
        Response<ProjectInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, storageMoverName, projectName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProjectImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String storageMoverName, String projectName) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, projectName);
    }

    public void delete(String resourceGroupName, String storageMoverName, String projectName, Context context) {
        this.serviceClient().delete(resourceGroupName, storageMoverName, projectName, context);
    }

    public Project getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageMoverName, projectName, Context.NONE).getValue();
    }

    public Response<Project> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getWithResponse(resourceGroupName, storageMoverName, projectName, context);
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
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, projectName, Context.NONE);
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
        String storageMoverName = Utils.getValueFromIdByName(id, "storageMovers");
        if (storageMoverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'storageMovers'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        this.delete(resourceGroupName, storageMoverName, projectName, context);
    }

    private ProjectsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagemover.StorageMoverManager manager() {
        return this.serviceManager;
    }

    public ProjectImpl define(String name) {
        return new ProjectImpl(name, this.manager());
    }
}

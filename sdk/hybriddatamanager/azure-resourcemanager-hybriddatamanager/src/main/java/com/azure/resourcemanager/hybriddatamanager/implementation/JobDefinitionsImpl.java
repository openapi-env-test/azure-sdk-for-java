// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybriddatamanager.fluent.JobDefinitionsClient;
import com.azure.resourcemanager.hybriddatamanager.fluent.models.JobDefinitionInner;
import com.azure.resourcemanager.hybriddatamanager.models.JobDefinition;
import com.azure.resourcemanager.hybriddatamanager.models.JobDefinitions;
import com.azure.resourcemanager.hybriddatamanager.models.RunParameters;

public final class JobDefinitionsImpl implements JobDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(JobDefinitionsImpl.class);

    private final JobDefinitionsClient innerClient;

    private final com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager;

    public JobDefinitionsImpl(
        JobDefinitionsClient innerClient,
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JobDefinition> listByDataService(
        String dataServiceName, String resourceGroupName, String dataManagerName) {
        PagedIterable<JobDefinitionInner> inner =
            this.serviceClient().listByDataService(dataServiceName, resourceGroupName, dataManagerName);
        return Utils.mapPage(inner, inner1 -> new JobDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<JobDefinition> listByDataService(
        String dataServiceName, String resourceGroupName, String dataManagerName, String filter, Context context) {
        PagedIterable<JobDefinitionInner> inner =
            this
                .serviceClient()
                .listByDataService(dataServiceName, resourceGroupName, dataManagerName, filter, context);
        return Utils.mapPage(inner, inner1 -> new JobDefinitionImpl(inner1, this.manager()));
    }

    public JobDefinition get(
        String dataServiceName, String jobDefinitionName, String resourceGroupName, String dataManagerName) {
        JobDefinitionInner inner =
            this.serviceClient().get(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName);
        if (inner != null) {
            return new JobDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobDefinition> getWithResponse(
        String dataServiceName,
        String jobDefinitionName,
        String resourceGroupName,
        String dataManagerName,
        Context context) {
        Response<JobDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String dataServiceName, String jobDefinitionName, String resourceGroupName, String dataManagerName) {
        this.serviceClient().delete(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName);
    }

    public void delete(
        String dataServiceName,
        String jobDefinitionName,
        String resourceGroupName,
        String dataManagerName,
        Context context) {
        this.serviceClient().delete(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, context);
    }

    public void run(
        String dataServiceName,
        String jobDefinitionName,
        String resourceGroupName,
        String dataManagerName,
        RunParameters runParameters) {
        this.serviceClient().run(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, runParameters);
    }

    public void run(
        String dataServiceName,
        String jobDefinitionName,
        String resourceGroupName,
        String dataManagerName,
        RunParameters runParameters,
        Context context) {
        this
            .serviceClient()
            .run(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, runParameters, context);
    }

    public PagedIterable<JobDefinition> listByDataManager(String resourceGroupName, String dataManagerName) {
        PagedIterable<JobDefinitionInner> inner =
            this.serviceClient().listByDataManager(resourceGroupName, dataManagerName);
        return Utils.mapPage(inner, inner1 -> new JobDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<JobDefinition> listByDataManager(
        String resourceGroupName, String dataManagerName, String filter, Context context) {
        PagedIterable<JobDefinitionInner> inner =
            this.serviceClient().listByDataManager(resourceGroupName, dataManagerName, filter, context);
        return Utils.mapPage(inner, inner1 -> new JobDefinitionImpl(inner1, this.manager()));
    }

    public JobDefinition getById(String id) {
        String dataServiceName = Utils.getValueFromIdByName(id, "dataServices");
        if (dataServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataServices'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        return this
            .getWithResponse(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, Context.NONE)
            .getValue();
    }

    public Response<JobDefinition> getByIdWithResponse(String id, Context context) {
        String dataServiceName = Utils.getValueFromIdByName(id, "dataServices");
        if (dataServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataServices'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        return this.getWithResponse(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, context);
    }

    public void deleteById(String id) {
        String dataServiceName = Utils.getValueFromIdByName(id, "dataServices");
        if (dataServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataServices'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        this.delete(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String dataServiceName = Utils.getValueFromIdByName(id, "dataServices");
        if (dataServiceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataServices'.", id)));
        }
        String jobDefinitionName = Utils.getValueFromIdByName(id, "jobDefinitions");
        if (jobDefinitionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'jobDefinitions'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dataManagerName = Utils.getValueFromIdByName(id, "dataManagers");
        if (dataManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataManagers'.", id)));
        }
        this.delete(dataServiceName, jobDefinitionName, resourceGroupName, dataManagerName, context);
    }

    private JobDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager() {
        return this.serviceManager;
    }

    public JobDefinitionImpl define(String name) {
        return new JobDefinitionImpl(name, this.manager());
    }
}

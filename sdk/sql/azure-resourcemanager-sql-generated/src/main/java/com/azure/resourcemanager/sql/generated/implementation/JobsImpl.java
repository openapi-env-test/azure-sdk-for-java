// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.JobsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.JobInner;
import com.azure.resourcemanager.sql.generated.models.Job;
import com.azure.resourcemanager.sql.generated.models.Jobs;

public final class JobsImpl implements Jobs {
    private static final ClientLogger LOGGER = new ClientLogger(JobsImpl.class);

    private final JobsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public JobsImpl(JobsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Job> listByAgent(String resourceGroupName, String serverName, String jobAgentName) {
        PagedIterable<JobInner> inner = this.serviceClient().listByAgent(resourceGroupName, serverName, jobAgentName);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public PagedIterable<Job> listByAgent(
        String resourceGroupName, String serverName, String jobAgentName, Context context) {
        PagedIterable<JobInner> inner =
            this.serviceClient().listByAgent(resourceGroupName, serverName, jobAgentName, context);
        return Utils.mapPage(inner, inner1 -> new JobImpl(inner1, this.manager()));
    }

    public Response<Job> getWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, Context context) {
        Response<JobInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, jobAgentName, jobName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Job get(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        JobInner inner = this.serviceClient().get(resourceGroupName, serverName, jobAgentName, jobName);
        if (inner != null) {
            return new JobImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serverName, jobAgentName, jobName, context);
    }

    public void delete(String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        this.serviceClient().delete(resourceGroupName, serverName, jobAgentName, jobName);
    }

    public Job getById(String id) {
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
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, jobAgentName, jobName, Context.NONE).getValue();
    }

    public Response<Job> getByIdWithResponse(String id, Context context) {
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
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serverName, jobAgentName, jobName, context);
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
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, serverName, jobAgentName, jobName, Context.NONE);
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
        String serverName = Utils.getValueFromIdByName(id, "servers");
        if (serverName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'servers'.", id)));
        }
        String jobAgentName = Utils.getValueFromIdByName(id, "jobAgents");
        if (jobAgentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobAgents'.", id)));
        }
        String jobName = Utils.getValueFromIdByName(id, "jobs");
        if (jobName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'jobs'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serverName, jobAgentName, jobName, context);
    }

    private JobsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }

    public JobImpl define(String name) {
        return new JobImpl(name, this.manager());
    }
}

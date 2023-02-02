// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.JobVersionsClient;
import com.azure.resourcemanager.sql.generated.fluent.models.JobVersionInner;
import com.azure.resourcemanager.sql.generated.models.JobVersion;
import com.azure.resourcemanager.sql.generated.models.JobVersions;

public final class JobVersionsImpl implements JobVersions {
    private static final ClientLogger LOGGER = new ClientLogger(JobVersionsImpl.class);

    private final JobVersionsClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public JobVersionsImpl(
        JobVersionsClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<JobVersion> listByJob(
        String resourceGroupName, String serverName, String jobAgentName, String jobName) {
        PagedIterable<JobVersionInner> inner =
            this.serviceClient().listByJob(resourceGroupName, serverName, jobAgentName, jobName);
        return Utils.mapPage(inner, inner1 -> new JobVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<JobVersion> listByJob(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, Context context) {
        PagedIterable<JobVersionInner> inner =
            this.serviceClient().listByJob(resourceGroupName, serverName, jobAgentName, jobName, context);
        return Utils.mapPage(inner, inner1 -> new JobVersionImpl(inner1, this.manager()));
    }

    public Response<JobVersion> getWithResponse(
        String resourceGroupName,
        String serverName,
        String jobAgentName,
        String jobName,
        int jobVersion,
        Context context) {
        Response<JobVersionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serverName, jobAgentName, jobName, jobVersion, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public JobVersion get(
        String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion) {
        JobVersionInner inner =
            this.serviceClient().get(resourceGroupName, serverName, jobAgentName, jobName, jobVersion);
        if (inner != null) {
            return new JobVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private JobVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.WorkflowVersionsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowVersionInner;
import com.azure.resourcemanager.appservice.generated.models.WorkflowVersion;
import com.azure.resourcemanager.appservice.generated.models.WorkflowVersions;

public final class WorkflowVersionsImpl implements WorkflowVersions {
    private static final ClientLogger LOGGER = new ClientLogger(WorkflowVersionsImpl.class);

    private final WorkflowVersionsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public WorkflowVersionsImpl(
        WorkflowVersionsClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkflowVersion> list(String resourceGroupName, String name, String workflowName) {
        PagedIterable<WorkflowVersionInner> inner = this.serviceClient().list(resourceGroupName, name, workflowName);
        return Utils.mapPage(inner, inner1 -> new WorkflowVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkflowVersion> list(
        String resourceGroupName, String name, String workflowName, Integer top, Context context) {
        PagedIterable<WorkflowVersionInner> inner =
            this.serviceClient().list(resourceGroupName, name, workflowName, top, context);
        return Utils.mapPage(inner, inner1 -> new WorkflowVersionImpl(inner1, this.manager()));
    }

    public WorkflowVersion get(String resourceGroupName, String name, String workflowName, String versionId) {
        WorkflowVersionInner inner = this.serviceClient().get(resourceGroupName, name, workflowName, versionId);
        if (inner != null) {
            return new WorkflowVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkflowVersion> getWithResponse(
        String resourceGroupName, String name, String workflowName, String versionId, Context context) {
        Response<WorkflowVersionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, name, workflowName, versionId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkflowVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private WorkflowVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.WorkflowRunActionScopeRepetitionsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.WorkflowRunActionRepetitionDefinitionInner;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActionRepetitionDefinition;
import com.azure.resourcemanager.appservice.generated.models.WorkflowRunActionScopeRepetitions;

public final class WorkflowRunActionScopeRepetitionsImpl implements WorkflowRunActionScopeRepetitions {
    private static final ClientLogger LOGGER = new ClientLogger(WorkflowRunActionScopeRepetitionsImpl.class);

    private final WorkflowRunActionScopeRepetitionsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public WorkflowRunActionScopeRepetitionsImpl(
        WorkflowRunActionScopeRepetitionsClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<WorkflowRunActionRepetitionDefinition> list(
        String resourceGroupName, String name, String workflowName, String runName, String actionName) {
        PagedIterable<WorkflowRunActionRepetitionDefinitionInner> inner =
            this.serviceClient().list(resourceGroupName, name, workflowName, runName, actionName);
        return Utils.mapPage(inner, inner1 -> new WorkflowRunActionRepetitionDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<WorkflowRunActionRepetitionDefinition> list(
        String resourceGroupName,
        String name,
        String workflowName,
        String runName,
        String actionName,
        Context context) {
        PagedIterable<WorkflowRunActionRepetitionDefinitionInner> inner =
            this.serviceClient().list(resourceGroupName, name, workflowName, runName, actionName, context);
        return Utils.mapPage(inner, inner1 -> new WorkflowRunActionRepetitionDefinitionImpl(inner1, this.manager()));
    }

    public WorkflowRunActionRepetitionDefinition get(
        String resourceGroupName,
        String name,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName) {
        WorkflowRunActionRepetitionDefinitionInner inner =
            this.serviceClient().get(resourceGroupName, name, workflowName, runName, actionName, repetitionName);
        if (inner != null) {
            return new WorkflowRunActionRepetitionDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkflowRunActionRepetitionDefinition> getWithResponse(
        String resourceGroupName,
        String name,
        String workflowName,
        String runName,
        String actionName,
        String repetitionName,
        Context context) {
        Response<WorkflowRunActionRepetitionDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, name, workflowName, runName, actionName, repetitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkflowRunActionRepetitionDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private WorkflowRunActionScopeRepetitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}

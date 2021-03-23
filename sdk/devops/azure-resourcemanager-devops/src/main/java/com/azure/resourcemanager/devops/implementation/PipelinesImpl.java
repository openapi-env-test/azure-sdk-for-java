// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devops.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devops.fluent.PipelinesClient;
import com.azure.resourcemanager.devops.fluent.models.PipelineInner;
import com.azure.resourcemanager.devops.models.Pipeline;
import com.azure.resourcemanager.devops.models.Pipelines;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PipelinesImpl implements Pipelines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelinesImpl.class);

    private final PipelinesClient innerClient;

    private final com.azure.resourcemanager.devops.DevopsManager serviceManager;

    public PipelinesImpl(PipelinesClient innerClient, com.azure.resourcemanager.devops.DevopsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Pipeline getByResourceGroup(String resourceGroupName, String pipelineName) {
        PipelineInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, pipelineName);
        if (inner != null) {
            return new PipelineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Pipeline> getByResourceGroupWithResponse(
        String resourceGroupName, String pipelineName, Context context) {
        Response<PipelineInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, pipelineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PipelineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String pipelineName) {
        this.serviceClient().delete(resourceGroupName, pipelineName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String pipelineName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, pipelineName, context);
    }

    public PagedIterable<Pipeline> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PipelineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PipelineImpl(inner1, this.manager()));
    }

    public PagedIterable<Pipeline> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PipelineInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PipelineImpl(inner1, this.manager()));
    }

    public PagedIterable<Pipeline> list() {
        PagedIterable<PipelineInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PipelineImpl(inner1, this.manager()));
    }

    public PagedIterable<Pipeline> list(Context context) {
        PagedIterable<PipelineInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PipelineImpl(inner1, this.manager()));
    }

    public Pipeline getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, pipelineName, Context.NONE).getValue();
    }

    public Response<Pipeline> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, pipelineName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, pipelineName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, pipelineName, context);
    }

    private PipelinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devops.DevopsManager manager() {
        return this.serviceManager;
    }

    public PipelineImpl define(String name) {
        return new PipelineImpl(name, this.manager());
    }
}

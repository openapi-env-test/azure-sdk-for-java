// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestackhci.AzureStackHciManager;
import com.azure.resourcemanager.azurestackhci.fluent.ClustersClient;
import com.azure.resourcemanager.azurestackhci.fluent.models.ClusterInner;
import com.azure.resourcemanager.azurestackhci.models.Cluster;
import com.azure.resourcemanager.azurestackhci.models.Clusters;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ClustersImpl implements Clusters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final AzureStackHciManager serviceManager;

    public ClustersImpl(ClustersClient innerClient, AzureStackHciManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Cluster> list() {
        PagedIterable<ClusterInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> list(Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public Cluster getByResourceGroup(String resourceGroupName, String clusterName) {
        ClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, clusterName);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Cluster> getByResourceGroupWithResponse(
        String resourceGroupName, String clusterName, Context context) {
        Response<ClusterInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String clusterName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, clusterName, context);
    }

    public Cluster getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    public Response<Cluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, clusterName, context);
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private AzureStackHciManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}

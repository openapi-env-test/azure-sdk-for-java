// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.VirtualHubsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner;
import com.azure.resourcemanager.network.generated.models.VirtualHub;
import com.azure.resourcemanager.network.generated.models.VirtualHubs;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualHubsImpl implements VirtualHubs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubsImpl.class);

    private final VirtualHubsClient innerClient;

    private final NetworkManager serviceManager;

    public VirtualHubsImpl(VirtualHubsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualHub getByResourceGroup(String resourceGroupName, String virtualHubName) {
        VirtualHubInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, virtualHubName);
        if (inner != null) {
            return new VirtualHubImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualHub> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualHubName, Context context) {
        Response<VirtualHubInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualHubName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualHubImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String virtualHubName) {
        this.serviceClient().delete(resourceGroupName, virtualHubName);
    }

    public void delete(String resourceGroupName, String virtualHubName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, context);
    }

    public PagedIterable<VirtualHub> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualHub> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualHub> list() {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualHub> list(Context context) {
        PagedIterable<VirtualHubInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new VirtualHubImpl(inner1, this.manager()));
    }

    public VirtualHub getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualHubName, Context.NONE).getValue();
    }

    public Response<VirtualHub> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualHubName, context);
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
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, context);
    }

    private VirtualHubsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public VirtualHubImpl define(String name) {
        return new VirtualHubImpl(name, this.manager());
    }
}

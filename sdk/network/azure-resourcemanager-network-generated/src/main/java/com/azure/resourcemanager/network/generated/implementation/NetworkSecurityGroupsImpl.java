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
import com.azure.resourcemanager.network.generated.fluent.NetworkSecurityGroupsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkSecurityGroupsImpl implements NetworkSecurityGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkSecurityGroupsImpl.class);

    private final NetworkSecurityGroupsClient innerClient;

    private final NetworkManager serviceManager;

    public NetworkSecurityGroupsImpl(NetworkSecurityGroupsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkSecurityGroupName) {
        this.serviceClient().delete(resourceGroupName, networkSecurityGroupName);
    }

    public void delete(String resourceGroupName, String networkSecurityGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkSecurityGroupName, context);
    }

    public NetworkSecurityGroup getByResourceGroup(String resourceGroupName, String networkSecurityGroupName) {
        NetworkSecurityGroupInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, networkSecurityGroupName);
        if (inner != null) {
            return new NetworkSecurityGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkSecurityGroup> getByResourceGroupWithResponse(
        String resourceGroupName, String networkSecurityGroupName, Context context) {
        Response<NetworkSecurityGroupInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, networkSecurityGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkSecurityGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkSecurityGroup> list() {
        PagedIterable<NetworkSecurityGroupInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new NetworkSecurityGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkSecurityGroup> list(Context context) {
        PagedIterable<NetworkSecurityGroupInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new NetworkSecurityGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkSecurityGroup> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkSecurityGroupInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new NetworkSecurityGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkSecurityGroup> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkSecurityGroupInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new NetworkSecurityGroupImpl(inner1, this.manager()));
    }

    public NetworkSecurityGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkSecurityGroupName = Utils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, networkSecurityGroupName, Context.NONE)
            .getValue();
    }

    public Response<NetworkSecurityGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkSecurityGroupName = Utils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkSecurityGroupName, context);
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
        String networkSecurityGroupName = Utils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.",
                                id)));
        }
        this.delete(resourceGroupName, networkSecurityGroupName, Context.NONE);
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
        String networkSecurityGroupName = Utils.getValueFromIdByName(id, "networkSecurityGroups");
        if (networkSecurityGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkSecurityGroups'.",
                                id)));
        }
        this.delete(resourceGroupName, networkSecurityGroupName, context);
    }

    private NetworkSecurityGroupsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkSecurityGroupImpl define(String name) {
        return new NetworkSecurityGroupImpl(name, this.manager());
    }
}

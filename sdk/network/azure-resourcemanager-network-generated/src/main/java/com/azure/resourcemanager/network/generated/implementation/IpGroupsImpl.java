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
import com.azure.resourcemanager.network.generated.fluent.IpGroupsClient;
import com.azure.resourcemanager.network.generated.fluent.models.IpGroupInner;
import com.azure.resourcemanager.network.generated.models.IpGroup;
import com.azure.resourcemanager.network.generated.models.IpGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IpGroupsImpl implements IpGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpGroupsImpl.class);

    private final IpGroupsClient innerClient;

    private final NetworkManager serviceManager;

    public IpGroupsImpl(IpGroupsClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IpGroup getByResourceGroup(String resourceGroupName, String ipGroupsName) {
        IpGroupInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, ipGroupsName);
        if (inner != null) {
            return new IpGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IpGroup> getByResourceGroupWithResponse(
        String resourceGroupName, String ipGroupsName, String expand, Context context) {
        Response<IpGroupInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, ipGroupsName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IpGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String ipGroupsName) {
        this.serviceClient().delete(resourceGroupName, ipGroupsName);
    }

    public void delete(String resourceGroupName, String ipGroupsName, Context context) {
        this.serviceClient().delete(resourceGroupName, ipGroupsName, context);
    }

    public PagedIterable<IpGroup> listByResourceGroup(String resourceGroupName) {
        PagedIterable<IpGroupInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new IpGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<IpGroup> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<IpGroupInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return inner.mapPage(inner1 -> new IpGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<IpGroup> list() {
        PagedIterable<IpGroupInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new IpGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<IpGroup> list(Context context) {
        PagedIterable<IpGroupInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new IpGroupImpl(inner1, this.manager()));
    }

    public IpGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ipGroupsName = Utils.getValueFromIdByName(id, "ipGroups");
        if (ipGroupsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ipGroups'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, ipGroupsName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<IpGroup> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String ipGroupsName = Utils.getValueFromIdByName(id, "ipGroups");
        if (ipGroupsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ipGroups'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, ipGroupsName, expand, context);
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
        String ipGroupsName = Utils.getValueFromIdByName(id, "ipGroups");
        if (ipGroupsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ipGroups'.", id)));
        }
        this.delete(resourceGroupName, ipGroupsName, Context.NONE);
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
        String ipGroupsName = Utils.getValueFromIdByName(id, "ipGroups");
        if (ipGroupsName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'ipGroups'.", id)));
        }
        this.delete(resourceGroupName, ipGroupsName, context);
    }

    private IpGroupsClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    public IpGroupImpl define(String name) {
        return new IpGroupImpl(name, this.manager());
    }
}

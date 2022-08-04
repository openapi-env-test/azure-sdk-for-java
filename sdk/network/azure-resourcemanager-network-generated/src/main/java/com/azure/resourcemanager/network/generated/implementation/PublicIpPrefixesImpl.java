// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.PublicIpPrefixesClient;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpPrefixInner;
import com.azure.resourcemanager.network.generated.models.PublicIpPrefix;
import com.azure.resourcemanager.network.generated.models.PublicIpPrefixes;

public final class PublicIpPrefixesImpl implements PublicIpPrefixes {
    private static final ClientLogger LOGGER = new ClientLogger(PublicIpPrefixesImpl.class);

    private final PublicIpPrefixesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public PublicIpPrefixesImpl(
        PublicIpPrefixesClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String publicIpPrefixName) {
        this.serviceClient().delete(resourceGroupName, publicIpPrefixName);
    }

    public void delete(String resourceGroupName, String publicIpPrefixName, Context context) {
        this.serviceClient().delete(resourceGroupName, publicIpPrefixName, context);
    }

    public PublicIpPrefix getByResourceGroup(String resourceGroupName, String publicIpPrefixName) {
        PublicIpPrefixInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, publicIpPrefixName);
        if (inner != null) {
            return new PublicIpPrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PublicIpPrefix> getByResourceGroupWithResponse(
        String resourceGroupName, String publicIpPrefixName, String expand, Context context) {
        Response<PublicIpPrefixInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, publicIpPrefixName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PublicIpPrefixImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<PublicIpPrefix> list() {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpPrefix> list(Context context) {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpPrefix> listByResourceGroup(String resourceGroupName) {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PagedIterable<PublicIpPrefix> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<PublicIpPrefixInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PublicIpPrefixImpl(inner1, this.manager()));
    }

    public PublicIpPrefix getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpPrefixName = Utils.getValueFromIdByName(id, "publicIPPrefixes");
        if (publicIpPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPPrefixes'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, publicIpPrefixName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<PublicIpPrefix> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpPrefixName = Utils.getValueFromIdByName(id, "publicIPPrefixes");
        if (publicIpPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPPrefixes'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, publicIpPrefixName, expand, context);
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
        String publicIpPrefixName = Utils.getValueFromIdByName(id, "publicIPPrefixes");
        if (publicIpPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPPrefixes'.", id)));
        }
        this.delete(resourceGroupName, publicIpPrefixName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publicIpPrefixName = Utils.getValueFromIdByName(id, "publicIPPrefixes");
        if (publicIpPrefixName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'publicIPPrefixes'.", id)));
        }
        this.delete(resourceGroupName, publicIpPrefixName, context);
    }

    private PublicIpPrefixesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public PublicIpPrefixImpl define(String name) {
        return new PublicIpPrefixImpl(name, this.manager());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.PrivateDnsZoneGroupsClient;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateDnsZoneGroupInner;
import com.azure.resourcemanager.network.generated.models.PrivateDnsZoneGroup;
import com.azure.resourcemanager.network.generated.models.PrivateDnsZoneGroups;

public final class PrivateDnsZoneGroupsImpl implements PrivateDnsZoneGroups {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateDnsZoneGroupsImpl.class);

    private final PrivateDnsZoneGroupsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public PrivateDnsZoneGroupsImpl(
        PrivateDnsZoneGroupsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName) {
        this.serviceClient().delete(resourceGroupName, privateEndpointName, privateDnsZoneGroupName);
    }

    public void delete(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context) {
        this.serviceClient().delete(resourceGroupName, privateEndpointName, privateDnsZoneGroupName, context);
    }

    public PrivateDnsZoneGroup get(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName) {
        PrivateDnsZoneGroupInner inner =
            this.serviceClient().get(resourceGroupName, privateEndpointName, privateDnsZoneGroupName);
        if (inner != null) {
            return new PrivateDnsZoneGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateDnsZoneGroup> getWithResponse(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context) {
        Response<PrivateDnsZoneGroupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, privateEndpointName, privateDnsZoneGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateDnsZoneGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateDnsZoneGroup createOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters) {
        PrivateDnsZoneGroupInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, privateEndpointName, privateDnsZoneGroupName, parameters);
        if (inner != null) {
            return new PrivateDnsZoneGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateDnsZoneGroup createOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters,
        Context context) {
        PrivateDnsZoneGroupInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, privateEndpointName, privateDnsZoneGroupName, parameters, context);
        if (inner != null) {
            return new PrivateDnsZoneGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PrivateDnsZoneGroup> list(String privateEndpointName, String resourceGroupName) {
        PagedIterable<PrivateDnsZoneGroupInner> inner =
            this.serviceClient().list(privateEndpointName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new PrivateDnsZoneGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateDnsZoneGroup> list(
        String privateEndpointName, String resourceGroupName, Context context) {
        PagedIterable<PrivateDnsZoneGroupInner> inner =
            this.serviceClient().list(privateEndpointName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateDnsZoneGroupImpl(inner1, this.manager()));
    }

    private PrivateDnsZoneGroupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}

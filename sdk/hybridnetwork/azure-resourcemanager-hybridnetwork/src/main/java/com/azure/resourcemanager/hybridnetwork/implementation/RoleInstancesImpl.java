// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.RoleInstancesClient;
import com.azure.resourcemanager.hybridnetwork.fluent.models.RoleInstanceInner;
import com.azure.resourcemanager.hybridnetwork.models.RoleInstance;
import com.azure.resourcemanager.hybridnetwork.models.RoleInstances;

public final class RoleInstancesImpl implements RoleInstances {
    private static final ClientLogger LOGGER = new ClientLogger(RoleInstancesImpl.class);

    private final RoleInstancesClient innerClient;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public RoleInstancesImpl(
        RoleInstancesClient innerClient, com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void start(String locationName, String vendorName, String serviceKey, String roleInstanceName) {
        this.serviceClient().start(locationName, vendorName, serviceKey, roleInstanceName);
    }

    public void start(
        String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context) {
        this.serviceClient().start(locationName, vendorName, serviceKey, roleInstanceName, context);
    }

    public void stop(String locationName, String vendorName, String serviceKey, String roleInstanceName) {
        this.serviceClient().stop(locationName, vendorName, serviceKey, roleInstanceName);
    }

    public void stop(
        String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context) {
        this.serviceClient().stop(locationName, vendorName, serviceKey, roleInstanceName, context);
    }

    public void restart(String locationName, String vendorName, String serviceKey, String roleInstanceName) {
        this.serviceClient().restart(locationName, vendorName, serviceKey, roleInstanceName);
    }

    public void restart(
        String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context) {
        this.serviceClient().restart(locationName, vendorName, serviceKey, roleInstanceName, context);
    }

    public RoleInstance get(String locationName, String vendorName, String serviceKey, String roleInstanceName) {
        RoleInstanceInner inner = this.serviceClient().get(locationName, vendorName, serviceKey, roleInstanceName);
        if (inner != null) {
            return new RoleInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RoleInstance> getWithResponse(
        String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context) {
        Response<RoleInstanceInner> inner =
            this.serviceClient().getWithResponse(locationName, vendorName, serviceKey, roleInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<RoleInstance> list(String locationName, String vendorName, String serviceKey) {
        PagedIterable<RoleInstanceInner> inner = this.serviceClient().list(locationName, vendorName, serviceKey);
        return Utils.mapPage(inner, inner1 -> new RoleInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<RoleInstance> list(
        String locationName, String vendorName, String serviceKey, Context context) {
        PagedIterable<RoleInstanceInner> inner =
            this.serviceClient().list(locationName, vendorName, serviceKey, context);
        return Utils.mapPage(inner, inner1 -> new RoleInstanceImpl(inner1, this.manager()));
    }

    private RoleInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }
}

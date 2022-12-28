// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deviceupdate.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.deviceupdate.fluent.models.GroupInformationInner;
import com.azure.resourcemanager.deviceupdate.models.GroupInformation;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkResources;

public final class PrivateLinkResourcesImpl implements PrivateLinkResources {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkResourcesImpl.class);

    private final PrivateLinkResourcesClient innerClient;

    private final com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager;

    public PrivateLinkResourcesImpl(
        PrivateLinkResourcesClient innerClient,
        com.azure.resourcemanager.deviceupdate.DeviceUpdateManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GroupInformation> listByAccount(String resourceGroupName, String accountName) {
        PagedIterable<GroupInformationInner> inner = this.serviceClient().listByAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new GroupInformationImpl(inner1, this.manager()));
    }

    public PagedIterable<GroupInformation> listByAccount(
        String resourceGroupName, String accountName, Context context) {
        PagedIterable<GroupInformationInner> inner =
            this.serviceClient().listByAccount(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new GroupInformationImpl(inner1, this.manager()));
    }

    public Response<GroupInformation> getWithResponse(
        String resourceGroupName, String accountName, String groupId, Context context) {
        Response<GroupInformationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, groupId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GroupInformationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupInformation get(String resourceGroupName, String accountName, String groupId) {
        GroupInformationInner inner = this.serviceClient().get(resourceGroupName, accountName, groupId);
        if (inner != null) {
            return new GroupInformationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager() {
        return this.serviceManager;
    }
}

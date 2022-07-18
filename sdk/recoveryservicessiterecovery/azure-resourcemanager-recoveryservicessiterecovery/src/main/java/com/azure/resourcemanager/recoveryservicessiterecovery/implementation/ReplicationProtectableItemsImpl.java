// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationProtectableItemsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectableItemInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectableItem;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectableItems;

public final class ReplicationProtectableItemsImpl implements ReplicationProtectableItems {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicationProtectableItemsImpl.class);

    private final ReplicationProtectableItemsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationProtectableItemsImpl(
        ReplicationProtectableItemsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectableItem> listByReplicationProtectionContainers(
        String resourceName, String resourceGroupName, String fabricName, String protectionContainerName) {
        PagedIterable<ProtectableItemInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectionContainers(
                    resourceName, resourceGroupName, fabricName, protectionContainerName);
        return Utils.mapPage(inner, inner1 -> new ProtectableItemImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectableItem> listByReplicationProtectionContainers(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String filter,
        String take,
        String skipToken,
        Context context) {
        PagedIterable<ProtectableItemInner> inner =
            this
                .serviceClient()
                .listByReplicationProtectionContainers(
                    resourceName,
                    resourceGroupName,
                    fabricName,
                    protectionContainerName,
                    filter,
                    take,
                    skipToken,
                    context);
        return Utils.mapPage(inner, inner1 -> new ProtectableItemImpl(inner1, this.manager()));
    }

    public ProtectableItem get(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName) {
        ProtectableItemInner inner =
            this
                .serviceClient()
                .get(resourceName, resourceGroupName, fabricName, protectionContainerName, protectableItemName);
        if (inner != null) {
            return new ProtectableItemImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProtectableItem> getWithResponse(
        String resourceName,
        String resourceGroupName,
        String fabricName,
        String protectionContainerName,
        String protectableItemName,
        Context context) {
        Response<ProtectableItemInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceName, resourceGroupName, fabricName, protectionContainerName, protectableItemName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProtectableItemImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ReplicationProtectableItemsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}

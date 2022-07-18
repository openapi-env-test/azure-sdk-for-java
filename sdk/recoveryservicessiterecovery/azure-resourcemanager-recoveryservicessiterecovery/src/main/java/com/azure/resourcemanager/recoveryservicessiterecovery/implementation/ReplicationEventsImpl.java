// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationEventsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.EventInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Event;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationEvents;

public final class ReplicationEventsImpl implements ReplicationEvents {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicationEventsImpl.class);

    private final ReplicationEventsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationEventsImpl(
        ReplicationEventsClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Event> list(String resourceName, String resourceGroupName) {
        PagedIterable<EventInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new EventImpl(inner1, this.manager()));
    }

    public PagedIterable<Event> list(String resourceName, String resourceGroupName, String filter, Context context) {
        PagedIterable<EventInner> inner = this.serviceClient().list(resourceName, resourceGroupName, filter, context);
        return Utils.mapPage(inner, inner1 -> new EventImpl(inner1, this.manager()));
    }

    public Event get(String resourceName, String resourceGroupName, String eventName) {
        EventInner inner = this.serviceClient().get(resourceName, resourceGroupName, eventName);
        if (inner != null) {
            return new EventImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Event> getWithResponse(
        String resourceName, String resourceGroupName, String eventName, Context context) {
        Response<EventInner> inner =
            this.serviceClient().getWithResponse(resourceName, resourceGroupName, eventName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ReplicationEventsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.MediaservicesManager;
import com.azure.resourcemanager.mediaservices.fluent.LiveEventsTestsClient;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventInner;
import com.azure.resourcemanager.mediaservices.models.LiveEvent;
import com.azure.resourcemanager.mediaservices.models.LiveEventsTests;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LiveEventsTestsImpl implements LiveEventsTests {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LiveEventsTestsImpl.class);

    private final LiveEventsTestsClient innerClient;

    private final MediaservicesManager serviceManager;

    public LiveEventsTestsImpl(LiveEventsTestsClient innerClient, MediaservicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<LiveEvent> list(String resourceGroupName, String accountName) {
        PagedIterable<LiveEventInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return inner.mapPage(inner1 -> new LiveEventImpl(inner1, this.manager()));
    }

    public PagedIterable<LiveEvent> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<LiveEventInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return inner.mapPage(inner1 -> new LiveEventImpl(inner1, this.manager()));
    }

    private LiveEventsTestsClient serviceClient() {
        return this.innerClient;
    }

    private MediaservicesManager manager() {
        return this.serviceManager;
    }
}

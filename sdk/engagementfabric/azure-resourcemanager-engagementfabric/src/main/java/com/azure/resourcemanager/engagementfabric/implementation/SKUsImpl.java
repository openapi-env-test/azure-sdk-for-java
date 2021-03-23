// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.engagementfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.engagementfabric.fluent.SKUsClient;
import com.azure.resourcemanager.engagementfabric.fluent.models.SkuDescriptionInner;
import com.azure.resourcemanager.engagementfabric.models.SKUs;
import com.azure.resourcemanager.engagementfabric.models.SkuDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SKUsImpl implements SKUs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SKUsImpl.class);

    private final SKUsClient innerClient;

    private final com.azure.resourcemanager.engagementfabric.EngagementFabricManager serviceManager;

    public SKUsImpl(
        SKUsClient innerClient, com.azure.resourcemanager.engagementfabric.EngagementFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SkuDescription> list() {
        PagedIterable<SkuDescriptionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SkuDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuDescription> list(Context context) {
        PagedIterable<SkuDescriptionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SkuDescriptionImpl(inner1, this.manager()));
    }

    private SKUsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.engagementfabric.EngagementFabricManager manager() {
        return this.serviceManager;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appplatform.generated.fluent.SkusClient;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.appplatform.generated.models.ResourceSku;
import com.azure.resourcemanager.appplatform.generated.models.Skus;

public final class SkusImpl implements Skus {
    private static final ClientLogger LOGGER = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    public SkusImpl(
        SkusClient innerClient, com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSku> list() {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSku> list(Context context) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }
}

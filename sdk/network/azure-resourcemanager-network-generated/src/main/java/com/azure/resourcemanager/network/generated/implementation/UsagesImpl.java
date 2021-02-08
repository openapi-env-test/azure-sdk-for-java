// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.UsagesClient;
import com.azure.resourcemanager.network.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.network.generated.models.Usage;
import com.azure.resourcemanager.network.generated.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final NetworkManager serviceManager;

    public UsagesImpl(UsagesClient innerClient, NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> list(String location) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(location);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> list(String location, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(location, context);
        return inner.mapPage(inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }
}

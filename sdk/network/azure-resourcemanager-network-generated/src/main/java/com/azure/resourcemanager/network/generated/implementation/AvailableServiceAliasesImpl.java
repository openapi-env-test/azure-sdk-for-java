// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.AvailableServiceAliasesClient;
import com.azure.resourcemanager.network.generated.fluent.models.AvailableServiceAliasInner;
import com.azure.resourcemanager.network.generated.models.AvailableServiceAlias;
import com.azure.resourcemanager.network.generated.models.AvailableServiceAliases;

public final class AvailableServiceAliasesImpl implements AvailableServiceAliases {
    private static final ClientLogger LOGGER = new ClientLogger(AvailableServiceAliasesImpl.class);

    private final AvailableServiceAliasesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public AvailableServiceAliasesImpl(
        AvailableServiceAliasesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailableServiceAlias> list(String location) {
        PagedIterable<AvailableServiceAliasInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new AvailableServiceAliasImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableServiceAlias> list(String location, Context context) {
        PagedIterable<AvailableServiceAliasInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new AvailableServiceAliasImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableServiceAlias> listByResourceGroup(String resourceGroupName, String location) {
        PagedIterable<AvailableServiceAliasInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, location);
        return Utils.mapPage(inner, inner1 -> new AvailableServiceAliasImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableServiceAlias> listByResourceGroup(
        String resourceGroupName, String location, Context context) {
        PagedIterable<AvailableServiceAliasInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, location, context);
        return Utils.mapPage(inner, inner1 -> new AvailableServiceAliasImpl(inner1, this.manager()));
    }

    private AvailableServiceAliasesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}

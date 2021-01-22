// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.blockchain.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.blockchain.BlockchainManager;
import com.azure.resourcemanager.blockchain.fluent.OperationsClient;
import com.azure.resourcemanager.blockchain.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.blockchain.models.Operations;
import com.azure.resourcemanager.blockchain.models.ResourceProviderOperation;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final BlockchainManager serviceManager;

    public OperationsImpl(OperationsClient innerClient, BlockchainManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceProviderOperation> list() {
        PagedIterable<ResourceProviderOperationInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new ResourceProviderOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceProviderOperation> list(Context context) {
        PagedIterable<ResourceProviderOperationInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new ResourceProviderOperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private BlockchainManager manager() {
        return this.serviceManager;
    }
}

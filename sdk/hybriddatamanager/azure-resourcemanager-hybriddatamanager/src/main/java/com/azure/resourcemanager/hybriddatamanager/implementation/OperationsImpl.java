// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybriddatamanager.fluent.OperationsClient;
import com.azure.resourcemanager.hybriddatamanager.fluent.models.AvailableProviderOperationInner;
import com.azure.resourcemanager.hybriddatamanager.models.AvailableProviderOperation;
import com.azure.resourcemanager.hybriddatamanager.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient, com.azure.resourcemanager.hybriddatamanager.HybridDataManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailableProviderOperation> list() {
        PagedIterable<AvailableProviderOperationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AvailableProviderOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableProviderOperation> list(Context context) {
        PagedIterable<AvailableProviderOperationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AvailableProviderOperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager() {
        return this.serviceManager;
    }
}

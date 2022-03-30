// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appplatform.generated.fluent.OperationsClient;
import com.azure.resourcemanager.appplatform.generated.fluent.models.OperationDetailInner;
import com.azure.resourcemanager.appplatform.generated.models.OperationDetail;
import com.azure.resourcemanager.appplatform.generated.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient,
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OperationDetail> list() {
        PagedIterable<OperationDetailInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new OperationDetailImpl(inner1, this.manager()));
    }

    public PagedIterable<OperationDetail> list(Context context) {
        PagedIterable<OperationDetailInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new OperationDetailImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager() {
        return this.serviceManager;
    }
}

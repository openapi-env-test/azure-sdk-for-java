// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.UsagesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.sql.generated.models.Usage;
import com.azure.resourcemanager.sql.generated.models.Usages;

public final class UsagesImpl implements Usages {
    private static final ClientLogger LOGGER = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public UsagesImpl(UsagesClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> listByInstancePool(String resourceGroupName, String instancePoolName) {
        PagedIterable<UsageInner> inner = this.serviceClient().listByInstancePool(resourceGroupName, instancePoolName);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listByInstancePool(
        String resourceGroupName, String instancePoolName, Boolean expandChildren, Context context) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listByInstancePool(resourceGroupName, instancePoolName, expandChildren, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

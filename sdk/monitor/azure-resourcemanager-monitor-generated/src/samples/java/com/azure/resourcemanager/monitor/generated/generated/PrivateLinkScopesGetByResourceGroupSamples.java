// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkScopes GetByResourceGroup. */
public final class PrivateLinkScopesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2019-10-17-preview/examples/PrivateLinkScopesGet.json
     */
    /**
     * Sample code: PrivateLinkScopeGet.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void privateLinkScopeGet(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .privateLinkScopes()
            .getByResourceGroupWithResponse("my-resource-group", "my-privatelinkscope", Context.NONE);
    }
}

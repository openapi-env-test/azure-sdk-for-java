// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListByPrivateLinkScope. */
public final class PrivateLinkResourcesListByPrivateLinkScopeSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2019-10-17-preview/examples/PrivateLinkScopePrivateLinkResourceListGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.privateLinkResources().listByPrivateLinkScope("MyResourceGroup", "MyPrivateLinkScope", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2021-07-01-preview/examples/PrivateLinkScopePrivateLinkResourceGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .privateLinkResources()
            .getWithResponse("MyResourceGroup", "MyPrivateLinkScope", "azuremonitor", Context.NONE);
    }
}

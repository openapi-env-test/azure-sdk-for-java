// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;

/** Samples for AfdEndpoints ListResourceUsage. */
public final class AfdEndpointsListResourceUsageSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/AFDEndpoints_ListResourceUsage.json
     */
    /**
     * Sample code: AFDEndpoints_ListResourceUsage.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void aFDEndpointsListResourceUsage(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.afdEndpoints().listResourceUsage("RG", "profile1", "endpoint1", Context.NONE);
    }
}

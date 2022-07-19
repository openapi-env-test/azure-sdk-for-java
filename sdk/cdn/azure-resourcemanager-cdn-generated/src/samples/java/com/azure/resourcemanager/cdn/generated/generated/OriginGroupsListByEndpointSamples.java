// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.generated;

import com.azure.core.util.Context;

/** Samples for OriginGroups ListByEndpoint. */
public final class OriginGroupsListByEndpointSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/OriginGroups_ListByEndpoint.json
     */
    /**
     * Sample code: OriginsGroups_ListByEndpoint.
     *
     * @param manager Entry point to CdnManager.
     */
    public static void originsGroupsListByEndpoint(com.azure.resourcemanager.cdn.generated.CdnManager manager) {
        manager.originGroups().listByEndpoint("RG", "profile1", "endpoint1", Context.NONE);
    }
}

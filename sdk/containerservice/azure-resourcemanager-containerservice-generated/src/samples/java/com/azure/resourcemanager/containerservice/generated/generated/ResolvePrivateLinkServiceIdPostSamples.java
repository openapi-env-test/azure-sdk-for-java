// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.fluent.models.PrivateLinkResourceInner;

/** Samples for ResolvePrivateLinkServiceId Post. */
public final class ResolvePrivateLinkServiceIdPostSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-05-02-preview/examples/ResolvePrivateLinkServiceId.json
     */
    /**
     * Sample code: Resolve the Private Link Service ID for Managed Cluster.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void resolveThePrivateLinkServiceIDForManagedCluster(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager
            .resolvePrivateLinkServiceIds()
            .postWithResponse(
                "rg1", "clustername1", new PrivateLinkResourceInner().withName("management"), Context.NONE);
    }
}

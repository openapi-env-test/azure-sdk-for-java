// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for Fleets List. */
public final class FleetsListSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/preview/2022-07-02-preview/examples/Fleets_ListBySub.json
     */
    /**
     * Sample code: List fleet resources in a given subscription.
     *
     * @param manager Entry point to ContainerServiceManager.
     */
    public static void listFleetResourcesInAGivenSubscription(
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager) {
        manager.fleets().list(Context.NONE);
    }
}

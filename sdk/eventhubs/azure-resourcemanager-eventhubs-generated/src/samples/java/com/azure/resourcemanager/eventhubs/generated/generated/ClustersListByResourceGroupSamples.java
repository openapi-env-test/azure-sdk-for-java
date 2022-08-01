// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.core.util.Context;

/** Samples for Clusters ListByResourceGroup. */
public final class ClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2022-01-01-preview/examples/Clusters/ClustersListByResourceGroup.json
     */
    /**
     * Sample code: ClustersListByResourceGroup.
     *
     * @param manager Entry point to EventHubsManager.
     */
    public static void clustersListByResourceGroup(
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.clusters().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.generated;

import com.azure.core.util.Context;

/** Samples for AzureTrafficCollectors GetByResourceGroup. */
public final class AzureTrafficCollectorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkfunction/resource-manager/Microsoft.NetworkFunction/stable/2022-08-01/examples/AzureTrafficCollectorGet.json
     */
    /**
     * Sample code: Get Traffic Collector.
     *
     * @param manager Entry point to AzureTrafficCollectorManager.
     */
    public static void getTrafficCollector(
        com.azure.resourcemanager.networkfunction.AzureTrafficCollectorManager manager) {
        manager.azureTrafficCollectors().getByResourceGroupWithResponse("rg1", "atc", Context.NONE);
    }
}

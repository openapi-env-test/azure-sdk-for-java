// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for RestorePointCollections List. */
public final class RestorePointCollectionsListSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/restorePointExamples/RestorePointCollection_ListBySubscription.json
     */
    /**
     * Sample code: Gets the list of restore point collections in a subscription.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getsTheListOfRestorePointCollectionsInASubscription(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.restorePointCollections().list(Context.NONE);
    }
}

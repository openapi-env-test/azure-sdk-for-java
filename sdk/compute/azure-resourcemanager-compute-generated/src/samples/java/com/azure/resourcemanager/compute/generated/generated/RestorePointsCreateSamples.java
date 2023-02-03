// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.resourcemanager.compute.generated.models.ApiEntityReference;
import java.util.Arrays;

/** Samples for RestorePoints Create. */
public final class RestorePointsCreateSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/restorePointExamples/RestorePoint_Copy_BetweenRegions.json
     */
    /**
     * Sample code: Copy a restore point to a different region.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void copyARestorePointToADifferentRegion(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .restorePoints()
            .define("rpName")
            .withExistingRestorePointCollection("myResourceGroup", "rpcName")
            .withSourceRestorePoint(
                new ApiEntityReference()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/restorePointCollections/sourceRpcName/restorePoints/sourceRpName"))
            .create();
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2022-11-01/examples/restorePointExamples/RestorePoint_Create.json
     */
    /**
     * Sample code: Create a restore point.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void createARestorePoint(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .restorePoints()
            .define("rpName")
            .withExistingRestorePointCollection("myResourceGroup", "rpcName")
            .withExcludeDisks(
                Arrays
                    .asList(
                        new ApiEntityReference()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/disk123")))
            .create();
    }
}

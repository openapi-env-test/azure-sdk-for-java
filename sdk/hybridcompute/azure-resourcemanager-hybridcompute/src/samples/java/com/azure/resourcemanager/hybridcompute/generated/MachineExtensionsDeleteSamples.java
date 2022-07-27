// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.Context;

/** Samples for MachineExtensions Delete. */
public final class MachineExtensionsDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2022-05-10-preview/examples/DELETEExtension.json
     */
    /**
     * Sample code: Delete a Machine Extension.
     *
     * @param manager Entry point to HybridComputeManager.
     */
    public static void deleteAMachineExtension(com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.machineExtensions().delete("myResourceGroup", "myMachine", "MMA", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DedicatedHosts Get. */
public final class DedicatedHostsGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/dedicatedHostExamples/DedicatedHost_Get.json
     */
    /**
     * Sample code: Get a dedicated host.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getADedicatedHost(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .dedicatedHosts()
            .getWithResponse("myResourceGroup", "myDedicatedHostGroup", "myHost", null, Context.NONE);
    }
}

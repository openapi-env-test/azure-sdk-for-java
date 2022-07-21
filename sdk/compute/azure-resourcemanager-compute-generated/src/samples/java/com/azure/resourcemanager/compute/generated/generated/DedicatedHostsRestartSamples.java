// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;

/** Samples for DedicatedHosts Restart. */
public final class DedicatedHostsRestartSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-03-01/ComputeRP/examples/dedicatedHostExamples/DedicatedHost_Restart.json
     */
    /**
     * Sample code: Restart Dedicated Host.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void restartDedicatedHost(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager.dedicatedHosts().restart("myResourceGroup", "myDedicatedHostGroup", "myHost", Context.NONE);
    }
}

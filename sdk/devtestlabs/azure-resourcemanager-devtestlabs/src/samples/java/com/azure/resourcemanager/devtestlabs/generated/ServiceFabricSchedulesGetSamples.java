// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for ServiceFabricSchedules Get. */
public final class ServiceFabricSchedulesGetSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/ServiceFabricSchedules_Get.json
     */
    /**
     * Sample code: ServiceFabricSchedules_Get.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void serviceFabricSchedulesGet(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .serviceFabricSchedules()
            .getWithResponse(
                "resourceGroupName", "{labName}", "@me", "{serviceFrabicName}", "{scheduleName}", null, Context.NONE);
    }
}

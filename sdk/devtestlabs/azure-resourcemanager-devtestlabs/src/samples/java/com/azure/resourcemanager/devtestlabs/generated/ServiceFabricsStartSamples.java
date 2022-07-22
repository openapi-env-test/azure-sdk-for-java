// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for ServiceFabrics Start. */
public final class ServiceFabricsStartSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/ServiceFabrics_Start.json
     */
    /**
     * Sample code: ServiceFabrics_Start.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void serviceFabricsStart(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager
            .serviceFabrics()
            .start("resourceGroupName", "{labName}", "{userName}", "{serviceFabricName}", Context.NONE);
    }
}

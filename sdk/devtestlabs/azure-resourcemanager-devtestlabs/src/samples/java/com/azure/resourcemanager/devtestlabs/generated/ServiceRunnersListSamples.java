// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for ServiceRunners List. */
public final class ServiceRunnersListSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/ServiceRunners_List.json
     */
    /**
     * Sample code: ServiceRunners_List.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void serviceRunnersList(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.serviceRunners().list("resourceGroupName", "{devtestlabName}", null, null, null, Context.NONE);
    }
}

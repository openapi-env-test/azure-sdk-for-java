// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.QueryTroubleshootingParameters;

/** Samples for NetworkWatchers GetTroubleshootingResult. */
public final class NetworkWatchersGetTroubleshootingResultSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkWatcherTroubleshootResultQuery.json
     */
    /**
     * Sample code: Get troubleshoot result.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getTroubleshootResult(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkWatchers()
            .getTroubleshootingResult(
                "rg1",
                "nw1",
                new QueryTroubleshootingParameters()
                    .withTargetResourceId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1"),
                Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.FlowLogStatusParameters;

/** Samples for NetworkWatchers GetFlowLogStatus. */
public final class NetworkWatchersGetFlowLogStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkWatcherFlowLogStatusQuery.json
     */
    /**
     * Sample code: Get flow log status.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getFlowLogStatus(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkWatchers()
            .getFlowLogStatus(
                "rg1",
                "nw1",
                new FlowLogStatusParameters()
                    .withTargetResourceId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/nsg1"),
                Context.NONE);
    }
}

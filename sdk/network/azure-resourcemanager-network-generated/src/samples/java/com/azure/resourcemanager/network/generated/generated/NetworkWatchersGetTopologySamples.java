// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.TopologyParameters;

/** Samples for NetworkWatchers GetTopology. */
public final class NetworkWatchersGetTopologySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkWatcherTopologyGet.json
     */
    /**
     * Sample code: Get Topology.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getTopology(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkWatchers()
            .getTopologyWithResponse(
                "rg1", "nw1", new TopologyParameters().withTargetResourceGroupName("rg2"), Context.NONE);
    }
}

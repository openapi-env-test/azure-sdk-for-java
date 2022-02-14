// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnectionPeerings List. */
public final class ExpressRouteCrossConnectionPeeringsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/ExpressRouteCrossConnectionBgpPeeringList.json
     */
    /**
     * Sample code: ExpressRouteCrossConnectionBgpPeeringList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteCrossConnectionBgpPeeringList(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCrossConnectionPeerings()
            .list("CrossConnection-SiliconValley", "<circuitServiceKey>", Context.NONE);
    }
}

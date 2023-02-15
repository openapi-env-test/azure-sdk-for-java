// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ExpressRouteCrossConnectionPeerings Get. */
public final class ExpressRouteCrossConnectionPeeringsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRouteCrossConnectionBgpPeeringGet.json
     */
    /**
     * Sample code: GetExpressRouteCrossConnectionBgpPeering.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getExpressRouteCrossConnectionBgpPeering(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCrossConnectionPeerings()
            .getWithResponse(
                "CrossConnection-SiliconValley",
                "<circuitServiceKey>",
                "AzurePrivatePeering",
                com.azure.core.util.Context.NONE);
    }
}

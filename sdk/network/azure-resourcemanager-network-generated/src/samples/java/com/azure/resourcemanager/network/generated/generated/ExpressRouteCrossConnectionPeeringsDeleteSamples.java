// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ExpressRouteCrossConnectionPeerings Delete. */
public final class ExpressRouteCrossConnectionPeeringsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRouteCrossConnectionBgpPeeringDelete.json
     */
    /**
     * Sample code: DeleteExpressRouteCrossConnectionBgpPeering.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteExpressRouteCrossConnectionBgpPeering(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCrossConnectionPeerings()
            .delete(
                "CrossConnection-SiliconValley",
                "<circuitServiceKey>",
                "AzurePrivatePeering",
                com.azure.core.util.Context.NONE);
    }
}

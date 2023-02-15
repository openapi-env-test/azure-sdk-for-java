// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.TroubleshootingParameters;

/** Samples for NetworkWatchers GetTroubleshooting. */
public final class NetworkWatchersGetTroubleshootingSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkWatcherTroubleshootGet.json
     */
    /**
     * Sample code: Get troubleshooting.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getTroubleshooting(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkWatchers()
            .getTroubleshooting(
                "rg1",
                "nw1",
                new TroubleshootingParameters()
                    .withTargetResourceId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1")
                    .withStorageId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/st1")
                    .withStoragePath("https://st1.blob.core.windows.net/cn1"),
                com.azure.core.util.Context.NONE);
    }
}

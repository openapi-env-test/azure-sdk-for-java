// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for NetworkGroups Delete. */
public final class NetworkGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkManagerGroupDelete.json
     */
    /**
     * Sample code: NetworkGroupsDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void networkGroupsDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkGroups()
            .delete("rg1", "testNetworkManager", "testNetworkGroup", false, com.azure.core.util.Context.NONE);
    }
}

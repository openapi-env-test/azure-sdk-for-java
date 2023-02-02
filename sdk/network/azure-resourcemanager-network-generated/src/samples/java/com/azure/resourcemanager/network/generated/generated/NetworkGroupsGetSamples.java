// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkGroups Get. */
public final class NetworkGroupsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkManagerGroupGet.json
     */
    /**
     * Sample code: NetworkGroupsGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void networkGroupsGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkGroups().getWithResponse("rg1", "testNetworkManager", "testNetworkGroup", Context.NONE);
    }
}

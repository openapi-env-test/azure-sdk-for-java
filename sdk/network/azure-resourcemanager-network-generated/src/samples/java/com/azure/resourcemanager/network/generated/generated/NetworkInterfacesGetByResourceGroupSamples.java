// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces GetByResourceGroup. */
public final class NetworkInterfacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkInterfaceGet.json
     */
    /**
     * Sample code: Get network interface.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getNetworkInterface(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkInterfaces().getByResourceGroupWithResponse("rg1", "test-nic", null, Context.NONE);
    }
}

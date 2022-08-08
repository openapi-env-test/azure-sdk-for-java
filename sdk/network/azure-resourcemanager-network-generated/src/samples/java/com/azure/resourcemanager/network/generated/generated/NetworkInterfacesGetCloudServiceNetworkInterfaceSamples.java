// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces GetCloudServiceNetworkInterface. */
public final class NetworkInterfacesGetCloudServiceNetworkInterfaceSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/CloudServiceNetworkInterfaceGet.json
     */
    /**
     * Sample code: Get cloud service network interface.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getCloudServiceNetworkInterface(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkInterfaces()
            .getCloudServiceNetworkInterfaceWithResponse("rg1", "cs1", "TestVMRole_IN_0", "nic1", null, Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceLoadBalancers List. */
public final class NetworkInterfaceLoadBalancersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkInterfaceLoadBalancerList.json
     */
    /**
     * Sample code: NetworkInterfaceLoadBalancerList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void networkInterfaceLoadBalancerList(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkInterfaceLoadBalancers().list("testrg", "nic1", Context.NONE);
    }
}

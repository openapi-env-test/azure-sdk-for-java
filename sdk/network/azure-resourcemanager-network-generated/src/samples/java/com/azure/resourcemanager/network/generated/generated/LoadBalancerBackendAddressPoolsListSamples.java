// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for LoadBalancerBackendAddressPools List. */
public final class LoadBalancerBackendAddressPoolsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/LBBackendAddressPoolListWithBackendAddressesPoolType.json
     */
    /**
     * Sample code: Load balancer with BackendAddressPool containing BackendAddresses.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void loadBalancerWithBackendAddressPoolContainingBackendAddresses(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.loadBalancerBackendAddressPools().list("testrg", "lb", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/LoadBalancerBackendAddressPoolList.json
     */
    /**
     * Sample code: LoadBalancerBackendAddressPoolList.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void loadBalancerBackendAddressPoolList(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.loadBalancerBackendAddressPools().list("testrg", "lb", Context.NONE);
    }
}

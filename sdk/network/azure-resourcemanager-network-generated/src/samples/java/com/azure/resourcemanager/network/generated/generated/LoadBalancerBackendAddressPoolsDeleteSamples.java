// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for LoadBalancerBackendAddressPools Delete. */
public final class LoadBalancerBackendAddressPoolsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/LoadBalancerBackendAddressPoolDelete.json
     */
    /**
     * Sample code: BackendAddressPoolDelete.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void backendAddressPoolDelete(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.loadBalancerBackendAddressPools().delete("testrg", "lb", "backend", com.azure.core.util.Context.NONE);
    }
}

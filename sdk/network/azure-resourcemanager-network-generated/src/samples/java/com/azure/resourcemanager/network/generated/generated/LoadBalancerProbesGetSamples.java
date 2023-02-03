// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for LoadBalancerProbes Get. */
public final class LoadBalancerProbesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/LoadBalancerProbeGet.json
     */
    /**
     * Sample code: LoadBalancerProbeGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void loadBalancerProbeGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.loadBalancerProbes().getWithResponse("testrg", "lb", "probe1", Context.NONE);
    }
}

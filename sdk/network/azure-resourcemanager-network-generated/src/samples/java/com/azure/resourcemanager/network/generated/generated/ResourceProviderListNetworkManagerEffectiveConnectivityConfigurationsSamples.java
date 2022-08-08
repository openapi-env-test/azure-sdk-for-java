// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.QueryRequestOptions;

/** Samples for ResourceProvider ListNetworkManagerEffectiveConnectivityConfigurations. */
public final class ResourceProviderListNetworkManagerEffectiveConnectivityConfigurationsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkManagerEffectiveConnectivityConfigurationsList.json
     */
    /**
     * Sample code: List effective connectivity configuration.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listEffectiveConnectivityConfiguration(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .resourceProviders()
            .listNetworkManagerEffectiveConnectivityConfigurationsWithResponse(
                "myResourceGroup",
                "testVirtualNetwork",
                new QueryRequestOptions().withSkipToken("FakeSkipTokenCode"),
                Context.NONE);
    }
}

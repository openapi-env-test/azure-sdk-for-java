// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.ActiveConfigurationParameter;
import java.util.Arrays;

/** Samples for ResourceProvider ListActiveConnectivityConfigurations. */
public final class ResourceProviderListActiveConnectivityConfigurationsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkManagerActiveConnectivityConfigurationsList.json
     */
    /**
     * Sample code: List Active Connectivity Configurations.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listActiveConnectivityConfigurations(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .resourceProviders()
            .listActiveConnectivityConfigurationsWithResponse(
                "myResourceGroup",
                "testNetworkManager",
                new ActiveConfigurationParameter()
                    .withRegions(Arrays.asList("westus"))
                    .withSkipToken("fakeTokenPlaceholder"),
                null,
                Context.NONE);
    }
}

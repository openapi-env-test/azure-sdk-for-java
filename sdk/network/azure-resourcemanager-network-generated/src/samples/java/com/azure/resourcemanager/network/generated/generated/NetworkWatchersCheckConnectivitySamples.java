// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.ConnectivityDestination;
import com.azure.resourcemanager.network.generated.models.ConnectivityParameters;
import com.azure.resourcemanager.network.generated.models.ConnectivitySource;
import com.azure.resourcemanager.network.generated.models.IpVersion;

/** Samples for NetworkWatchers CheckConnectivity. */
public final class NetworkWatchersCheckConnectivitySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NetworkWatcherConnectivityCheck.json
     */
    /**
     * Sample code: Check connectivity.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void checkConnectivity(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkWatchers()
            .checkConnectivity(
                "rg1",
                "nw1",
                new ConnectivityParameters()
                    .withSource(
                        new ConnectivitySource()
                            .withResourceId(
                                "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1"))
                    .withDestination(new ConnectivityDestination().withAddress("192.168.100.4").withPort(3389))
                    .withPreferredIpVersion(IpVersion.IPV4),
                Context.NONE);
    }
}

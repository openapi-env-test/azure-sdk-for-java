// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ConnectionMonitors Query. */
public final class ConnectionMonitorsQuerySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkWatcherConnectionMonitorQuery.json
     */
    /**
     * Sample code: Query connection monitor.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void queryConnectionMonitor(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().query("rg1", "nw1", "cm1", Context.NONE);
    }
}

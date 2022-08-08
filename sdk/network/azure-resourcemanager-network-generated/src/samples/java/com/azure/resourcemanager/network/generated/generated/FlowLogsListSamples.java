// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FlowLogs List. */
public final class FlowLogsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkWatcherFlowLogList.json
     */
    /**
     * Sample code: List connection monitors.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listConnectionMonitors(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().list("rg1", "nw1", Context.NONE);
    }
}

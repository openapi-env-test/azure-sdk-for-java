// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for FlowLogs List. */
public final class FlowLogsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkWatcherFlowLogList.json
     */
    /**
     * Sample code: List connection monitors.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listConnectionMonitors(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().list("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}

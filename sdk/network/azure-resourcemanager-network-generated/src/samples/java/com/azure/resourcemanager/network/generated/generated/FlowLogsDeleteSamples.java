// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for FlowLogs Delete. */
public final class FlowLogsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkWatcherFlowLogDelete.json
     */
    /**
     * Sample code: Delete flow log.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteFlowLog(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().delete("rg1", "nw1", "fl", Context.NONE);
    }
}

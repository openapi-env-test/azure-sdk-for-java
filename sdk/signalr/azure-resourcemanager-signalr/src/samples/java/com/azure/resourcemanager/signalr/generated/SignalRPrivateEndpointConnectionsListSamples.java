// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalRPrivateEndpointConnections List. */
public final class SignalRPrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/stable/2023-02-01/examples/SignalRPrivateEndpointConnections_List.json
     */
    /**
     * Sample code: SignalRPrivateEndpointConnections_List.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRPrivateEndpointConnectionsList(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRPrivateEndpointConnections()
            .list("myResourceGroup", "mySignalRService", com.azure.core.util.Context.NONE);
    }
}

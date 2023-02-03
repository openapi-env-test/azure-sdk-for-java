// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/NameSpaces/PrivateEndPointConnectionGet.json
     */
    /**
     * Sample code: NameSpacePrivateEndPointConnectionGet.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void nameSpacePrivateEndPointConnectionGet(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse(
                "SDK-ServiceBus-4794", "sdk-Namespace-5828", "privateEndpointConnectionName", Context.NONE);
    }
}

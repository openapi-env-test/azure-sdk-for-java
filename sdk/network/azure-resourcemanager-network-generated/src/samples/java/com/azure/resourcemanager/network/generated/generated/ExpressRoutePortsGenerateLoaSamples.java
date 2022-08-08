// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.models.GenerateExpressRoutePortsLoaRequest;

/** Samples for ExpressRoutePorts GenerateLoa. */
public final class ExpressRoutePortsGenerateLoaSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/GenerateExpressRoutePortsLOA.json
     */
    /**
     * Sample code: GenerateExpressRoutePortLOA.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void generateExpressRoutePortLOA(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRoutePorts()
            .generateLoaWithResponse(
                "rg1",
                "portName",
                new GenerateExpressRoutePortsLoaRequest().withCustomerName("customerName"),
                Context.NONE);
    }
}

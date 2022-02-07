// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NatGateways Delete. */
public final class NatGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NatGatewayDelete.json
     */
    /**
     * Sample code: Delete nat gateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteNatGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.natGateways().delete("rg1", "test-natGateway", Context.NONE);
    }
}

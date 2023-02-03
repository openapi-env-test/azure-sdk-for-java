// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualNetworks CheckIpAddressAvailability. */
public final class VirtualNetworksCheckIpAddressAvailabilitySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualNetworkCheckIPAddressAvailability.json
     */
    /**
     * Sample code: Check IP address availability.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void checkIPAddressAvailability(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualNetworks().checkIpAddressAvailabilityWithResponse("rg1", "test-vnet", "10.0.1.4", Context.NONE);
    }
}

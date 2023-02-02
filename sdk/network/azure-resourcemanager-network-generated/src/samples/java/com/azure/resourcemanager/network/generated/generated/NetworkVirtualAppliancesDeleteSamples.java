// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkVirtualAppliances Delete. */
public final class NetworkVirtualAppliancesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkVirtualApplianceDelete.json
     */
    /**
     * Sample code: Delete NetworkVirtualAppliance.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteNetworkVirtualAppliance(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkVirtualAppliances().delete("rg1", "nva", Context.NONE);
    }
}

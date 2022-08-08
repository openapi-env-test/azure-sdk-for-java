// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VirtualApplianceSites List. */
public final class VirtualApplianceSitesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/NetworkVirtualApplianceSiteList.json
     */
    /**
     * Sample code: List all Network Virtual Appliance sites for a given Network Virtual Appliance.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllNetworkVirtualApplianceSitesForAGivenNetworkVirtualAppliance(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualApplianceSites().list("rg1", "nva", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VirtualApplianceSites Delete. */
public final class VirtualApplianceSitesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkVirtualApplianceSiteDelete.json
     */
    /**
     * Sample code: Delete Network Virtual Appliance Site.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteNetworkVirtualApplianceSite(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualApplianceSites().delete("rg1", "nva", "site1", com.azure.core.util.Context.NONE);
    }
}

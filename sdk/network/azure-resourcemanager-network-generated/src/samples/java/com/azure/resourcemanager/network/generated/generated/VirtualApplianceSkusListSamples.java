// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VirtualApplianceSkus List. */
public final class VirtualApplianceSkusListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkVirtualApplianceSkuList.json
     */
    /**
     * Sample code: NetworkVirtualApplianceSkuListResult.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void networkVirtualApplianceSkuListResult(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.virtualApplianceSkus().list(com.azure.core.util.Context.NONE);
    }
}

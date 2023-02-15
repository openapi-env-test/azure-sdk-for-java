// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for PublicIpAddresses DdosProtectionStatus. */
public final class PublicIpAddressesDdosProtectionStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PublicIpAddressGetDdosProtectionStatus.json
     */
    /**
     * Sample code: Get Ddos Protection Status of a Public IP Address.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getDdosProtectionStatusOfAPublicIPAddress(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.publicIpAddresses().ddosProtectionStatus("rg1", "test-pip", com.azure.core.util.Context.NONE);
    }
}

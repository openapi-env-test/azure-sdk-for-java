// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for CustomIpPrefixes List. */
public final class CustomIpPrefixesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/CustomIpPrefixListAll.json
     */
    /**
     * Sample code: List all custom IP prefixes.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllCustomIPPrefixes(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.customIpPrefixes().list(com.azure.core.util.Context.NONE);
    }
}

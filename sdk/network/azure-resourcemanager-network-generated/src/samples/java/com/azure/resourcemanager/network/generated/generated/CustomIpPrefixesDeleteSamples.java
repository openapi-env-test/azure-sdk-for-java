// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for CustomIpPrefixes Delete. */
public final class CustomIpPrefixesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/CustomIpPrefixDelete.json
     */
    /**
     * Sample code: Delete custom IP prefix.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteCustomIPPrefix(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.customIpPrefixes().delete("rg1", "test-customipprefix", com.azure.core.util.Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for CustomIpPrefixes CreateOrUpdate. */
public final class CustomIpPrefixesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/CustomIpPrefixCreateCustomizedValues.json
     */
    /**
     * Sample code: Create custom IP prefix allocation method.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createCustomIPPrefixAllocationMethod(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .customIpPrefixes()
            .define("test-customipprefix")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withCidr("0.0.0.0/24")
            .create();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses Delete. */
public final class PublicIpAddressesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/PublicIpAddressDelete.json
     */
    /**
     * Sample code: Delete public IP address.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deletePublicIPAddress(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.publicIpAddresses().delete("rg1", "test-ip", Context.NONE);
    }
}

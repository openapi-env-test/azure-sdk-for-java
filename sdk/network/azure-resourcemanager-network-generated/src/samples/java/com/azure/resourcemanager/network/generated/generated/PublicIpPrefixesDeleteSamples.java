// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PublicIpPrefixes Delete. */
public final class PublicIpPrefixesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/PublicIpPrefixDelete.json
     */
    /**
     * Sample code: Delete public IP prefix.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void deletePublicIPPrefix(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.publicIpPrefixes().delete("rg1", "test-ipprefix", Context.NONE);
    }
}

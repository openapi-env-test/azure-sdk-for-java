// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for ResourceProvider SupportedSecurityProviders. */
public final class ResourceProviderSupportedSecurityProvidersSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/VirtualWanSupportedSecurityProviders.json
     */
    /**
     * Sample code: supportedSecurityProviders.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void supportedSecurityProviders(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.resourceProviders().supportedSecurityProvidersWithResponse("rg1", "wan1", Context.NONE);
    }
}

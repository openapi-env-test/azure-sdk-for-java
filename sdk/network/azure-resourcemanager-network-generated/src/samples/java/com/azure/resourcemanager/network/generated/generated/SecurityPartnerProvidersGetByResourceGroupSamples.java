// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for SecurityPartnerProviders GetByResourceGroup. */
public final class SecurityPartnerProvidersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/SecurityPartnerProviderGet.json
     */
    /**
     * Sample code: Get Security Partner Provider.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getSecurityPartnerProvider(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .securityPartnerProviders()
            .getByResourceGroupWithResponse("rg1", "securityPartnerProvider", Context.NONE);
    }
}

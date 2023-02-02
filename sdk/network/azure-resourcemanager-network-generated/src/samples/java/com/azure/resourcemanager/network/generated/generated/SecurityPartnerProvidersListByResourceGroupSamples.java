// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for SecurityPartnerProviders ListByResourceGroup. */
public final class SecurityPartnerProvidersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/SecurityPartnerProviderListByResourceGroup.json
     */
    /**
     * Sample code: List all Security Partner Providers for a given resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllSecurityPartnerProvidersForAGivenResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.securityPartnerProviders().listByResourceGroup("rg1", Context.NONE);
    }
}

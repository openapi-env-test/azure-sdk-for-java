// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for MhsmPrivateEndpointConnections ListByResource. */
public final class MhsmPrivateEndpointConnectionsListByResourceSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-11-01/examples/ManagedHsm_ListPrivateEndpointConnectionsByResource.json
     */
    /**
     * Sample code: List managed HSM Pools in a subscription.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void listManagedHSMPoolsInASubscription(
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager.mhsmPrivateEndpointConnections().listByResource("sample-group", "sample-mhsm", Context.NONE);
    }
}

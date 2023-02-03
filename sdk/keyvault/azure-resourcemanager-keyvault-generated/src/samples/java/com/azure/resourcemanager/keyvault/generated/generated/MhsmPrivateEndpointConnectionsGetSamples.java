// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for MhsmPrivateEndpointConnections Get. */
public final class MhsmPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-11-01/examples/ManagedHsm_getPrivateEndpointConnection.json
     */
    /**
     * Sample code: ManagedHsmGetPrivateEndpointConnection.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void managedHsmGetPrivateEndpointConnection(
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager
            .mhsmPrivateEndpointConnections()
            .getWithResponse("sample-group", "sample-mhsm", "sample-pec", Context.NONE);
    }
}

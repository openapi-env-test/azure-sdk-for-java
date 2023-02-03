// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedHsmKeys ListVersions. */
public final class ManagedHsmKeysListVersionsSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-11-01/examples/managedHsmListKeyVersions.json
     */
    /**
     * Sample code: List key versions in the managed HSM.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void listKeyVersionsInTheManagedHSM(
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager
            .managedHsmKeys()
            .listVersions("sample-group", "sample-managedhsm-name", "sample-key-name", Context.NONE);
    }
}

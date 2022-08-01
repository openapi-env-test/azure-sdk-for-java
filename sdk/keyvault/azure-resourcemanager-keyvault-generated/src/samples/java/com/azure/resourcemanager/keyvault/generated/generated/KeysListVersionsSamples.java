// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for Keys ListVersions. */
public final class KeysListVersionsSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-07-01/examples/listKeyVersions.json
     */
    /**
     * Sample code: List key versions in the vault.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void listKeyVersionsInTheVault(com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager.keys().listVersions("sample-group", "sample-vault-name", "sample-key-name", Context.NONE);
    }
}

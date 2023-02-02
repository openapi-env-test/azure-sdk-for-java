// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for Keys Get. */
public final class KeysGetSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-07-01/examples/getKey.json
     */
    /**
     * Sample code: Get a key.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void getAKey(com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager.keys().getWithResponse("sample-group", "sample-vault-name", "sample-key-name", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for Secrets Get. */
public final class SecretsGetSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-11-01/examples/getSecret.json
     */
    /**
     * Sample code: Get a secret.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void getASecret(com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager.secrets().getWithResponse("sample-group", "sample-vault", "secret-name", Context.NONE);
    }
}

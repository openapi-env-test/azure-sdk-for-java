// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for Keys GetVersion. */
public final class KeysGetVersionSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-11-01/examples/getKeyVersion.json
     */
    /**
     * Sample code: Get a key version.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void getAKeyVersion(com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager
            .keys()
            .getVersionWithResponse(
                "sample-group",
                "sample-vault-name",
                "sample-key-name",
                "fd618d9519b74f9aae94ade66b876acc",
                Context.NONE);
    }
}

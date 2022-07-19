// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.generated;

import com.azure.core.util.Context;

/** Samples for Vaults ListBySubscription. */
public final class VaultsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2022-07-01/examples/listVaultBySubscription.json
     */
    /**
     * Sample code: List vaults in the specified subscription.
     *
     * @param manager Entry point to KeyVaultManager.
     */
    public static void listVaultsInTheSpecifiedSubscription(
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager) {
        manager.vaults().listBySubscription(1, Context.NONE);
    }
}

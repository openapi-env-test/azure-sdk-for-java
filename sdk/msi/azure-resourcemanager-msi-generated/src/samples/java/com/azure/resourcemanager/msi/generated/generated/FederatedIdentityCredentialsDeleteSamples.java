// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.generated;

import com.azure.core.util.Context;

/** Samples for FederatedIdentityCredentials Delete. */
public final class FederatedIdentityCredentialsDeleteSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/FederatedIdentityCredentialDelete.json
     */
    /**
     * Sample code: FederatedIdentityCredentialDelete.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void federatedIdentityCredentialDelete(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .federatedIdentityCredentials()
            .deleteWithResponse("rgName", "resourceName", "ficResourceName", Context.NONE);
    }
}

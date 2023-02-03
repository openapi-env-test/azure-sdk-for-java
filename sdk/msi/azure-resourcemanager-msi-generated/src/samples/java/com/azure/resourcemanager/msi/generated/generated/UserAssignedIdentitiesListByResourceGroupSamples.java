// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated.generated;

import com.azure.core.util.Context;

/** Samples for UserAssignedIdentities ListByResourceGroup. */
public final class UserAssignedIdentitiesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityListByResourceGroup.json
     */
    /**
     * Sample code: IdentityListByResourceGroup.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityListByResourceGroup(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager.userAssignedIdentities().listByResourceGroup("rgName", Context.NONE);
    }
}

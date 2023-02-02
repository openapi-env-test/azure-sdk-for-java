// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResourcesOperation List. */
public final class PrivateLinkResourcesOperationListSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-01-01/examples/ListPrivateLinkResources.json
     */
    /**
     * Sample code: List PrivateLinkResources.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void listPrivateLinkResources(
        com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.privateLinkResourcesOperations().list("petesting", "pemsi-ecy-rsv2", Context.NONE);
    }
}

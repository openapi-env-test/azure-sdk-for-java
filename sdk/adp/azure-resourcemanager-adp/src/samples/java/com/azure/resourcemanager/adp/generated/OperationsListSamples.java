// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/adp/resource-manager/Microsoft.AutonomousDevelopmentPlatform/preview/2021-11-01-preview/examples/AdpOperationsList.json
     */
    /**
     * Sample code: List operations.
     *
     * @param manager Entry point to AdpManager.
     */
    public static void listOperations(com.azure.resourcemanager.adp.AdpManager manager) {
        manager.operations().list(Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scan.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/scan/resource-manager/Microsoft.AzureScan/preview/2022-05-17-preview/examples/listScanningAccountOperations.json
     */
    /**
     * Sample code: List Scanning Account operations.
     *
     * @param manager Entry point to AzureScanningManager.
     */
    public static void listScanningAccountOperations(com.azure.resourcemanager.scan.AzureScanningManager manager) {
        manager.operations().list(Context.NONE);
    }
}

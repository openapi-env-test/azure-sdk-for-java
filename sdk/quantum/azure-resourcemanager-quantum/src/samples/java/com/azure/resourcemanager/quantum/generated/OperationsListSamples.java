// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/quantum/resource-manager/Microsoft.Quantum/preview/2022-01-10-preview/examples/operations.json
     */
    /**
     * Sample code: Operations.
     *
     * @param manager Entry point to AzureQuantumManager.
     */
    public static void operations(com.azure.resourcemanager.quantum.AzureQuantumManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}

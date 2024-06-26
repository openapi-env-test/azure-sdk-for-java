// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

/** Samples for Workspaces Delete. */
public final class WorkspacesDeleteSamples {
    /*
     * x-ms-original-file: specification/quantum/resource-manager/Microsoft.Quantum/preview/2022-01-10-preview/examples/quantumWorkspacesDelete.json
     */
    /**
     * Sample code: QuantumWorkspacesDelete.
     *
     * @param manager Entry point to AzureQuantumManager.
     */
    public static void quantumWorkspacesDelete(com.azure.resourcemanager.quantum.AzureQuantumManager manager) {
        manager.workspaces().delete("quantumResourcegroup", "quantumworkspace1", com.azure.core.util.Context.NONE);
    }
}

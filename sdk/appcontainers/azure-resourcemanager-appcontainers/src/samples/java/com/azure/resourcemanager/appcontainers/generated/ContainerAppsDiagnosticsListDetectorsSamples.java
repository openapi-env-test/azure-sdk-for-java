// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ContainerAppsDiagnostics ListDetectors. */
public final class ContainerAppsDiagnosticsListDetectorsSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/stable/2022-10-01/examples/ContainerAppsDiagnostics_List.json
     */
    /**
     * Sample code: Get the list of available diagnostics for a given Container App.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getTheListOfAvailableDiagnosticsForAGivenContainerApp(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsDiagnostics()
            .listDetectors("mikono-workerapp-test-rg", "mikono-capp-stage1", Context.NONE);
    }
}

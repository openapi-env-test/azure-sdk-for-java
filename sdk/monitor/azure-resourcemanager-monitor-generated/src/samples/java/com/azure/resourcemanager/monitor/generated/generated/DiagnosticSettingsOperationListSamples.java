// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for DiagnosticSettingsOperation List. */
public final class DiagnosticSettingsOperationListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2017-05-01-preview/examples/listDiagnosticSettings.json
     */
    /**
     * Sample code: Gets the diagnostic setting.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void getsTheDiagnosticSetting(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .diagnosticSettingsOperations()
            .listWithResponse(
                "subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourcegroups/viruela1/providers/microsoft.logic/workflows/viruela6",
                Context.NONE);
    }
}

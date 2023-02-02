// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.generated;

import com.azure.core.util.Context;

/** Samples for AzureMonitorWorkspaces Delete. */
public final class AzureMonitorWorkspacesDeleteSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Monitor/preview/2021-06-03-preview/examples/MonitoringAccountsDelete.json
     */
    /**
     * Sample code: Delete workspace.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void deleteWorkspace(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .azureMonitorWorkspaces()
            .deleteByResourceGroupWithResponse("myResourceGroup", "myMonitoringAccount", Context.NONE);
    }
}

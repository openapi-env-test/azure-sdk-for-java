// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for AzureDevOpsConnector Delete. */
public final class AzureDevOpsConnectorDeleteSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/AzureDevOpsConnectorDelete.json
     */
    /**
     * Sample code: AzureDevOpsConnector_Delete.
     *
     * @param manager Entry point to SecurityDevOpsManager.
     */
    public static void azureDevOpsConnectorDelete(
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager) {
        manager.azureDevOpsConnectors().delete("westusrg", "testconnector", Context.NONE);
    }
}

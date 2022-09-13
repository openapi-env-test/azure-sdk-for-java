// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.generated;

import com.azure.core.util.Context;

/** Samples for ActiveDirectoryConnectors Delete. */
public final class ActiveDirectoryConnectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/azurearcdata/resource-manager/Microsoft.AzureArcData/preview/2022-03-01-preview/examples/DeleteActiveDirectoryConnector.json
     */
    /**
     * Sample code: Deletes an Active Directory connector instance.
     *
     * @param manager Entry point to AzureArcDataManager.
     */
    public static void deletesAnActiveDirectoryConnectorInstance(
        com.azure.resourcemanager.azurearcdata.AzureArcDataManager manager) {
        manager.activeDirectoryConnectors().delete("testrg", "testdataController", "testADConnector", Context.NONE);
    }
}

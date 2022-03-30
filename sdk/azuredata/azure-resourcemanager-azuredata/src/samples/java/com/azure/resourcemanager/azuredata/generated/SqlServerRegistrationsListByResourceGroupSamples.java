// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azuredata.generated;

import com.azure.core.util.Context;

/** Samples for SqlServerRegistrations ListByResourceGroup. */
public final class SqlServerRegistrationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azuredata/resource-manager/Microsoft.AzureData/preview/2019-07-24-preview/examples/ListByResourceGroupSqlServerRegistration.json
     */
    /**
     * Sample code: Gets all SQL Server registrations in a resource group.
     *
     * @param manager Entry point to AzureDataManager.
     */
    public static void getsAllSQLServerRegistrationsInAResourceGroup(
        com.azure.resourcemanager.azuredata.AzureDataManager manager) {
        manager.sqlServerRegistrations().listByResourceGroup("testrg", Context.NONE);
    }
}

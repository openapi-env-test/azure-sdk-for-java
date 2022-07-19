// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for ManagedInstances Delete. */
public final class ManagedInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2021-05-01-preview/examples/ManagedInstanceDelete.json
     */
    /**
     * Sample code: Delete managed instance.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void deleteManagedInstance(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager.managedInstances().delete("testrg", "testinstance", Context.NONE);
    }
}

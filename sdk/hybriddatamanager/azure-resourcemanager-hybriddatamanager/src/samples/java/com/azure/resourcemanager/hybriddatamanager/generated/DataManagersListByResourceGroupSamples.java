// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.generated;

import com.azure.core.util.Context;

/** Samples for DataManagers ListByResourceGroup. */
public final class DataManagersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2019-06-01/examples/DataManagers_ListByResourceGroup-GET-example-31.json
     */
    /**
     * Sample code: DataManagers_ListByResourceGroupGET31.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void dataManagersListByResourceGroupGET31(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager.dataManagers().listByResourceGroup("ResourceGroupForSDKTest", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.Context;

/** Samples for Advisors Get. */
public final class AdvisorsGetSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/stable/2018-06-01/examples/AdvisorsGet.json
     */
    /**
     * Sample code: AdvisorsGet.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void advisorsGet(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.advisors().getWithResponse("testResourceGroupName", "testServerName", "Index", Context.NONE);
    }
}

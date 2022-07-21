// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for DataMaskingRules ListByDatabase. */
public final class DataMaskingRulesListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DataMaskingRuleList.json
     */
    /**
     * Sample code: List data masking rules.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void listDataMaskingRules(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .dataMaskingRules()
            .listByDatabase("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-331", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for SensitivityLabels ListCurrentByDatabase. */
public final class SensitivityLabelsListCurrentByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/SensitivityLabelsListByDatabaseWithSourceCurrent.json
     */
    /**
     * Sample code: Gets the current sensitivity labels of a given database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void getsTheCurrentSensitivityLabelsOfAGivenDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .sensitivityLabels()
            .listCurrentByDatabase("myRG", "myServer", "myDatabase", null, null, null, Context.NONE);
    }
}

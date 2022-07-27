// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.core.util.Context;

/** Samples for SensitivityLabels EnableRecommendation. */
public final class SensitivityLabelsEnableRecommendationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2020-11-01-preview/examples/RecommendedColumnSensitivityLabelEnable.json
     */
    /**
     * Sample code: Enables sensitivity recommendations on a given column.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void enablesSensitivityRecommendationsOnAGivenColumn(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .sensitivityLabels()
            .enableRecommendationWithResponse(
                "myRG", "myServer", "myDatabase", "dbo", "myTable", "myColumn", Context.NONE);
    }
}

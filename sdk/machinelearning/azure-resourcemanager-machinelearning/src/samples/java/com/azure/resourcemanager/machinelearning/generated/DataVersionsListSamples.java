// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for DataVersions List. */
public final class DataVersionsListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/preview/2022-06-01-preview/examples/DataVersionBase/list.json
     */
    /**
     * Sample code: List Data Version Base.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listDataVersionBase(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .dataVersions()
            .list("test-rg", "my-aml-workspace", "string", "string", 1, null, "string", null, Context.NONE);
    }
}

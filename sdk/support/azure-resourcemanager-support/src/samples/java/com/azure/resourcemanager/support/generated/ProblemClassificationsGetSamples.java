// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.Context;

/** Samples for ProblemClassifications Get. */
public final class ProblemClassificationsGetSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/GetProblemClassification.json
     */
    /**
     * Sample code: Gets details of problemClassification for Azure service.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void getsDetailsOfProblemClassificationForAzureService(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.problemClassifications().getWithResponse("service_guid", "problemClassification_guid", Context.NONE);
    }
}

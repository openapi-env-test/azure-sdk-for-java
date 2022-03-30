// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.generated;

import com.azure.core.util.Context;

/** Samples for Suppressions Delete. */
public final class SuppressionsDeleteSamples {
    /*
     * x-ms-original-file: specification/advisor/resource-manager/Microsoft.Advisor/stable/2020-01-01/examples/DeleteSuppression.json
     */
    /**
     * Sample code: DeleteSuppression.
     *
     * @param manager Entry point to AdvisorManager.
     */
    public static void deleteSuppression(com.azure.resourcemanager.advisor.AdvisorManager manager) {
        manager.suppressions().deleteWithResponse("resourceUri", "recommendationId", "suppressionName1", Context.NONE);
    }
}

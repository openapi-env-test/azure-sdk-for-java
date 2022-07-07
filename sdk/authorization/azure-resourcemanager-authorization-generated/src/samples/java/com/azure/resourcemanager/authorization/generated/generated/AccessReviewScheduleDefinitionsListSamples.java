// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for AccessReviewScheduleDefinitions List. */
public final class AccessReviewScheduleDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewScheduleDefinitions.json
     */
    /**
     * Sample code: GetAccessReviewScheduleDefinitions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewScheduleDefinitions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.accessReviewScheduleDefinitions().list(null, Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for AccessReviewInstances List. */
public final class AccessReviewInstancesListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewInstances.json
     */
    /**
     * Sample code: GetAccessReviewInstances.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewInstances(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.accessReviewInstances().list("265785a7-a81f-4201-8a18-bb0db95982b7", null, Context.NONE);
    }
}

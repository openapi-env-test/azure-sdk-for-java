// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceMyDecisions List. */
public final class AccessReviewInstanceMyDecisionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewInstanceMyDecisions.json
     */
    /**
     * Sample code: GetAccessReviewMyInstanceDecisions.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewMyInstanceDecisions(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceMyDecisions()
            .list("488a6d0e-0a63-4946-86e3-1f5bbc934661", "4135f961-be78-4005-8101-c72a5af307a2", null, Context.NONE);
    }
}

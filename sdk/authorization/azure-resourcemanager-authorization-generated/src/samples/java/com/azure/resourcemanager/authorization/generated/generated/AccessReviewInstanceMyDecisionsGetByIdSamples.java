// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceMyDecisions GetById. */
public final class AccessReviewInstanceMyDecisionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/GetAccessReviewInstanceMyDecisionById.json
     */
    /**
     * Sample code: GetAccessReviewMyInstanceDecision.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewMyInstanceDecision(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceMyDecisions()
            .getByIdWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661",
                "4135f961-be78-4005-8101-c72a5af307a2",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for AccessReviewInstanceOperation AcceptRecommendations. */
public final class AccessReviewInstanceOperationAcceptRecommendationsSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceAcceptRecommendations.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewInstanceOperations()
            .acceptRecommendationsWithResponse(
                "488a6d0e-0a63-4946-86e3-1f5bbc934661", "d9b9e056-7004-470b-bf21-1635e98487da", Context.NONE);
    }
}

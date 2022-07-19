// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewInstanceOperation SendReminders. */
public final class ScopeAccessReviewInstanceOperationSendRemindersSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/AccessReviewInstanceSendReminders.json
     */
    /**
     * Sample code: GetAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReview(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewInstanceOperations()
            .sendRemindersWithResponse(
                "subscriptions/fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "fa73e90b-5bf1-45fd-a182-35ce5fc0674d",
                "d9b9e056-7004-470b-bf21-1635e98487da",
                Context.NONE);
    }
}

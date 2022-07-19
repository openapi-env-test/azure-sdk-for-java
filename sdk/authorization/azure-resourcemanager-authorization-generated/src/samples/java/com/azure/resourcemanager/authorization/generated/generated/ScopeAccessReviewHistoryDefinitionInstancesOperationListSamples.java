// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for ScopeAccessReviewHistoryDefinitionInstancesOperation List. */
public final class ScopeAccessReviewHistoryDefinitionInstancesOperationListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-12-01-preview/examples/GetAccessReviewHistoryDefinitionInstances.json
     */
    /**
     * Sample code: GetAccessReviewHistoryDefinitionInstances.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getAccessReviewHistoryDefinitionInstances(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .scopeAccessReviewHistoryDefinitionInstancesOperations()
            .list(
                "subscriptions/129a304b-4aea-4b86-a9f7-ba7e2b23737a",
                "44724910-d7a5-4c29-b28f-db73e717165a",
                Context.NONE);
    }
}

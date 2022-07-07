// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for AccessReviewScheduleDefinitions DeleteById. */
public final class AccessReviewScheduleDefinitionsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2021-11-16-preview/examples/DeleteAccessReviewScheduleDefinition.json
     */
    /**
     * Sample code: DeleteAccessReview.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteAccessReview(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .accessReviewScheduleDefinitions()
            .deleteByIdWithResponse("fa73e90b-5bf1-45fd-a182-35ce5fc0674d", Context.NONE);
    }
}

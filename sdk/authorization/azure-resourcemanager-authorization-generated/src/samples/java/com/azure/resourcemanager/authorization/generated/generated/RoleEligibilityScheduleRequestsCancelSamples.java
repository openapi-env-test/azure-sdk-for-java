// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.generated;

import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests Cancel. */
public final class RoleEligibilityScheduleRequestsCancelSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2022-06-02/examples/CancelRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: CancelRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void cancelRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .cancelWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                Context.NONE);
    }
}

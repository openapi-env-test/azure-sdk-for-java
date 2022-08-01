// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.Context;

/** Samples for ManagementGroupSubscriptions Delete. */
public final class ManagementGroupSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file: specification/managementgroups/resource-manager/Microsoft.Management/stable/2021-04-01/examples/RemoveManagementGroupSubscription.json
     */
    /**
     * Sample code: DeleteSubscriptionFromManagementGroup.
     *
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void deleteSubscriptionFromManagementGroup(
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager
            .managementGroupSubscriptions()
            .deleteWithResponse("Group", "728bcbe4-8d56-4510-86c2-4921b8beefbc", "no-cache", Context.NONE);
    }
}

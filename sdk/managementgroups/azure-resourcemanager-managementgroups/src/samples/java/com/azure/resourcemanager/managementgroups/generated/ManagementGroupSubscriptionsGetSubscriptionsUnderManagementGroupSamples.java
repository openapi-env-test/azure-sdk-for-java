// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.generated;

import com.azure.core.util.Context;

/** Samples for ManagementGroupSubscriptions GetSubscriptionsUnderManagementGroup. */
public final class ManagementGroupSubscriptionsGetSubscriptionsUnderManagementGroupSamples {
    /*
     * x-ms-original-file: specification/managementgroups/resource-manager/Microsoft.Management/stable/2021-04-01/examples/GetAllSubscriptionsFromManagementGroup.json
     */
    /**
     * Sample code: GetAllSubscriptionsFromManagementGroup.
     *
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void getAllSubscriptionsFromManagementGroup(
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroupSubscriptions().getSubscriptionsUnderManagementGroup("Group", null, Context.NONE);
    }
}

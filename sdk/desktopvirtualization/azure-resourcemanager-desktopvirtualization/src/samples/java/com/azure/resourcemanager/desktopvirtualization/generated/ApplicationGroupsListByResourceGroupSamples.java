// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGroups ListByResourceGroup. */
public final class ApplicationGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-07-05-preview/examples/ApplicationGroup_ListByResourceGroup.json
     */
    /**
     * Sample code: ApplicationGroup_ListByResourceGroup.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .applicationGroups()
            .listByResourceGroup("resourceGroup1", "applicationGroupType eq 'RailApplication'", Context.NONE);
    }
}

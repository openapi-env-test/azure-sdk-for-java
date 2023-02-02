// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for Workspaces ListByResourceGroup. */
public final class WorkspacesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-10-14-preview/examples/Workspace_ListByResourceGroup.json
     */
    /**
     * Sample code: Workspace_ListByResourceGroup.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().listByResourceGroup("resourceGroup1", 10, true, 0, Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources ListByWorkspace. */
public final class PrivateLinkResourcesListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-07-05-preview/examples/PrivateLinkResources_ListByWorkspace.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByWorkspace.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateLinkResourcesListByWorkspace(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateLinkResources().listByWorkspace("resourceGroup1", "workspace1", Context.NONE);
    }
}

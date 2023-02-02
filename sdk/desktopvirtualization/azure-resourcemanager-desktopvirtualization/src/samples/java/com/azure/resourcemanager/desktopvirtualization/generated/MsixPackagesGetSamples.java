// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for MsixPackages Get. */
public final class MsixPackagesGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-10-14-preview/examples/MsixPackage_Get.json
     */
    /**
     * Sample code: MSIXPackage_Get.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixPackages().getWithResponse("resourceGroup1", "hostpool1", "packagefullname", Context.NONE);
    }
}

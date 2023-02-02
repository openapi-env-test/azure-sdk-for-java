// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.models.Application;
import com.azure.resourcemanager.desktopvirtualization.models.CommandLineSetting;
import com.azure.resourcemanager.desktopvirtualization.models.RemoteApplicationType;

/** Samples for Applications Update. */
public final class ApplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2022-10-14-preview/examples/Application_Update.json
     */
    /**
     * Sample code: Application_Update.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationUpdate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        Application resource =
            manager
                .applications()
                .getWithResponse("resourceGroup1", "applicationGroup1", "application1", Context.NONE)
                .getValue();
        resource
            .update()
            .withDescription("des1")
            .withFriendlyName("friendly")
            .withFilePath("path")
            .withCommandLineSetting(CommandLineSetting.ALLOW)
            .withCommandLineArguments("arguments")
            .withShowInPortal(true)
            .withIconPath("icon")
            .withIconIndex(1)
            .withApplicationType(RemoteApplicationType.IN_BUILT)
            .apply();
    }
}

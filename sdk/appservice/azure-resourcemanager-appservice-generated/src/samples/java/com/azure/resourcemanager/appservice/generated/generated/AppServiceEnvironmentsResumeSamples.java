// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for AppServiceEnvironments Resume. */
public final class AppServiceEnvironmentsResumeSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/AppServiceEnvironments_Resume.json
     */
    /**
     * Sample code: Resume an App Service Environment.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void resumeAnAppServiceEnvironment(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceEnvironments().resume("test-rg", "test-ase", Context.NONE);
    }
}

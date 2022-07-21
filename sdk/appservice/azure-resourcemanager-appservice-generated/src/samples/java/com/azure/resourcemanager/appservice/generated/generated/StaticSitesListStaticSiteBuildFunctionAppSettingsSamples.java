// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for StaticSites ListStaticSiteBuildFunctionAppSettings. */
public final class StaticSitesListStaticSiteBuildFunctionAppSettingsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListStaticSiteBuildFunctionAppSettings.json
     */
    /**
     * Sample code: Get function app settings of a static site build.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getFunctionAppSettingsOfAStaticSiteBuild(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .staticSites()
            .listStaticSiteBuildFunctionAppSettingsWithResponse("rg", "testStaticSite0", "12", Context.NONE);
    }
}

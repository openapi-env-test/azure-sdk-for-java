// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for StaticSites ListStaticSiteBuildAppSettings. */
public final class StaticSitesListStaticSiteBuildAppSettingsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/ListStaticSiteBuildAppSettings.json
     */
    /**
     * Sample code: Get app settings of a static site build.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppSettingsOfAStaticSiteBuild(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .listStaticSiteBuildAppSettingsWithResponse(
                "rg", "testStaticSite0", "12", com.azure.core.util.Context.NONE);
    }
}

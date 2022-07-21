// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for StaticSites GetUserProvidedFunctionAppForStaticSiteBuild. */
public final class StaticSitesGetUserProvidedFunctionAppForStaticSiteBuildSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetUserProvidedFunctionAppForStaticSiteBuild.json
     */
    /**
     * Sample code: Get details of the user provided function app registered with a static site build.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getDetailsOfTheUserProvidedFunctionAppRegisteredWithAStaticSiteBuild(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .staticSites()
            .getUserProvidedFunctionAppForStaticSiteBuildWithResponse(
                "rg", "testStaticSite0", "default", "testFunctionApp", Context.NONE);
    }
}

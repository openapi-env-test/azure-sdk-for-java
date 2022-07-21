// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteUserProvidedFunctionAppArmResourceInner;

/** Samples for StaticSites RegisterUserProvidedFunctionAppWithStaticSite. */
public final class StaticSitesRegisterUserProvidedFunctionAppWithStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/RegisterUserProvidedFunctionAppWithStaticSite.json
     */
    /**
     * Sample code: Register a user provided function app with a static site.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void registerAUserProvidedFunctionAppWithAStaticSite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .staticSites()
            .registerUserProvidedFunctionAppWithStaticSite(
                "rg",
                "testStaticSite0",
                "testFunctionApp",
                new StaticSiteUserProvidedFunctionAppArmResourceInner()
                    .withFunctionAppResourceId(
                        "/subscription/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/functionRG/providers/Microsoft.Web/sites/testFunctionApp")
                    .withFunctionAppRegion("West US 2"),
                true,
                Context.NONE);
    }
}

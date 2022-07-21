// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteLinkedBackendArmResourceInner;

/** Samples for StaticSites ValidateBackend. */
public final class StaticSitesValidateBackendSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ValidateLinkedBackendForStaticSite.json
     */
    /**
     * Sample code: Validate if backend can be linked to static site.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void validateIfBackendCanBeLinkedToStaticSite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .staticSites()
            .validateBackend(
                "rg",
                "testStaticSite0",
                "testBackend",
                new StaticSiteLinkedBackendArmResourceInner()
                    .withBackendResourceId(
                        "/subscription/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/backendRg/providers/Microsoft.Web/sites/testBackend")
                    .withRegion("West US 2"),
                Context.NONE);
    }
}

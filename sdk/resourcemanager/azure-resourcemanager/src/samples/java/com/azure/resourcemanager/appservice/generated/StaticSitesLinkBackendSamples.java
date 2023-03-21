// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.StaticSiteLinkedBackendArmResourceInner;

/** Samples for StaticSites LinkBackend. */
public final class StaticSitesLinkBackendSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/LinkBackendToStaticSite.json
     */
    /**
     * Sample code: Link a backend to a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void linkABackendToAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .linkBackend(
                "rg",
                "testStaticSite0",
                "testBackend",
                new StaticSiteLinkedBackendArmResourceInner()
                    .withBackendResourceId(
                        "/subscription/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/backendRg/providers/Microsoft.Web/sites/testBackend")
                    .withRegion("West US 2"),
                com.azure.core.util.Context.NONE);
    }
}

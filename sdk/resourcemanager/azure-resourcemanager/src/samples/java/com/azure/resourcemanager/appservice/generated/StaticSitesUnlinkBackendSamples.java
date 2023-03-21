// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for StaticSites UnlinkBackend. */
public final class StaticSitesUnlinkBackendSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/UnlinkBackendFromStaticSite.json
     */
    /**
     * Sample code: Unlink a backend from a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void unlinkABackendFromAStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .unlinkBackendWithResponse("rg", "testStaticSite0", "testBackend", null, com.azure.core.util.Context.NONE);
    }
}

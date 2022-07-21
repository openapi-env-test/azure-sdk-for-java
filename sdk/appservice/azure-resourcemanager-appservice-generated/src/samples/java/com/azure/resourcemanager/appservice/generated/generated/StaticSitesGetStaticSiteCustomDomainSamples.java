// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for StaticSites GetStaticSiteCustomDomain. */
public final class StaticSitesGetStaticSiteCustomDomainSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetStaticSiteCustomDomain.json
     */
    /**
     * Sample code: Get custom domain for a static site.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getCustomDomainForAStaticSite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .staticSites()
            .getStaticSiteCustomDomainWithResponse("rg", "testStaticSite0", "custom.domain.net", Context.NONE);
    }
}

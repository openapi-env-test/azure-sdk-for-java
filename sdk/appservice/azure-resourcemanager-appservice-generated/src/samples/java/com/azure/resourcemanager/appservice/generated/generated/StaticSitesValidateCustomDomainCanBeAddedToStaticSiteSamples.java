// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteCustomDomainRequestPropertiesArmResource;

/** Samples for StaticSites ValidateCustomDomainCanBeAddedToStaticSite. */
public final class StaticSitesValidateCustomDomainCanBeAddedToStaticSiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ValidateStaticSiteCustomDomain.json
     */
    /**
     * Sample code: Validate a custom domain for a static site.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void validateACustomDomainForAStaticSite(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .staticSites()
            .validateCustomDomainCanBeAddedToStaticSite(
                "rg",
                "testStaticSite0",
                "custom.domain.net",
                new StaticSiteCustomDomainRequestPropertiesArmResource(),
                Context.NONE);
    }
}

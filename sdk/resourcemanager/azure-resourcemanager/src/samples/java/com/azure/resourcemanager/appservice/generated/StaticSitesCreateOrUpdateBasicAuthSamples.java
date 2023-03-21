// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.resourcemanager.appservice.fluent.models.StaticSiteBasicAuthPropertiesArmResourceInner;
import com.azure.resourcemanager.appservice.models.BasicAuthName;

/** Samples for StaticSites CreateOrUpdateBasicAuth. */
public final class StaticSitesCreateOrUpdateBasicAuthSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/CreateOrUpdateStaticSiteBasicAuth.json
     */
    /**
     * Sample code: Creates or updates basic auth properties for a static site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsOrUpdatesBasicAuthPropertiesForAStaticSite(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .createOrUpdateBasicAuthWithResponse(
                "rg",
                "testStaticSite0",
                BasicAuthName.DEFAULT,
                new StaticSiteBasicAuthPropertiesArmResourceInner()
                    .withPassword("fakeTokenPlaceholder")
                    .withApplicableEnvironmentsMode("AllEnvironments"),
                com.azure.core.util.Context.NONE);
    }
}

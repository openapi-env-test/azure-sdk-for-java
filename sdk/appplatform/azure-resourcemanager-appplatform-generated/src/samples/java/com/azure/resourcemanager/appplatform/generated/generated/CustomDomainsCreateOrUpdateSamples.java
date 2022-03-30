// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.resourcemanager.appplatform.generated.models.CustomDomainProperties;

/** Samples for CustomDomains CreateOrUpdate. */
public final class CustomDomainsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/CustomDomains_CreateOrUpdate.json
     */
    /**
     * Sample code: CustomDomains_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .customDomains()
            .define("mydomain.com")
            .withExistingApp("myResourceGroup", "myservice", "myapp")
            .withProperties(
                new CustomDomainProperties()
                    .withThumbprint("934367bf1c97033f877db0f15cb1b586957d3133")
                    .withCertName("mycert"))
            .create();
    }
}

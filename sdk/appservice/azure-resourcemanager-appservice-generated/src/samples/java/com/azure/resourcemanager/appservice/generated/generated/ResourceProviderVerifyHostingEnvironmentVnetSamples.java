// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.models.VnetParameters;

/** Samples for ResourceProvider VerifyHostingEnvironmentVnet. */
public final class ResourceProviderVerifyHostingEnvironmentVnetSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/VerifyHostingEnvironmentVnet.json
     */
    /**
     * Sample code: VerifyHostingEnvironmentVnet.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void verifyHostingEnvironmentVnet(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .resourceProviders()
            .verifyHostingEnvironmentVnetWithResponse(
                new VnetParameters()
                    .withVnetResourceGroup("vNet123rg")
                    .withVnetName("vNet123")
                    .withVnetSubnetName("vNet123SubNet"),
                Context.NONE);
    }
}

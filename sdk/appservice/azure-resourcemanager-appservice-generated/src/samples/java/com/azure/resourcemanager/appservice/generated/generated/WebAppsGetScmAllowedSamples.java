// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for WebApps GetScmAllowed. */
public final class WebAppsGetScmAllowedSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetPublishingCredentialsPolicy.json
     */
    /**
     * Sample code: Get SCM Allowed.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getSCMAllowed(com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.webApps().getScmAllowedWithResponse("rg", "testSite", Context.NONE);
    }
}

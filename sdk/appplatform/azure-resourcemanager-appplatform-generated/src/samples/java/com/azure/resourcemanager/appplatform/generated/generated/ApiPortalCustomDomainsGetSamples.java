// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApiPortalCustomDomains Get. */
public final class ApiPortalCustomDomainsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/ApiPortalCustomDomains_Get.json
     */
    /**
     * Sample code: ApiPortalCustomDomains_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void apiPortalCustomDomainsGet(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .apiPortalCustomDomains()
            .getWithResponse("myResourceGroup", "myservice", "default", "myDomainName", Context.NONE);
    }
}

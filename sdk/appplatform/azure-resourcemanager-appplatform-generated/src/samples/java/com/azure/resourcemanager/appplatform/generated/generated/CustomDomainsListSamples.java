// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for CustomDomains List. */
public final class CustomDomainsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/CustomDomains_List.json
     */
    /**
     * Sample code: CustomDomains_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.customDomains().list("myResourceGroup", "myservice", "myapp", Context.NONE);
    }
}

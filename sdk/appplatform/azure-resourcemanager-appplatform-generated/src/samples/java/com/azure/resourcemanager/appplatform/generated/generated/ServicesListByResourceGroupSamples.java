// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for Services ListByResourceGroup. */
public final class ServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/Services_List.json
     */
    /**
     * Sample code: Services_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}

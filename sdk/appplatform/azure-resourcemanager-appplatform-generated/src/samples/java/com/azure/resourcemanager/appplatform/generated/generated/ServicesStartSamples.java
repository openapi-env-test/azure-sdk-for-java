// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for Services Start. */
public final class ServicesStartSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/Services_Start.json
     */
    /**
     * Sample code: Services_Start.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesStart(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().start("myResourceGroup", "myservice", Context.NONE);
    }
}

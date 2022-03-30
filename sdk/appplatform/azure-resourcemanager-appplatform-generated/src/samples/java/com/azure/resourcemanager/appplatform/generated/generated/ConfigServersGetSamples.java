// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for ConfigServers Get. */
public final class ConfigServersGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/ConfigServers_Get.json
     */
    /**
     * Sample code: ConfigServers_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void configServersGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.configServers().getWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}

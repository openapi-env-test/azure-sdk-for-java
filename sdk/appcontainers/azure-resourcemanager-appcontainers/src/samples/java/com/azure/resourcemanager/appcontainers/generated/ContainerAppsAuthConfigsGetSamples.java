// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.Context;

/** Samples for ContainerAppsAuthConfigs Get. */
public final class ContainerAppsAuthConfigsGetSamples {
    /*
     * x-ms-original-file: specification/app/resource-manager/Microsoft.App/preview/2022-06-01/examples/AuthConfigs_Get.json
     */
    /**
     * Sample code: Get Container App's AuthConfig.
     *
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void getContainerAppSAuthConfig(
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager
            .containerAppsAuthConfigs()
            .getWithResponse("workerapps-rg-xj", "testcanadacentral", "current", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for BuildServiceAgentPool List. */
public final class BuildServiceAgentPoolListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/BuildServiceAgentPool_List.json
     */
    /**
     * Sample code: BuildServiceAgentPool_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void buildServiceAgentPoolList(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.buildServiceAgentPools().list("myResourceGroup", "myservice", "default", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.generated;

import com.azure.core.util.Context;

/** Samples for Deployments Start. */
public final class DeploymentsStartSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2022-01-01-preview/examples/Deployments_Start.json
     */
    /**
     * Sample code: Deployments_Start.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsStart(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().start("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}

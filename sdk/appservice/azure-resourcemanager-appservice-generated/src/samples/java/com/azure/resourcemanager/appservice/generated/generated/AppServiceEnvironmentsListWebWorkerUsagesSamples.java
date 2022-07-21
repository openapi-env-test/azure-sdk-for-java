// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for AppServiceEnvironments ListWebWorkerUsages. */
public final class AppServiceEnvironmentsListWebWorkerUsagesSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/AppServiceEnvironments_ListWebWorkerUsages.json
     */
    /**
     * Sample code: Get usage metrics for a worker pool of an App Service Environment.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getUsageMetricsForAWorkerPoolOfAnAppServiceEnvironment(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.appServiceEnvironments().listWebWorkerUsages("test-rg", "test-ase", "0", Context.NONE);
    }
}

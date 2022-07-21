// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for DeletedWebApps ListByLocation. */
public final class DeletedWebAppsListByLocationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/ListDeletedWebAppsByLocation.json
     */
    /**
     * Sample code: List Deleted Web App by Location.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void listDeletedWebAppByLocation(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager.deletedWebApps().listByLocation("West US 2", Context.NONE);
    }
}

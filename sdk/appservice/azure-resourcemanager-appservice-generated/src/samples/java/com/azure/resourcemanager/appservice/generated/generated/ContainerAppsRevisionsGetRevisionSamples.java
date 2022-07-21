// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for ContainerAppsRevisions GetRevision. */
public final class ContainerAppsRevisionsGetRevisionSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetRevision.json
     */
    /**
     * Sample code: Get Container App's revision.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getContainerAppSRevision(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .containerAppsRevisions()
            .getRevisionWithResponse("rg", "testcontainerApp0", "testcontainerApp0-pjxhsye", Context.NONE);
    }
}

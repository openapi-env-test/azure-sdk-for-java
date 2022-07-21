// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.generated;

import com.azure.core.util.Context;

/** Samples for ResourceHealthMetadata GetBySite. */
public final class ResourceHealthMetadataGetBySiteSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/GetResourceHealthMetadataBySite.json
     */
    /**
     * Sample code: Get ResourceHealthMetadata.
     *
     * @param manager Entry point to AppServiceManager.
     */
    public static void getResourceHealthMetadata(
        com.azure.resourcemanager.appservice.generated.AppServiceManager manager) {
        manager
            .resourceHealthMetadatas()
            .getBySiteWithResponse("Default-Web-NorthCentralUS", "newsiteinnewASE-NCUS", Context.NONE);
    }
}

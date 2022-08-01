// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGroup Get. */
public final class ApplicationGroupGetSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2022-01-01-preview/examples/ApplicationGroup/ApplicationGroupGet.json
     */
    /**
     * Sample code: ApplicationGroupGet.
     *
     * @param manager Entry point to EventHubsManager.
     */
    public static void applicationGroupGet(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager
            .applicationGroups()
            .getWithResponse("contosotest", "contoso-ua-test-eh-system-1", "appGroup1", Context.NONE);
    }
}

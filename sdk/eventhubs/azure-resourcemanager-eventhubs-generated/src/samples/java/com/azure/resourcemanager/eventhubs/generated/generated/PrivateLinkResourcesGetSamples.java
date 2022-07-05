// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.core.util.Context;

/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/stable/2021-11-01/examples/NameSpaces/PrivateLinkResourcesGet.json
     */
    /**
     * Sample code: NameSpacePrivateLinkResourcesGet.
     *
     * @param manager Entry point to EventHubsManager.
     */
    public static void nameSpacePrivateLinkResourcesGet(
        com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.privateLinkResources().getWithResponse("ArunMonocle", "sdk-Namespace-2924", Context.NONE);
    }
}

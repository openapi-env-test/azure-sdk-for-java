// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;

/** Samples for StreamingLocators Get. */
public final class StreamingLocatorsGetSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Metadata/stable/2022-08-01/examples/streaming-locators-get-by-name.json
     */
    /**
     * Sample code: Get a Streaming Locator by name.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void getAStreamingLocatorByName(
        com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        manager.streamingLocators().getWithResponse("contosorg", "contosomedia", "clearStreamingLocator", Context.NONE);
    }
}

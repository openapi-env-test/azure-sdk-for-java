// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpoint;
import java.util.HashMap;
import java.util.Map;

/** Samples for StreamingEndpoints Update. */
public final class StreamingEndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/mediaservices/resource-manager/Microsoft.Media/Streaming/stable/2022-08-01/examples/streamingendpoint-update.json
     */
    /**
     * Sample code: Update a streaming endpoint.
     *
     * @param manager Entry point to MediaServicesManager.
     */
    public static void updateAStreamingEndpoint(com.azure.resourcemanager.mediaservices.MediaServicesManager manager) {
        StreamingEndpoint resource =
            manager
                .streamingEndpoints()
                .getWithResponse("mediaresources", "slitestmedia10", "myStreamingEndpoint1", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("tag3", "value3", "tag5", "value5"))
            .withDescription("test event 2")
            .withScaleUnits(5)
            .withAvailabilitySetName("availableset")
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

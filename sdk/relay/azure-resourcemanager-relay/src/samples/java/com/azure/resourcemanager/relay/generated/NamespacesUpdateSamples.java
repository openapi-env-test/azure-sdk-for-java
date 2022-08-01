// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.relay.models.RelayNamespace;
import java.util.HashMap;
import java.util.Map;

/** Samples for Namespaces Update. */
public final class NamespacesUpdateSamples {
    /*
     * x-ms-original-file: specification/relay/resource-manager/Microsoft.Relay/stable/2021-11-01/examples/NameSpaces/RelayNameSpaceUpdate.json
     */
    /**
     * Sample code: RelayNameSpaceUpdate.
     *
     * @param manager Entry point to RelayManager.
     */
    public static void relayNameSpaceUpdate(com.azure.resourcemanager.relay.RelayManager manager) {
        RelayNamespace resource =
            manager
                .namespaces()
                .getByResourceGroupWithResponse("RG-eg", "example-RelayRelayNamespace-01", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("tag3", "value3", "tag4", "value4", "tag5", "value5", "tag6", "value6"))
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.resourcemanager.eventhubs.generated.models.SchemaCompatibility;
import com.azure.resourcemanager.eventhubs.generated.models.SchemaType;
import java.util.HashMap;
import java.util.Map;

/** Samples for SchemaRegistry CreateOrUpdate. */
public final class SchemaRegistryCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2022-01-01-preview/examples/SchemaRegistry/SchemaRegistryCreate.json
     */
    /**
     * Sample code: SchemaRegistryCreate.
     *
     * @param manager Entry point to EventHubsManager.
     */
    public static void schemaRegistryCreate(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager
            .schemaRegistries()
            .define("testSchemaGroup1")
            .withExistingNamespace("alitest", "ali-ua-test-eh-system-1")
            .withGroupProperties(mapOf())
            .withSchemaCompatibility(SchemaCompatibility.FORWARD)
            .withSchemaType(SchemaType.AVRO)
            .create();
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

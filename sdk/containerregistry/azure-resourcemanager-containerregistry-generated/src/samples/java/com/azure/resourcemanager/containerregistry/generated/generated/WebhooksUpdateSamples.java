// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.Webhook;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookAction;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Webhooks Update. */
public final class WebhooksUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-01-01-preview/examples/WebhookUpdate.json
     */
    /**
     * Sample code: WebhookUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Webhook resource =
            manager.webhooks().getWithResponse("myResourceGroup", "myRegistry", "myWebhook", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("key", "value"))
            .withServiceUri("http://myservice.com")
            .withCustomHeaders(mapOf("Authorization", "Basic 000000000000000000000000000000000000000000000000000"))
            .withStatus(WebhookStatus.ENABLED)
            .withScope("myRepository")
            .withActions(Arrays.asList(WebhookAction.PUSH))
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

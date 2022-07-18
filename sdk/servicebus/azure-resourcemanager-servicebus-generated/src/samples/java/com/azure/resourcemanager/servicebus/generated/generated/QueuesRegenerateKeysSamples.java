// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.models.KeyType;
import com.azure.resourcemanager.servicebus.generated.models.RegenerateAccessKeyParameters;

/** Samples for Queues RegenerateKeys. */
public final class QueuesRegenerateKeysSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-01-01-preview/examples/Queues/SBQueueAuthorizationRuleRegenerateKey.json
     */
    /**
     * Sample code: QueueAuthorizationRuleRegenerateKey.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void queueAuthorizationRuleRegenerateKey(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .queues()
            .regenerateKeysWithResponse(
                "ArunMonocle",
                "sdk-namespace-7982",
                "sdk-Queues-2317",
                "sdk-AuthRules-5800",
                new RegenerateAccessKeyParameters().withKeyType(KeyType.PRIMARY_KEY),
                Context.NONE);
    }
}

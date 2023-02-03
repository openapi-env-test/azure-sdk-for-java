// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;

/** Samples for Queues GetAuthorizationRule. */
public final class QueuesGetAuthorizationRuleSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/Queues/SBQueueAuthorizationRuleGet.json
     */
    /**
     * Sample code: QueueAuthorizationRuleGet.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void queueAuthorizationRuleGet(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .queues()
            .getAuthorizationRuleWithResponse(
                "ArunMonocle", "sdk-Namespace-7982", "sdk-Queues-2317", "sdk-AuthRules-5800", Context.NONE);
    }
}

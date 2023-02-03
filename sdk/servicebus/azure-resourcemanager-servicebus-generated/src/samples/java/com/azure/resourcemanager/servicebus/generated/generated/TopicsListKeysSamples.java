// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;

/** Samples for Topics ListKeys. */
public final class TopicsListKeysSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/Topics/SBTopicAuthorizationRuleListKey.json
     */
    /**
     * Sample code: TopicAuthorizationRuleListKey.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void topicAuthorizationRuleListKey(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .topics()
            .listKeysWithResponse(
                "Default-ServiceBus-WestUS", "sdk-Namespace8408", "sdk-Topics2075", "sdk-Authrules5067", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;

/** Samples for Topics ListAuthorizationRules. */
public final class TopicsListAuthorizationRulesSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/Topics/SBTopicAuthorizationRuleListAll.json
     */
    /**
     * Sample code: TopicAuthorizationRuleListAll.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void topicAuthorizationRuleListAll(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager.topics().listAuthorizationRules("ArunMonocle", "sdk-Namespace-6261", "sdk-Topics-1984", Context.NONE);
    }
}

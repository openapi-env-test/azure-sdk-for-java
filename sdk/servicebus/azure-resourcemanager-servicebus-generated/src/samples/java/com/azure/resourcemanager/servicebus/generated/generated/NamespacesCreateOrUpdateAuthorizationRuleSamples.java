// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.resourcemanager.servicebus.generated.models.AccessRights;
import java.util.Arrays;

/** Samples for Namespaces CreateOrUpdateAuthorizationRule. */
public final class NamespacesCreateOrUpdateAuthorizationRuleSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/NameSpaces/SBNameSpaceAuthorizationRuleCreate.json
     */
    /**
     * Sample code: NameSpaceAuthorizationRuleCreate.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void nameSpaceAuthorizationRuleCreate(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .namespaces()
            .defineAuthorizationRule("sdk-AuthRules-1788")
            .withExistingNamespace("ArunMonocle", "sdk-Namespace-6914")
            .withRights(Arrays.asList(AccessRights.LISTEN, AccessRights.SEND))
            .create();
    }
}

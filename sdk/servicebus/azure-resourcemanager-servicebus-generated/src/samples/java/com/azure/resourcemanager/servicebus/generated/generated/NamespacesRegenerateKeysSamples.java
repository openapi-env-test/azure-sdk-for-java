// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.models.KeyType;
import com.azure.resourcemanager.servicebus.generated.models.RegenerateAccessKeyParameters;

/** Samples for Namespaces RegenerateKeys. */
public final class NamespacesRegenerateKeysSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-01-01-preview/examples/NameSpaces/SBNameSpaceAuthorizationRuleRegenerateKey.json
     */
    /**
     * Sample code: NameSpaceAuthorizationRuleRegenerateKey.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void nameSpaceAuthorizationRuleRegenerateKey(
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager
            .namespaces()
            .regenerateKeysWithResponse(
                "ArunMonocle",
                "sdk-namespace-6914",
                "sdk-AuthRules-1788",
                new RegenerateAccessKeyParameters().withKeyType(KeyType.PRIMARY_KEY),
                Context.NONE);
    }
}

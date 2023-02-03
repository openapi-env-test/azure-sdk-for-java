// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;

/** Samples for Namespaces Delete. */
public final class NamespacesDeleteSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/NameSpaces/SBNameSpaceDelete.json
     */
    /**
     * Sample code: NameSpaceDelete.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void nameSpaceDelete(com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager.namespaces().delete("ArunMonocle", "sdk-Namespace-3285", Context.NONE);
    }
}

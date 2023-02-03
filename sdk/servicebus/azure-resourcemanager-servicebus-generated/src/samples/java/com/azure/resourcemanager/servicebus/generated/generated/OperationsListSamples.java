// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/preview/2022-10-01-preview/examples/SBOperations_List.json
     */
    /**
     * Sample code: OperationsList.
     *
     * @param manager Entry point to ServiceBusManager.
     */
    public static void operationsList(com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager) {
        manager.operations().list(Context.NONE);
    }
}

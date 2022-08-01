// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/eventhub/resource-manager/Microsoft.EventHub/preview/2022-01-01-preview/examples/EHOperations_List.json
     */
    /**
     * Sample code: EHOperations_List.
     *
     * @param manager Entry point to EventHubsManager.
     */
    public static void eHOperationsList(com.azure.resourcemanager.eventhubs.generated.EventHubsManager manager) {
        manager.operations().list(Context.NONE);
    }
}

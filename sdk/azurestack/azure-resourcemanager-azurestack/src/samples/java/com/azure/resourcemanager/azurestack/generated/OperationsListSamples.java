// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/azurestack/resource-manager/Microsoft.AzureStack/preview/2020-06-01-preview/examples/Operation/List.json
     */
    /**
     * Sample code: Returns the list of supported REST operations.
     *
     * @param manager Entry point to AzureStackManager.
     */
    public static void returnsTheListOfSupportedRESTOperations(
        com.azure.resourcemanager.azurestack.AzureStackManager manager) {
        manager.operations().list(Context.NONE);
    }
}

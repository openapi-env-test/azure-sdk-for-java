// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.Context;

/** Samples for Operation List. */
public final class OperationListSamples {
    /*
     * x-ms-original-file: specification/reservations/resource-manager/Microsoft.Capacity/stable/2022-11-01/examples/GetOperations.json
     */
    /**
     * Sample code: GetOperations.
     *
     * @param manager Entry point to ReservationsManager.
     */
    public static void getOperations(com.azure.resourcemanager.reservations.ReservationsManager manager) {
        manager.operations().list(Context.NONE);
    }
}

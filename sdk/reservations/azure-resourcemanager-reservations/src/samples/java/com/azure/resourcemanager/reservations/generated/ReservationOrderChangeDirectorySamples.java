// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.reservations.models.ChangeDirectoryRequest;

/** Samples for ReservationOrder ChangeDirectory. */
public final class ReservationOrderChangeDirectorySamples {
    /*
     * x-ms-original-file: specification/reservations/resource-manager/Microsoft.Capacity/stable/2022-11-01/examples/ChangeDirectoryReservationOrder.json
     */
    /**
     * Sample code: ChangeDirectory.
     *
     * @param manager Entry point to ReservationsManager.
     */
    public static void changeDirectory(com.azure.resourcemanager.reservations.ReservationsManager manager) {
        manager
            .reservationOrders()
            .changeDirectoryWithResponse(
                "a075419f-44cc-497f-b68a-14ee811d48b9",
                new ChangeDirectoryRequest().withDestinationTenantId("906655ea-30be-4587-9d12-b50e077b0f32"),
                Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.Context;

/** Samples for Reservation ListRevisions. */
public final class ReservationListRevisionsSamples {
    /*
     * x-ms-original-file: specification/reservations/resource-manager/Microsoft.Capacity/stable/2022-11-01/examples/GetReservationRevisions.json
     */
    /**
     * Sample code: ReservationRevisions.
     *
     * @param manager Entry point to ReservationsManager.
     */
    public static void reservationRevisions(com.azure.resourcemanager.reservations.ReservationsManager manager) {
        manager
            .reservations()
            .listRevisions(
                "276e7ae4-84d0-4da6-ab4b-d6b94f3557da", "6ef59113-3482-40da-8d79-787f823e34bc", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.Context;

/** Samples for ReservationOrder Get. */
public final class ReservationOrderGetSamples {
    /*
     * x-ms-original-file: specification/reservations/resource-manager/Microsoft.Capacity/stable/2022-11-01/examples/GetReservationOrderDetailsWithExpandPlanInformation.json
     */
    /**
     * Sample code: GetReservationWithExpandPayments.
     *
     * @param manager Entry point to ReservationsManager.
     */
    public static void getReservationWithExpandPayments(
        com.azure.resourcemanager.reservations.ReservationsManager manager) {
        manager.reservationOrders().getWithResponse("a075419f-44cc-497f-b68a-14ee811d48b9", "schedule", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/reservations/resource-manager/Microsoft.Capacity/stable/2022-11-01/examples/GetReservationOrderDetails.json
     */
    /**
     * Sample code: GetReservationOrder.
     *
     * @param manager Entry point to ReservationsManager.
     */
    public static void getReservationOrder(com.azure.resourcemanager.reservations.ReservationsManager manager) {
        manager.reservationOrders().getWithResponse("a075419f-44cc-497f-b68a-14ee811d48b9", null, Context.NONE);
    }
}

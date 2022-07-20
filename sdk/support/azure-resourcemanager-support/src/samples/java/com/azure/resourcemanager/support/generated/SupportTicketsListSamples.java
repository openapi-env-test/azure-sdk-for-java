// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.Context;

/** Samples for SupportTickets List. */
public final class SupportTicketsListSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/ListSupportTicketsServiceIdEqualsForSubscription.json
     */
    /**
     * Sample code: List support tickets with a certain service id for a subscription.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsWithACertainServiceIdForASubscription(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTickets().list(null, "ServiceId eq 'vm_windows_service_guid'", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/ListSupportTicketsCreatedOnOrAfterAndInOpenStateBySubscription.json
     */
    /**
     * Sample code: List support tickets created on or after a certain date and in open state for a subscription.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsCreatedOnOrAfterACertainDateAndInOpenStateForASubscription(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTickets().list(null, "createdDate ge 2020-03-10T22:08:51Z and status eq 'Open'", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/ListSupportTicketsProblemClassificationIdEqualsForSubscription.json
     */
    /**
     * Sample code: List support tickets with a certain problem classification id for a subscription.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsWithACertainProblemClassificationIdForASubscription(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager
            .supportTickets()
            .list(null, "ProblemClassificationId eq 'compute_vm_problemClassification_guid'", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/ListSupportTicketsBySubscription.json
     */
    /**
     * Sample code: List support tickets for a subscription.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsForASubscription(com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTickets().list(null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/ListSupportTicketsInOpenStateBySubscription.json
     */
    /**
     * Sample code: List support tickets in open state for a subscription.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void listSupportTicketsInOpenStateForASubscription(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.supportTickets().list(null, "status eq 'Open'", Context.NONE);
    }
}

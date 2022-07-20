// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.Context;

/** Samples for Communications Get. */
public final class CommunicationsGetSamples {
    /*
     * x-ms-original-file: specification/support/resource-manager/Microsoft.Support/stable/2020-04-01/examples/GetCommunicationDetailsForSubscriptionSupportTicket.json
     */
    /**
     * Sample code: Get communication details for a subscription support ticket.
     *
     * @param manager Entry point to SupportManager.
     */
    public static void getCommunicationDetailsForASubscriptionSupportTicket(
        com.azure.resourcemanager.support.SupportManager manager) {
        manager.communications().getWithResponse("testticket", "testmessage", Context.NONE);
    }
}

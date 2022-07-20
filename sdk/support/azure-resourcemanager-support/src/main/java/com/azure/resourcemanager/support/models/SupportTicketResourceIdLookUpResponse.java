// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.resourcemanager.support.fluent.models.SupportTicketResourceIdLookUpResponseInner;

/** An immutable client-side representation of SupportTicketResourceIdLookUpResponse. */
public interface SupportTicketResourceIdLookUpResponse {
    /**
     * Gets the resourceId property: The ARM resource Id of support ticket.
     *
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * Gets the inner com.azure.resourcemanager.support.fluent.models.SupportTicketResourceIdLookUpResponseInner object.
     *
     * @return the inner object.
     */
    SupportTicketResourceIdLookUpResponseInner innerModel();
}

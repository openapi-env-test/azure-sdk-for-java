// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.SupportTicketsClient;
import com.azure.resourcemanager.support.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.support.fluent.models.SupportTicketDetailsInner;
import com.azure.resourcemanager.support.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.support.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.SupportTickets;

public final class SupportTicketsImpl implements SupportTickets {
    private static final ClientLogger LOGGER = new ClientLogger(SupportTicketsImpl.class);

    private final SupportTicketsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public SupportTicketsImpl(
        SupportTicketsClient innerClient, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CheckNameAvailabilityOutput checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput) {
        CheckNameAvailabilityOutputInner inner = this.serviceClient().checkNameAvailability(checkNameAvailabilityInput);
        if (inner != null) {
            return new CheckNameAvailabilityOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context) {
        Response<CheckNameAvailabilityOutputInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(checkNameAvailabilityInput, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SupportTicketDetails> list() {
        PagedIterable<SupportTicketDetailsInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SupportTicketDetailsImpl(inner1, this.manager()));
    }

    public PagedIterable<SupportTicketDetails> list(Integer top, String filter, Context context) {
        PagedIterable<SupportTicketDetailsInner> inner = this.serviceClient().list(top, filter, context);
        return Utils.mapPage(inner, inner1 -> new SupportTicketDetailsImpl(inner1, this.manager()));
    }

    public SupportTicketDetails get(String supportTicketName) {
        SupportTicketDetailsInner inner = this.serviceClient().get(supportTicketName);
        if (inner != null) {
            return new SupportTicketDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SupportTicketDetails> getWithResponse(String supportTicketName, Context context) {
        Response<SupportTicketDetailsInner> inner = this.serviceClient().getWithResponse(supportTicketName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SupportTicketDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SupportTicketDetails getById(String id) {
        String supportTicketName = Utils.getValueFromIdByName(id, "supportTickets");
        if (supportTicketName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'supportTickets'.", id)));
        }
        return this.getWithResponse(supportTicketName, Context.NONE).getValue();
    }

    public Response<SupportTicketDetails> getByIdWithResponse(String id, Context context) {
        String supportTicketName = Utils.getValueFromIdByName(id, "supportTickets");
        if (supportTicketName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'supportTickets'.", id)));
        }
        return this.getWithResponse(supportTicketName, context);
    }

    private SupportTicketsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }

    public SupportTicketDetailsImpl define(String name) {
        return new SupportTicketDetailsImpl(name, this.manager());
    }
}

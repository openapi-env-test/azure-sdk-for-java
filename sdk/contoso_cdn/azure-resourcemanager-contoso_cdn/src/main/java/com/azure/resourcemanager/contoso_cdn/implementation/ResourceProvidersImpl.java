// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.contoso_cdn.CdnManager;
import com.azure.resourcemanager.contoso_cdn.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.contoso_cdn.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.ValidateProbeOutputInner;
import com.azure.resourcemanager.contoso_cdn.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.contoso_cdn.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.contoso_cdn.models.ResourceProviders;
import com.azure.resourcemanager.contoso_cdn.models.ValidateProbeInput;
import com.azure.resourcemanager.contoso_cdn.models.ValidateProbeOutput;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final CdnManager serviceManager;

    public ResourceProvidersImpl(ResourceProvidersClient innerClient, CdnManager serviceManager) {
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

    public CheckNameAvailabilityOutput checkNameAvailabilityWithSubscription(
        CheckNameAvailabilityInput checkNameAvailabilityInput) {
        CheckNameAvailabilityOutputInner inner =
            this.serviceClient().checkNameAvailabilityWithSubscription(checkNameAvailabilityInput);
        if (inner != null) {
            return new CheckNameAvailabilityOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityOutput> checkNameAvailabilityWithSubscriptionWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context) {
        Response<CheckNameAvailabilityOutputInner> inner =
            this.serviceClient().checkNameAvailabilityWithSubscriptionWithResponse(checkNameAvailabilityInput, context);
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

    public ValidateProbeOutput validateProbe(ValidateProbeInput validateProbeInput) {
        ValidateProbeOutputInner inner = this.serviceClient().validateProbe(validateProbeInput);
        if (inner != null) {
            return new ValidateProbeOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ValidateProbeOutput> validateProbeWithResponse(
        ValidateProbeInput validateProbeInput, Context context) {
        Response<ValidateProbeOutputInner> inner =
            this.serviceClient().validateProbeWithResponse(validateProbeInput, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ValidateProbeOutputImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }
}

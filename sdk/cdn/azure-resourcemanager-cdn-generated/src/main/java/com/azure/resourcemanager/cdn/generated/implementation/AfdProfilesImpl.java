// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.fluent.AfdProfilesClient;
import com.azure.resourcemanager.cdn.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.cdn.generated.fluent.models.UsageInner;
import com.azure.resourcemanager.cdn.generated.models.AfdProfiles;
import com.azure.resourcemanager.cdn.generated.models.CheckHostnameAvailabilityInput;
import com.azure.resourcemanager.cdn.generated.models.CheckNameAvailabilityOutput;
import com.azure.resourcemanager.cdn.generated.models.Usage;

public final class AfdProfilesImpl implements AfdProfiles {
    private static final ClientLogger LOGGER = new ClientLogger(AfdProfilesImpl.class);

    private final AfdProfilesClient innerClient;

    private final com.azure.resourcemanager.cdn.generated.CdnManager serviceManager;

    public AfdProfilesImpl(
        AfdProfilesClient innerClient, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> listResourceUsage(String resourceGroupName, String profileName) {
        PagedIterable<UsageInner> inner = this.serviceClient().listResourceUsage(resourceGroupName, profileName);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> listResourceUsage(String resourceGroupName, String profileName, Context context) {
        PagedIterable<UsageInner> inner =
            this.serviceClient().listResourceUsage(resourceGroupName, profileName, context);
        return Utils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public CheckNameAvailabilityOutput checkHostnameAvailability(
        String resourceGroupName, String profileName, CheckHostnameAvailabilityInput checkHostnameAvailabilityInput) {
        CheckNameAvailabilityOutputInner inner =
            this
                .serviceClient()
                .checkHostnameAvailability(resourceGroupName, profileName, checkHostnameAvailabilityInput);
        if (inner != null) {
            return new CheckNameAvailabilityOutputImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityOutput> checkHostnameAvailabilityWithResponse(
        String resourceGroupName,
        String profileName,
        CheckHostnameAvailabilityInput checkHostnameAvailabilityInput,
        Context context) {
        Response<CheckNameAvailabilityOutputInner> inner =
            this
                .serviceClient()
                .checkHostnameAvailabilityWithResponse(
                    resourceGroupName, profileName, checkHostnameAvailabilityInput, context);
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

    private AfdProfilesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cdn.generated.CdnManager manager() {
        return this.serviceManager;
    }
}

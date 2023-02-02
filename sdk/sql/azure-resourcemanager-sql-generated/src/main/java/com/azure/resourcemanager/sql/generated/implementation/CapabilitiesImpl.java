// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.CapabilitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.LocationCapabilitiesInner;
import com.azure.resourcemanager.sql.generated.models.Capabilities;
import com.azure.resourcemanager.sql.generated.models.CapabilityGroup;
import com.azure.resourcemanager.sql.generated.models.LocationCapabilities;

public final class CapabilitiesImpl implements Capabilities {
    private static final ClientLogger LOGGER = new ClientLogger(CapabilitiesImpl.class);

    private final CapabilitiesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public CapabilitiesImpl(
        CapabilitiesClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<LocationCapabilities> listByLocationWithResponse(
        String locationName, CapabilityGroup include, Context context) {
        Response<LocationCapabilitiesInner> inner =
            this.serviceClient().listByLocationWithResponse(locationName, include, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new LocationCapabilitiesImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public LocationCapabilities listByLocation(String locationName) {
        LocationCapabilitiesInner inner = this.serviceClient().listByLocation(locationName);
        if (inner != null) {
            return new LocationCapabilitiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private CapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

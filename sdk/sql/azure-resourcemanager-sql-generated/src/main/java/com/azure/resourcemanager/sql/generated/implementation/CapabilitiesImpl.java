// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.CapabilitiesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.LocationCapabilitiesInner;
import com.azure.resourcemanager.sql.generated.models.Capabilities;
import com.azure.resourcemanager.sql.generated.models.LocationCapabilities;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CapabilitiesImpl implements Capabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapabilitiesImpl.class);

    private final CapabilitiesClient innerClient;

    private final SqlManager serviceManager;

    public CapabilitiesImpl(CapabilitiesClient innerClient, SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public LocationCapabilities listByLocation(String locationId) {
        LocationCapabilitiesInner inner = this.serviceClient().listByLocation(locationId);
        if (inner != null) {
            return new LocationCapabilitiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<LocationCapabilities> listByLocationWithResponse(String locationId, Context context) {
        Response<LocationCapabilitiesInner> inner =
            this.serviceClient().listByLocationWithResponse(locationId, context);
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

    private CapabilitiesClient serviceClient() {
        return this.innerClient;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}

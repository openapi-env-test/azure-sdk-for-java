// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.TimeZonesClient;
import com.azure.resourcemanager.sql.generated.fluent.models.TimeZoneInner;
import com.azure.resourcemanager.sql.generated.models.TimeZone;
import com.azure.resourcemanager.sql.generated.models.TimeZones;

public final class TimeZonesImpl implements TimeZones {
    private static final ClientLogger LOGGER = new ClientLogger(TimeZonesImpl.class);

    private final TimeZonesClient innerClient;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    public TimeZonesImpl(
        TimeZonesClient innerClient, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TimeZone> listByLocation(String locationName) {
        PagedIterable<TimeZoneInner> inner = this.serviceClient().listByLocation(locationName);
        return Utils.mapPage(inner, inner1 -> new TimeZoneImpl(inner1, this.manager()));
    }

    public PagedIterable<TimeZone> listByLocation(String locationName, Context context) {
        PagedIterable<TimeZoneInner> inner = this.serviceClient().listByLocation(locationName, context);
        return Utils.mapPage(inner, inner1 -> new TimeZoneImpl(inner1, this.manager()));
    }

    public TimeZone get(String locationName, String timeZoneId) {
        TimeZoneInner inner = this.serviceClient().get(locationName, timeZoneId);
        if (inner != null) {
            return new TimeZoneImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TimeZone> getWithResponse(String locationName, String timeZoneId, Context context) {
        Response<TimeZoneInner> inner = this.serviceClient().getWithResponse(locationName, timeZoneId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TimeZoneImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private TimeZonesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

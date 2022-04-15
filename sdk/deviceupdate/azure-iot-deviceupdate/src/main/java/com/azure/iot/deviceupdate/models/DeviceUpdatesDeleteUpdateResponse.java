package com.azure.iot.deviceupdate.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the deleteUpdate operation. */
public final class DeviceUpdatesDeleteUpdateResponse extends ResponseBase<DeviceUpdatesDeleteUpdateHeaders, Void> {
    /**
     * Creates an instance of DeviceUpdatesDeleteUpdateResponse.
     *
     * @param request the request which resulted in this DeviceUpdatesDeleteUpdateResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DeviceUpdatesDeleteUpdateResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            DeviceUpdatesDeleteUpdateHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}

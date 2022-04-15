package com.azure.iot.deviceupdate.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getOperation operation. */
public final class DeviceManagementsGetOperationResponse
        extends ResponseBase<DeviceManagementsGetOperationHeaders, DeviceOperation> {
    /**
     * Creates an instance of DeviceManagementsGetOperationResponse.
     *
     * @param request the request which resulted in this DeviceManagementsGetOperationResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DeviceManagementsGetOperationResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            DeviceOperation value,
            DeviceManagementsGetOperationHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public DeviceOperation getValue() {
        return super.getValue();
    }
}

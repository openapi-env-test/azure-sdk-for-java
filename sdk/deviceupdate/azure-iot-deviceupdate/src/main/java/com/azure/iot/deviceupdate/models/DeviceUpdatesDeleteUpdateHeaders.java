package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeviceUpdatesDeleteUpdateHeaders model. */
@Fluent
public final class DeviceUpdatesDeleteUpdateHeaders {
    /*
     * The Operation-Location property.
     */
    @JsonProperty(value = "Operation-Location")
    private String operationLocation;

    /**
     * Get the operationLocation property: The Operation-Location property.
     *
     * @return the operationLocation value.
     */
    public String getOperationLocation() {
        return this.operationLocation;
    }

    /**
     * Set the operationLocation property: The Operation-Location property.
     *
     * @param operationLocation the operationLocation value to set.
     * @return the DeviceUpdatesDeleteUpdateHeaders object itself.
     */
    public DeviceUpdatesDeleteUpdateHeaders setOperationLocation(String operationLocation) {
        this.operationLocation = operationLocation;
        return this;
    }
}

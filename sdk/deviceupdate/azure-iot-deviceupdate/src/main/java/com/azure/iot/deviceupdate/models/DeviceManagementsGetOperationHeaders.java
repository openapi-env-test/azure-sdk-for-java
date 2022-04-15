package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeviceManagementsGetOperationHeaders model. */
@Fluent
public final class DeviceManagementsGetOperationHeaders {
    /*
     * The Retry-After property.
     */
    @JsonProperty(value = "Retry-After")
    private String retryAfter;

    /**
     * Get the retryAfter property: The Retry-After property.
     *
     * @return the retryAfter value.
     */
    public String getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: The Retry-After property.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the DeviceManagementsGetOperationHeaders object itself.
     */
    public DeviceManagementsGetOperationHeaders setRetryAfter(String retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }
}

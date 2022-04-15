package com.azure.iot.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Common error response. */
@Fluent
public final class ErrorResponse {
    /*
     * The error details.
     */
    @JsonProperty(value = "error", required = true)
    private Error error;

    /**
     * Get the error property: The error details.
     *
     * @return the error value.
     */
    public Error getError() {
        return this.error;
    }

    /**
     * Set the error property: The error details.
     *
     * @param error the error value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setError(Error error) {
        this.error = error;
        return this;
    }
}

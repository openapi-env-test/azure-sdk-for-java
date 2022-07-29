// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Payload for execute request post call. */
@Fluent
public final class ExecuteRequestParameters {
    /*
     * The endpoint of service to call.
     */
    @JsonProperty(value = "serviceEndpoint", required = true)
    private String serviceEndpoint;

    /*
     * The request metadata.
     */
    @JsonProperty(value = "requestMetadata", required = true)
    private RequestMetadata requestMetadata;

    /**
     * Get the serviceEndpoint property: The endpoint of service to call.
     *
     * @return the serviceEndpoint value.
     */
    public String serviceEndpoint() {
        return this.serviceEndpoint;
    }

    /**
     * Set the serviceEndpoint property: The endpoint of service to call.
     *
     * @param serviceEndpoint the serviceEndpoint value to set.
     * @return the ExecuteRequestParameters object itself.
     */
    public ExecuteRequestParameters withServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }

    /**
     * Get the requestMetadata property: The request metadata.
     *
     * @return the requestMetadata value.
     */
    public RequestMetadata requestMetadata() {
        return this.requestMetadata;
    }

    /**
     * Set the requestMetadata property: The request metadata.
     *
     * @param requestMetadata the requestMetadata value to set.
     * @return the ExecuteRequestParameters object itself.
     */
    public ExecuteRequestParameters withRequestMetadata(RequestMetadata requestMetadata) {
        this.requestMetadata = requestMetadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceEndpoint() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serviceEndpoint in model ExecuteRequestParameters"));
        }
        if (requestMetadata() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property requestMetadata in model ExecuteRequestParameters"));
        } else {
            requestMetadata().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecuteRequestParameters.class);
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of the endpoint used for ingesting logs. */
@Immutable
public class LogsIngestionEndpointSpec {
    /*
     * The endpoint. This property is READ-ONLY.
     */
    @JsonProperty(value = "endpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String endpoint;

    /** Creates an instance of LogsIngestionEndpointSpec class. */
    public LogsIngestionEndpointSpec() {
    }

    /**
     * Get the endpoint property: The endpoint. This property is READ-ONLY.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

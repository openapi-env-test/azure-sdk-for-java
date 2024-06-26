// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The details of the service for which credentials needs to be returned. */
@Fluent
public final class ListCredentialsRequest {
    /*
     * The name of the service. If not provided, the request will by pass the generation of service configuration token
     */
    @JsonProperty(value = "serviceName")
    private ServiceName serviceName;

    /** Creates an instance of ListCredentialsRequest class. */
    public ListCredentialsRequest() {
    }

    /**
     * Get the serviceName property: The name of the service. If not provided, the request will by pass the generation
     * of service configuration token.
     *
     * @return the serviceName value.
     */
    public ServiceName serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service. If not provided, the request will by pass the generation
     * of service configuration token.
     *
     * @param serviceName the serviceName value to set.
     * @return the ListCredentialsRequest object itself.
     */
    public ListCredentialsRequest withServiceName(ServiceName serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

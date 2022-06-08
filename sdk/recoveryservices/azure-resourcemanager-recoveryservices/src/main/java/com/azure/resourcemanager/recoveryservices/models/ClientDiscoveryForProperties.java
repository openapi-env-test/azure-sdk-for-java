// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to represent shoebox properties in json client discovery. */
@Fluent
public final class ClientDiscoveryForProperties {
    /*
     * Operation properties.
     */
    @JsonProperty(value = "serviceSpecification")
    private ClientDiscoveryForServiceSpecification serviceSpecification;

    /**
     * Get the serviceSpecification property: Operation properties.
     *
     * @return the serviceSpecification value.
     */
    public ClientDiscoveryForServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the serviceSpecification property: Operation properties.
     *
     * @param serviceSpecification the serviceSpecification value to set.
     * @return the ClientDiscoveryForProperties object itself.
     */
    public ClientDiscoveryForProperties withServiceSpecification(
        ClientDiscoveryForServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceSpecification() != null) {
            serviceSpecification().validate();
        }
    }
}

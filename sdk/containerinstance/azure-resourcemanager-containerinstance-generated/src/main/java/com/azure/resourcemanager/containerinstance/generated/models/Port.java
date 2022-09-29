// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The port exposed on the container group. */
@Fluent
public final class Port {
    /*
     * The protocol associated with the port.
     */
    @JsonProperty(value = "protocol")
    private ContainerGroupNetworkProtocol protocol;

    /*
     * The port number.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get the protocol property: The protocol associated with the port.
     *
     * @return the protocol value.
     */
    public ContainerGroupNetworkProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol associated with the port.
     *
     * @param protocol the protocol value to set.
     * @return the Port object itself.
     */
    public Port withProtocol(ContainerGroupNetworkProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the port property: The port number.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: The port number.
     *
     * @param port the port value to set.
     * @return the Port object itself.
     */
    public Port withPort(int port) {
        this.port = port;
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

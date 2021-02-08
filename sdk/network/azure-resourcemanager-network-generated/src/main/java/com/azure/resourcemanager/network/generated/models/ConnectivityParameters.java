// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that determine how the connectivity check will be performed. */
@Fluent
public final class ConnectivityParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectivityParameters.class);

    /*
     * Describes the source of the connection.
     */
    @JsonProperty(value = "source", required = true)
    private ConnectivitySource source;

    /*
     * Describes the destination of connection.
     */
    @JsonProperty(value = "destination", required = true)
    private ConnectivityDestination destination;

    /*
     * Network protocol.
     */
    @JsonProperty(value = "protocol")
    private Protocol protocol;

    /*
     * Configuration of the protocol.
     */
    @JsonProperty(value = "protocolConfiguration")
    private ProtocolConfiguration protocolConfiguration;

    /**
     * Get the source property: Describes the source of the connection.
     *
     * @return the source value.
     */
    public ConnectivitySource source() {
        return this.source;
    }

    /**
     * Set the source property: Describes the source of the connection.
     *
     * @param source the source value to set.
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withSource(ConnectivitySource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Describes the destination of connection.
     *
     * @return the destination value.
     */
    public ConnectivityDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Describes the destination of connection.
     *
     * @param destination the destination value to set.
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withDestination(ConnectivityDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the protocol property: Network protocol.
     *
     * @return the protocol value.
     */
    public Protocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Network protocol.
     *
     * @param protocol the protocol value to set.
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withProtocol(Protocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the protocolConfiguration property: Configuration of the protocol.
     *
     * @return the protocolConfiguration value.
     */
    public ProtocolConfiguration protocolConfiguration() {
        return this.protocolConfiguration;
    }

    /**
     * Set the protocolConfiguration property: Configuration of the protocol.
     *
     * @param protocolConfiguration the protocolConfiguration value to set.
     * @return the ConnectivityParameters object itself.
     */
    public ConnectivityParameters withProtocolConfiguration(ProtocolConfiguration protocolConfiguration) {
        this.protocolConfiguration = protocolConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model ConnectivityParameters"));
        } else {
            source().validate();
        }
        if (destination() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destination in model ConnectivityParameters"));
        } else {
            destination().validate();
        }
        if (protocolConfiguration() != null) {
            protocolConfiguration().validate();
        }
    }
}

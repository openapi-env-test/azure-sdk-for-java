// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the destination of connection monitor. */
@Fluent
public final class ConnectionMonitorDestination {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorDestination.class);

    /*
     * The ID of the resource used as the destination by connection monitor.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Address of the connection monitor destination (IP or domain name).
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * The destination port used by connection monitor.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the resourceId property: The ID of the resource used as the destination by connection monitor.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource used as the destination by connection monitor.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConnectionMonitorDestination object itself.
     */
    public ConnectionMonitorDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the address property: Address of the connection monitor destination (IP or domain name).
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: Address of the connection monitor destination (IP or domain name).
     *
     * @param address the address value to set.
     * @return the ConnectionMonitorDestination object itself.
     */
    public ConnectionMonitorDestination withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the port property: The destination port used by connection monitor.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The destination port used by connection monitor.
     *
     * @param port the port value to set.
     * @return the ConnectionMonitorDestination object itself.
     */
    public ConnectionMonitorDestination withPort(Integer port) {
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

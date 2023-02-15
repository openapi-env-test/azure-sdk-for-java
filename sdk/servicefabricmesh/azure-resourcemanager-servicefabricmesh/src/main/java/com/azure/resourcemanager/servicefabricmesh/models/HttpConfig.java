// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the http configuration for external connectivity for this network. */
@Fluent
public final class HttpConfig {
    /*
     * http gateway config name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Specifies the port at which the service endpoint below needs to be exposed.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /*
     * description for routing.
     */
    @JsonProperty(value = "hosts", required = true)
    private List<HttpHostConfig> hosts;

    /** Creates an instance of HttpConfig class. */
    public HttpConfig() {
    }

    /**
     * Get the name property: http gateway config name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: http gateway config name.
     *
     * @param name the name value to set.
     * @return the HttpConfig object itself.
     */
    public HttpConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the port property: Specifies the port at which the service endpoint below needs to be exposed.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: Specifies the port at which the service endpoint below needs to be exposed.
     *
     * @param port the port value to set.
     * @return the HttpConfig object itself.
     */
    public HttpConfig withPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get the hosts property: description for routing.
     *
     * @return the hosts value.
     */
    public List<HttpHostConfig> hosts() {
        return this.hosts;
    }

    /**
     * Set the hosts property: description for routing.
     *
     * @param hosts the hosts value to set.
     * @return the HttpConfig object itself.
     */
    public HttpConfig withHosts(List<HttpHostConfig> hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model HttpConfig"));
        }
        if (hosts() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property hosts in model HttpConfig"));
        } else {
            hosts().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HttpConfig.class);
}

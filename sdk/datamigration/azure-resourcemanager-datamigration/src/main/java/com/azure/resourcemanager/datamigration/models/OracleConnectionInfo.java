// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Information for connecting to Oracle server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OracleConnectionInfo")
@Fluent
public final class OracleConnectionInfo extends ConnectionInfo {
    /*
     * EZConnect or TNSName connection string.
     */
    @JsonProperty(value = "dataSource", required = true)
    private String dataSource;

    /*
     * name of the server
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /*
     * server version
     */
    @JsonProperty(value = "serverVersion")
    private String serverVersion;

    /*
     * port for server
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * Authentication type to use for connection
     */
    @JsonProperty(value = "authentication")
    private AuthenticationType authentication;

    /**
     * Get the dataSource property: EZConnect or TNSName connection string.
     *
     * @return the dataSource value.
     */
    public String dataSource() {
        return this.dataSource;
    }

    /**
     * Set the dataSource property: EZConnect or TNSName connection string.
     *
     * @param dataSource the dataSource value to set.
     * @return the OracleConnectionInfo object itself.
     */
    public OracleConnectionInfo withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * Get the serverName property: name of the server.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: name of the server.
     *
     * @param serverName the serverName value to set.
     * @return the OracleConnectionInfo object itself.
     */
    public OracleConnectionInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the serverVersion property: server version.
     *
     * @return the serverVersion value.
     */
    public String serverVersion() {
        return this.serverVersion;
    }

    /**
     * Set the serverVersion property: server version.
     *
     * @param serverVersion the serverVersion value to set.
     * @return the OracleConnectionInfo object itself.
     */
    public OracleConnectionInfo withServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    /**
     * Get the port property: port for server.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: port for server.
     *
     * @param port the port value to set.
     * @return the OracleConnectionInfo object itself.
     */
    public OracleConnectionInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authentication property: Authentication type to use for connection.
     *
     * @return the authentication value.
     */
    public AuthenticationType authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Authentication type to use for connection.
     *
     * @param authentication the authentication value to set.
     * @return the OracleConnectionInfo object itself.
     */
    public OracleConnectionInfo withAuthentication(AuthenticationType authentication) {
        this.authentication = authentication;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OracleConnectionInfo withUsername(String username) {
        super.withUsername(username);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OracleConnectionInfo withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataSource() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataSource in model OracleConnectionInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OracleConnectionInfo.class);
}

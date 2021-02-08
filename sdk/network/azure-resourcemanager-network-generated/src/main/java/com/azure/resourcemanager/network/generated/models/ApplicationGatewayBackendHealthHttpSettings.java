// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application gateway BackendHealthHttp settings. */
@Fluent
public final class ApplicationGatewayBackendHealthHttpSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHealthHttpSettings.class);

    /*
     * Reference of an ApplicationGatewayBackendHttpSettings resource.
     */
    @JsonProperty(value = "backendHttpSettings")
    private ApplicationGatewayBackendHttpSettings backendHttpSettings;

    /*
     * List of ApplicationGatewayBackendHealthServer resources.
     */
    @JsonProperty(value = "servers")
    private List<ApplicationGatewayBackendHealthServer> servers;

    /**
     * Get the backendHttpSettings property: Reference of an ApplicationGatewayBackendHttpSettings resource.
     *
     * @return the backendHttpSettings value.
     */
    public ApplicationGatewayBackendHttpSettings backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Reference of an ApplicationGatewayBackendHttpSettings resource.
     *
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayBackendHealthHttpSettings object itself.
     */
    public ApplicationGatewayBackendHealthHttpSettings withBackendHttpSettings(
        ApplicationGatewayBackendHttpSettings backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the servers property: List of ApplicationGatewayBackendHealthServer resources.
     *
     * @return the servers value.
     */
    public List<ApplicationGatewayBackendHealthServer> servers() {
        return this.servers;
    }

    /**
     * Set the servers property: List of ApplicationGatewayBackendHealthServer resources.
     *
     * @param servers the servers value to set.
     * @return the ApplicationGatewayBackendHealthHttpSettings object itself.
     */
    public ApplicationGatewayBackendHealthHttpSettings withServers(
        List<ApplicationGatewayBackendHealthServer> servers) {
        this.servers = servers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (backendHttpSettings() != null) {
            backendHttpSettings().validate();
        }
        if (servers() != null) {
            servers().forEach(e -> e.validate());
        }
    }
}

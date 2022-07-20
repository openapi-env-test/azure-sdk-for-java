// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters to get network configuration diagnostic. */
@Fluent
public final class NetworkConfigurationDiagnosticParameters {
    /*
     * The ID of the target resource to perform network configuration
     * diagnostic. Valid options are VM, NetworkInterface,
     * VMSS/NetworkInterface and Application Gateway.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * Verbosity level.
     */
    @JsonProperty(value = "verbosityLevel")
    private VerbosityLevel verbosityLevel;

    /*
     * List of network configuration diagnostic profiles.
     */
    @JsonProperty(value = "profiles", required = true)
    private List<NetworkConfigurationDiagnosticProfile> profiles;

    /**
     * Get the targetResourceId property: The ID of the target resource to perform network configuration diagnostic.
     * Valid options are VM, NetworkInterface, VMSS/NetworkInterface and Application Gateway.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the target resource to perform network configuration diagnostic.
     * Valid options are VM, NetworkInterface, VMSS/NetworkInterface and Application Gateway.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the verbosityLevel property: Verbosity level.
     *
     * @return the verbosityLevel value.
     */
    public VerbosityLevel verbosityLevel() {
        return this.verbosityLevel;
    }

    /**
     * Set the verbosityLevel property: Verbosity level.
     *
     * @param verbosityLevel the verbosityLevel value to set.
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withVerbosityLevel(VerbosityLevel verbosityLevel) {
        this.verbosityLevel = verbosityLevel;
        return this;
    }

    /**
     * Get the profiles property: List of network configuration diagnostic profiles.
     *
     * @return the profiles value.
     */
    public List<NetworkConfigurationDiagnosticProfile> profiles() {
        return this.profiles;
    }

    /**
     * Set the profiles property: List of network configuration diagnostic profiles.
     *
     * @param profiles the profiles value to set.
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withProfiles(List<NetworkConfigurationDiagnosticProfile> profiles) {
        this.profiles = profiles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceId in model"
                            + " NetworkConfigurationDiagnosticParameters"));
        }
        if (profiles() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property profiles in model NetworkConfigurationDiagnosticParameters"));
        } else {
            profiles().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkConfigurationDiagnosticParameters.class);
}

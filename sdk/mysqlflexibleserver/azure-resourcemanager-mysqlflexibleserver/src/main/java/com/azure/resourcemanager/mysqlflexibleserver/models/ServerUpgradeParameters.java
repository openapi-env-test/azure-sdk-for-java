// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ServerUpgradeParametersProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServerUpgradeParameters model. */
@Fluent
public final class ServerUpgradeParameters {
    /*
     * The properties that can be updated for a server.
     */
    @JsonProperty(value = "properties")
    private ServerUpgradeParametersProperties innerProperties;

    /**
     * Get the innerProperties property: The properties that can be updated for a server.
     *
     * @return the innerProperties value.
     */
    private ServerUpgradeParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the targetServerVersion property: Represents an server storage profile.
     *
     * @return the targetServerVersion value.
     */
    public String targetServerVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().targetServerVersion();
    }

    /**
     * Set the targetServerVersion property: Represents an server storage profile.
     *
     * @param targetServerVersion the targetServerVersion value to set.
     * @return the ServerUpgradeParameters object itself.
     */
    public ServerUpgradeParameters withTargetServerVersion(String targetServerVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ServerUpgradeParametersProperties();
        }
        this.innerProperties().withTargetServerVersion(targetServerVersion);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

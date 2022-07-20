// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that can be updated for a server. */
@Fluent
public final class ServerUpgradeParametersProperties {
    /*
     * Represents an server storage profile.
     */
    @JsonProperty(value = "targetServerVersion")
    private String targetServerVersion;

    /**
     * Get the targetServerVersion property: Represents an server storage profile.
     *
     * @return the targetServerVersion value.
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Set the targetServerVersion property: Represents an server storage profile.
     *
     * @param targetServerVersion the targetServerVersion value to set.
     * @return the ServerUpgradeParametersProperties object itself.
     */
    public ServerUpgradeParametersProperties withTargetServerVersion(String targetServerVersion) {
        this.targetServerVersion = targetServerVersion;
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

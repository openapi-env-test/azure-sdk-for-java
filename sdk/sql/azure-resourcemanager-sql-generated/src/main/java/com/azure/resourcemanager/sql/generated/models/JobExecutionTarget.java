// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The target that a job execution is executed on. */
@Immutable
public final class JobExecutionTarget {
    /*
     * The type of the target.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private JobTargetType type;

    /*
     * The server name.
     */
    @JsonProperty(value = "serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /*
     * The database name.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /**
     * Get the type property: The type of the target.
     *
     * @return the type value.
     */
    public JobTargetType type() {
        return this.type;
    }

    /**
     * Get the serverName property: The server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the databaseName property: The database name.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

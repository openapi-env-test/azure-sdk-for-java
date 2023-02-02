// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Output for the task that validates connection to SQL DB and target server requirements. */
@Immutable
public final class ConnectToTargetSqlDbTaskOutput {
    /*
     * Result identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Source databases as a map from database name to database id
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private String databases;

    /*
     * Version of the target server
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /*
     * Target server brand version
     */
    @JsonProperty(value = "targetServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerBrandVersion;

    /** Creates an instance of ConnectToTargetSqlDbTaskOutput class. */
    public ConnectToTargetSqlDbTaskOutput() {
    }

    /**
     * Get the id property: Result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the databases property: Source databases as a map from database name to database id.
     *
     * @return the databases value.
     */
    public String databases() {
        return this.databases;
    }

    /**
     * Get the targetServerVersion property: Version of the target server.
     *
     * @return the targetServerVersion value.
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get the targetServerBrandVersion property: Target server brand version.
     *
     * @return the targetServerBrandVersion value.
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

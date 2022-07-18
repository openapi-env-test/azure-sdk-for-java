// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Migration Validation Database level summary result. */
@Immutable
public final class MigrationValidationDatabaseSummaryResult {
    /*
     * Result identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Migration Identifier
     */
    @JsonProperty(value = "migrationId", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationId;

    /*
     * Name of the source database
     */
    @JsonProperty(value = "sourceDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceDatabaseName;

    /*
     * Name of the target database
     */
    @JsonProperty(value = "targetDatabaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String targetDatabaseName;

    /*
     * Validation start time
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startedOn;

    /*
     * Validation end time
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endedOn;

    /*
     * Current status of validation at the database level
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get the id property: Result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the migrationId property: Migration Identifier.
     *
     * @return the migrationId value.
     */
    public String migrationId() {
        return this.migrationId;
    }

    /**
     * Get the sourceDatabaseName property: Name of the source database.
     *
     * @return the sourceDatabaseName value.
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    /**
     * Get the targetDatabaseName property: Name of the target database.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Get the startedOn property: Validation start time.
     *
     * @return the startedOn value.
     */
    public OffsetDateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get the endedOn property: Validation end time.
     *
     * @return the endedOn value.
     */
    public OffsetDateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get the status property: Current status of validation at the database level.
     *
     * @return the status value.
     */
    public ValidationStatus status() {
        return this.status;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

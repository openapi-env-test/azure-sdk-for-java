// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The restorable dropped managed database's properties. */
@Immutable
public final class RestorableDroppedManagedDatabaseProperties {
    /*
     * The name of the database.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The creation date of the database (ISO8601 format).
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The deletion date of the database (ISO8601 format).
     */
    @JsonProperty(value = "deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionDate;

    /*
     * The earliest restore date of the database (ISO8601 format).
     */
    @JsonProperty(value = "earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreDate;

    /**
     * Get the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     *
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

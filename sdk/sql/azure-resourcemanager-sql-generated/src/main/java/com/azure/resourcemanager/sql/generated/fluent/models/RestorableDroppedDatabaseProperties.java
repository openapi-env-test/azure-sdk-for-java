// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.generated.models.BackupStorageRedundancy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The restorable dropped database's properties. */
@Immutable
public final class RestorableDroppedDatabaseProperties {
    /*
     * The name of the database.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * The max size of the database expressed in bytes.
     */
    @JsonProperty(value = "maxSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxSizeBytes;

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

    /*
     * The storage account type used to store backups for this database.
     */
    @JsonProperty(value = "backupStorageRedundancy", access = JsonProperty.Access.WRITE_ONLY)
    private BackupStorageRedundancy backupStorageRedundancy;

    /**
     * Get the databaseName property: The name of the database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Get the maxSizeBytes property: The max size of the database expressed in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
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
     * Get the backupStorageRedundancy property: The storage account type used to store backups for this database.
     *
     * @return the backupStorageRedundancy value.
     */
    public BackupStorageRedundancy backupStorageRedundancy() {
        return this.backupStorageRedundancy;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

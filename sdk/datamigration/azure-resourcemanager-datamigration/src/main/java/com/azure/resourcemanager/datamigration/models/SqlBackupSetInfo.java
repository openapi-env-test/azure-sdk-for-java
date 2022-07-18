// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** Information of backup set. */
@Immutable
public final class SqlBackupSetInfo {
    /*
     * Backup set id.
     */
    @JsonProperty(value = "backupSetId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID backupSetId;

    /*
     * First LSN of the backup set.
     */
    @JsonProperty(value = "firstLSN", access = JsonProperty.Access.WRITE_ONLY)
    private String firstLsn;

    /*
     * Last LSN of the backup set.
     */
    @JsonProperty(value = "lastLSN", access = JsonProperty.Access.WRITE_ONLY)
    private String lastLsn;

    /*
     * Backup type.
     */
    @JsonProperty(value = "backupType", access = JsonProperty.Access.WRITE_ONLY)
    private String backupType;

    /*
     * List of files in the backup set.
     */
    @JsonProperty(value = "listOfBackupFiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<SqlBackupFileInfo> listOfBackupFiles;

    /*
     * Backup start date.
     */
    @JsonProperty(value = "backupStartDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupStartDate;

    /*
     * Backup end time.
     */
    @JsonProperty(value = "backupFinishDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime backupFinishDate;

    /*
     * Whether this backup set has been restored or not.
     */
    @JsonProperty(value = "isBackupRestored", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isBackupRestored;

    /*
     * Has Backup Checksums
     */
    @JsonProperty(value = "hasBackupChecksums", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean hasBackupChecksums;

    /*
     * Media family count
     */
    @JsonProperty(value = "familyCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer familyCount;

    /*
     * The reasons why the backup set is ignored
     */
    @JsonProperty(value = "ignoreReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> ignoreReasons;

    /**
     * Get the backupSetId property: Backup set id.
     *
     * @return the backupSetId value.
     */
    public UUID backupSetId() {
        return this.backupSetId;
    }

    /**
     * Get the firstLsn property: First LSN of the backup set.
     *
     * @return the firstLsn value.
     */
    public String firstLsn() {
        return this.firstLsn;
    }

    /**
     * Get the lastLsn property: Last LSN of the backup set.
     *
     * @return the lastLsn value.
     */
    public String lastLsn() {
        return this.lastLsn;
    }

    /**
     * Get the backupType property: Backup type.
     *
     * @return the backupType value.
     */
    public String backupType() {
        return this.backupType;
    }

    /**
     * Get the listOfBackupFiles property: List of files in the backup set.
     *
     * @return the listOfBackupFiles value.
     */
    public List<SqlBackupFileInfo> listOfBackupFiles() {
        return this.listOfBackupFiles;
    }

    /**
     * Get the backupStartDate property: Backup start date.
     *
     * @return the backupStartDate value.
     */
    public OffsetDateTime backupStartDate() {
        return this.backupStartDate;
    }

    /**
     * Get the backupFinishDate property: Backup end time.
     *
     * @return the backupFinishDate value.
     */
    public OffsetDateTime backupFinishDate() {
        return this.backupFinishDate;
    }

    /**
     * Get the isBackupRestored property: Whether this backup set has been restored or not.
     *
     * @return the isBackupRestored value.
     */
    public Boolean isBackupRestored() {
        return this.isBackupRestored;
    }

    /**
     * Get the hasBackupChecksums property: Has Backup Checksums.
     *
     * @return the hasBackupChecksums value.
     */
    public Boolean hasBackupChecksums() {
        return this.hasBackupChecksums;
    }

    /**
     * Get the familyCount property: Media family count.
     *
     * @return the familyCount value.
     */
    public Integer familyCount() {
        return this.familyCount;
    }

    /**
     * Get the ignoreReasons property: The reasons why the backup set is ignored.
     *
     * @return the ignoreReasons value.
     */
    public List<String> ignoreReasons() {
        return this.ignoreReasons;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (listOfBackupFiles() != null) {
            listOfBackupFiles().forEach(e -> e.validate());
        }
    }
}

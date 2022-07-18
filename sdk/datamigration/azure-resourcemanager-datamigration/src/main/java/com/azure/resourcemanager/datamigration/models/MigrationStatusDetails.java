// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Detailed status of current migration. */
@Immutable
public final class MigrationStatusDetails {
    /*
     * Current State of Migration.
     */
    @JsonProperty(value = "migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationState;

    /*
     * Details of full backup set.
     */
    @JsonProperty(value = "fullBackupSetInfo", access = JsonProperty.Access.WRITE_ONLY)
    private SqlBackupSetInfo fullBackupSetInfo;

    /*
     * Last applied backup set information.
     */
    @JsonProperty(value = "lastRestoredBackupSetInfo", access = JsonProperty.Access.WRITE_ONLY)
    private SqlBackupSetInfo lastRestoredBackupSetInfo;

    /*
     * Backup sets that are currently active.
     */
    @JsonProperty(value = "activeBackupSets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SqlBackupSetInfo> activeBackupSets;

    /*
     * Files that are not valid backup files.
     */
    @JsonProperty(value = "invalidFiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> invalidFiles;

    /*
     * Name of blob container.
     */
    @JsonProperty(value = "blobContainerName", access = JsonProperty.Access.WRITE_ONLY)
    private String blobContainerName;

    /*
     * Whether full backup has been applied to the target database or not.
     */
    @JsonProperty(value = "isFullBackupRestored", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFullBackupRestored;

    /*
     * Restore blocking reason, if any
     */
    @JsonProperty(value = "restoreBlockingReason", access = JsonProperty.Access.WRITE_ONLY)
    private String restoreBlockingReason;

    /*
     * Complete restore error message, if any
     */
    @JsonProperty(value = "completeRestoreErrorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String completeRestoreErrorMessage;

    /*
     * File upload blocking errors, if any.
     */
    @JsonProperty(value = "fileUploadBlockingErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> fileUploadBlockingErrors;

    /*
     * File name that is currently being restored.
     */
    @JsonProperty(value = "currentRestoringFilename", access = JsonProperty.Access.WRITE_ONLY)
    private String currentRestoringFilename;

    /*
     * Last restored file name.
     */
    @JsonProperty(value = "lastRestoredFilename", access = JsonProperty.Access.WRITE_ONLY)
    private String lastRestoredFilename;

    /*
     * Total pending log backups.
     */
    @JsonProperty(value = "pendingLogBackupsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer pendingLogBackupsCount;

    /**
     * Get the migrationState property: Current State of Migration.
     *
     * @return the migrationState value.
     */
    public String migrationState() {
        return this.migrationState;
    }

    /**
     * Get the fullBackupSetInfo property: Details of full backup set.
     *
     * @return the fullBackupSetInfo value.
     */
    public SqlBackupSetInfo fullBackupSetInfo() {
        return this.fullBackupSetInfo;
    }

    /**
     * Get the lastRestoredBackupSetInfo property: Last applied backup set information.
     *
     * @return the lastRestoredBackupSetInfo value.
     */
    public SqlBackupSetInfo lastRestoredBackupSetInfo() {
        return this.lastRestoredBackupSetInfo;
    }

    /**
     * Get the activeBackupSets property: Backup sets that are currently active.
     *
     * @return the activeBackupSets value.
     */
    public List<SqlBackupSetInfo> activeBackupSets() {
        return this.activeBackupSets;
    }

    /**
     * Get the invalidFiles property: Files that are not valid backup files.
     *
     * @return the invalidFiles value.
     */
    public List<String> invalidFiles() {
        return this.invalidFiles;
    }

    /**
     * Get the blobContainerName property: Name of blob container.
     *
     * @return the blobContainerName value.
     */
    public String blobContainerName() {
        return this.blobContainerName;
    }

    /**
     * Get the isFullBackupRestored property: Whether full backup has been applied to the target database or not.
     *
     * @return the isFullBackupRestored value.
     */
    public Boolean isFullBackupRestored() {
        return this.isFullBackupRestored;
    }

    /**
     * Get the restoreBlockingReason property: Restore blocking reason, if any.
     *
     * @return the restoreBlockingReason value.
     */
    public String restoreBlockingReason() {
        return this.restoreBlockingReason;
    }

    /**
     * Get the completeRestoreErrorMessage property: Complete restore error message, if any.
     *
     * @return the completeRestoreErrorMessage value.
     */
    public String completeRestoreErrorMessage() {
        return this.completeRestoreErrorMessage;
    }

    /**
     * Get the fileUploadBlockingErrors property: File upload blocking errors, if any.
     *
     * @return the fileUploadBlockingErrors value.
     */
    public List<String> fileUploadBlockingErrors() {
        return this.fileUploadBlockingErrors;
    }

    /**
     * Get the currentRestoringFilename property: File name that is currently being restored.
     *
     * @return the currentRestoringFilename value.
     */
    public String currentRestoringFilename() {
        return this.currentRestoringFilename;
    }

    /**
     * Get the lastRestoredFilename property: Last restored file name.
     *
     * @return the lastRestoredFilename value.
     */
    public String lastRestoredFilename() {
        return this.lastRestoredFilename;
    }

    /**
     * Get the pendingLogBackupsCount property: Total pending log backups.
     *
     * @return the pendingLogBackupsCount value.
     */
    public Integer pendingLogBackupsCount() {
        return this.pendingLogBackupsCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fullBackupSetInfo() != null) {
            fullBackupSetInfo().validate();
        }
        if (lastRestoredBackupSetInfo() != null) {
            lastRestoredBackupSetInfo().validate();
        }
        if (activeBackupSets() != null) {
            activeBackupSets().forEach(e -> e.validate());
        }
    }
}

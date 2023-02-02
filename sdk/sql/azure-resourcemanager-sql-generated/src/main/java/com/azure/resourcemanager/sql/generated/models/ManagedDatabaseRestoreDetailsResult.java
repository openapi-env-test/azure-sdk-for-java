// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseRestoreDetailsResultInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of ManagedDatabaseRestoreDetailsResult. */
public interface ManagedDatabaseRestoreDetailsResult {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the typePropertiesType property: Restore type.
     *
     * @return the typePropertiesType value.
     */
    String typePropertiesType();

    /**
     * Gets the status property: Restore status.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the blockReason property: The reason why restore is in Blocked state.
     *
     * @return the blockReason value.
     */
    String blockReason();

    /**
     * Gets the lastUploadedFileName property: Last uploaded file name.
     *
     * @return the lastUploadedFileName value.
     */
    String lastUploadedFileName();

    /**
     * Gets the lastUploadedFileTime property: Last uploaded file time.
     *
     * @return the lastUploadedFileTime value.
     */
    OffsetDateTime lastUploadedFileTime();

    /**
     * Gets the lastRestoredFileName property: Last restored file name.
     *
     * @return the lastRestoredFileName value.
     */
    String lastRestoredFileName();

    /**
     * Gets the lastRestoredFileTime property: Last restored file time.
     *
     * @return the lastRestoredFileTime value.
     */
    OffsetDateTime lastRestoredFileTime();

    /**
     * Gets the percentCompleted property: Percent completed.
     *
     * @return the percentCompleted value.
     */
    Integer percentCompleted();

    /**
     * Gets the currentRestoredSizeMB property: Current restored size MB.
     *
     * @return the currentRestoredSizeMB value.
     */
    Integer currentRestoredSizeMB();

    /**
     * Gets the currentRestorePlanSizeMB property: Current restore plan size MB.
     *
     * @return the currentRestorePlanSizeMB value.
     */
    Integer currentRestorePlanSizeMB();

    /**
     * Gets the currentBackupType property: Current backup type.
     *
     * @return the currentBackupType value.
     */
    String currentBackupType();

    /**
     * Gets the currentRestoringFileName property: Current restoring file name.
     *
     * @return the currentRestoringFileName value.
     */
    String currentRestoringFileName();

    /**
     * Gets the numberOfFilesDetected property: Number of files detected.
     *
     * @return the numberOfFilesDetected value.
     */
    Integer numberOfFilesDetected();

    /**
     * Gets the numberOfFilesQueued property: Number of files queued.
     *
     * @return the numberOfFilesQueued value.
     */
    Integer numberOfFilesQueued();

    /**
     * Gets the numberOfFilesSkipped property: Number of files skipped.
     *
     * @return the numberOfFilesSkipped value.
     */
    Integer numberOfFilesSkipped();

    /**
     * Gets the numberOfFilesRestoring property: Number of files restoring.
     *
     * @return the numberOfFilesRestoring value.
     */
    Integer numberOfFilesRestoring();

    /**
     * Gets the numberOfFilesRestored property: Number of files restored.
     *
     * @return the numberOfFilesRestored value.
     */
    Integer numberOfFilesRestored();

    /**
     * Gets the numberOfFilesUnrestorable property: Number of files unrestorable.
     *
     * @return the numberOfFilesUnrestorable value.
     */
    Integer numberOfFilesUnrestorable();

    /**
     * Gets the fullBackupSets property: Full backup sets.
     *
     * @return the fullBackupSets value.
     */
    List<ManagedDatabaseRestoreDetailsBackupSetProperties> fullBackupSets();

    /**
     * Gets the diffBackupSets property: Diff backup sets.
     *
     * @return the diffBackupSets value.
     */
    List<ManagedDatabaseRestoreDetailsBackupSetProperties> diffBackupSets();

    /**
     * Gets the logBackupSets property: Log backup sets.
     *
     * @return the logBackupSets value.
     */
    List<ManagedDatabaseRestoreDetailsBackupSetProperties> logBackupSets();

    /**
     * Gets the unrestorableFiles property: Unrestorable files.
     *
     * @return the unrestorableFiles value.
     */
    List<ManagedDatabaseRestoreDetailsUnrestorableFileProperties> unrestorableFiles();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.ManagedDatabaseRestoreDetailsResultInner
     * object.
     *
     * @return the inner object.
     */
    ManagedDatabaseRestoreDetailsResultInner innerModel();
}

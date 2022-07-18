// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SyncDatabaseMigrationReportingState. */
public final class SyncDatabaseMigrationReportingState
    extends ExpandableStringEnum<SyncDatabaseMigrationReportingState> {
    /** Static value UNDEFINED for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState UNDEFINED = fromString("UNDEFINED");

    /** Static value CONFIGURING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState CONFIGURING = fromString("CONFIGURING");

    /** Static value INITIALIAZING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState INITIALIAZING = fromString("INITIALIAZING");

    /** Static value STARTING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState STARTING = fromString("STARTING");

    /** Static value RUNNING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState RUNNING = fromString("RUNNING");

    /** Static value READY_TO_COMPLETE for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState READY_TO_COMPLETE = fromString("READY_TO_COMPLETE");

    /** Static value COMPLETING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState COMPLETING = fromString("COMPLETING");

    /** Static value COMPLETE for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState COMPLETE = fromString("COMPLETE");

    /** Static value CANCELLING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState CANCELLING = fromString("CANCELLING");

    /** Static value CANCELLED for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState CANCELLED = fromString("CANCELLED");

    /** Static value FAILED for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState FAILED = fromString("FAILED");

    /** Static value VALIDATING for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState VALIDATING = fromString("VALIDATING");

    /** Static value VALIDATION_COMPLETE for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState VALIDATION_COMPLETE = fromString("VALIDATION_COMPLETE");

    /** Static value VALIDATION_FAILED for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState VALIDATION_FAILED = fromString("VALIDATION_FAILED");

    /** Static value RESTORE_IN_PROGRESS for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState RESTORE_IN_PROGRESS = fromString("RESTORE_IN_PROGRESS");

    /** Static value RESTORE_COMPLETED for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState RESTORE_COMPLETED = fromString("RESTORE_COMPLETED");

    /** Static value BACKUP_IN_PROGRESS for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState BACKUP_IN_PROGRESS = fromString("BACKUP_IN_PROGRESS");

    /** Static value BACKUP_COMPLETED for SyncDatabaseMigrationReportingState. */
    public static final SyncDatabaseMigrationReportingState BACKUP_COMPLETED = fromString("BACKUP_COMPLETED");

    /**
     * Creates or finds a SyncDatabaseMigrationReportingState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SyncDatabaseMigrationReportingState.
     */
    @JsonCreator
    public static SyncDatabaseMigrationReportingState fromString(String name) {
        return fromString(name, SyncDatabaseMigrationReportingState.class);
    }

    /**
     * Gets known SyncDatabaseMigrationReportingState values.
     *
     * @return known SyncDatabaseMigrationReportingState values.
     */
    public static Collection<SyncDatabaseMigrationReportingState> values() {
        return values(SyncDatabaseMigrationReportingState.class);
    }
}

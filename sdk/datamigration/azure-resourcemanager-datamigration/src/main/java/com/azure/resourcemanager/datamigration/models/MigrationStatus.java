// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MigrationStatus. */
public final class MigrationStatus extends ExpandableStringEnum<MigrationStatus> {
    /** Static value Default for MigrationStatus. */
    public static final MigrationStatus DEFAULT = fromString("Default");

    /** Static value Connecting for MigrationStatus. */
    public static final MigrationStatus CONNECTING = fromString("Connecting");

    /** Static value SourceAndTargetSelected for MigrationStatus. */
    public static final MigrationStatus SOURCE_AND_TARGET_SELECTED = fromString("SourceAndTargetSelected");

    /** Static value SelectLogins for MigrationStatus. */
    public static final MigrationStatus SELECT_LOGINS = fromString("SelectLogins");

    /** Static value Configured for MigrationStatus. */
    public static final MigrationStatus CONFIGURED = fromString("Configured");

    /** Static value Running for MigrationStatus. */
    public static final MigrationStatus RUNNING = fromString("Running");

    /** Static value Error for MigrationStatus. */
    public static final MigrationStatus ERROR = fromString("Error");

    /** Static value Stopped for MigrationStatus. */
    public static final MigrationStatus STOPPED = fromString("Stopped");

    /** Static value Completed for MigrationStatus. */
    public static final MigrationStatus COMPLETED = fromString("Completed");

    /** Static value CompletedWithWarnings for MigrationStatus. */
    public static final MigrationStatus COMPLETED_WITH_WARNINGS = fromString("CompletedWithWarnings");

    /**
     * Creates or finds a MigrationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MigrationStatus.
     */
    @JsonCreator
    public static MigrationStatus fromString(String name) {
        return fromString(name, MigrationStatus.class);
    }

    /**
     * Gets known MigrationStatus values.
     *
     * @return known MigrationStatus values.
     */
    public static Collection<MigrationStatus> values() {
        return values(MigrationStatus.class);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Backup Configuration. */
@Fluent
public final class BackupConfiguration {
    /*
     * Source location of backups.
     */
    @JsonProperty(value = "sourceLocation")
    private SourceLocation sourceLocation;

    /*
     * Target location for copying backups.
     */
    @JsonProperty(value = "targetLocation")
    private TargetLocation targetLocation;

    /**
     * Get the sourceLocation property: Source location of backups.
     *
     * @return the sourceLocation value.
     */
    public SourceLocation sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the sourceLocation property: Source location of backups.
     *
     * @param sourceLocation the sourceLocation value to set.
     * @return the BackupConfiguration object itself.
     */
    public BackupConfiguration withSourceLocation(SourceLocation sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get the targetLocation property: Target location for copying backups.
     *
     * @return the targetLocation value.
     */
    public TargetLocation targetLocation() {
        return this.targetLocation;
    }

    /**
     * Set the targetLocation property: Target location for copying backups.
     *
     * @param targetLocation the targetLocation value to set.
     * @return the BackupConfiguration object itself.
     */
    public BackupConfiguration withTargetLocation(TargetLocation targetLocation) {
        this.targetLocation = targetLocation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceLocation() != null) {
            sourceLocation().validate();
        }
        if (targetLocation() != null) {
            targetLocation().validate();
        }
    }
}

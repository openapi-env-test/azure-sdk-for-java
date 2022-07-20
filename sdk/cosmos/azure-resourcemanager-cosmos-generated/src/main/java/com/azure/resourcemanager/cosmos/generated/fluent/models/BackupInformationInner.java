// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupInformation;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Backup information of a resource. */
@Immutable
public final class BackupInformationInner {
    /*
     * Information about the status of continuous backups.
     */
    @JsonProperty(value = "continuousBackupInformation", access = JsonProperty.Access.WRITE_ONLY)
    private ContinuousBackupInformation continuousBackupInformation;

    /**
     * Get the continuousBackupInformation property: Information about the status of continuous backups.
     *
     * @return the continuousBackupInformation value.
     */
    public ContinuousBackupInformation continuousBackupInformation() {
        return this.continuousBackupInformation;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (continuousBackupInformation() != null) {
            continuousBackupInformation().validate();
        }
    }
}

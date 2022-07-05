// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Backup Vault Contract for Patch Backup Vault API. */
@Fluent
public final class PatchBackupVaultInput {
    /*
     * Monitoring Settings
     */
    @JsonProperty(value = "monitoringSettings")
    private MonitoringSettings monitoringSettings;

    /**
     * Get the monitoringSettings property: Monitoring Settings.
     *
     * @return the monitoringSettings value.
     */
    public MonitoringSettings monitoringSettings() {
        return this.monitoringSettings;
    }

    /**
     * Set the monitoringSettings property: Monitoring Settings.
     *
     * @param monitoringSettings the monitoringSettings value to set.
     * @return the PatchBackupVaultInput object itself.
     */
    public PatchBackupVaultInput withMonitoringSettings(MonitoringSettings monitoringSettings) {
        this.monitoringSettings = monitoringSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (monitoringSettings() != null) {
            monitoringSettings().validate();
        }
    }
}

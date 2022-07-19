// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The object representing the policy for taking backups on an account. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = BackupPolicy.class)
@JsonTypeName("BackupPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Periodic", value = PeriodicModeBackupPolicy.class),
    @JsonSubTypes.Type(name = "Continuous", value = ContinuousModeBackupPolicy.class)
})
@Fluent
public class BackupPolicy {
    /*
     * The object representing the state of the migration between the backup
     * policies.
     */
    @JsonProperty(value = "migrationState")
    private BackupPolicyMigrationState migrationState;

    /**
     * Get the migrationState property: The object representing the state of the migration between the backup policies.
     *
     * @return the migrationState value.
     */
    public BackupPolicyMigrationState migrationState() {
        return this.migrationState;
    }

    /**
     * Set the migrationState property: The object representing the state of the migration between the backup policies.
     *
     * @param migrationState the migrationState value to set.
     * @return the BackupPolicy object itself.
     */
    public BackupPolicy withMigrationState(BackupPolicyMigrationState migrationState) {
        this.migrationState = migrationState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (migrationState() != null) {
            migrationState().validate();
        }
    }
}

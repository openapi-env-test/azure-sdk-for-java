// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.generated.models.BackupStorageRedundancy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the properties to perform long term retention backup copy operation. */
@Fluent
public final class CopyLongTermRetentionBackupParametersProperties {
    /*
     * The subscription that owns the target server
     */
    @JsonProperty(value = "targetSubscriptionId")
    private String targetSubscriptionId;

    /*
     * The resource group that owns the target server
     */
    @JsonProperty(value = "targetResourceGroup")
    private String targetResourceGroup;

    /*
     * The resource Id of the target server that owns the database
     */
    @JsonProperty(value = "targetServerResourceId")
    private String targetServerResourceId;

    /*
     * The fully qualified domain name of the target server
     */
    @JsonProperty(value = "targetServerFullyQualifiedDomainName")
    private String targetServerFullyQualifiedDomainName;

    /*
     * The name of the database owns the copied backup.
     */
    @JsonProperty(value = "targetDatabaseName")
    private String targetDatabaseName;

    /*
     * The storage redundancy type of the copied backup
     */
    @JsonProperty(value = "targetBackupStorageRedundancy")
    private BackupStorageRedundancy targetBackupStorageRedundancy;

    /** Creates an instance of CopyLongTermRetentionBackupParametersProperties class. */
    public CopyLongTermRetentionBackupParametersProperties() {
    }

    /**
     * Get the targetSubscriptionId property: The subscription that owns the target server.
     *
     * @return the targetSubscriptionId value.
     */
    public String targetSubscriptionId() {
        return this.targetSubscriptionId;
    }

    /**
     * Set the targetSubscriptionId property: The subscription that owns the target server.
     *
     * @param targetSubscriptionId the targetSubscriptionId value to set.
     * @return the CopyLongTermRetentionBackupParametersProperties object itself.
     */
    public CopyLongTermRetentionBackupParametersProperties withTargetSubscriptionId(String targetSubscriptionId) {
        this.targetSubscriptionId = targetSubscriptionId;
        return this;
    }

    /**
     * Get the targetResourceGroup property: The resource group that owns the target server.
     *
     * @return the targetResourceGroup value.
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the targetResourceGroup property: The resource group that owns the target server.
     *
     * @param targetResourceGroup the targetResourceGroup value to set.
     * @return the CopyLongTermRetentionBackupParametersProperties object itself.
     */
    public CopyLongTermRetentionBackupParametersProperties withTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }

    /**
     * Get the targetServerResourceId property: The resource Id of the target server that owns the database.
     *
     * @return the targetServerResourceId value.
     */
    public String targetServerResourceId() {
        return this.targetServerResourceId;
    }

    /**
     * Set the targetServerResourceId property: The resource Id of the target server that owns the database.
     *
     * @param targetServerResourceId the targetServerResourceId value to set.
     * @return the CopyLongTermRetentionBackupParametersProperties object itself.
     */
    public CopyLongTermRetentionBackupParametersProperties withTargetServerResourceId(String targetServerResourceId) {
        this.targetServerResourceId = targetServerResourceId;
        return this;
    }

    /**
     * Get the targetServerFullyQualifiedDomainName property: The fully qualified domain name of the target server.
     *
     * @return the targetServerFullyQualifiedDomainName value.
     */
    public String targetServerFullyQualifiedDomainName() {
        return this.targetServerFullyQualifiedDomainName;
    }

    /**
     * Set the targetServerFullyQualifiedDomainName property: The fully qualified domain name of the target server.
     *
     * @param targetServerFullyQualifiedDomainName the targetServerFullyQualifiedDomainName value to set.
     * @return the CopyLongTermRetentionBackupParametersProperties object itself.
     */
    public CopyLongTermRetentionBackupParametersProperties withTargetServerFullyQualifiedDomainName(
        String targetServerFullyQualifiedDomainName) {
        this.targetServerFullyQualifiedDomainName = targetServerFullyQualifiedDomainName;
        return this;
    }

    /**
     * Get the targetDatabaseName property: The name of the database owns the copied backup.
     *
     * @return the targetDatabaseName value.
     */
    public String targetDatabaseName() {
        return this.targetDatabaseName;
    }

    /**
     * Set the targetDatabaseName property: The name of the database owns the copied backup.
     *
     * @param targetDatabaseName the targetDatabaseName value to set.
     * @return the CopyLongTermRetentionBackupParametersProperties object itself.
     */
    public CopyLongTermRetentionBackupParametersProperties withTargetDatabaseName(String targetDatabaseName) {
        this.targetDatabaseName = targetDatabaseName;
        return this;
    }

    /**
     * Get the targetBackupStorageRedundancy property: The storage redundancy type of the copied backup.
     *
     * @return the targetBackupStorageRedundancy value.
     */
    public BackupStorageRedundancy targetBackupStorageRedundancy() {
        return this.targetBackupStorageRedundancy;
    }

    /**
     * Set the targetBackupStorageRedundancy property: The storage redundancy type of the copied backup.
     *
     * @param targetBackupStorageRedundancy the targetBackupStorageRedundancy value to set.
     * @return the CopyLongTermRetentionBackupParametersProperties object itself.
     */
    public CopyLongTermRetentionBackupParametersProperties withTargetBackupStorageRedundancy(
        BackupStorageRedundancy targetBackupStorageRedundancy) {
        this.targetBackupStorageRedundancy = targetBackupStorageRedundancy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

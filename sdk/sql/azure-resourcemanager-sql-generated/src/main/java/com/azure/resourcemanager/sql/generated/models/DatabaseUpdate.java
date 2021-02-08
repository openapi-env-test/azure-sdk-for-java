// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** A database resource. */
@JsonFlatten
@Fluent
public class DatabaseUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseUpdate.class);

    /*
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Specifies the mode of database creation.
     *
     * Default: regular database creation.
     *
     * Copy: creates a database as a copy of an existing database.
     * sourceDatabaseId must be specified as the resource ID of the source
     * database.
     *
     * Secondary: creates a database as a secondary replica of an existing
     * database. sourceDatabaseId must be specified as the resource ID of the
     * existing primary database.
     *
     * PointInTimeRestore: Creates a database by restoring a point in time
     * backup of an existing database. sourceDatabaseId must be specified as
     * the resource ID of the existing database, and restorePointInTime must be
     * specified.
     *
     * Recovery: Creates a database by restoring a geo-replicated backup.
     * sourceDatabaseId must be specified as the recoverable database resource
     * ID to restore.
     *
     * Restore: Creates a database by restoring a backup of a deleted database.
     * sourceDatabaseId must be specified. If sourceDatabaseId is the
     * database's original resource ID, then sourceDatabaseDeletionDate must be
     * specified. Otherwise sourceDatabaseId must be the restorable dropped
     * database resource ID and sourceDatabaseDeletionDate is ignored.
     * restorePointInTime may also be specified to restore from an earlier
     * point in time.
     *
     * RestoreLongTermRetentionBackup: Creates a database by restoring from a
     * long term retention vault. recoveryServicesRecoveryPointResourceId must
     * be specified as the recovery point resource ID.
     *
     * Copy, Secondary, and RestoreLongTermRetentionBackup are not supported
     * for DataWarehouse edition.
     */
    @JsonProperty(value = "properties.createMode")
    private CreateMode createMode;

    /*
     * The collation of the database.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /*
     * The max size of the database expressed in bytes.
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /*
     * The name of the sample schema to apply when creating this database.
     */
    @JsonProperty(value = "properties.sampleName")
    private SampleName sampleName;

    /*
     * The resource identifier of the elastic pool containing this database.
     */
    @JsonProperty(value = "properties.elasticPoolId")
    private String elasticPoolId;

    /*
     * The resource identifier of the source database associated with create
     * operation of this database.
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /*
     * The status of the database.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseStatus status;

    /*
     * The ID of the database.
     */
    @JsonProperty(value = "properties.databaseId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID databaseId;

    /*
     * The creation date of the database (ISO8601 format).
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The current service level objective name of the database.
     */
    @JsonProperty(value = "properties.currentServiceObjectiveName", access = JsonProperty.Access.WRITE_ONLY)
    private String currentServiceObjectiveName;

    /*
     * The requested service level objective name of the database.
     */
    @JsonProperty(value = "properties.requestedServiceObjectiveName", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedServiceObjectiveName;

    /*
     * The default secondary region for this database.
     */
    @JsonProperty(value = "properties.defaultSecondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSecondaryLocation;

    /*
     * Failover Group resource identifier that this database belongs to.
     */
    @JsonProperty(value = "properties.failoverGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String failoverGroupId;

    /*
     * Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private OffsetDateTime restorePointInTime;

    /*
     * Specifies the time that the database was deleted.
     */
    @JsonProperty(value = "properties.sourceDatabaseDeletionDate")
    private OffsetDateTime sourceDatabaseDeletionDate;

    /*
     * The resource identifier of the recovery point associated with create
     * operation of this database.
     */
    @JsonProperty(value = "properties.recoveryServicesRecoveryPointId")
    private String recoveryServicesRecoveryPointId;

    /*
     * The resource identifier of the long term retention backup associated
     * with create operation of this database.
     */
    @JsonProperty(value = "properties.longTermRetentionBackupResourceId")
    private String longTermRetentionBackupResourceId;

    /*
     * The resource identifier of the recoverable database associated with
     * create operation of this database.
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /*
     * The resource identifier of the restorable dropped database associated
     * with create operation of this database.
     */
    @JsonProperty(value = "properties.restorableDroppedDatabaseId")
    private String restorableDroppedDatabaseId;

    /*
     * Collation of the metadata catalog.
     */
    @JsonProperty(value = "properties.catalogCollation")
    private CatalogCollationType catalogCollation;

    /*
     * Whether or not this database is zone redundant, which means the replicas
     * of this database will be spread across multiple availability zones.
     */
    @JsonProperty(value = "properties.zoneRedundant")
    private Boolean zoneRedundant;

    /*
     * The license type to apply for this database. `LicenseIncluded` if you
     * need a license, or `BasePrice` if you have a license and are eligible
     * for the Azure Hybrid Benefit.
     */
    @JsonProperty(value = "properties.licenseType")
    private DatabaseLicenseType licenseType;

    /*
     * The max log size for this database.
     */
    @JsonProperty(value = "properties.maxLogSizeBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long maxLogSizeBytes;

    /*
     * This records the earliest start date and time that restore is available
     * for this database (ISO8601 format).
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestoreDate;

    /*
     * The state of read-only routing. If enabled, connections that have
     * application intent set to readonly in their connection string may be
     * routed to a readonly secondary replica in the same region.
     */
    @JsonProperty(value = "properties.readScale")
    private DatabaseReadScale readScale;

    /*
     * The number of readonly secondary replicas associated with the database.
     */
    @JsonProperty(value = "properties.readReplicaCount")
    private Integer readReplicaCount;

    /*
     * The name and tier of the SKU.
     */
    @JsonProperty(value = "properties.currentSku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku currentSku;

    /*
     * Time in minutes after which database is automatically paused. A value of
     * -1 means that automatic pause is disabled
     */
    @JsonProperty(value = "properties.autoPauseDelay")
    private Integer autoPauseDelay;

    /*
     * The storage account type used to store backups for this database.
     */
    @JsonProperty(value = "properties.storageAccountType")
    private StorageAccountType storageAccountType;

    /*
     * Minimal capacity that database will always have allocated, if not paused
     */
    @JsonProperty(value = "properties.minCapacity")
    private Double minCapacity;

    /*
     * The date when database was paused by user configuration or
     * action(ISO8601 format). Null if the database is ready.
     */
    @JsonProperty(value = "properties.pausedDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime pausedDate;

    /*
     * The date when database was resumed by user action or database login
     * (ISO8601 format). Null if the database is paused.
     */
    @JsonProperty(value = "properties.resumedDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime resumedDate;

    /**
     * Get the sku property: The name and tier of the SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The name and tier of the SKU.
     *
     * @param sku the sku value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the createMode property: Specifies the mode of database creation.
     *
     * <p>Default: regular database creation.
     *
     * <p>Copy: creates a database as a copy of an existing database. sourceDatabaseId must be specified as the resource
     * ID of the source database.
     *
     * <p>Secondary: creates a database as a secondary replica of an existing database. sourceDatabaseId must be
     * specified as the resource ID of the existing primary database.
     *
     * <p>PointInTimeRestore: Creates a database by restoring a point in time backup of an existing database.
     * sourceDatabaseId must be specified as the resource ID of the existing database, and restorePointInTime must be
     * specified.
     *
     * <p>Recovery: Creates a database by restoring a geo-replicated backup. sourceDatabaseId must be specified as the
     * recoverable database resource ID to restore.
     *
     * <p>Restore: Creates a database by restoring a backup of a deleted database. sourceDatabaseId must be specified.
     * If sourceDatabaseId is the database's original resource ID, then sourceDatabaseDeletionDate must be specified.
     * Otherwise sourceDatabaseId must be the restorable dropped database resource ID and sourceDatabaseDeletionDate is
     * ignored. restorePointInTime may also be specified to restore from an earlier point in time.
     *
     * <p>RestoreLongTermRetentionBackup: Creates a database by restoring from a long term retention vault.
     * recoveryServicesRecoveryPointResourceId must be specified as the recovery point resource ID.
     *
     * <p>Copy, Secondary, and RestoreLongTermRetentionBackup are not supported for DataWarehouse edition.
     *
     * @return the createMode value.
     */
    public CreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Specifies the mode of database creation.
     *
     * <p>Default: regular database creation.
     *
     * <p>Copy: creates a database as a copy of an existing database. sourceDatabaseId must be specified as the resource
     * ID of the source database.
     *
     * <p>Secondary: creates a database as a secondary replica of an existing database. sourceDatabaseId must be
     * specified as the resource ID of the existing primary database.
     *
     * <p>PointInTimeRestore: Creates a database by restoring a point in time backup of an existing database.
     * sourceDatabaseId must be specified as the resource ID of the existing database, and restorePointInTime must be
     * specified.
     *
     * <p>Recovery: Creates a database by restoring a geo-replicated backup. sourceDatabaseId must be specified as the
     * recoverable database resource ID to restore.
     *
     * <p>Restore: Creates a database by restoring a backup of a deleted database. sourceDatabaseId must be specified.
     * If sourceDatabaseId is the database's original resource ID, then sourceDatabaseDeletionDate must be specified.
     * Otherwise sourceDatabaseId must be the restorable dropped database resource ID and sourceDatabaseDeletionDate is
     * ignored. restorePointInTime may also be specified to restore from an earlier point in time.
     *
     * <p>RestoreLongTermRetentionBackup: Creates a database by restoring from a long term retention vault.
     * recoveryServicesRecoveryPointResourceId must be specified as the recovery point resource ID.
     *
     * <p>Copy, Secondary, and RestoreLongTermRetentionBackup are not supported for DataWarehouse edition.
     *
     * @param createMode the createMode value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withCreateMode(CreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the collation property: The collation of the database.
     *
     * @return the collation value.
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation property: The collation of the database.
     *
     * @param collation the collation value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the maxSizeBytes property: The max size of the database expressed in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: The max size of the database expressed in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the sampleName property: The name of the sample schema to apply when creating this database.
     *
     * @return the sampleName value.
     */
    public SampleName sampleName() {
        return this.sampleName;
    }

    /**
     * Set the sampleName property: The name of the sample schema to apply when creating this database.
     *
     * @param sampleName the sampleName value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSampleName(SampleName sampleName) {
        this.sampleName = sampleName;
        return this;
    }

    /**
     * Get the elasticPoolId property: The resource identifier of the elastic pool containing this database.
     *
     * @return the elasticPoolId value.
     */
    public String elasticPoolId() {
        return this.elasticPoolId;
    }

    /**
     * Set the elasticPoolId property: The resource identifier of the elastic pool containing this database.
     *
     * @param elasticPoolId the elasticPoolId value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withElasticPoolId(String elasticPoolId) {
        this.elasticPoolId = elasticPoolId;
        return this;
    }

    /**
     * Get the sourceDatabaseId property: The resource identifier of the source database associated with create
     * operation of this database.
     *
     * @return the sourceDatabaseId value.
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set the sourceDatabaseId property: The resource identifier of the source database associated with create
     * operation of this database.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get the status property: The status of the database.
     *
     * @return the status value.
     */
    public DatabaseStatus status() {
        return this.status;
    }

    /**
     * Get the databaseId property: The ID of the database.
     *
     * @return the databaseId value.
     */
    public UUID databaseId() {
        return this.databaseId;
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the currentServiceObjectiveName property: The current service level objective name of the database.
     *
     * @return the currentServiceObjectiveName value.
     */
    public String currentServiceObjectiveName() {
        return this.currentServiceObjectiveName;
    }

    /**
     * Get the requestedServiceObjectiveName property: The requested service level objective name of the database.
     *
     * @return the requestedServiceObjectiveName value.
     */
    public String requestedServiceObjectiveName() {
        return this.requestedServiceObjectiveName;
    }

    /**
     * Get the defaultSecondaryLocation property: The default secondary region for this database.
     *
     * @return the defaultSecondaryLocation value.
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }

    /**
     * Get the failoverGroupId property: Failover Group resource identifier that this database belongs to.
     *
     * @return the failoverGroupId value.
     */
    public String failoverGroupId() {
        return this.failoverGroupId;
    }

    /**
     * Get the restorePointInTime property: Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     *
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Specifies the point in time (ISO8601 format) of the source database that
     * will be restored to create the new database.
     *
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the sourceDatabaseDeletionDate property: Specifies the time that the database was deleted.
     *
     * @return the sourceDatabaseDeletionDate value.
     */
    public OffsetDateTime sourceDatabaseDeletionDate() {
        return this.sourceDatabaseDeletionDate;
    }

    /**
     * Set the sourceDatabaseDeletionDate property: Specifies the time that the database was deleted.
     *
     * @param sourceDatabaseDeletionDate the sourceDatabaseDeletionDate value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSourceDatabaseDeletionDate(OffsetDateTime sourceDatabaseDeletionDate) {
        this.sourceDatabaseDeletionDate = sourceDatabaseDeletionDate;
        return this;
    }

    /**
     * Get the recoveryServicesRecoveryPointId property: The resource identifier of the recovery point associated with
     * create operation of this database.
     *
     * @return the recoveryServicesRecoveryPointId value.
     */
    public String recoveryServicesRecoveryPointId() {
        return this.recoveryServicesRecoveryPointId;
    }

    /**
     * Set the recoveryServicesRecoveryPointId property: The resource identifier of the recovery point associated with
     * create operation of this database.
     *
     * @param recoveryServicesRecoveryPointId the recoveryServicesRecoveryPointId value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRecoveryServicesRecoveryPointId(String recoveryServicesRecoveryPointId) {
        this.recoveryServicesRecoveryPointId = recoveryServicesRecoveryPointId;
        return this;
    }

    /**
     * Get the longTermRetentionBackupResourceId property: The resource identifier of the long term retention backup
     * associated with create operation of this database.
     *
     * @return the longTermRetentionBackupResourceId value.
     */
    public String longTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId;
    }

    /**
     * Set the longTermRetentionBackupResourceId property: The resource identifier of the long term retention backup
     * associated with create operation of this database.
     *
     * @param longTermRetentionBackupResourceId the longTermRetentionBackupResourceId value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
        return this;
    }

    /**
     * Get the recoverableDatabaseId property: The resource identifier of the recoverable database associated with
     * create operation of this database.
     *
     * @return the recoverableDatabaseId value.
     */
    public String recoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set the recoverableDatabaseId property: The resource identifier of the recoverable database associated with
     * create operation of this database.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

    /**
     * Get the restorableDroppedDatabaseId property: The resource identifier of the restorable dropped database
     * associated with create operation of this database.
     *
     * @return the restorableDroppedDatabaseId value.
     */
    public String restorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId;
    }

    /**
     * Set the restorableDroppedDatabaseId property: The resource identifier of the restorable dropped database
     * associated with create operation of this database.
     *
     * @param restorableDroppedDatabaseId the restorableDroppedDatabaseId value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        return this;
    }

    /**
     * Get the catalogCollation property: Collation of the metadata catalog.
     *
     * @return the catalogCollation value.
     */
    public CatalogCollationType catalogCollation() {
        return this.catalogCollation;
    }

    /**
     * Set the catalogCollation property: Collation of the metadata catalog.
     *
     * @param catalogCollation the catalogCollation value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withCatalogCollation(CatalogCollationType catalogCollation) {
        this.catalogCollation = catalogCollation;
        return this;
    }

    /**
     * Get the zoneRedundant property: Whether or not this database is zone redundant, which means the replicas of this
     * database will be spread across multiple availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Whether or not this database is zone redundant, which means the replicas of this
     * database will be spread across multiple availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the licenseType property: The license type to apply for this database. `LicenseIncluded` if you need a
     * license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     *
     * @return the licenseType value.
     */
    public DatabaseLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type to apply for this database. `LicenseIncluded` if you need a
     * license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     *
     * @param licenseType the licenseType value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withLicenseType(DatabaseLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the maxLogSizeBytes property: The max log size for this database.
     *
     * @return the maxLogSizeBytes value.
     */
    public Long maxLogSizeBytes() {
        return this.maxLogSizeBytes;
    }

    /**
     * Get the earliestRestoreDate property: This records the earliest start date and time that restore is available for
     * this database (ISO8601 format).
     *
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

    /**
     * Get the readScale property: The state of read-only routing. If enabled, connections that have application intent
     * set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     *
     * @return the readScale value.
     */
    public DatabaseReadScale readScale() {
        return this.readScale;
    }

    /**
     * Set the readScale property: The state of read-only routing. If enabled, connections that have application intent
     * set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     *
     * @param readScale the readScale value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withReadScale(DatabaseReadScale readScale) {
        this.readScale = readScale;
        return this;
    }

    /**
     * Get the readReplicaCount property: The number of readonly secondary replicas associated with the database.
     *
     * @return the readReplicaCount value.
     */
    public Integer readReplicaCount() {
        return this.readReplicaCount;
    }

    /**
     * Set the readReplicaCount property: The number of readonly secondary replicas associated with the database.
     *
     * @param readReplicaCount the readReplicaCount value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withReadReplicaCount(Integer readReplicaCount) {
        this.readReplicaCount = readReplicaCount;
        return this;
    }

    /**
     * Get the currentSku property: The name and tier of the SKU.
     *
     * @return the currentSku value.
     */
    public Sku currentSku() {
        return this.currentSku;
    }

    /**
     * Get the autoPauseDelay property: Time in minutes after which database is automatically paused. A value of -1
     * means that automatic pause is disabled.
     *
     * @return the autoPauseDelay value.
     */
    public Integer autoPauseDelay() {
        return this.autoPauseDelay;
    }

    /**
     * Set the autoPauseDelay property: Time in minutes after which database is automatically paused. A value of -1
     * means that automatic pause is disabled.
     *
     * @param autoPauseDelay the autoPauseDelay value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withAutoPauseDelay(Integer autoPauseDelay) {
        this.autoPauseDelay = autoPauseDelay;
        return this;
    }

    /**
     * Get the storageAccountType property: The storage account type used to store backups for this database.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: The storage account type used to store backups for this database.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Get the minCapacity property: Minimal capacity that database will always have allocated, if not paused.
     *
     * @return the minCapacity value.
     */
    public Double minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: Minimal capacity that database will always have allocated, if not paused.
     *
     * @param minCapacity the minCapacity value to set.
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withMinCapacity(Double minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the pausedDate property: The date when database was paused by user configuration or action(ISO8601 format).
     * Null if the database is ready.
     *
     * @return the pausedDate value.
     */
    public OffsetDateTime pausedDate() {
        return this.pausedDate;
    }

    /**
     * Get the resumedDate property: The date when database was resumed by user action or database login (ISO8601
     * format). Null if the database is paused.
     *
     * @return the resumedDate value.
     */
    public OffsetDateTime resumedDate() {
        return this.resumedDate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (currentSku() != null) {
            currentSku().validate();
        }
    }
}

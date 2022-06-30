// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.generated;

import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicyDefinition;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicyFilter;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicyName;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicyRule;
import com.azure.resourcemanager.storage.generated.models.BlobInventoryPolicySchema;
import com.azure.resourcemanager.storage.generated.models.Format;
import com.azure.resourcemanager.storage.generated.models.InventoryRuleType;
import com.azure.resourcemanager.storage.generated.models.ObjectType;
import com.azure.resourcemanager.storage.generated.models.Schedule;
import java.util.Arrays;

/** Samples for BlobInventoryPolicies CreateOrUpdate. */
public final class BlobInventoryPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForNonHnsAccount.json
     */
    /**
     * Sample code: StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForNonHnsAccount.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void storageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForNonHnsAccount(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobInventoryPolicies()
            .define(BlobInventoryPolicyName.DEFAULT)
            .withExistingStorageAccount("res7687", "sto9699")
            .withPolicy(
                new BlobInventoryPolicySchema()
                    .withEnabled(true)
                    .withType(InventoryRuleType.INVENTORY)
                    .withRules(
                        Arrays
                            .asList(
                                new BlobInventoryPolicyRule()
                                    .withEnabled(true)
                                    .withName("inventoryPolicyRule1")
                                    .withDestination("container1")
                                    .withDefinition(
                                        new BlobInventoryPolicyDefinition()
                                            .withFilters(
                                                new BlobInventoryPolicyFilter()
                                                    .withPrefixMatch(
                                                        Arrays.asList("inventoryprefix1", "inventoryprefix2"))
                                                    .withExcludePrefix(
                                                        Arrays.asList("excludeprefix1", "excludeprefix2"))
                                                    .withBlobTypes(Arrays.asList("blockBlob", "appendBlob", "pageBlob"))
                                                    .withIncludeBlobVersions(true)
                                                    .withIncludeSnapshots(true)
                                                    .withIncludeDeleted(true))
                                            .withFormat(Format.CSV)
                                            .withSchedule(Schedule.DAILY)
                                            .withObjectType(ObjectType.BLOB)
                                            .withSchemaFields(
                                                Arrays
                                                    .asList(
                                                        "Name",
                                                        "Creation-Time",
                                                        "Last-Modified",
                                                        "Content-Length",
                                                        "Content-MD5",
                                                        "BlobType",
                                                        "AccessTier",
                                                        "AccessTierChangeTime",
                                                        "Snapshot",
                                                        "VersionId",
                                                        "IsCurrentVersion",
                                                        "Tags",
                                                        "ContentType",
                                                        "ContentEncoding",
                                                        "ContentLanguage",
                                                        "ContentCRC64",
                                                        "CacheControl",
                                                        "Metadata",
                                                        "Deleted",
                                                        "RemainingRetentionDays"))),
                                new BlobInventoryPolicyRule()
                                    .withEnabled(true)
                                    .withName("inventoryPolicyRule2")
                                    .withDestination("container2")
                                    .withDefinition(
                                        new BlobInventoryPolicyDefinition()
                                            .withFormat(Format.PARQUET)
                                            .withSchedule(Schedule.WEEKLY)
                                            .withObjectType(ObjectType.CONTAINER)
                                            .withSchemaFields(
                                                Arrays
                                                    .asList(
                                                        "Name",
                                                        "Last-Modified",
                                                        "Metadata",
                                                        "LeaseStatus",
                                                        "LeaseState",
                                                        "LeaseDuration",
                                                        "PublicAccess",
                                                        "HasImmutabilityPolicy",
                                                        "HasLegalHold",
                                                        "Etag",
                                                        "DefaultEncryptionScope",
                                                        "DenyEncryptionScopeOverride",
                                                        "ImmutableStorageWithVersioningEnabled",
                                                        "Deleted",
                                                        "Version",
                                                        "DeletedTime",
                                                        "RemainingRetentionDays"))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/StorageAccountSetBlobInventoryPolicy.json
     */
    /**
     * Sample code: StorageAccountSetBlobInventoryPolicy.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void storageAccountSetBlobInventoryPolicy(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobInventoryPolicies()
            .define(BlobInventoryPolicyName.DEFAULT)
            .withExistingStorageAccount("res7687", "sto9699")
            .withPolicy(
                new BlobInventoryPolicySchema()
                    .withEnabled(true)
                    .withType(InventoryRuleType.INVENTORY)
                    .withRules(
                        Arrays
                            .asList(
                                new BlobInventoryPolicyRule()
                                    .withEnabled(true)
                                    .withName("inventoryPolicyRule1")
                                    .withDestination("container1")
                                    .withDefinition(
                                        new BlobInventoryPolicyDefinition()
                                            .withFilters(
                                                new BlobInventoryPolicyFilter()
                                                    .withPrefixMatch(
                                                        Arrays.asList("inventoryprefix1", "inventoryprefix2"))
                                                    .withExcludePrefix(
                                                        Arrays.asList("excludeprefix1", "excludeprefix2"))
                                                    .withBlobTypes(Arrays.asList("blockBlob", "appendBlob", "pageBlob"))
                                                    .withIncludeBlobVersions(true)
                                                    .withIncludeSnapshots(true))
                                            .withFormat(Format.CSV)
                                            .withSchedule(Schedule.DAILY)
                                            .withObjectType(ObjectType.BLOB)
                                            .withSchemaFields(
                                                Arrays
                                                    .asList(
                                                        "Name",
                                                        "Creation-Time",
                                                        "Last-Modified",
                                                        "Content-Length",
                                                        "Content-MD5",
                                                        "BlobType",
                                                        "AccessTier",
                                                        "AccessTierChangeTime",
                                                        "Snapshot",
                                                        "VersionId",
                                                        "IsCurrentVersion",
                                                        "Metadata"))),
                                new BlobInventoryPolicyRule()
                                    .withEnabled(true)
                                    .withName("inventoryPolicyRule2")
                                    .withDestination("container2")
                                    .withDefinition(
                                        new BlobInventoryPolicyDefinition()
                                            .withFormat(Format.PARQUET)
                                            .withSchedule(Schedule.WEEKLY)
                                            .withObjectType(ObjectType.CONTAINER)
                                            .withSchemaFields(
                                                Arrays
                                                    .asList(
                                                        "Name",
                                                        "Last-Modified",
                                                        "Metadata",
                                                        "LeaseStatus",
                                                        "LeaseState",
                                                        "LeaseDuration",
                                                        "PublicAccess",
                                                        "HasImmutabilityPolicy",
                                                        "HasLegalHold"))))))
            .create();
    }

    /*
     * x-ms-original-file: specification/storage/resource-manager/Microsoft.Storage/stable/2021-09-01/examples/StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForHnsAccount.json
     */
    /**
     * Sample code: StorageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForHnsAccount.
     *
     * @param manager Entry point to StorageManager.
     */
    public static void storageAccountSetBlobInventoryPolicyIncludeDeleteAndNewSchemaForHnsAccount(
        com.azure.resourcemanager.storage.generated.StorageManager manager) {
        manager
            .blobInventoryPolicies()
            .define(BlobInventoryPolicyName.DEFAULT)
            .withExistingStorageAccount("res7687", "sto9699")
            .withPolicy(
                new BlobInventoryPolicySchema()
                    .withEnabled(true)
                    .withType(InventoryRuleType.INVENTORY)
                    .withRules(
                        Arrays
                            .asList(
                                new BlobInventoryPolicyRule()
                                    .withEnabled(true)
                                    .withName("inventoryPolicyRule1")
                                    .withDestination("container1")
                                    .withDefinition(
                                        new BlobInventoryPolicyDefinition()
                                            .withFilters(
                                                new BlobInventoryPolicyFilter()
                                                    .withPrefixMatch(
                                                        Arrays.asList("inventoryprefix1", "inventoryprefix2"))
                                                    .withExcludePrefix(
                                                        Arrays.asList("excludeprefix1", "excludeprefix2"))
                                                    .withBlobTypes(Arrays.asList("blockBlob", "appendBlob", "pageBlob"))
                                                    .withIncludeBlobVersions(true)
                                                    .withIncludeSnapshots(true)
                                                    .withIncludeDeleted(true))
                                            .withFormat(Format.CSV)
                                            .withSchedule(Schedule.DAILY)
                                            .withObjectType(ObjectType.BLOB)
                                            .withSchemaFields(
                                                Arrays
                                                    .asList(
                                                        "Name",
                                                        "Creation-Time",
                                                        "Last-Modified",
                                                        "Content-Length",
                                                        "Content-MD5",
                                                        "BlobType",
                                                        "AccessTier",
                                                        "AccessTierChangeTime",
                                                        "Snapshot",
                                                        "VersionId",
                                                        "IsCurrentVersion",
                                                        "ContentType",
                                                        "ContentEncoding",
                                                        "ContentLanguage",
                                                        "ContentCRC64",
                                                        "CacheControl",
                                                        "Metadata",
                                                        "DeletionId",
                                                        "Deleted",
                                                        "DeletedTime",
                                                        "RemainingRetentionDays"))),
                                new BlobInventoryPolicyRule()
                                    .withEnabled(true)
                                    .withName("inventoryPolicyRule2")
                                    .withDestination("container2")
                                    .withDefinition(
                                        new BlobInventoryPolicyDefinition()
                                            .withFormat(Format.PARQUET)
                                            .withSchedule(Schedule.WEEKLY)
                                            .withObjectType(ObjectType.CONTAINER)
                                            .withSchemaFields(
                                                Arrays
                                                    .asList(
                                                        "Name",
                                                        "Last-Modified",
                                                        "Metadata",
                                                        "LeaseStatus",
                                                        "LeaseState",
                                                        "LeaseDuration",
                                                        "PublicAccess",
                                                        "HasImmutabilityPolicy",
                                                        "HasLegalHold",
                                                        "Etag",
                                                        "DefaultEncryptionScope",
                                                        "DenyEncryptionScopeOverride",
                                                        "ImmutableStorageWithVersioningEnabled",
                                                        "Deleted",
                                                        "Version",
                                                        "DeletedTime",
                                                        "RemainingRetentionDays"))))))
            .create();
    }
}

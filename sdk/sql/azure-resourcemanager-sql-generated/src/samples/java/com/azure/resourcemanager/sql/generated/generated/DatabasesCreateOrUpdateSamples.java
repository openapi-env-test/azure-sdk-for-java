// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.generated;

import com.azure.resourcemanager.sql.generated.models.BackupStorageRedundancy;
import com.azure.resourcemanager.sql.generated.models.CreateMode;
import com.azure.resourcemanager.sql.generated.models.SecondaryType;
import com.azure.resourcemanager.sql.generated.models.Sku;
import java.time.OffsetDateTime;

/** Samples for Databases CreateOrUpdate. */
public final class DatabasesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseConfiguredBackupStorageRedundancy.json
     */
    /**
     * Sample code: Creates a database with specified backup storage redundancy.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseWithSpecifiedBackupStorageRedundancy(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withRequestedBackupStorageRedundancy(BackupStorageRedundancy.ZONE)
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseDefaultMode.json
     */
    /**
     * Sample code: Creates a database with default mode.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseWithDefaultMode(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("S0").withTier("Standard"))
            .withCreateMode(CreateMode.DEFAULT)
            .withCollation("SQL_Latin1_General_CP1_CI_AS")
            .withMaxSizeBytes(1073741824L)
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateVCoreDatabaseByServiceObjective.json
     */
    /**
     * Sample code: Creates a VCore database by specifying service objective name.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsAVCoreDatabaseBySpecifyingServiceObjectiveName(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("BC").withFamily("Gen4").withCapacity(2))
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseMin.json
     */
    /**
     * Sample code: Creates a database with minimum number of parameters.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseWithMinimumNumberOfParameters(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseStandbyMode.json
     */
    /**
     * Sample code: Creates a database as a standby secondary.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseAsAStandbySecondary(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("S0").withTier("Standard"))
            .withCreateMode(CreateMode.SECONDARY)
            .withSourceDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-NorthEurope/providers/Microsoft.Sql/servers/testsvr1/databases/testdb")
            .withSecondaryType(SecondaryType.STANDBY)
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDwDatabaseCrossSubscriptionRecovery.json
     */
    /**
     * Sample code: Creates a data warehouse database as a cross-subscription restore from a geo-backup.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADataWarehouseDatabaseAsACrossSubscriptionRestoreFromAGeoBackup(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdw")
            .withRegion("westus")
            .withExistingServer("Default-SQL-WestUS", "testsvr")
            .withCreateMode(CreateMode.RECOVERY)
            .withSourceResourceId(
                "/subscriptions/55555555-6666-7777-8888-999999999999/resourceGroups/Default-SQL-EastUS/providers/Microsoft.Sql/servers/srcsvr/recoverabledatabases/srcdw")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseMaintenanceConfiguration.json
     */
    /**
     * Sample code: Creates a database with preferred maintenance window.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseWithPreferredMaintenanceWindow(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("S2").withTier("Standard"))
            .withCreateMode(CreateMode.DEFAULT)
            .withCollation("SQL_Latin1_General_CP1_CI_AS")
            .withMaxSizeBytes(1073741824L)
            .withMaintenanceConfigurationId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/providers/Microsoft.Maintenance/publicMaintenanceConfigurations/SQL_SouthEastAsia_1")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseCopyMode.json
     */
    /**
     * Sample code: Creates a database as a copy.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseAsACopy(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("dbcopy")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("S0").withTier("Standard"))
            .withCreateMode(CreateMode.COPY)
            .withSourceDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/testsvr/databases/testdb")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabasePITRMode.json
     */
    /**
     * Sample code: Creates a database from PointInTimeRestore.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseFromPointInTimeRestore(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("dbpitr")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
            .withSourceDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-SoutheastAsia/providers/Microsoft.Sql/servers/testsvr/databases/testdb")
            .withRestorePointInTime(OffsetDateTime.parse("2020-10-22T05:35:31.503Z"))
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseLedger.json
     */
    /**
     * Sample code: Creates a database with ledger on.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseWithLedgerOn(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withIsLedgerOn(true)
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDwDatabaseCrossSubscriptionPITR.json
     */
    /**
     * Sample code: Creates a data warehouse database as a cross-subscription restore from a restore point of an
     * existing database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADataWarehouseDatabaseAsACrossSubscriptionRestoreFromARestorePointOfAnExistingDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdw")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
            .withRestorePointInTime(OffsetDateTime.parse("2022-01-22T05:35:31.503Z"))
            .withSourceResourceId(
                "/subscriptions/55555555-6666-7777-8888-999999999999/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/srcsvr/databases/srcdw")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateVCoreDatabaseBySkuNameCapacity.json
     */
    /**
     * Sample code: Creates a VCore database by specifying sku name and capacity.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsAVCoreDatabaseBySpecifyingSkuNameAndCapacity(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("BC_Gen4").withCapacity(2))
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDwDatabaseCrossSubscriptionRestore.json
     */
    /**
     * Sample code: Creates a data warehouse database as a cross-subscription restore from a backup of a dropped
     * database.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADataWarehouseDatabaseAsACrossSubscriptionRestoreFromABackupOfADroppedDatabase(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdw")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withCreateMode(CreateMode.RESTORE)
            .withSourceResourceId(
                "/subscriptions/55555555-6666-7777-8888-999999999999/resourceGroups/Default-SQL-SouthEastAsia/providers/Microsoft.Sql/servers/srcsvr/restorableDroppedDatabases/srcdw,131403269876900000")
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseNamedReplica.json
     */
    /**
     * Sample code: Creates a database as named replica secondary.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseAsNamedReplicaSecondary(
        com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("HS_Gen4").withTier("Hyperscale").withCapacity(2))
            .withCreateMode(CreateMode.SECONDARY)
            .withSourceDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-NorthEurope/providers/Microsoft.Sql/servers/testsvr1/databases/primarydb")
            .withSecondaryType(SecondaryType.NAMED)
            .create();
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2022-02-01-preview/examples/CreateDatabaseSecondaryMode.json
     */
    /**
     * Sample code: Creates a database as an on-line secondary.
     *
     * @param manager Entry point to SqlManager.
     */
    public static void createsADatabaseAsAnOnLineSecondary(com.azure.resourcemanager.sql.generated.SqlManager manager) {
        manager
            .databases()
            .define("testdb")
            .withRegion("southeastasia")
            .withExistingServer("Default-SQL-SouthEastAsia", "testsvr")
            .withSku(new Sku().withName("S0").withTier("Standard"))
            .withCreateMode(CreateMode.SECONDARY)
            .withSourceDatabaseId(
                "/subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/Default-SQL-NorthEurope/providers/Microsoft.Sql/servers/testsvr1/databases/testdb")
            .withSecondaryType(SecondaryType.GEO)
            .create();
    }
}

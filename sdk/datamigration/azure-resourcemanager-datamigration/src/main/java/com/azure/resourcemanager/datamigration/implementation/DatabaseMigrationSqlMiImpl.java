// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datamigration.fluent.models.DatabaseMigrationSqlMiInner;
import com.azure.resourcemanager.datamigration.models.DatabaseMigrationPropertiesSqlMi;
import com.azure.resourcemanager.datamigration.models.DatabaseMigrationSqlMi;
import com.azure.resourcemanager.datamigration.models.MigrationOperationInput;
import java.util.UUID;

public final class DatabaseMigrationSqlMiImpl
    implements DatabaseMigrationSqlMi, DatabaseMigrationSqlMi.Definition, DatabaseMigrationSqlMi.Update {
    private DatabaseMigrationSqlMiInner innerObject;

    private final com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DatabaseMigrationPropertiesSqlMi properties() {
        return this.innerModel().properties();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DatabaseMigrationSqlMiInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datamigration.DataMigrationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String managedInstanceName;

    private String targetDbName;

    public DatabaseMigrationSqlMiImpl withExistingManagedInstance(
        String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    public DatabaseMigrationSqlMi create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseMigrationsSqlMis()
                .createOrUpdate(resourceGroupName, managedInstanceName, targetDbName, this.innerModel(), Context.NONE);
        return this;
    }

    public DatabaseMigrationSqlMi create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseMigrationsSqlMis()
                .createOrUpdate(resourceGroupName, managedInstanceName, targetDbName, this.innerModel(), context);
        return this;
    }

    DatabaseMigrationSqlMiImpl(
        String name, com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = new DatabaseMigrationSqlMiInner();
        this.serviceManager = serviceManager;
        this.targetDbName = name;
    }

    public DatabaseMigrationSqlMiImpl update() {
        return this;
    }

    public DatabaseMigrationSqlMi apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseMigrationsSqlMis()
                .createOrUpdate(resourceGroupName, managedInstanceName, targetDbName, this.innerModel(), Context.NONE);
        return this;
    }

    public DatabaseMigrationSqlMi apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseMigrationsSqlMis()
                .createOrUpdate(resourceGroupName, managedInstanceName, targetDbName, this.innerModel(), context);
        return this;
    }

    DatabaseMigrationSqlMiImpl(
        DatabaseMigrationSqlMiInner innerObject,
        com.azure.resourcemanager.datamigration.DataMigrationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.managedInstanceName = Utils.getValueFromIdByName(innerObject.id(), "managedInstances");
        this.targetDbName = Utils.getValueFromIdByName(innerObject.id(), "databaseMigrations");
    }

    public DatabaseMigrationSqlMi refresh() {
        UUID localMigrationOperationId = null;
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseMigrationsSqlMis()
                .getWithResponse(
                    resourceGroupName,
                    managedInstanceName,
                    targetDbName,
                    localMigrationOperationId,
                    localExpand,
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseMigrationSqlMi refresh(Context context) {
        UUID localMigrationOperationId = null;
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDatabaseMigrationsSqlMis()
                .getWithResponse(
                    resourceGroupName,
                    managedInstanceName,
                    targetDbName,
                    localMigrationOperationId,
                    localExpand,
                    context)
                .getValue();
        return this;
    }

    public void cancel(MigrationOperationInput parameters) {
        serviceManager
            .databaseMigrationsSqlMis()
            .cancel(resourceGroupName, managedInstanceName, targetDbName, parameters);
    }

    public void cancel(MigrationOperationInput parameters, Context context) {
        serviceManager
            .databaseMigrationsSqlMis()
            .cancel(resourceGroupName, managedInstanceName, targetDbName, parameters, context);
    }

    public void cutover(MigrationOperationInput parameters) {
        serviceManager
            .databaseMigrationsSqlMis()
            .cutover(resourceGroupName, managedInstanceName, targetDbName, parameters);
    }

    public void cutover(MigrationOperationInput parameters, Context context) {
        serviceManager
            .databaseMigrationsSqlMis()
            .cutover(resourceGroupName, managedInstanceName, targetDbName, parameters, context);
    }

    public DatabaseMigrationSqlMiImpl withProperties(DatabaseMigrationPropertiesSqlMi properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}

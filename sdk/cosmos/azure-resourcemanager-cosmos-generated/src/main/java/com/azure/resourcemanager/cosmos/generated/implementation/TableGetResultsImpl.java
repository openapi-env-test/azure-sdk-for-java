// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.TableGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.BackupInformation;
import com.azure.resourcemanager.cosmos.generated.models.ContinuousBackupRestoreLocation;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.generated.models.TableCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.TableGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.TableGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.TableGetResults;
import com.azure.resourcemanager.cosmos.generated.models.TableResource;
import java.util.Collections;
import java.util.Map;

public final class TableGetResultsImpl implements TableGetResults, TableGetResults.Definition, TableGetResults.Update {
    private TableGetResultsInner innerObject;

    private final com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public TableGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public TableGetPropertiesOptions options() {
        return this.innerModel().options();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public TableGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String tableName;

    private TableCreateUpdateParameters createCreateUpdateTableParameters;

    private TableCreateUpdateParameters updateCreateUpdateTableParameters;

    public TableGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public TableGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableResources()
                .createUpdateTable(
                    resourceGroupName, accountName, tableName, createCreateUpdateTableParameters, Context.NONE);
        return this;
    }

    public TableGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableResources()
                .createUpdateTable(
                    resourceGroupName, accountName, tableName, createCreateUpdateTableParameters, context);
        return this;
    }

    TableGetResultsImpl(String name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new TableGetResultsInner();
        this.serviceManager = serviceManager;
        this.tableName = name;
        this.createCreateUpdateTableParameters = new TableCreateUpdateParameters();
    }

    public TableGetResultsImpl update() {
        this.updateCreateUpdateTableParameters = new TableCreateUpdateParameters();
        return this;
    }

    public TableGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableResources()
                .createUpdateTable(
                    resourceGroupName, accountName, tableName, updateCreateUpdateTableParameters, Context.NONE);
        return this;
    }

    public TableGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableResources()
                .createUpdateTable(
                    resourceGroupName, accountName, tableName, updateCreateUpdateTableParameters, context);
        return this;
    }

    TableGetResultsImpl(
        TableGetResultsInner innerObject, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.tableName = Utils.getValueFromIdByName(innerObject.id(), "tables");
    }

    public TableGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableResources()
                .getTableWithResponse(resourceGroupName, accountName, tableName, Context.NONE)
                .getValue();
        return this;
    }

    public TableGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTableResources()
                .getTableWithResponse(resourceGroupName, accountName, tableName, context)
                .getValue();
        return this;
    }

    public BackupInformation retrieveContinuousBackupInformation(ContinuousBackupRestoreLocation location) {
        return serviceManager
            .tableResources()
            .retrieveContinuousBackupInformation(resourceGroupName, accountName, tableName, location);
    }

    public BackupInformation retrieveContinuousBackupInformation(
        ContinuousBackupRestoreLocation location, Context context) {
        return serviceManager
            .tableResources()
            .retrieveContinuousBackupInformation(resourceGroupName, accountName, tableName, location, context);
    }

    public TableGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateTableParameters.withLocation(location.toString());
        return this;
    }

    public TableGetResultsImpl withRegion(String location) {
        this.createCreateUpdateTableParameters.withLocation(location);
        return this;
    }

    public TableGetResultsImpl withResource(TableResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateTableParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateTableParameters.withResource(resource);
            return this;
        }
    }

    public TableGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateTableParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateTableParameters.withTags(tags);
            return this;
        }
    }

    public TableGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.createCreateUpdateTableParameters.withIdentity(identity);
            return this;
        } else {
            this.updateCreateUpdateTableParameters.withIdentity(identity);
            return this;
        }
    }

    public TableGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateTableParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateTableParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

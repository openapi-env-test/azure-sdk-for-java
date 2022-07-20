// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.MongoDBDatabaseGetResultsInner;
import com.azure.resourcemanager.cosmos.generated.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseCreateUpdateParameters;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseGetPropertiesOptions;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseGetPropertiesResource;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseGetResults;
import com.azure.resourcemanager.cosmos.generated.models.MongoDBDatabaseResource;
import java.util.Collections;
import java.util.Map;

public final class MongoDBDatabaseGetResultsImpl
    implements MongoDBDatabaseGetResults, MongoDBDatabaseGetResults.Definition, MongoDBDatabaseGetResults.Update {
    private MongoDBDatabaseGetResultsInner innerObject;

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

    public MongoDBDatabaseGetPropertiesResource resource() {
        return this.innerModel().resource();
    }

    public MongoDBDatabaseGetPropertiesOptions options() {
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

    public MongoDBDatabaseGetResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmos.generated.CosmosDBManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String databaseName;

    private MongoDBDatabaseCreateUpdateParameters createCreateUpdateMongoDBDatabaseParameters;

    private MongoDBDatabaseCreateUpdateParameters updateCreateUpdateMongoDBDatabaseParameters;

    public MongoDBDatabaseGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public MongoDBDatabaseGetResults create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMongoDBResources()
                .createUpdateMongoDBDatabase(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    createCreateUpdateMongoDBDatabaseParameters,
                    Context.NONE);
        return this;
    }

    public MongoDBDatabaseGetResults create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMongoDBResources()
                .createUpdateMongoDBDatabase(
                    resourceGroupName, accountName, databaseName, createCreateUpdateMongoDBDatabaseParameters, context);
        return this;
    }

    MongoDBDatabaseGetResultsImpl(
        String name, com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = new MongoDBDatabaseGetResultsInner();
        this.serviceManager = serviceManager;
        this.databaseName = name;
        this.createCreateUpdateMongoDBDatabaseParameters = new MongoDBDatabaseCreateUpdateParameters();
    }

    public MongoDBDatabaseGetResultsImpl update() {
        this.updateCreateUpdateMongoDBDatabaseParameters = new MongoDBDatabaseCreateUpdateParameters();
        return this;
    }

    public MongoDBDatabaseGetResults apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMongoDBResources()
                .createUpdateMongoDBDatabase(
                    resourceGroupName,
                    accountName,
                    databaseName,
                    updateCreateUpdateMongoDBDatabaseParameters,
                    Context.NONE);
        return this;
    }

    public MongoDBDatabaseGetResults apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMongoDBResources()
                .createUpdateMongoDBDatabase(
                    resourceGroupName, accountName, databaseName, updateCreateUpdateMongoDBDatabaseParameters, context);
        return this;
    }

    MongoDBDatabaseGetResultsImpl(
        MongoDBDatabaseGetResultsInner innerObject,
        com.azure.resourcemanager.cosmos.generated.CosmosDBManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "databaseAccounts");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "mongodbDatabases");
    }

    public MongoDBDatabaseGetResults refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMongoDBResources()
                .getMongoDBDatabaseWithResponse(resourceGroupName, accountName, databaseName, Context.NONE)
                .getValue();
        return this;
    }

    public MongoDBDatabaseGetResults refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMongoDBResources()
                .getMongoDBDatabaseWithResponse(resourceGroupName, accountName, databaseName, context)
                .getValue();
        return this;
    }

    public MongoDBDatabaseGetResultsImpl withRegion(Region location) {
        this.createCreateUpdateMongoDBDatabaseParameters.withLocation(location.toString());
        return this;
    }

    public MongoDBDatabaseGetResultsImpl withRegion(String location) {
        this.createCreateUpdateMongoDBDatabaseParameters.withLocation(location);
        return this;
    }

    public MongoDBDatabaseGetResultsImpl withResource(MongoDBDatabaseResource resource) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBDatabaseParameters.withResource(resource);
            return this;
        } else {
            this.updateCreateUpdateMongoDBDatabaseParameters.withResource(resource);
            return this;
        }
    }

    public MongoDBDatabaseGetResultsImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBDatabaseParameters.withTags(tags);
            return this;
        } else {
            this.updateCreateUpdateMongoDBDatabaseParameters.withTags(tags);
            return this;
        }
    }

    public MongoDBDatabaseGetResultsImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBDatabaseParameters.withIdentity(identity);
            return this;
        } else {
            this.updateCreateUpdateMongoDBDatabaseParameters.withIdentity(identity);
            return this;
        }
    }

    public MongoDBDatabaseGetResultsImpl withOptions(CreateUpdateOptions options) {
        if (isInCreateMode()) {
            this.createCreateUpdateMongoDBDatabaseParameters.withOptions(options);
            return this;
        } else {
            this.updateCreateUpdateMongoDBDatabaseParameters.withOptions(options);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

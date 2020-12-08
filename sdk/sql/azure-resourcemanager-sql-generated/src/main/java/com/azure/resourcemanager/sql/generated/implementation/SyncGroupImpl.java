// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncGroupInner;
import com.azure.resourcemanager.sql.generated.models.SyncConflictResolutionPolicy;
import com.azure.resourcemanager.sql.generated.models.SyncGroup;
import com.azure.resourcemanager.sql.generated.models.SyncGroupSchema;
import com.azure.resourcemanager.sql.generated.models.SyncGroupState;
import java.time.OffsetDateTime;

public final class SyncGroupImpl implements SyncGroup, SyncGroup.Definition, SyncGroup.Update {
    private SyncGroupInner innerObject;

    private final SqlManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer interval() {
        return this.innerModel().interval();
    }

    public OffsetDateTime lastSyncTime() {
        return this.innerModel().lastSyncTime();
    }

    public SyncConflictResolutionPolicy conflictResolutionPolicy() {
        return this.innerModel().conflictResolutionPolicy();
    }

    public String syncDatabaseId() {
        return this.innerModel().syncDatabaseId();
    }

    public String hubDatabaseUsername() {
        return this.innerModel().hubDatabaseUsername();
    }

    public String hubDatabasePassword() {
        return this.innerModel().hubDatabasePassword();
    }

    public SyncGroupState syncState() {
        return this.innerModel().syncState();
    }

    public SyncGroupSchema schema() {
        return this.innerModel().schema();
    }

    public Boolean usePrivateLinkConnection() {
        return this.innerModel().usePrivateLinkConnection();
    }

    public String privateEndpointName() {
        return this.innerModel().privateEndpointName();
    }

    public SyncGroupInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String databaseName;

    private String syncGroupName;

    public SyncGroupImpl withExistingDatabase(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    public SyncGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .createOrUpdate(
                    resourceGroupName, serverName, databaseName, syncGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public SyncGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .createOrUpdate(resourceGroupName, serverName, databaseName, syncGroupName, this.innerModel(), context);
        return this;
    }

    public SyncGroupImpl(String name, SqlManager serviceManager) {
        this.innerObject = new SyncGroupInner();
        this.serviceManager = serviceManager;
        this.syncGroupName = name;
    }

    public SyncGroupImpl update() {
        return this;
    }

    public SyncGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .update(resourceGroupName, serverName, databaseName, syncGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public SyncGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .update(resourceGroupName, serverName, databaseName, syncGroupName, this.innerModel(), context);
        return this;
    }

    public SyncGroupImpl(SyncGroupInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = Utils.getValueFromIdByName(innerObject.id(), "servers");
        this.databaseName = Utils.getValueFromIdByName(innerObject.id(), "databases");
        this.syncGroupName = Utils.getValueFromIdByName(innerObject.id(), "syncGroups");
    }

    public SyncGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .getWithResponse(resourceGroupName, serverName, databaseName, syncGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public SyncGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSyncGroups()
                .getWithResponse(resourceGroupName, serverName, databaseName, syncGroupName, context)
                .getValue();
        return this;
    }

    public SyncGroupImpl withInterval(Integer interval) {
        this.innerModel().withInterval(interval);
        return this;
    }

    public SyncGroupImpl withConflictResolutionPolicy(SyncConflictResolutionPolicy conflictResolutionPolicy) {
        this.innerModel().withConflictResolutionPolicy(conflictResolutionPolicy);
        return this;
    }

    public SyncGroupImpl withSyncDatabaseId(String syncDatabaseId) {
        this.innerModel().withSyncDatabaseId(syncDatabaseId);
        return this;
    }

    public SyncGroupImpl withHubDatabaseUsername(String hubDatabaseUsername) {
        this.innerModel().withHubDatabaseUsername(hubDatabaseUsername);
        return this;
    }

    public SyncGroupImpl withHubDatabasePassword(String hubDatabasePassword) {
        this.innerModel().withHubDatabasePassword(hubDatabasePassword);
        return this;
    }

    public SyncGroupImpl withSchema(SyncGroupSchema schema) {
        this.innerModel().withSchema(schema);
        return this;
    }

    public SyncGroupImpl withUsePrivateLinkConnection(Boolean usePrivateLinkConnection) {
        this.innerModel().withUsePrivateLinkConnection(usePrivateLinkConnection);
        return this;
    }
}

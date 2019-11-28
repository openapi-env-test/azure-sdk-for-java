/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroups;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroup;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncDatabaseIdProperties;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroupDatabasisServerSyncFullSchemaProperties;
import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncGroupLogProperties;

class SyncGroupsImpl extends WrapperImpl<SyncGroupsInner> implements SyncGroups {
    private final SqlManager manager;

    SyncGroupsImpl(SqlManager manager) {
        super(manager.inner().syncGroups());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public SyncGroupImpl define(String name) {
        return wrapModel(name);
    }

    private SyncGroupImpl wrapModel(SyncGroupInner inner) {
        return  new SyncGroupImpl(inner, manager());
    }

    private SyncGroupImpl wrapModel(String name) {
        return new SyncGroupImpl(name, this.manager());
    }

    @Override
    public Completable refreshHubSchemaAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName) {
        SyncGroupsInner client = this.inner();
        return client.refreshHubSchemaAsync(resourceGroupName, serverName, databaseName, syncGroupName).toCompletable();
    }

    @Override
    public Completable cancelSyncAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName) {
        SyncGroupsInner client = this.inner();
        return client.cancelSyncAsync(resourceGroupName, serverName, databaseName, syncGroupName).toCompletable();
    }

    @Override
    public Completable triggerSyncAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName) {
        SyncGroupsInner client = this.inner();
        return client.triggerSyncAsync(resourceGroupName, serverName, databaseName, syncGroupName).toCompletable();
    }

    @Override
    public Observable<SyncGroup> listByDatabaseAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        SyncGroupsInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, serverName, databaseName)
        .flatMapIterable(new Func1<Page<SyncGroupInner>, Iterable<SyncGroupInner>>() {
            @Override
            public Iterable<SyncGroupInner> call(Page<SyncGroupInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SyncGroupInner, SyncGroup>() {
            @Override
            public SyncGroup call(SyncGroupInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<SyncGroup> getAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName) {
        SyncGroupsInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName, syncGroupName)
        .flatMap(new Func1<SyncGroupInner, Observable<SyncGroup>>() {
            @Override
            public Observable<SyncGroup> call(SyncGroupInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((SyncGroup)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String databaseName, String syncGroupName) {
        SyncGroupsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, databaseName, syncGroupName).toCompletable();
    }

    private SyncDatabaseIdPropertiesImpl wrapSyncDatabaseIdPropertiesModel(SyncDatabaseIdPropertiesInner inner) {
        return  new SyncDatabaseIdPropertiesImpl(inner, manager());
    }

    private SyncGroupDatabasisServerSyncFullSchemaPropertiesImpl wrapSyncGroupDatabasisServerSyncFullSchemaPropertiesModel(SyncFullSchemaPropertiesInner inner) {
        return  new SyncGroupDatabasisServerSyncFullSchemaPropertiesImpl(inner, manager());
    }

    private SyncGroupLogPropertiesImpl wrapSyncGroupLogPropertiesModel(SyncGroupLogPropertiesInner inner) {
        return  new SyncGroupLogPropertiesImpl(inner, manager());
    }

    @Override
    public Observable<SyncDatabaseIdProperties> listSyncDatabaseIdsAsync(final String locationName) {
        SyncGroupsInner client = this.inner();
        return client.listSyncDatabaseIdsAsync(locationName)
        .flatMapIterable(new Func1<Page<SyncDatabaseIdPropertiesInner>, Iterable<SyncDatabaseIdPropertiesInner>>() {
            @Override
            public Iterable<SyncDatabaseIdPropertiesInner> call(Page<SyncDatabaseIdPropertiesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SyncDatabaseIdPropertiesInner, SyncDatabaseIdProperties>() {
            @Override
            public SyncDatabaseIdProperties call(SyncDatabaseIdPropertiesInner inner) {
                return wrapSyncDatabaseIdPropertiesModel(inner);
            }
        });
    }

    @Override
    public Observable<SyncGroupDatabasisServerSyncFullSchemaProperties> listHubSchemasAsync(final String resourceGroupName, final String serverName, final String databaseName, final String syncGroupName) {
        SyncGroupsInner client = this.inner();
        return client.listHubSchemasAsync(resourceGroupName, serverName, databaseName, syncGroupName)
        .flatMapIterable(new Func1<Page<SyncFullSchemaPropertiesInner>, Iterable<SyncFullSchemaPropertiesInner>>() {
            @Override
            public Iterable<SyncFullSchemaPropertiesInner> call(Page<SyncFullSchemaPropertiesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SyncFullSchemaPropertiesInner, SyncGroupDatabasisServerSyncFullSchemaProperties>() {
            @Override
            public SyncGroupDatabasisServerSyncFullSchemaProperties call(SyncFullSchemaPropertiesInner inner) {
                return wrapSyncGroupDatabasisServerSyncFullSchemaPropertiesModel(inner);
            }
        });
    }

    @Override
    public Observable<SyncGroupLogProperties> listLogsAsync(final String resourceGroupName, final String serverName, final String databaseName, final String syncGroupName, final String startTime, final String endTime, final String type) {
        SyncGroupsInner client = this.inner();
        return client.listLogsAsync(resourceGroupName, serverName, databaseName, syncGroupName, startTime, endTime, type)
        .flatMapIterable(new Func1<Page<SyncGroupLogPropertiesInner>, Iterable<SyncGroupLogPropertiesInner>>() {
            @Override
            public Iterable<SyncGroupLogPropertiesInner> call(Page<SyncGroupLogPropertiesInner> page) {
                return page.items();
            }
        })
        .map(new Func1<SyncGroupLogPropertiesInner, SyncGroupLogProperties>() {
            @Override
            public SyncGroupLogProperties call(SyncGroupLogPropertiesInner inner) {
                return wrapSyncGroupLogPropertiesModel(inner);
            }
        });
    }

}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.RestorableDroppedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.BackupStorageRedundancy;
import com.azure.resourcemanager.sql.generated.models.RestorableDroppedDatabase;
import com.azure.resourcemanager.sql.generated.models.Sku;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class RestorableDroppedDatabaseImpl implements RestorableDroppedDatabase {
    private RestorableDroppedDatabaseInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    RestorableDroppedDatabaseImpl(
        RestorableDroppedDatabaseInner innerObject, com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Sku sku() {
        return this.innerModel().sku();
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

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public Long maxSizeBytes() {
        return this.innerModel().maxSizeBytes();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public OffsetDateTime deletionDate() {
        return this.innerModel().deletionDate();
    }

    public OffsetDateTime earliestRestoreDate() {
        return this.innerModel().earliestRestoreDate();
    }

    public BackupStorageRedundancy backupStorageRedundancy() {
        return this.innerModel().backupStorageRedundancy();
    }

    public RestorableDroppedDatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

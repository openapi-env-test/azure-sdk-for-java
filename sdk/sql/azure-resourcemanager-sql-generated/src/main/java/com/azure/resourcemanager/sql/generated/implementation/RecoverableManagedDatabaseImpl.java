// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.fluent.models.RecoverableManagedDatabaseInner;
import com.azure.resourcemanager.sql.generated.models.RecoverableManagedDatabase;

public final class RecoverableManagedDatabaseImpl implements RecoverableManagedDatabase {
    private RecoverableManagedDatabaseInner innerObject;

    private final com.azure.resourcemanager.sql.generated.SqlManager serviceManager;

    RecoverableManagedDatabaseImpl(
        RecoverableManagedDatabaseInner innerObject,
        com.azure.resourcemanager.sql.generated.SqlManager serviceManager) {
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

    public String lastAvailableBackupDate() {
        return this.innerModel().lastAvailableBackupDate();
    }

    public RecoverableManagedDatabaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sql.generated.SqlManager manager() {
        return this.serviceManager;
    }
}

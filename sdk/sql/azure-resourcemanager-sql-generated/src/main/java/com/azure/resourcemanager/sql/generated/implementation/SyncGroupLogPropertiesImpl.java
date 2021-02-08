// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.SyncGroupLogPropertiesInner;
import com.azure.resourcemanager.sql.generated.models.SyncGroupLogProperties;
import com.azure.resourcemanager.sql.generated.models.SyncGroupLogType;
import java.time.OffsetDateTime;
import java.util.UUID;

public final class SyncGroupLogPropertiesImpl implements SyncGroupLogProperties {
    private SyncGroupLogPropertiesInner innerObject;

    private final SqlManager serviceManager;

    SyncGroupLogPropertiesImpl(SyncGroupLogPropertiesInner innerObject, SqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OffsetDateTime timestamp() {
        return this.innerModel().timestamp();
    }

    public SyncGroupLogType type() {
        return this.innerModel().type();
    }

    public String source() {
        return this.innerModel().source();
    }

    public String details() {
        return this.innerModel().details();
    }

    public UUID tracingId() {
        return this.innerModel().tracingId();
    }

    public String operationStatus() {
        return this.innerModel().operationStatus();
    }

    public SyncGroupLogPropertiesInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}

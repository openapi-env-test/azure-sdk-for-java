// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azuredata.implementation;

import com.azure.resourcemanager.azuredata.AzureDataManager;
import com.azure.resourcemanager.azuredata.fluent.models.PostgresInstanceInner;
import com.azure.resourcemanager.azuredata.models.PostgresInstance;
import com.azure.resourcemanager.azuredata.models.SystemData;
import java.util.Collections;
import java.util.Map;

public final class PostgresInstanceImpl implements PostgresInstance {
    private PostgresInstanceInner innerObject;

    private final AzureDataManager serviceManager;

    PostgresInstanceImpl(PostgresInstanceInner innerObject, AzureDataManager serviceManager) {
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

    public String hybridDataManagerId() {
        return this.innerModel().hybridDataManagerId();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public PostgresInstanceInner innerModel() {
        return this.innerObject;
    }

    private AzureDataManager manager() {
        return this.serviceManager;
    }
}

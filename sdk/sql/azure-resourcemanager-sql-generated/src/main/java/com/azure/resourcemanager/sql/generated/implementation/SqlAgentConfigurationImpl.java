// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.implementation;

import com.azure.resourcemanager.sql.generated.SqlManager;
import com.azure.resourcemanager.sql.generated.fluent.models.SqlAgentConfigurationInner;
import com.azure.resourcemanager.sql.generated.models.SqlAgentConfiguration;
import com.azure.resourcemanager.sql.generated.models.SqlAgentConfigurationPropertiesState;

public final class SqlAgentConfigurationImpl implements SqlAgentConfiguration {
    private SqlAgentConfigurationInner innerObject;

    private final SqlManager serviceManager;

    SqlAgentConfigurationImpl(SqlAgentConfigurationInner innerObject, SqlManager serviceManager) {
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

    public SqlAgentConfigurationPropertiesState state() {
        return this.innerModel().state();
    }

    public SqlAgentConfigurationInner innerModel() {
        return this.innerObject;
    }

    private SqlManager manager() {
        return this.serviceManager;
    }
}

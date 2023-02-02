// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Properties for the task that validates connection to PostgreSQL server and source server requirements for online
 * migration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ConnectToSource.PostgreSql.Sync")
@Fluent
public final class ConnectToSourcePostgreSqlSyncTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private ConnectToSourcePostgreSqlSyncTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectToSourcePostgreSqlSyncTaskOutput> output;

    /** Creates an instance of ConnectToSourcePostgreSqlSyncTaskProperties class. */
    public ConnectToSourcePostgreSqlSyncTaskProperties() {
    }

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public ConnectToSourcePostgreSqlSyncTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the ConnectToSourcePostgreSqlSyncTaskProperties object itself.
     */
    public ConnectToSourcePostgreSqlSyncTaskProperties withInput(ConnectToSourcePostgreSqlSyncTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<ConnectToSourcePostgreSqlSyncTaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectToSourcePostgreSqlSyncTaskProperties withClientData(Map<String, String> clientData) {
        super.withClientData(clientData);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (input() != null) {
            input().validate();
        }
        if (output() != null) {
            output().forEach(e -> e.validate());
        }
    }
}

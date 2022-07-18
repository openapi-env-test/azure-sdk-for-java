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

/** Properties for task that migrates SQL Server databases to Azure SQL Database Managed Instance sync scenario. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Migrate.SqlServer.AzureSqlDbMI.Sync.LRS")
@Fluent
public final class MigrateSqlServerSqlMISyncTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private MigrateSqlServerSqlMISyncTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrateSqlServerSqlMISyncTaskOutput> output;

    /*
     * DateTime in UTC when the task was created
     */
    @JsonProperty(value = "createdOn")
    private String createdOn;

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public MigrateSqlServerSqlMISyncTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the MigrateSqlServerSqlMISyncTaskProperties object itself.
     */
    public MigrateSqlServerSqlMISyncTaskProperties withInput(MigrateSqlServerSqlMISyncTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<MigrateSqlServerSqlMISyncTaskOutput> output() {
        return this.output;
    }

    /**
     * Get the createdOn property: DateTime in UTC when the task was created.
     *
     * @return the createdOn value.
     */
    public String createdOn() {
        return this.createdOn;
    }

    /**
     * Set the createdOn property: DateTime in UTC when the task was created.
     *
     * @param createdOn the createdOn value to set.
     * @return the MigrateSqlServerSqlMISyncTaskProperties object itself.
     */
    public MigrateSqlServerSqlMISyncTaskProperties withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateSqlServerSqlMISyncTaskProperties withClientData(Map<String, String> clientData) {
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

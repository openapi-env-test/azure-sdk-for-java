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

/** Properties for task that migrates SQL Server databases to Azure SQL Database Managed Instance. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("Migrate.SqlServer.AzureSqlDbMI")
@Fluent
public final class MigrateSqlServerSqlMITaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private MigrateSqlServerSqlMITaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<MigrateSqlServerSqlMITaskOutput> output;

    /*
     * task id
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /*
     * DateTime in UTC when the task was created
     */
    @JsonProperty(value = "createdOn")
    private String createdOn;

    /*
     * parent task id
     */
    @JsonProperty(value = "parentTaskId")
    private String parentTaskId;

    /*
     * whether the task can be cloned or not
     */
    @JsonProperty(value = "isCloneable")
    private Boolean isCloneable;

    /** Creates an instance of MigrateSqlServerSqlMITaskProperties class. */
    public MigrateSqlServerSqlMITaskProperties() {
    }

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public MigrateSqlServerSqlMITaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the MigrateSqlServerSqlMITaskProperties object itself.
     */
    public MigrateSqlServerSqlMITaskProperties withInput(MigrateSqlServerSqlMITaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<MigrateSqlServerSqlMITaskOutput> output() {
        return this.output;
    }

    /**
     * Get the taskId property: task id.
     *
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: task id.
     *
     * @param taskId the taskId value to set.
     * @return the MigrateSqlServerSqlMITaskProperties object itself.
     */
    public MigrateSqlServerSqlMITaskProperties withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
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
     * @return the MigrateSqlServerSqlMITaskProperties object itself.
     */
    public MigrateSqlServerSqlMITaskProperties withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Get the parentTaskId property: parent task id.
     *
     * @return the parentTaskId value.
     */
    public String parentTaskId() {
        return this.parentTaskId;
    }

    /**
     * Set the parentTaskId property: parent task id.
     *
     * @param parentTaskId the parentTaskId value to set.
     * @return the MigrateSqlServerSqlMITaskProperties object itself.
     */
    public MigrateSqlServerSqlMITaskProperties withParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
        return this;
    }

    /**
     * Get the isCloneable property: whether the task can be cloned or not.
     *
     * @return the isCloneable value.
     */
    public Boolean isCloneable() {
        return this.isCloneable;
    }

    /**
     * Set the isCloneable property: whether the task can be cloned or not.
     *
     * @param isCloneable the isCloneable value to set.
     * @return the MigrateSqlServerSqlMITaskProperties object itself.
     */
    public MigrateSqlServerSqlMITaskProperties withIsCloneable(Boolean isCloneable) {
        this.isCloneable = isCloneable;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateSqlServerSqlMITaskProperties withClientData(Map<String, String> clientData) {
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

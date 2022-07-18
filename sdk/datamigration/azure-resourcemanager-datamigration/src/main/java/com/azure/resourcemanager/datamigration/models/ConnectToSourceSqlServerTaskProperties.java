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

/** Properties for the task that validates connection to SQL Server and also validates source server requirements. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ConnectToSource.SqlServer")
@Fluent
public final class ConnectToSourceSqlServerTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private ConnectToSourceSqlServerTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectToSourceSqlServerTaskOutput> output;

    /*
     * Task id
     */
    @JsonProperty(value = "taskId")
    private String taskId;

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public ConnectToSourceSqlServerTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the ConnectToSourceSqlServerTaskProperties object itself.
     */
    public ConnectToSourceSqlServerTaskProperties withInput(ConnectToSourceSqlServerTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<ConnectToSourceSqlServerTaskOutput> output() {
        return this.output;
    }

    /**
     * Get the taskId property: Task id.
     *
     * @return the taskId value.
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId property: Task id.
     *
     * @param taskId the taskId value to set.
     * @return the ConnectToSourceSqlServerTaskProperties object itself.
     */
    public ConnectToSourceSqlServerTaskProperties withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectToSourceSqlServerTaskProperties withClientData(Map<String, String> clientData) {
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

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

/** Properties for the task that validates connection to Azure SQL Database Managed Instance. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ConnectToTarget.AzureSqlDbMI")
@Fluent
public final class ConnectToTargetSqlMITaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private ConnectToTargetSqlMITaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectToTargetSqlMITaskOutput> output;

    /** Creates an instance of ConnectToTargetSqlMITaskProperties class. */
    public ConnectToTargetSqlMITaskProperties() {
    }

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public ConnectToTargetSqlMITaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the ConnectToTargetSqlMITaskProperties object itself.
     */
    public ConnectToTargetSqlMITaskProperties withInput(ConnectToTargetSqlMITaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<ConnectToTargetSqlMITaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectToTargetSqlMITaskProperties withClientData(Map<String, String> clientData) {
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

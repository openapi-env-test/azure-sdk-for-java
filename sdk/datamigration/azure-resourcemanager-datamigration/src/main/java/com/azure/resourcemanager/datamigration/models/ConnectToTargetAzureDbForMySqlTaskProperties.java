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

/** Properties for the task that validates connection to Azure Database for MySQL and target server requirements. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "taskType")
@JsonTypeName("ConnectToTarget.AzureDbForMySql")
@Fluent
public final class ConnectToTargetAzureDbForMySqlTaskProperties extends ProjectTaskProperties {
    /*
     * Task input
     */
    @JsonProperty(value = "input")
    private ConnectToTargetAzureDbForMySqlTaskInput input;

    /*
     * Task output. This is ignored if submitted.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private List<ConnectToTargetAzureDbForMySqlTaskOutput> output;

    /**
     * Get the input property: Task input.
     *
     * @return the input value.
     */
    public ConnectToTargetAzureDbForMySqlTaskInput input() {
        return this.input;
    }

    /**
     * Set the input property: Task input.
     *
     * @param input the input value to set.
     * @return the ConnectToTargetAzureDbForMySqlTaskProperties object itself.
     */
    public ConnectToTargetAzureDbForMySqlTaskProperties withInput(ConnectToTargetAzureDbForMySqlTaskInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the output property: Task output. This is ignored if submitted.
     *
     * @return the output value.
     */
    public List<ConnectToTargetAzureDbForMySqlTaskOutput> output() {
        return this.output;
    }

    /** {@inheritDoc} */
    @Override
    public ConnectToTargetAzureDbForMySqlTaskProperties withClientData(Map<String, String> clientData) {
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

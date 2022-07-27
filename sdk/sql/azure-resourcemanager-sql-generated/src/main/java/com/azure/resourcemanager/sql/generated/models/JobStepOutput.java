// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The output configuration of a job step. */
@Fluent
public final class JobStepOutput {
    /*
     * The output destination type.
     */
    @JsonProperty(value = "type")
    private JobStepOutputType type;

    /*
     * The output destination subscription id.
     */
    @JsonProperty(value = "subscriptionId")
    private UUID subscriptionId;

    /*
     * The output destination resource group.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * The output destination server name.
     */
    @JsonProperty(value = "serverName", required = true)
    private String serverName;

    /*
     * The output destination database.
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /*
     * The output destination schema.
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /*
     * The output destination table.
     */
    @JsonProperty(value = "tableName", required = true)
    private String tableName;

    /*
     * The resource ID of the credential to use to connect to the output
     * destination.
     */
    @JsonProperty(value = "credential", required = true)
    private String credential;

    /**
     * Get the type property: The output destination type.
     *
     * @return the type value.
     */
    public JobStepOutputType type() {
        return this.type;
    }

    /**
     * Set the type property: The output destination type.
     *
     * @param type the type value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withType(JobStepOutputType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the subscriptionId property: The output destination subscription id.
     *
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The output destination subscription id.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withSubscriptionId(UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: The output destination resource group.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: The output destination resource group.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the serverName property: The output destination server name.
     *
     * @return the serverName value.
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set the serverName property: The output destination server name.
     *
     * @param serverName the serverName value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get the databaseName property: The output destination database.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The output destination database.
     *
     * @param databaseName the databaseName value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the schemaName property: The output destination schema.
     *
     * @return the schemaName value.
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the schemaName property: The output destination schema.
     *
     * @param schemaName the schemaName value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the tableName property: The output destination table.
     *
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The output destination table.
     *
     * @param tableName the tableName value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Get the credential property: The resource ID of the credential to use to connect to the output destination.
     *
     * @return the credential value.
     */
    public String credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The resource ID of the credential to use to connect to the output destination.
     *
     * @param credential the credential value to set.
     * @return the JobStepOutput object itself.
     */
    public JobStepOutput withCredential(String credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property serverName in model JobStepOutput"));
        }
        if (databaseName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property databaseName in model JobStepOutput"));
        }
        if (tableName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property tableName in model JobStepOutput"));
        }
        if (credential() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property credential in model JobStepOutput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(JobStepOutput.class);
}

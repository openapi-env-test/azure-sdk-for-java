// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Task level output for the task that validates connection to SQL Server and also validates source server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("TaskLevelOutput")
@Immutable
public final class ConnectToSourceSqlServerTaskOutputTaskLevel extends ConnectToSourceSqlServerTaskOutput {
    /*
     * Source databases as a map from database name to database id
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private String databases;

    /*
     * Source logins as a map from login name to login id.
     */
    @JsonProperty(value = "logins", access = JsonProperty.Access.WRITE_ONLY)
    private String logins;

    /*
     * Source agent jobs as a map from agent job name to id.
     */
    @JsonProperty(value = "agentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private String agentJobs;

    /*
     * Mapping from database name to TDE certificate name, if applicable
     */
    @JsonProperty(value = "databaseTdeCertificateMapping", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseTdeCertificateMapping;

    /*
     * Source server version
     */
    @JsonProperty(value = "sourceServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerVersion;

    /*
     * Source server brand version
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /*
     * Validation errors
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get the databases property: Source databases as a map from database name to database id.
     *
     * @return the databases value.
     */
    public String databases() {
        return this.databases;
    }

    /**
     * Get the logins property: Source logins as a map from login name to login id.
     *
     * @return the logins value.
     */
    public String logins() {
        return this.logins;
    }

    /**
     * Get the agentJobs property: Source agent jobs as a map from agent job name to id.
     *
     * @return the agentJobs value.
     */
    public String agentJobs() {
        return this.agentJobs;
    }

    /**
     * Get the databaseTdeCertificateMapping property: Mapping from database name to TDE certificate name, if
     * applicable.
     *
     * @return the databaseTdeCertificateMapping value.
     */
    public String databaseTdeCertificateMapping() {
        return this.databaseTdeCertificateMapping;
    }

    /**
     * Get the sourceServerVersion property: Source server version.
     *
     * @return the sourceServerVersion value.
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Get the sourceServerBrandVersion property: Source server brand version.
     *
     * @return the sourceServerBrandVersion value.
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get the validationErrors property: Validation errors.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}

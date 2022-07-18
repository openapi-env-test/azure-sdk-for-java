// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.datamigration.models.DatabaseMigrationPropertiesSqlMi;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Database Migration Resource for SQL Managed Instance. */
@Fluent
public final class DatabaseMigrationSqlMiInner extends ProxyResource {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Database Migration Resource properties for SQL Managed Instance.
     */
    @JsonProperty(value = "properties")
    private DatabaseMigrationPropertiesSqlMi properties;

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the properties property: Database Migration Resource properties for SQL Managed Instance.
     *
     * @return the properties value.
     */
    public DatabaseMigrationPropertiesSqlMi properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Database Migration Resource properties for SQL Managed Instance.
     *
     * @param properties the properties value to set.
     * @return the DatabaseMigrationSqlMiInner object itself.
     */
    public DatabaseMigrationSqlMiInner withProperties(DatabaseMigrationPropertiesSqlMi properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}

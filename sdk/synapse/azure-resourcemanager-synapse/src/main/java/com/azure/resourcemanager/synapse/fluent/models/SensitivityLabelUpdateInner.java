// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateKind;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A sensitivity label update operation. */
@Fluent
public final class SensitivityLabelUpdateInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private SensitivityLabelUpdatePropertiesInner innerProperties;

    /** Creates an instance of SensitivityLabelUpdateInner class. */
    public SensitivityLabelUpdateInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private SensitivityLabelUpdatePropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the op property: The op property.
     *
     * @return the op value.
     */
    public SensitivityLabelUpdateKind op() {
        return this.innerProperties() == null ? null : this.innerProperties().op();
    }

    /**
     * Set the op property: The op property.
     *
     * @param op the op value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withOp(SensitivityLabelUpdateKind op) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withOp(op);
        return this;
    }

    /**
     * Get the schema property: Schema name of the column to update.
     *
     * @return the schema value.
     */
    public String schema() {
        return this.innerProperties() == null ? null : this.innerProperties().schema();
    }

    /**
     * Set the schema property: Schema name of the column to update.
     *
     * @param schema the schema value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withSchema(String schema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withSchema(schema);
        return this;
    }

    /**
     * Get the table property: Table name of the column to update.
     *
     * @return the table value.
     */
    public String table() {
        return this.innerProperties() == null ? null : this.innerProperties().table();
    }

    /**
     * Set the table property: Table name of the column to update.
     *
     * @param table the table value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withTable(String table) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withTable(table);
        return this;
    }

    /**
     * Get the column property: Column name to update.
     *
     * @return the column value.
     */
    public String column() {
        return this.innerProperties() == null ? null : this.innerProperties().column();
    }

    /**
     * Set the column property: Column name to update.
     *
     * @param column the column value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withColumn(String column) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withColumn(column);
        return this;
    }

    /**
     * Get the sensitivityLabel property: The sensitivity label information to apply on a column.
     *
     * @return the sensitivityLabel value.
     */
    public SensitivityLabelInner sensitivityLabel() {
        return this.innerProperties() == null ? null : this.innerProperties().sensitivityLabel();
    }

    /**
     * Set the sensitivityLabel property: The sensitivity label information to apply on a column.
     *
     * @param sensitivityLabel the sensitivityLabel value to set.
     * @return the SensitivityLabelUpdateInner object itself.
     */
    public SensitivityLabelUpdateInner withSensitivityLabel(SensitivityLabelInner sensitivityLabel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SensitivityLabelUpdatePropertiesInner();
        }
        this.innerProperties().withSensitivityLabel(sensitivityLabel);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

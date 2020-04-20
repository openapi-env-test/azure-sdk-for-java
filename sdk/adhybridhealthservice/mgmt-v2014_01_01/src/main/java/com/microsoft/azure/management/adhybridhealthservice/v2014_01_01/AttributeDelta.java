/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The delta attributes.
 */
public class AttributeDelta {
    /**
     * The delta values.
     */
    @JsonProperty(value = "values")
    private List<ValueDelta> values;

    /**
     * The name of the attribute delta.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The attribute delta operation type. Possible values include:
     * 'Undefined', 'Add', 'Replace', 'Update', 'Delete'.
     */
    @JsonProperty(value = "operationType")
    private AttributeDeltaOperationType operationType;

    /**
     * The value type. Possible values include: 'Undefined', 'Dn', 'Binary',
     * 'String', 'Integer', 'Boolean'.
     */
    @JsonProperty(value = "valueType")
    private ValueType valueType;

    /**
     * Indicates if the attribute delta is multivalued or not.
     */
    @JsonProperty(value = "multiValued")
    private Boolean multiValued;

    /**
     * Get the delta values.
     *
     * @return the values value
     */
    public List<ValueDelta> values() {
        return this.values;
    }

    /**
     * Set the delta values.
     *
     * @param values the values value to set
     * @return the AttributeDelta object itself.
     */
    public AttributeDelta withValues(List<ValueDelta> values) {
        this.values = values;
        return this;
    }

    /**
     * Get the name of the attribute delta.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the attribute delta.
     *
     * @param name the name value to set
     * @return the AttributeDelta object itself.
     */
    public AttributeDelta withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the attribute delta operation type. Possible values include: 'Undefined', 'Add', 'Replace', 'Update', 'Delete'.
     *
     * @return the operationType value
     */
    public AttributeDeltaOperationType operationType() {
        return this.operationType;
    }

    /**
     * Set the attribute delta operation type. Possible values include: 'Undefined', 'Add', 'Replace', 'Update', 'Delete'.
     *
     * @param operationType the operationType value to set
     * @return the AttributeDelta object itself.
     */
    public AttributeDelta withOperationType(AttributeDeltaOperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get the value type. Possible values include: 'Undefined', 'Dn', 'Binary', 'String', 'Integer', 'Boolean'.
     *
     * @return the valueType value
     */
    public ValueType valueType() {
        return this.valueType;
    }

    /**
     * Set the value type. Possible values include: 'Undefined', 'Dn', 'Binary', 'String', 'Integer', 'Boolean'.
     *
     * @param valueType the valueType value to set
     * @return the AttributeDelta object itself.
     */
    public AttributeDelta withValueType(ValueType valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * Get indicates if the attribute delta is multivalued or not.
     *
     * @return the multiValued value
     */
    public Boolean multiValued() {
        return this.multiValued;
    }

    /**
     * Set indicates if the attribute delta is multivalued or not.
     *
     * @param multiValued the multiValued value to set
     * @return the AttributeDelta object itself.
     */
    public AttributeDelta withMultiValued(Boolean multiValued) {
        this.multiValued = multiValued;
        return this;
    }

}

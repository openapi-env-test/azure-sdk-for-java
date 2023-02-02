// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies an auto scale rule metric dimension. */
@Fluent
public final class ScaleRuleMetricDimension {
    /*
     * Name of the dimension.
     */
    @JsonProperty(value = "DimensionName", required = true)
    private String dimensionName;

    /*
     * the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being equal to any of the values.
     * 'NotEquals' being not equal to all of the values
     */
    @JsonProperty(value = "Operator", required = true)
    private ScaleRuleMetricDimensionOperationType operator;

    /*
     * list of dimension values. For example: ["App1","App2"].
     */
    @JsonProperty(value = "Values", required = true)
    private List<String> values;

    /** Creates an instance of ScaleRuleMetricDimension class. */
    public ScaleRuleMetricDimension() {
    }

    /**
     * Get the dimensionName property: Name of the dimension.
     *
     * @return the dimensionName value.
     */
    public String dimensionName() {
        return this.dimensionName;
    }

    /**
     * Set the dimensionName property: Name of the dimension.
     *
     * @param dimensionName the dimensionName value to set.
     * @return the ScaleRuleMetricDimension object itself.
     */
    public ScaleRuleMetricDimension withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * Get the operator property: the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being
     * equal to any of the values. 'NotEquals' being not equal to all of the values.
     *
     * @return the operator value.
     */
    public ScaleRuleMetricDimensionOperationType operator() {
        return this.operator;
    }

    /**
     * Set the operator property: the dimension operator. Only 'Equals' and 'NotEquals' are supported. 'Equals' being
     * equal to any of the values. 'NotEquals' being not equal to all of the values.
     *
     * @param operator the operator value to set.
     * @return the ScaleRuleMetricDimension object itself.
     */
    public ScaleRuleMetricDimension withOperator(ScaleRuleMetricDimensionOperationType operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the values property: list of dimension values. For example: ["App1","App2"].
     *
     * @return the values value.
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Set the values property: list of dimension values. For example: ["App1","App2"].
     *
     * @param values the values value to set.
     * @return the ScaleRuleMetricDimension object itself.
     */
    public ScaleRuleMetricDimension withValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dimensionName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dimensionName in model ScaleRuleMetricDimension"));
        }
        if (operator() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operator in model ScaleRuleMetricDimension"));
        }
        if (values() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property values in model ScaleRuleMetricDimension"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScaleRuleMetricDimension.class);
}

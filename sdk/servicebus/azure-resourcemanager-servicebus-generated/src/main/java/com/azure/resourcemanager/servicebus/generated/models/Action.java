// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the filter actions which are allowed for the transformation of a message that have been matched by a
 * filter expression.
 */
@Fluent
public class Action {
    /*
     * SQL expression. e.g. MyProperty='ABC'
     */
    @JsonProperty(value = "sqlExpression")
    private String sqlExpression;

    /*
     * This property is reserved for future use. An integer value showing the compatibility level, currently hard-coded
     * to 20.
     */
    @JsonProperty(value = "compatibilityLevel")
    private Integer compatibilityLevel;

    /*
     * Value that indicates whether the rule action requires preprocessing.
     */
    @JsonProperty(value = "requiresPreprocessing")
    private Boolean requiresPreprocessing;

    /** Creates an instance of Action class. */
    public Action() {
    }

    /**
     * Get the sqlExpression property: SQL expression. e.g. MyProperty='ABC'.
     *
     * @return the sqlExpression value.
     */
    public String sqlExpression() {
        return this.sqlExpression;
    }

    /**
     * Set the sqlExpression property: SQL expression. e.g. MyProperty='ABC'.
     *
     * @param sqlExpression the sqlExpression value to set.
     * @return the Action object itself.
     */
    public Action withSqlExpression(String sqlExpression) {
        this.sqlExpression = sqlExpression;
        return this;
    }

    /**
     * Get the compatibilityLevel property: This property is reserved for future use. An integer value showing the
     * compatibility level, currently hard-coded to 20.
     *
     * @return the compatibilityLevel value.
     */
    public Integer compatibilityLevel() {
        return this.compatibilityLevel;
    }

    /**
     * Set the compatibilityLevel property: This property is reserved for future use. An integer value showing the
     * compatibility level, currently hard-coded to 20.
     *
     * @param compatibilityLevel the compatibilityLevel value to set.
     * @return the Action object itself.
     */
    public Action withCompatibilityLevel(Integer compatibilityLevel) {
        this.compatibilityLevel = compatibilityLevel;
        return this;
    }

    /**
     * Get the requiresPreprocessing property: Value that indicates whether the rule action requires preprocessing.
     *
     * @return the requiresPreprocessing value.
     */
    public Boolean requiresPreprocessing() {
        return this.requiresPreprocessing;
    }

    /**
     * Set the requiresPreprocessing property: Value that indicates whether the rule action requires preprocessing.
     *
     * @param requiresPreprocessing the requiresPreprocessing value to set.
     * @return the Action object itself.
     */
    public Action withRequiresPreprocessing(Boolean requiresPreprocessing) {
        this.requiresPreprocessing = requiresPreprocessing;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

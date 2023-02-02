// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The definition of Azure Monitoring list. */
@Fluent
public final class OperationServiceSpecificationDefinition {
    /*
     * A list of Azure Monitoring metrics definition.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<OperationMetricSpecificationDefinition> metricSpecifications;

    /*
     * A list of Azure Monitoring log definitions.
     */
    @JsonProperty(value = "logSpecifications")
    private List<OperationLogSpecificationDefinition> logSpecifications;

    /** Creates an instance of OperationServiceSpecificationDefinition class. */
    public OperationServiceSpecificationDefinition() {
    }

    /**
     * Get the metricSpecifications property: A list of Azure Monitoring metrics definition.
     *
     * @return the metricSpecifications value.
     */
    public List<OperationMetricSpecificationDefinition> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: A list of Azure Monitoring metrics definition.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the OperationServiceSpecificationDefinition object itself.
     */
    public OperationServiceSpecificationDefinition withMetricSpecifications(
        List<OperationMetricSpecificationDefinition> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Get the logSpecifications property: A list of Azure Monitoring log definitions.
     *
     * @return the logSpecifications value.
     */
    public List<OperationLogSpecificationDefinition> logSpecifications() {
        return this.logSpecifications;
    }

    /**
     * Set the logSpecifications property: A list of Azure Monitoring log definitions.
     *
     * @param logSpecifications the logSpecifications value to set.
     * @return the OperationServiceSpecificationDefinition object itself.
     */
    public OperationServiceSpecificationDefinition withLogSpecifications(
        List<OperationLogSpecificationDefinition> logSpecifications) {
        this.logSpecifications = logSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
        if (logSpecifications() != null) {
            logSpecifications().forEach(e -> e.validate());
        }
    }
}

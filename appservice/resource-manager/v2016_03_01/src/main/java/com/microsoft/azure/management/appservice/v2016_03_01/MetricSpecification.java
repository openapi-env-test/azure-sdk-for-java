/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition of a single resource metric.
 */
public class MetricSpecification {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The displayName property.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The displayDescription property.
     */
    @JsonProperty(value = "displayDescription")
    private String displayDescription;

    /**
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * The aggregationType property.
     */
    @JsonProperty(value = "aggregationType")
    private String aggregationType;

    /**
     * The supportsInstanceLevelAggregation property.
     */
    @JsonProperty(value = "supportsInstanceLevelAggregation")
    private Boolean supportsInstanceLevelAggregation;

    /**
     * The enableRegionalMdmAccount property.
     */
    @JsonProperty(value = "enableRegionalMdmAccount")
    private Boolean enableRegionalMdmAccount;

    /**
     * The sourceMdmAccount property.
     */
    @JsonProperty(value = "sourceMdmAccount")
    private String sourceMdmAccount;

    /**
     * The sourceMdmNamespace property.
     */
    @JsonProperty(value = "sourceMdmNamespace")
    private String sourceMdmNamespace;

    /**
     * The metricFilterPattern property.
     */
    @JsonProperty(value = "metricFilterPattern")
    private String metricFilterPattern;

    /**
     * The fillGapWithZero property.
     */
    @JsonProperty(value = "fillGapWithZero")
    private Boolean fillGapWithZero;

    /**
     * The isInternal property.
     */
    @JsonProperty(value = "isInternal")
    private Boolean isInternal;

    /**
     * The dimensions property.
     */
    @JsonProperty(value = "dimensions")
    private List<Dimension> dimensions;

    /**
     * The category property.
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * The availabilities property.
     */
    @JsonProperty(value = "availabilities")
    private List<MetricAvailability> availabilities;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the displayDescription value.
     *
     * @return the displayDescription value
     */
    public String displayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription value.
     *
     * @param displayDescription the displayDescription value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the aggregationType value.
     *
     * @return the aggregationType value
     */
    public String aggregationType() {
        return this.aggregationType;
    }

    /**
     * Set the aggregationType value.
     *
     * @param aggregationType the aggregationType value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAggregationType(String aggregationType) {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Get the supportsInstanceLevelAggregation value.
     *
     * @return the supportsInstanceLevelAggregation value
     */
    public Boolean supportsInstanceLevelAggregation() {
        return this.supportsInstanceLevelAggregation;
    }

    /**
     * Set the supportsInstanceLevelAggregation value.
     *
     * @param supportsInstanceLevelAggregation the supportsInstanceLevelAggregation value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSupportsInstanceLevelAggregation(Boolean supportsInstanceLevelAggregation) {
        this.supportsInstanceLevelAggregation = supportsInstanceLevelAggregation;
        return this;
    }

    /**
     * Get the enableRegionalMdmAccount value.
     *
     * @return the enableRegionalMdmAccount value
     */
    public Boolean enableRegionalMdmAccount() {
        return this.enableRegionalMdmAccount;
    }

    /**
     * Set the enableRegionalMdmAccount value.
     *
     * @param enableRegionalMdmAccount the enableRegionalMdmAccount value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withEnableRegionalMdmAccount(Boolean enableRegionalMdmAccount) {
        this.enableRegionalMdmAccount = enableRegionalMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmAccount value.
     *
     * @return the sourceMdmAccount value
     */
    public String sourceMdmAccount() {
        return this.sourceMdmAccount;
    }

    /**
     * Set the sourceMdmAccount value.
     *
     * @param sourceMdmAccount the sourceMdmAccount value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmAccount(String sourceMdmAccount) {
        this.sourceMdmAccount = sourceMdmAccount;
        return this;
    }

    /**
     * Get the sourceMdmNamespace value.
     *
     * @return the sourceMdmNamespace value
     */
    public String sourceMdmNamespace() {
        return this.sourceMdmNamespace;
    }

    /**
     * Set the sourceMdmNamespace value.
     *
     * @param sourceMdmNamespace the sourceMdmNamespace value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withSourceMdmNamespace(String sourceMdmNamespace) {
        this.sourceMdmNamespace = sourceMdmNamespace;
        return this;
    }

    /**
     * Get the metricFilterPattern value.
     *
     * @return the metricFilterPattern value
     */
    public String metricFilterPattern() {
        return this.metricFilterPattern;
    }

    /**
     * Set the metricFilterPattern value.
     *
     * @param metricFilterPattern the metricFilterPattern value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withMetricFilterPattern(String metricFilterPattern) {
        this.metricFilterPattern = metricFilterPattern;
        return this;
    }

    /**
     * Get the fillGapWithZero value.
     *
     * @return the fillGapWithZero value
     */
    public Boolean fillGapWithZero() {
        return this.fillGapWithZero;
    }

    /**
     * Set the fillGapWithZero value.
     *
     * @param fillGapWithZero the fillGapWithZero value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withFillGapWithZero(Boolean fillGapWithZero) {
        this.fillGapWithZero = fillGapWithZero;
        return this;
    }

    /**
     * Get the isInternal value.
     *
     * @return the isInternal value
     */
    public Boolean isInternal() {
        return this.isInternal;
    }

    /**
     * Set the isInternal value.
     *
     * @param isInternal the isInternal value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    /**
     * Get the dimensions value.
     *
     * @return the dimensions value
     */
    public List<Dimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions value.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Get the category value.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category value.
     *
     * @param category the category value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the availabilities value.
     *
     * @return the availabilities value
     */
    public List<MetricAvailability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities value.
     *
     * @param availabilities the availabilities value to set
     * @return the MetricSpecification object itself.
     */
    public MetricSpecification withAvailabilities(List<MetricAvailability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

}

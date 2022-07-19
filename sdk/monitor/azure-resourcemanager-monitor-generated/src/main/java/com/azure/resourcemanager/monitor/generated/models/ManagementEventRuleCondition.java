// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A management event rule condition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.ManagementEventRuleCondition")
@Fluent
public final class ManagementEventRuleCondition extends RuleCondition {
    /*
     * How the data that is collected should be combined over time and when the
     * alert is activated. Note that for management event alerts aggregation is
     * optional – if it is not provided then any event will cause the alert to
     * activate.
     */
    @JsonProperty(value = "aggregation")
    private ManagementEventAggregationCondition aggregation;

    /**
     * Get the aggregation property: How the data that is collected should be combined over time and when the alert is
     * activated. Note that for management event alerts aggregation is optional – if it is not provided then any event
     * will cause the alert to activate.
     *
     * @return the aggregation value.
     */
    public ManagementEventAggregationCondition aggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: How the data that is collected should be combined over time and when the alert is
     * activated. Note that for management event alerts aggregation is optional – if it is not provided then any event
     * will cause the alert to activate.
     *
     * @param aggregation the aggregation value to set.
     * @return the ManagementEventRuleCondition object itself.
     */
    public ManagementEventRuleCondition withAggregation(ManagementEventAggregationCondition aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ManagementEventRuleCondition withDataSource(RuleDataSource dataSource) {
        super.withDataSource(dataSource);
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
        if (aggregation() != null) {
            aggregation().validate();
        }
    }
}

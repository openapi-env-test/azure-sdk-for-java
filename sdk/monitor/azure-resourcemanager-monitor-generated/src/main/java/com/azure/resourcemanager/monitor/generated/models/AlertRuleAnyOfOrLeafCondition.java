// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An Activity Log Alert rule condition that is met when all its member conditions are met. Each condition can be of one
 * of the following types: __Important__: Each type has its unique subset of properties. Properties from different types
 * CANNOT exist in one condition. * __Leaf Condition -__ must contain 'field' and either 'equals' or 'containsAny'.
 * _Please note, 'anyOf' should __not__ be set in a Leaf Condition._ * __AnyOf Condition -__ must contain __only__
 * 'anyOf' (which is an array of Leaf Conditions). _Please note, 'field', 'equals' and 'containsAny' should __not__ be
 * set in an AnyOf Condition._.
 */
@Fluent
public final class AlertRuleAnyOfOrLeafCondition extends AlertRuleLeafCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AlertRuleAnyOfOrLeafCondition.class);

    /*
     * An Activity Log Alert rule 'anyOf' condition. An Activity Log Alert rule
     * condition that is met when at least one of its member leaf conditions
     * are met.
     */
    @JsonProperty(value = "anyOf")
    private List<AlertRuleLeafCondition> anyOf;

    /**
     * Get the anyOf property: An Activity Log Alert rule 'anyOf' condition. An Activity Log Alert rule condition that
     * is met when at least one of its member leaf conditions are met.
     *
     * @return the anyOf value.
     */
    public List<AlertRuleLeafCondition> anyOf() {
        return this.anyOf;
    }

    /**
     * Set the anyOf property: An Activity Log Alert rule 'anyOf' condition. An Activity Log Alert rule condition that
     * is met when at least one of its member leaf conditions are met.
     *
     * @param anyOf the anyOf value to set.
     * @return the AlertRuleAnyOfOrLeafCondition object itself.
     */
    public AlertRuleAnyOfOrLeafCondition withAnyOf(List<AlertRuleLeafCondition> anyOf) {
        this.anyOf = anyOf;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AlertRuleAnyOfOrLeafCondition withField(String field) {
        super.withField(field);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AlertRuleAnyOfOrLeafCondition withEquals(String equals) {
        super.withEquals(equals);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AlertRuleAnyOfOrLeafCondition withContainsAny(List<String> containsAny) {
        super.withContainsAny(containsAny);
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
        if (anyOf() != null) {
            anyOf().forEach(e -> e.validate());
        }
    }
}

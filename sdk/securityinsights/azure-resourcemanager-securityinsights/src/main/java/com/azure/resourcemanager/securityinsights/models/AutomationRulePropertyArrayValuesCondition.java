// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AutomationRulePropertyArrayValuesCondition model. */
@Fluent
public final class AutomationRulePropertyArrayValuesCondition {
    /*
     * The arrayType property.
     */
    @JsonProperty(value = "arrayType")
    private AutomationRulePropertyArrayConditionSupportedArrayType arrayType;

    /*
     * The arrayConditionType property.
     */
    @JsonProperty(value = "arrayConditionType")
    private AutomationRulePropertyArrayConditionSupportedArrayConditionType arrayConditionType;

    /*
     * The itemConditions property.
     */
    @JsonProperty(value = "itemConditions")
    private List<AutomationRuleCondition> itemConditions;

    /**
     * Get the arrayType property: The arrayType property.
     *
     * @return the arrayType value.
     */
    public AutomationRulePropertyArrayConditionSupportedArrayType arrayType() {
        return this.arrayType;
    }

    /**
     * Set the arrayType property: The arrayType property.
     *
     * @param arrayType the arrayType value to set.
     * @return the AutomationRulePropertyArrayValuesCondition object itself.
     */
    public AutomationRulePropertyArrayValuesCondition withArrayType(
        AutomationRulePropertyArrayConditionSupportedArrayType arrayType) {
        this.arrayType = arrayType;
        return this;
    }

    /**
     * Get the arrayConditionType property: The arrayConditionType property.
     *
     * @return the arrayConditionType value.
     */
    public AutomationRulePropertyArrayConditionSupportedArrayConditionType arrayConditionType() {
        return this.arrayConditionType;
    }

    /**
     * Set the arrayConditionType property: The arrayConditionType property.
     *
     * @param arrayConditionType the arrayConditionType value to set.
     * @return the AutomationRulePropertyArrayValuesCondition object itself.
     */
    public AutomationRulePropertyArrayValuesCondition withArrayConditionType(
        AutomationRulePropertyArrayConditionSupportedArrayConditionType arrayConditionType) {
        this.arrayConditionType = arrayConditionType;
        return this;
    }

    /**
     * Get the itemConditions property: The itemConditions property.
     *
     * @return the itemConditions value.
     */
    public List<AutomationRuleCondition> itemConditions() {
        return this.itemConditions;
    }

    /**
     * Set the itemConditions property: The itemConditions property.
     *
     * @param itemConditions the itemConditions value to set.
     * @return the AutomationRulePropertyArrayValuesCondition object itself.
     */
    public AutomationRulePropertyArrayValuesCondition withItemConditions(List<AutomationRuleCondition> itemConditions) {
        this.itemConditions = itemConditions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (itemConditions() != null) {
            itemConditions().forEach(e -> e.validate());
        }
    }
}

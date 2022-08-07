// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.generated.fluent.models.DataMaskingRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to a list data masking rules request. */
@Fluent
public final class DataMaskingRuleListResult {
    /*
     * The list of database data masking rules.
     */
    @JsonProperty(value = "value")
    private List<DataMaskingRuleInner> value;

    /**
     * Get the value property: The list of database data masking rules.
     *
     * @return the value value.
     */
    public List<DataMaskingRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database data masking rules.
     *
     * @param value the value value to set.
     * @return the DataMaskingRuleListResult object itself.
     */
    public DataMaskingRuleListResult withValue(List<DataMaskingRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

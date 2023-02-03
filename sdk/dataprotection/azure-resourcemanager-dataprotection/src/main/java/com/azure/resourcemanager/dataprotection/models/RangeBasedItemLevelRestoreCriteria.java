// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Item Level target info for restore operation. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("RangeBasedItemLevelRestoreCriteria")
@Fluent
public final class RangeBasedItemLevelRestoreCriteria extends ItemLevelRestoreCriteria {
    /*
     * minimum value for range prefix match
     */
    @JsonProperty(value = "minMatchingValue")
    private String minMatchingValue;

    /*
     * maximum value for range prefix match
     */
    @JsonProperty(value = "maxMatchingValue")
    private String maxMatchingValue;

    /** Creates an instance of RangeBasedItemLevelRestoreCriteria class. */
    public RangeBasedItemLevelRestoreCriteria() {
    }

    /**
     * Get the minMatchingValue property: minimum value for range prefix match.
     *
     * @return the minMatchingValue value.
     */
    public String minMatchingValue() {
        return this.minMatchingValue;
    }

    /**
     * Set the minMatchingValue property: minimum value for range prefix match.
     *
     * @param minMatchingValue the minMatchingValue value to set.
     * @return the RangeBasedItemLevelRestoreCriteria object itself.
     */
    public RangeBasedItemLevelRestoreCriteria withMinMatchingValue(String minMatchingValue) {
        this.minMatchingValue = minMatchingValue;
        return this;
    }

    /**
     * Get the maxMatchingValue property: maximum value for range prefix match.
     *
     * @return the maxMatchingValue value.
     */
    public String maxMatchingValue() {
        return this.maxMatchingValue;
    }

    /**
     * Set the maxMatchingValue property: maximum value for range prefix match.
     *
     * @param maxMatchingValue the maxMatchingValue value to set.
     * @return the RangeBasedItemLevelRestoreCriteria object itself.
     */
    public RangeBasedItemLevelRestoreCriteria withMaxMatchingValue(String maxMatchingValue) {
        this.maxMatchingValue = maxMatchingValue;
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
    }
}

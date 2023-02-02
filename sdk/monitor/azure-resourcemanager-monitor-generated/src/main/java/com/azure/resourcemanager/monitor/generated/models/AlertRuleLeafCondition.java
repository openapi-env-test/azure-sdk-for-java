// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An Activity Log Alert rule condition that is met by comparing the field and value of an Activity Log event. This
 * condition must contain 'field' and either 'equals' or 'containsAny'.
 */
@Fluent
public class AlertRuleLeafCondition {
    /*
     * The name of the Activity Log event's field that this condition will examine.
     * The possible values for this field are (case-insensitive): 'resourceId', 'category', 'caller', 'level',
     * 'operationName', 'resourceGroup', 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything
     * beginning with 'properties'.
     */
    @JsonProperty(value = "field")
    private String field;

    /*
     * The value of the event's field will be compared to this value (case-insensitive) to determine if the condition
     * is met.
     */
    @JsonProperty(value = "equals")
    private String equals;

    /*
     * The value of the event's field will be compared to the values in this array (case-insensitive) to determine if
     * the condition is met.
     */
    @JsonProperty(value = "containsAny")
    private List<String> containsAny;

    /** Creates an instance of AlertRuleLeafCondition class. */
    public AlertRuleLeafCondition() {
    }

    /**
     * Get the field property: The name of the Activity Log event's field that this condition will examine. The possible
     * values for this field are (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName',
     * 'resourceGroup', 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with
     * 'properties'.
     *
     * @return the field value.
     */
    public String field() {
        return this.field;
    }

    /**
     * Set the field property: The name of the Activity Log event's field that this condition will examine. The possible
     * values for this field are (case-insensitive): 'resourceId', 'category', 'caller', 'level', 'operationName',
     * 'resourceGroup', 'resourceProvider', 'status', 'subStatus', 'resourceType', or anything beginning with
     * 'properties'.
     *
     * @param field the field value to set.
     * @return the AlertRuleLeafCondition object itself.
     */
    public AlertRuleLeafCondition withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get the equals property: The value of the event's field will be compared to this value (case-insensitive) to
     * determine if the condition is met.
     *
     * @return the equals value.
     */
    public String equals() {
        return this.equals;
    }

    /**
     * Set the equals property: The value of the event's field will be compared to this value (case-insensitive) to
     * determine if the condition is met.
     *
     * @param equals the equals value to set.
     * @return the AlertRuleLeafCondition object itself.
     */
    public AlertRuleLeafCondition withEquals(String equals) {
        this.equals = equals;
        return this;
    }

    /**
     * Get the containsAny property: The value of the event's field will be compared to the values in this array
     * (case-insensitive) to determine if the condition is met.
     *
     * @return the containsAny value.
     */
    public List<String> containsAny() {
        return this.containsAny;
    }

    /**
     * Set the containsAny property: The value of the event's field will be compared to the values in this array
     * (case-insensitive) to determine if the condition is met.
     *
     * @param containsAny the containsAny value to set.
     * @return the AlertRuleLeafCondition object itself.
     */
    public AlertRuleLeafCondition withContainsAny(List<String> containsAny) {
        this.containsAny = containsAny;
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

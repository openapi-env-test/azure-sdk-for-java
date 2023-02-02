// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.generated.models.Name;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ARM usage. */
@Immutable
public final class UsageInner {
    /*
     * Resource ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private Name name;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Usage unit.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Usage current value.
     */
    @JsonProperty(value = "currentValue", access = JsonProperty.Access.WRITE_ONLY)
    private Integer currentValue;

    /*
     * Usage limit.
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /*
     * Usage requested limit.
     */
    @JsonProperty(value = "requestedLimit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer requestedLimit;

    /** Creates an instance of UsageInner class. */
    public UsageInner() {
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public Name name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the unit property: Usage unit.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the currentValue property: Usage current value.
     *
     * @return the currentValue value.
     */
    public Integer currentValue() {
        return this.currentValue;
    }

    /**
     * Get the limit property: Usage limit.
     *
     * @return the limit value.
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the requestedLimit property: Usage requested limit.
     *
     * @return the requestedLimit value.
     */
    public Integer requestedLimit() {
        return this.requestedLimit;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}

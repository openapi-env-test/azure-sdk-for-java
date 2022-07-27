// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A long term retention policy. */
@Fluent
public final class LongTermRetentionPolicyInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private BaseLongTermRetentionPolicyProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private BaseLongTermRetentionPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the weeklyRetention property: The weekly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @return the weeklyRetention value.
     */
    public String weeklyRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().weeklyRetention();
    }

    /**
     * Set the weeklyRetention property: The weekly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @param weeklyRetention the weeklyRetention value to set.
     * @return the LongTermRetentionPolicyInner object itself.
     */
    public LongTermRetentionPolicyInner withWeeklyRetention(String weeklyRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withWeeklyRetention(weeklyRetention);
        return this;
    }

    /**
     * Get the monthlyRetention property: The monthly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @return the monthlyRetention value.
     */
    public String monthlyRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().monthlyRetention();
    }

    /**
     * Set the monthlyRetention property: The monthly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @param monthlyRetention the monthlyRetention value to set.
     * @return the LongTermRetentionPolicyInner object itself.
     */
    public LongTermRetentionPolicyInner withMonthlyRetention(String monthlyRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withMonthlyRetention(monthlyRetention);
        return this;
    }

    /**
     * Get the yearlyRetention property: The yearly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @return the yearlyRetention value.
     */
    public String yearlyRetention() {
        return this.innerProperties() == null ? null : this.innerProperties().yearlyRetention();
    }

    /**
     * Set the yearlyRetention property: The yearly retention policy for an LTR backup in an ISO 8601 format.
     *
     * @param yearlyRetention the yearlyRetention value to set.
     * @return the LongTermRetentionPolicyInner object itself.
     */
    public LongTermRetentionPolicyInner withYearlyRetention(String yearlyRetention) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withYearlyRetention(yearlyRetention);
        return this;
    }

    /**
     * Get the weekOfYear property: The week of year to take the yearly backup in an ISO 8601 format.
     *
     * @return the weekOfYear value.
     */
    public Integer weekOfYear() {
        return this.innerProperties() == null ? null : this.innerProperties().weekOfYear();
    }

    /**
     * Set the weekOfYear property: The week of year to take the yearly backup in an ISO 8601 format.
     *
     * @param weekOfYear the weekOfYear value to set.
     * @return the LongTermRetentionPolicyInner object itself.
     */
    public LongTermRetentionPolicyInner withWeekOfYear(Integer weekOfYear) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BaseLongTermRetentionPolicyProperties();
        }
        this.innerProperties().withWeekOfYear(weekOfYear);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

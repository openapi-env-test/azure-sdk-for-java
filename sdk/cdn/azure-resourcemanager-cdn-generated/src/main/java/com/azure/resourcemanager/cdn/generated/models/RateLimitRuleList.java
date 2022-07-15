// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines contents of rate limit rules. */
@Fluent
public final class RateLimitRuleList {
    /*
     * List of rules
     */
    @JsonProperty(value = "rules")
    private List<RateLimitRule> rules;

    /**
     * Get the rules property: List of rules.
     *
     * @return the rules value.
     */
    public List<RateLimitRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules.
     *
     * @param rules the rules value to set.
     * @return the RateLimitRuleList object itself.
     */
    public RateLimitRuleList withRules(List<RateLimitRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}

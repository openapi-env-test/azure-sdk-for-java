// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set of conditions in the Rewrite Rule in Application Gateway. */
@Fluent
public final class ApplicationGatewayRewriteRuleCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayRewriteRuleCondition.class);

    /*
     * The condition parameter of the RewriteRuleCondition.
     */
    @JsonProperty(value = "variable")
    private String variable;

    /*
     * The pattern, either fixed string or regular expression, that evaluates
     * the truthfulness of the condition.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /*
     * Setting this paramter to truth value with force the pattern to do a case
     * in-sensitive comparison.
     */
    @JsonProperty(value = "ignoreCase")
    private Boolean ignoreCase;

    /*
     * Setting this value as truth will force to check the negation of the
     * condition given by the user.
     */
    @JsonProperty(value = "negate")
    private Boolean negate;

    /**
     * Get the variable property: The condition parameter of the RewriteRuleCondition.
     *
     * @return the variable value.
     */
    public String variable() {
        return this.variable;
    }

    /**
     * Set the variable property: The condition parameter of the RewriteRuleCondition.
     *
     * @param variable the variable value to set.
     * @return the ApplicationGatewayRewriteRuleCondition object itself.
     */
    public ApplicationGatewayRewriteRuleCondition withVariable(String variable) {
        this.variable = variable;
        return this;
    }

    /**
     * Get the pattern property: The pattern, either fixed string or regular expression, that evaluates the truthfulness
     * of the condition.
     *
     * @return the pattern value.
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set the pattern property: The pattern, either fixed string or regular expression, that evaluates the truthfulness
     * of the condition.
     *
     * @param pattern the pattern value to set.
     * @return the ApplicationGatewayRewriteRuleCondition object itself.
     */
    public ApplicationGatewayRewriteRuleCondition withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get the ignoreCase property: Setting this paramter to truth value with force the pattern to do a case
     * in-sensitive comparison.
     *
     * @return the ignoreCase value.
     */
    public Boolean ignoreCase() {
        return this.ignoreCase;
    }

    /**
     * Set the ignoreCase property: Setting this paramter to truth value with force the pattern to do a case
     * in-sensitive comparison.
     *
     * @param ignoreCase the ignoreCase value to set.
     * @return the ApplicationGatewayRewriteRuleCondition object itself.
     */
    public ApplicationGatewayRewriteRuleCondition withIgnoreCase(Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
        return this;
    }

    /**
     * Get the negate property: Setting this value as truth will force to check the negation of the condition given by
     * the user.
     *
     * @return the negate value.
     */
    public Boolean negate() {
        return this.negate;
    }

    /**
     * Set the negate property: Setting this value as truth will force to check the negation of the condition given by
     * the user.
     *
     * @param negate the negate value to set.
     * @return the ApplicationGatewayRewriteRuleCondition object itself.
     */
    public ApplicationGatewayRewriteRuleCondition withNegate(Boolean negate) {
        this.negate = negate;
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Policy definition summary. */
@Fluent
public final class PolicyDefinitionSummary {
    /*
     * Policy definition ID.
     */
    @JsonProperty(value = "policyDefinitionId")
    private String policyDefinitionId;

    /*
     * Policy definition reference ID.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /*
     * Policy definition group names.
     */
    @JsonProperty(value = "policyDefinitionGroupNames")
    private List<String> policyDefinitionGroupNames;

    /*
     * Policy effect, i.e. policy definition action.
     */
    @JsonProperty(value = "effect")
    private String effect;

    /*
     * Compliance summary for the policy definition.
     */
    @JsonProperty(value = "results")
    private SummaryResults results;

    /**
     * Get the policyDefinitionId property: Policy definition ID.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: Policy definition ID.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: Policy definition reference ID.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: Policy definition reference ID.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get the policyDefinitionGroupNames property: Policy definition group names.
     *
     * @return the policyDefinitionGroupNames value.
     */
    public List<String> policyDefinitionGroupNames() {
        return this.policyDefinitionGroupNames;
    }

    /**
     * Set the policyDefinitionGroupNames property: Policy definition group names.
     *
     * @param policyDefinitionGroupNames the policyDefinitionGroupNames value to set.
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withPolicyDefinitionGroupNames(List<String> policyDefinitionGroupNames) {
        this.policyDefinitionGroupNames = policyDefinitionGroupNames;
        return this;
    }

    /**
     * Get the effect property: Policy effect, i.e. policy definition action.
     *
     * @return the effect value.
     */
    public String effect() {
        return this.effect;
    }

    /**
     * Set the effect property: Policy effect, i.e. policy definition action.
     *
     * @param effect the effect value to set.
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Get the results property: Compliance summary for the policy definition.
     *
     * @return the results value.
     */
    public SummaryResults results() {
        return this.results;
    }

    /**
     * Set the results property: Compliance summary for the policy definition.
     *
     * @param results the results value to set.
     * @return the PolicyDefinitionSummary object itself.
     */
    public PolicyDefinitionSummary withResults(SummaryResults results) {
        this.results = results;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (results() != null) {
            results().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Allow to exclude some variable satisfy the condition for the WAF check. */
@Fluent
public final class ManagedRulesDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedRulesDefinition.class);

    /*
     * Describes the Exclusions that are applied on the policy.
     */
    @JsonProperty(value = "exclusions")
    private List<OwaspCrsExclusionEntry> exclusions;

    /*
     * Describes the ruleSets that are associated with the policy.
     */
    @JsonProperty(value = "managedRuleSets", required = true)
    private List<ManagedRuleSet> managedRuleSets;

    /**
     * Get the exclusions property: Describes the Exclusions that are applied on the policy.
     *
     * @return the exclusions value.
     */
    public List<OwaspCrsExclusionEntry> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: Describes the Exclusions that are applied on the policy.
     *
     * @param exclusions the exclusions value to set.
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withExclusions(List<OwaspCrsExclusionEntry> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get the managedRuleSets property: Describes the ruleSets that are associated with the policy.
     *
     * @return the managedRuleSets value.
     */
    public List<ManagedRuleSet> managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Set the managedRuleSets property: Describes the ruleSets that are associated with the policy.
     *
     * @param managedRuleSets the managedRuleSets value to set.
     * @return the ManagedRulesDefinition object itself.
     */
    public ManagedRulesDefinition withManagedRuleSets(List<ManagedRuleSet> managedRuleSets) {
        this.managedRuleSets = managedRuleSets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
        if (managedRuleSets() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property managedRuleSets in model ManagedRulesDefinition"));
        } else {
            managedRuleSets().forEach(e -> e.validate());
        }
    }
}

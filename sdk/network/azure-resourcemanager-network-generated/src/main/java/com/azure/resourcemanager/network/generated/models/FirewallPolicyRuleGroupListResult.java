// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.FirewallPolicyRuleGroupInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListFirewallPolicyRuleGroups API service call. */
@Fluent
public final class FirewallPolicyRuleGroupListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyRuleGroupListResult.class);

    /*
     * List of FirewallPolicyRuleGroups in a FirewallPolicy.
     */
    @JsonProperty(value = "value")
    private List<FirewallPolicyRuleGroupInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of FirewallPolicyRuleGroups in a FirewallPolicy.
     *
     * @return the value value.
     */
    public List<FirewallPolicyRuleGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of FirewallPolicyRuleGroups in a FirewallPolicy.
     *
     * @param value the value value to set.
     * @return the FirewallPolicyRuleGroupListResult object itself.
     */
    public FirewallPolicyRuleGroupListResult withValue(List<FirewallPolicyRuleGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the FirewallPolicyRuleGroupListResult object itself.
     */
    public FirewallPolicyRuleGroupListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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

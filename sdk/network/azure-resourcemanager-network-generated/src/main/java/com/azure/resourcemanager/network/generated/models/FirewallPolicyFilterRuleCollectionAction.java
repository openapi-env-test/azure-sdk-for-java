// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the FirewallPolicyFilterRuleCollectionAction. */
@Fluent
public final class FirewallPolicyFilterRuleCollectionAction {
    /*
     * The type of action.
     */
    @JsonProperty(value = "type")
    private FirewallPolicyFilterRuleCollectionActionType type;

    /**
     * Get the type property: The type of action.
     *
     * @return the type value.
     */
    public FirewallPolicyFilterRuleCollectionActionType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of action.
     *
     * @param type the type value to set.
     * @return the FirewallPolicyFilterRuleCollectionAction object itself.
     */
    public FirewallPolicyFilterRuleCollectionAction withType(FirewallPolicyFilterRuleCollectionActionType type) {
        this.type = type;
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

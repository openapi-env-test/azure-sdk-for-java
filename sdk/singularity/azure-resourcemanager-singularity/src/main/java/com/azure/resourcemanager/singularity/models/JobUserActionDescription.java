// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes properties for the user action of Singularity jobs. */
@Fluent
public final class JobUserActionDescription {
    /*
     * The name of the group policy.
     */
    @JsonProperty(value = "groupPolicyName")
    private String groupPolicyName;

    /**
     * Get the groupPolicyName property: The name of the group policy.
     *
     * @return the groupPolicyName value.
     */
    public String groupPolicyName() {
        return this.groupPolicyName;
    }

    /**
     * Set the groupPolicyName property: The name of the group policy.
     *
     * @param groupPolicyName the groupPolicyName value to set.
     * @return the JobUserActionDescription object itself.
     */
    public JobUserActionDescription withGroupPolicyName(String groupPolicyName) {
        this.groupPolicyName = groupPolicyName;
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

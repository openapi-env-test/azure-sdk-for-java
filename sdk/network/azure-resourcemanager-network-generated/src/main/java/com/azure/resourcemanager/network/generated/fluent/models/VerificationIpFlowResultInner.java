// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.Access;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Results of IP flow verification on the target resource. */
@Fluent
public final class VerificationIpFlowResultInner {
    /*
     * Indicates whether the traffic is allowed or denied.
     */
    @JsonProperty(value = "access")
    private Access access;

    /*
     * Name of the rule. If input is not matched against any security rule, it is not displayed.
     */
    @JsonProperty(value = "ruleName")
    private String ruleName;

    /** Creates an instance of VerificationIpFlowResultInner class. */
    public VerificationIpFlowResultInner() {
    }

    /**
     * Get the access property: Indicates whether the traffic is allowed or denied.
     *
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access property: Indicates whether the traffic is allowed or denied.
     *
     * @param access the access value to set.
     * @return the VerificationIpFlowResultInner object itself.
     */
    public VerificationIpFlowResultInner withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the ruleName property: Name of the rule. If input is not matched against any security rule, it is not
     * displayed.
     *
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: Name of the rule. If input is not matched against any security rule, it is not
     * displayed.
     *
     * @param ruleName the ruleName value to set.
     * @return the VerificationIpFlowResultInner object itself.
     */
    public VerificationIpFlowResultInner withRuleName(String ruleName) {
        this.ruleName = ruleName;
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

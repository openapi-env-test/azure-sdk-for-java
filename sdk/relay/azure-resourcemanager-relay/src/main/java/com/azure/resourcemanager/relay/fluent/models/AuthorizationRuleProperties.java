// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.relay.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties supplied to create or update AuthorizationRule. */
@Fluent
public final class AuthorizationRuleProperties {
    /*
     * The rights associated with the rule.
     */
    @JsonProperty(value = "rights", required = true)
    private List<AccessRights> rights;

    /**
     * Get the rights property: The rights associated with the rule.
     *
     * @return the rights value.
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights property: The rights associated with the rule.
     *
     * @param rights the rights value to set.
     * @return the AuthorizationRuleProperties object itself.
     */
    public AuthorizationRuleProperties withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rights() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property rights in model AuthorizationRuleProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AuthorizationRuleProperties.class);
}

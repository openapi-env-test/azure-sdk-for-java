// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network interface and its custom security rules. */
@Fluent
public final class SubnetAssociation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubnetAssociation.class);

    /*
     * Subnet ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Collection of custom security rules.
     */
    @JsonProperty(value = "securityRules")
    private List<SecurityRuleInner> securityRules;

    /**
     * Get the id property: Subnet ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the securityRules property: Collection of custom security rules.
     *
     * @return the securityRules value.
     */
    public List<SecurityRuleInner> securityRules() {
        return this.securityRules;
    }

    /**
     * Set the securityRules property: Collection of custom security rules.
     *
     * @param securityRules the securityRules value to set.
     * @return the SubnetAssociation object itself.
     */
    public SubnetAssociation withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.securityRules = securityRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityRules() != null) {
            securityRules().forEach(e -> e.validate());
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The Storage Account Data Policies properties. */
@Immutable
public final class StorageAccountManagementPoliciesRulesProperty extends ManagementPoliciesRules {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(StorageAccountManagementPoliciesRulesProperty.class);

    /*
     * Returns the date and time the ManagementPolicies was last modified.
     */
    @JsonProperty(value = "lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /**
     * Get the lastModifiedTime property: Returns the date and time the ManagementPolicies was last modified.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /** {@inheritDoc} */
    @Override
    public StorageAccountManagementPoliciesRulesProperty withPolicy(Object policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

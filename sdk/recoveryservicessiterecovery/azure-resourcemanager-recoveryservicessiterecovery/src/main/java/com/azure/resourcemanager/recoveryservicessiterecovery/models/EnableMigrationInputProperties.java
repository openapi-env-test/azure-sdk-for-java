// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Enable migration input properties. */
@Fluent
public final class EnableMigrationInputProperties {
    /*
     * The policy Id.
     */
    @JsonProperty(value = "policyId", required = true)
    private String policyId;

    /*
     * The provider specific details.
     */
    @JsonProperty(value = "providerSpecificDetails", required = true)
    private EnableMigrationProviderSpecificInput providerSpecificDetails;

    /**
     * Get the policyId property: The policy Id.
     *
     * @return the policyId value.
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the policyId property: The policy Id.
     *
     * @param policyId the policyId value to set.
     * @return the EnableMigrationInputProperties object itself.
     */
    public EnableMigrationInputProperties withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the providerSpecificDetails property: The provider specific details.
     *
     * @return the providerSpecificDetails value.
     */
    public EnableMigrationProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The provider specific details.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the EnableMigrationInputProperties object itself.
     */
    public EnableMigrationInputProperties withProviderSpecificDetails(
        EnableMigrationProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property policyId in model EnableMigrationInputProperties"));
        }
        if (providerSpecificDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerSpecificDetails in model EnableMigrationInputProperties"));
        } else {
            providerSpecificDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(EnableMigrationInputProperties.class);
}

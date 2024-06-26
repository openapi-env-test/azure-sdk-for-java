// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Add Disks input properties. */
@Fluent
public final class AddDisksInputProperties {
    /*
     * The ReplicationProviderInput. For HyperVReplicaAzure provider, it will be AzureEnableProtectionInput object. For
     * San provider, it will be SanEnableProtectionInput object. For HyperVReplicaAzure provider, it can be null.
     */
    @JsonProperty(value = "providerSpecificDetails", required = true)
    private AddDisksProviderSpecificInput providerSpecificDetails;

    /** Creates an instance of AddDisksInputProperties class. */
    public AddDisksInputProperties() {
    }

    /**
     * Get the providerSpecificDetails property: The ReplicationProviderInput. For HyperVReplicaAzure provider, it will
     * be AzureEnableProtectionInput object. For San provider, it will be SanEnableProtectionInput object. For
     * HyperVReplicaAzure provider, it can be null.
     *
     * @return the providerSpecificDetails value.
     */
    public AddDisksProviderSpecificInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set the providerSpecificDetails property: The ReplicationProviderInput. For HyperVReplicaAzure provider, it will
     * be AzureEnableProtectionInput object. For San provider, it will be SanEnableProtectionInput object. For
     * HyperVReplicaAzure provider, it can be null.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set.
     * @return the AddDisksInputProperties object itself.
     */
    public AddDisksInputProperties withProviderSpecificDetails(AddDisksProviderSpecificInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property providerSpecificDetails in model AddDisksInputProperties"));
        } else {
            providerSpecificDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AddDisksInputProperties.class);
}

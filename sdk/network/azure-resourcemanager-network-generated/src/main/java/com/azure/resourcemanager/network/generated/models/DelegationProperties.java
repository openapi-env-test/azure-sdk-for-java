// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the delegation. */
@Fluent
public final class DelegationProperties {
    /*
     * The service name to which the NVA is delegated.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /*
     * The current provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of DelegationProperties class. */
    public DelegationProperties() {
    }

    /**
     * Get the serviceName property: The service name to which the NVA is delegated.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The service name to which the NVA is delegated.
     *
     * @param serviceName the serviceName value to set.
     * @return the DelegationProperties object itself.
     */
    public DelegationProperties withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the provisioningState property: The current provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

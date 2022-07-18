// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an update mobility service request. */
@Fluent
public final class UpdateMobilityServiceRequestProperties {
    /*
     * The CS run as account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /**
     * Get the runAsAccountId property: The CS run as account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: The CS run as account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the UpdateMobilityServiceRequestProperties object itself.
     */
    public UpdateMobilityServiceRequestProperties withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
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

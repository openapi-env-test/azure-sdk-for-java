// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The metadata of the cloud environment (Azure/GCP/AWS/OCI...). */
@Immutable
public final class CloudMetadata {
    /*
     * Specifies the cloud provider (Azure/AWS/GCP...).
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Get the provider property: Specifies the cloud provider (Azure/AWS/GCP...).
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

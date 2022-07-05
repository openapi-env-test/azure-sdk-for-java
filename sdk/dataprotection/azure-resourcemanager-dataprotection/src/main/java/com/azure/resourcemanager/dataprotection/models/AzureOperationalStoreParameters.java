// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Parameters for Operational-Tier DataStore. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureOperationalStoreParameters")
@Fluent
public final class AzureOperationalStoreParameters extends DataStoreParameters {
    /*
     * Gets or sets the Snapshot Resource Group Uri.
     */
    @JsonProperty(value = "resourceGroupId")
    private String resourceGroupId;

    /**
     * Get the resourceGroupId property: Gets or sets the Snapshot Resource Group Uri.
     *
     * @return the resourceGroupId value.
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Set the resourceGroupId property: Gets or sets the Snapshot Resource Group Uri.
     *
     * @param resourceGroupId the resourceGroupId value to set.
     * @return the AzureOperationalStoreParameters object itself.
     */
    public AzureOperationalStoreParameters withResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureOperationalStoreParameters withDataStoreType(DataStoreTypes dataStoreType) {
        super.withDataStoreType(dataStoreType);
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

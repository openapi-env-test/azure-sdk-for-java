// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Base definition for Azure datastore contents configuration. */
@Fluent
public class AzureDatastore {
    /*
     * Azure Resource Group name
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /*
     * Azure Subscription Id
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * Get the resourceGroup property: Azure Resource Group name.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: Azure Resource Group name.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the AzureDatastore object itself.
     */
    public AzureDatastore withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the subscriptionId property: Azure Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Azure Subscription Id.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDatastore object itself.
     */
    public AzureDatastore withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
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

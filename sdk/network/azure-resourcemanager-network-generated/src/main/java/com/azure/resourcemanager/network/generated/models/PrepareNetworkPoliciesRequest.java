// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PrepareNetworkPoliciesRequest model. */
@Fluent
public final class PrepareNetworkPoliciesRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrepareNetworkPoliciesRequest.class);

    /*
     * The name of the service for which subnet is being prepared for.
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /*
     * The name of the resource group where the Network Intent Policy will be
     * stored.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * A list of NetworkIntentPolicyConfiguration.
     */
    @JsonProperty(value = "networkIntentPolicyConfigurations")
    private List<NetworkIntentPolicyConfiguration> networkIntentPolicyConfigurations;

    /**
     * Get the serviceName property: The name of the service for which subnet is being prepared for.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service for which subnet is being prepared for.
     *
     * @param serviceName the serviceName value to set.
     * @return the PrepareNetworkPoliciesRequest object itself.
     */
    public PrepareNetworkPoliciesRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the resourceGroupName property: The name of the resource group where the Network Intent Policy will be
     * stored.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: The name of the resource group where the Network Intent Policy will be
     * stored.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the PrepareNetworkPoliciesRequest object itself.
     */
    public PrepareNetworkPoliciesRequest withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the networkIntentPolicyConfigurations property: A list of NetworkIntentPolicyConfiguration.
     *
     * @return the networkIntentPolicyConfigurations value.
     */
    public List<NetworkIntentPolicyConfiguration> networkIntentPolicyConfigurations() {
        return this.networkIntentPolicyConfigurations;
    }

    /**
     * Set the networkIntentPolicyConfigurations property: A list of NetworkIntentPolicyConfiguration.
     *
     * @param networkIntentPolicyConfigurations the networkIntentPolicyConfigurations value to set.
     * @return the PrepareNetworkPoliciesRequest object itself.
     */
    public PrepareNetworkPoliciesRequest withNetworkIntentPolicyConfigurations(
        List<NetworkIntentPolicyConfiguration> networkIntentPolicyConfigurations) {
        this.networkIntentPolicyConfigurations = networkIntentPolicyConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkIntentPolicyConfigurations() != null) {
            networkIntentPolicyConfigurations().forEach(e -> e.validate());
        }
    }
}

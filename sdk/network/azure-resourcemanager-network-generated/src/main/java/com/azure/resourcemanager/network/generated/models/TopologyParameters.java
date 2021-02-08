// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters that define the representation of topology. */
@Fluent
public final class TopologyParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopologyParameters.class);

    /*
     * The name of the target resource group to perform topology on.
     */
    @JsonProperty(value = "targetResourceGroupName", required = true)
    private String targetResourceGroupName;

    /**
     * Get the targetResourceGroupName property: The name of the target resource group to perform topology on.
     *
     * @return the targetResourceGroupName value.
     */
    public String targetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    /**
     * Set the targetResourceGroupName property: The name of the target resource group to perform topology on.
     *
     * @param targetResourceGroupName the targetResourceGroupName value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetResourceGroupName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetResourceGroupName in model TopologyParameters"));
        }
    }
}

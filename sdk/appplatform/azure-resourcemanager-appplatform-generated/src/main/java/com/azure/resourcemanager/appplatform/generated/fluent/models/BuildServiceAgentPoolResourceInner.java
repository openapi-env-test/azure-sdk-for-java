// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.generated.models.BuildServiceAgentPoolProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The build service agent pool resource. */
@Fluent
public final class BuildServiceAgentPoolResourceInner extends ProxyResource {
    /*
     * build service agent pool properties
     */
    @JsonProperty(value = "properties")
    private BuildServiceAgentPoolProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: build service agent pool properties.
     *
     * @return the properties value.
     */
    public BuildServiceAgentPoolProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: build service agent pool properties.
     *
     * @param properties the properties value to set.
     * @return the BuildServiceAgentPoolResourceInner object itself.
     */
    public BuildServiceAgentPoolResourceInner withProperties(BuildServiceAgentPoolProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}

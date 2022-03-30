// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.generated.models.BuildResultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Build result resource payload. */
@Fluent
public final class BuildResultInner extends ProxyResource {
    /*
     * Properties of the build result resource
     */
    @JsonProperty(value = "properties")
    private BuildResultProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Properties of the build result resource.
     *
     * @return the properties value.
     */
    public BuildResultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the build result resource.
     *
     * @param properties the properties value to set.
     * @return the BuildResultInner object itself.
     */
    public BuildResultInner withProperties(BuildResultProperties properties) {
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

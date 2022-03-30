// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.generated.models.SupportedBuildpackResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported buildpack resource payload. */
@Fluent
public final class SupportedBuildpackResourceInner extends ProxyResource {
    /*
     * Supported buildpack resource properties
     */
    @JsonProperty(value = "properties")
    private SupportedBuildpackResourceProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Supported buildpack resource properties.
     *
     * @return the properties value.
     */
    public SupportedBuildpackResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Supported buildpack resource properties.
     *
     * @param properties the properties value to set.
     * @return the SupportedBuildpackResourceInner object itself.
     */
    public SupportedBuildpackResourceInner withProperties(SupportedBuildpackResourceProperties properties) {
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

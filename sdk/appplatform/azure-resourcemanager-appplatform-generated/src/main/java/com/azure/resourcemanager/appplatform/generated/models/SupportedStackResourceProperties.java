// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Supported stack resource properties. */
@Fluent
public final class SupportedStackResourceProperties {
    /*
     * The id of supported stack
     */
    @JsonProperty(value = "stackId")
    private String stackId;

    /*
     * The version of supported stack
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the stackId property: The id of supported stack.
     *
     * @return the stackId value.
     */
    public String stackId() {
        return this.stackId;
    }

    /**
     * Set the stackId property: The id of supported stack.
     *
     * @param stackId the stackId value to set.
     * @return the SupportedStackResourceProperties object itself.
     */
    public SupportedStackResourceProperties withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * Get the version property: The version of supported stack.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of supported stack.
     *
     * @param version the version value to set.
     * @return the SupportedStackResourceProperties object itself.
     */
    public SupportedStackResourceProperties withVersion(String version) {
        this.version = version;
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of idle resources handling policy. */
@Fluent
public final class IdleResourcesHandlingPolicy {
    /*
     * The idleResourcesHandlingMode property.
     */
    @JsonProperty(value = "idleResourcesHandlingMode")
    private IdleResourcesHandlingMode idleResourcesHandlingMode;

    /**
     * Get the idleResourcesHandlingMode property: The idleResourcesHandlingMode property.
     *
     * @return the idleResourcesHandlingMode value.
     */
    public IdleResourcesHandlingMode idleResourcesHandlingMode() {
        return this.idleResourcesHandlingMode;
    }

    /**
     * Set the idleResourcesHandlingMode property: The idleResourcesHandlingMode property.
     *
     * @param idleResourcesHandlingMode the idleResourcesHandlingMode value to set.
     * @return the IdleResourcesHandlingPolicy object itself.
     */
    public IdleResourcesHandlingPolicy withIdleResourcesHandlingMode(
        IdleResourcesHandlingMode idleResourcesHandlingMode) {
        this.idleResourcesHandlingMode = idleResourcesHandlingMode;
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

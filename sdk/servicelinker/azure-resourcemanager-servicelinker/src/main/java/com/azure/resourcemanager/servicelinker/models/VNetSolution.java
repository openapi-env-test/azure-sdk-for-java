// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VNet solution for linker. */
@Fluent
public final class VNetSolution {
    /*
     * Type of VNet solution.
     */
    @JsonProperty(value = "type")
    private VNetSolutionType type;

    /** Creates an instance of VNetSolution class. */
    public VNetSolution() {
    }

    /**
     * Get the type property: Type of VNet solution.
     *
     * @return the type value.
     */
    public VNetSolutionType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of VNet solution.
     *
     * @param type the type value to set.
     * @return the VNetSolution object itself.
     */
    public VNetSolution withType(VNetSolutionType type) {
        this.type = type;
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

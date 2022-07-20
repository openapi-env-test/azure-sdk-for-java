// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.ExternalSecuritySolutionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents an ATA security solution which sends logs to an OMS workspace. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("ATA")
@Fluent
public final class AtaExternalSecuritySolution extends ExternalSecuritySolutionInner {
    /*
     * The external security solution properties for ATA solutions
     */
    @JsonProperty(value = "properties")
    private AtaSolutionProperties properties;

    /**
     * Get the properties property: The external security solution properties for ATA solutions.
     *
     * @return the properties value.
     */
    public AtaSolutionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The external security solution properties for ATA solutions.
     *
     * @param properties the properties value to set.
     * @return the AtaExternalSecuritySolution object itself.
     */
    public AtaExternalSecuritySolution withProperties(AtaSolutionProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}

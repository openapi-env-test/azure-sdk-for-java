// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A piece of evidence supporting the compliance state set in the attestation. */
@Fluent
public final class AttestationEvidence {
    /*
     * The description for this piece of evidence.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The URI location of the evidence.
     */
    @JsonProperty(value = "sourceUri")
    private String sourceUri;

    /**
     * Get the description property: The description for this piece of evidence.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for this piece of evidence.
     *
     * @param description the description value to set.
     * @return the AttestationEvidence object itself.
     */
    public AttestationEvidence withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the sourceUri property: The URI location of the evidence.
     *
     * @return the sourceUri value.
     */
    public String sourceUri() {
        return this.sourceUri;
    }

    /**
     * Set the sourceUri property: The URI location of the evidence.
     *
     * @param sourceUri the sourceUri value to set.
     * @return the AttestationEvidence object itself.
     */
    public AttestationEvidence withSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
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

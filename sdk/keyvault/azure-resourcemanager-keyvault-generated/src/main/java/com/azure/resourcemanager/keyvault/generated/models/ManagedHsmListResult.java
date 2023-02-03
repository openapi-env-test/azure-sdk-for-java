// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.generated.fluent.models.ManagedHsmInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of managed HSM Pools. */
@Fluent
public final class ManagedHsmListResult {
    /*
     * The list of managed HSM Pools.
     */
    @JsonProperty(value = "value")
    private List<ManagedHsmInner> value;

    /*
     * The URL to get the next set of managed HSM Pools.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ManagedHsmListResult class. */
    public ManagedHsmListResult() {
    }

    /**
     * Get the value property: The list of managed HSM Pools.
     *
     * @return the value value.
     */
    public List<ManagedHsmInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of managed HSM Pools.
     *
     * @param value the value value to set.
     * @return the ManagedHsmListResult object itself.
     */
    public ManagedHsmListResult withValue(List<ManagedHsmInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of managed HSM Pools.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of managed HSM Pools.
     *
     * @param nextLink the nextLink value to set.
     * @return the ManagedHsmListResult object itself.
     */
    public ManagedHsmListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

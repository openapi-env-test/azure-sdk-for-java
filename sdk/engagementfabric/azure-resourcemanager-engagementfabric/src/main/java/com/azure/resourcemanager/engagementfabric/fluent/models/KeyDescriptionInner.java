// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.engagementfabric.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.engagementfabric.models.KeyRank;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The description of the EngagementFabric account key. */
@Immutable
public final class KeyDescriptionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyDescriptionInner.class);

    /*
     * The name of the key
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The rank of the key
     */
    @JsonProperty(value = "rank", access = JsonProperty.Access.WRITE_ONLY)
    private KeyRank rank;

    /*
     * The value of the key
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the name property: The name of the key.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the rank property: The rank of the key.
     *
     * @return the rank value.
     */
    public KeyRank rank() {
        return this.rank;
    }

    /**
     * Get the value property: The value of the key.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

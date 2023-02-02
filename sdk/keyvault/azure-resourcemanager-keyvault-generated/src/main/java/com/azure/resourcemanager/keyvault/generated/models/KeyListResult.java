// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.generated.fluent.models.KeyInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The page of keys. */
@Fluent
public final class KeyListResult {
    /*
     * The key resources.
     */
    @JsonProperty(value = "value")
    private List<KeyInner> value;

    /*
     * The URL to get the next page of keys.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of KeyListResult class. */
    public KeyListResult() {
    }

    /**
     * Get the value property: The key resources.
     *
     * @return the value value.
     */
    public List<KeyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The key resources.
     *
     * @param value the value value to set.
     * @return the KeyListResult object itself.
     */
    public KeyListResult withValue(List<KeyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next page of keys.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next page of keys.
     *
     * @param nextLink the nextLink value to set.
     * @return the KeyListResult object itself.
     */
    public KeyListResult withNextLink(String nextLink) {
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

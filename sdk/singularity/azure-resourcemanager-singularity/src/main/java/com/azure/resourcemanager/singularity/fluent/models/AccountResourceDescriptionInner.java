// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.singularity.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes an account resource in Singularity. */
@Fluent
public final class AccountResourceDescriptionInner extends Resource {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private AccountResourceDescriptionProperties innerProperties;

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private AccountResourceDescriptionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AccountResourceDescriptionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountResourceDescriptionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

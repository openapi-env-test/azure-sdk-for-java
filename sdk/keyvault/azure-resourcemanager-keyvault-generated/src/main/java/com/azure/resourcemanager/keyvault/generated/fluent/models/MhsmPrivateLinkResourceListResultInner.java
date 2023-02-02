// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.keyvault.generated.models.MhsmPrivateLinkResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of private link resources. */
@Fluent
public final class MhsmPrivateLinkResourceListResultInner {
    /*
     * Array of private link resources
     */
    @JsonProperty(value = "value")
    private List<MhsmPrivateLinkResource> value;

    /** Creates an instance of MhsmPrivateLinkResourceListResultInner class. */
    public MhsmPrivateLinkResourceListResultInner() {
    }

    /**
     * Get the value property: Array of private link resources.
     *
     * @return the value value.
     */
    public List<MhsmPrivateLinkResource> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of private link resources.
     *
     * @param value the value value to set.
     * @return the MhsmPrivateLinkResourceListResultInner object itself.
     */
    public MhsmPrivateLinkResourceListResultInner withValue(List<MhsmPrivateLinkResource> value) {
        this.value = value;
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

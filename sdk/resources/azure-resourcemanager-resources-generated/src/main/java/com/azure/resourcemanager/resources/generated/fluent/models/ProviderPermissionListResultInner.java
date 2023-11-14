// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.generated.models.ProviderPermission;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of provider permissions. */
@Fluent
public final class ProviderPermissionListResultInner {
    /*
     * An array of provider permissions.
     */
    @JsonProperty(value = "value")
    private List<ProviderPermission> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ProviderPermissionListResultInner class. */
    public ProviderPermissionListResultInner() {
    }

    /**
     * Get the value property: An array of provider permissions.
     *
     * @return the value value.
     */
    public List<ProviderPermission> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of provider permissions.
     *
     * @param value the value value to set.
     * @return the ProviderPermissionListResultInner object itself.
     */
    public ProviderPermissionListResultInner withValue(List<ProviderPermission> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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

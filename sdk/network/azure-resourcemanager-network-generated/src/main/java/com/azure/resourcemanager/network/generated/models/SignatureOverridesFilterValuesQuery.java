// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the filter values possibles for a given column. */
@Fluent
public final class SignatureOverridesFilterValuesQuery {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SignatureOverridesFilterValuesQuery.class);

    /*
     * Describes the name of the column which values will be returned
     */
    @JsonProperty(value = "filterName")
    private String filterName;

    /**
     * Get the filterName property: Describes the name of the column which values will be returned.
     *
     * @return the filterName value.
     */
    public String filterName() {
        return this.filterName;
    }

    /**
     * Set the filterName property: Describes the name of the column which values will be returned.
     *
     * @param filterName the filterName value to set.
     * @return the SignatureOverridesFilterValuesQuery object itself.
     */
    public SignatureOverridesFilterValuesQuery withFilterName(String filterName) {
        this.filterName = filterName;
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

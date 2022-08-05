// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The sku type. */
@Fluent
public final class Sku {
    /*
     * The sku name. Required for data manager creation, optional for update.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The sku tier. This is based on the SKU name.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Get the name property: The sku name. Required for data manager creation, optional for update.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name. Required for data manager creation, optional for update.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The sku tier. This is based on the SKU name.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The sku tier. This is based on the SKU name.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(String tier) {
        this.tier = tier;
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

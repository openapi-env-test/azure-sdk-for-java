// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Sku. */
@Fluent
public final class Sku {
    /*
     * The sku name.
     */
    @JsonProperty(value = "name", required = true)
    private SkuName name;

    /*
     * The display name of the sku.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The sku family.
     */
    @JsonProperty(value = "family")
    private String family;

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public SkuName name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(SkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: The display name of the sku.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the sku.
     *
     * @param displayName the displayName value to set.
     * @return the Sku object itself.
     */
    public Sku withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the family property: The sku family.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: The sku family.
     *
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Sku"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Sku.class);
}

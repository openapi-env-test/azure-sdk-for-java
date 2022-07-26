// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource model definition representing SKU. */
@Fluent
public class Sku {
    /*
     * The name of the SKU. Ex - P3. It is typically a letter+number code
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * This field is required to be implemented by the Resource Provider if the
     * service has more than one tier, but is not required on a PUT.
     */
    @JsonProperty(value = "tier")
    private SkuTier tier;

    /*
     * The SKU size. When the name field is the combination of tier and some
     * other value, this would be the standalone code.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * If the service has different generations of hardware, for the same SKU,
     * then that can be captured here.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * If the SKU supports scale out/in then the capacity integer should be
     * included. If scale out/in is not possible for the resource this may be
     * omitted.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get the name property: The name of the SKU. Ex - P3. It is typically a letter+number code.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the SKU. Ex - P3. It is typically a letter+number code.
     *
     * @param name the name value to set.
     * @return the Sku object itself.
     */
    public Sku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier, but is not required on a PUT.
     *
     * @return the tier value.
     */
    public SkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: This field is required to be implemented by the Resource Provider if the service has more
     * than one tier, but is not required on a PUT.
     *
     * @param tier the tier value to set.
     * @return the Sku object itself.
     */
    public Sku withTier(SkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the size property: The SKU size. When the name field is the combination of tier and some other value, this
     * would be the standalone code.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The SKU size. When the name field is the combination of tier and some other value, this
     * would be the standalone code.
     *
     * @param size the size value to set.
     * @return the Sku object itself.
     */
    public Sku withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the family property: If the service has different generations of hardware, for the same SKU, then that can be
     * captured here.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: If the service has different generations of hardware, for the same SKU, then that can be
     * captured here.
     *
     * @param family the family value to set.
     * @return the Sku object itself.
     */
    public Sku withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the capacity property: If the SKU supports scale out/in then the capacity integer should be included. If
     * scale out/in is not possible for the resource this may be omitted.
     *
     * @return the capacity value.
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: If the SKU supports scale out/in then the capacity integer should be included. If
     * scale out/in is not possible for the resource this may be omitted.
     *
     * @param capacity the capacity value to set.
     * @return the Sku object itself.
     */
    public Sku withCapacity(Integer capacity) {
        this.capacity = capacity;
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

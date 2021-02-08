// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.SkuCapacity;
import com.azure.resourcemanager.appservice.generated.models.SkuDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sku discovery information. */
@Fluent
public final class SkuInfoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkuInfoInner.class);

    /*
     * Resource type that this sku applies to
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Name and tier of the sku
     */
    @JsonProperty(value = "sku")
    private SkuDescription sku;

    /*
     * Min, max, and default scale values of the sku
     */
    @JsonProperty(value = "capacity")
    private SkuCapacity capacity;

    /**
     * Get the resourceType property: Resource type that this sku applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type that this sku applies to.
     *
     * @param resourceType the resourceType value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku property: Name and tier of the sku.
     *
     * @return the sku value.
     */
    public SkuDescription sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Name and tier of the sku.
     *
     * @param sku the sku value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withSku(SkuDescription sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity property: Min, max, and default scale values of the sku.
     *
     * @return the capacity value.
     */
    public SkuCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: Min, max, and default scale values of the sku.
     *
     * @param capacity the capacity value to set.
     * @return the SkuInfoInner object itself.
     */
    public SkuInfoInner withCapacity(SkuCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (capacity() != null) {
            capacity().validate();
        }
    }
}

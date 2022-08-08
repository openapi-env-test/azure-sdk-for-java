// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SKU of a public IP prefix. */
@Fluent
public final class PublicIpPrefixSku {
    /*
     * Name of a public IP prefix SKU.
     */
    @JsonProperty(value = "name")
    private PublicIpPrefixSkuName name;

    /*
     * Tier of a public IP prefix SKU.
     */
    @JsonProperty(value = "tier")
    private PublicIpPrefixSkuTier tier;

    /**
     * Get the name property: Name of a public IP prefix SKU.
     *
     * @return the name value.
     */
    public PublicIpPrefixSkuName name() {
        return this.name;
    }

    /**
     * Set the name property: Name of a public IP prefix SKU.
     *
     * @param name the name value to set.
     * @return the PublicIpPrefixSku object itself.
     */
    public PublicIpPrefixSku withName(PublicIpPrefixSkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: Tier of a public IP prefix SKU.
     *
     * @return the tier value.
     */
    public PublicIpPrefixSkuTier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: Tier of a public IP prefix SKU.
     *
     * @param tier the tier value to set.
     * @return the PublicIpPrefixSku object itself.
     */
    public PublicIpPrefixSku withTier(PublicIpPrefixSkuTier tier) {
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

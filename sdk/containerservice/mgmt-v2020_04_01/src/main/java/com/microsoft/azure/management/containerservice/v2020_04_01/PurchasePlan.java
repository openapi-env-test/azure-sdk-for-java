/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Used for establishing the purchase context of any 3rd Party artifact through
 * MarketPlace.
 */
public class PurchasePlan {
    /**
     * The plan ID.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the product of the image from the marketplace. This is the
     * same value as Offer under the imageReference element.
     */
    @JsonProperty(value = "product")
    private String product;

    /**
     * The promotion code.
     */
    @JsonProperty(value = "promotionCode")
    private String promotionCode;

    /**
     * The plan ID.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * Get the plan ID.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the plan ID.
     *
     * @param name the name value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set specifies the product of the image from the marketplace. This is the same value as Offer under the imageReference element.
     *
     * @param product the product value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotion code.
     *
     * @return the promotionCode value
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotion code.
     *
     * @param promotionCode the promotionCode value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

    /**
     * Get the plan ID.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the plan ID.
     *
     * @param publisher the publisher value to set
     * @return the PurchasePlan object itself.
     */
    public PurchasePlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

}

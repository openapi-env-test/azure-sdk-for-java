// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;

/** The ResourceModelWithAllowedPropertySetPlan model. */
@Fluent
public final class ResourceModelWithAllowedPropertySetPlan extends Plan {
    /** {@inheritDoc} */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withPublisher(String publisher) {
        super.withPublisher(publisher);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withProduct(String product) {
        super.withProduct(product);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withPromotionCode(String promotionCode) {
        super.withPromotionCode(promotionCode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

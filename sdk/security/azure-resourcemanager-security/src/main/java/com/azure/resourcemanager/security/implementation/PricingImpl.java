// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.models.Pricing;
import com.azure.resourcemanager.security.models.PricingTier;
import java.time.Duration;

public final class PricingImpl implements Pricing {
    private PricingInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    PricingImpl(PricingInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PricingTier pricingTier() {
        return this.innerModel().pricingTier();
    }

    public String subPlan() {
        return this.innerModel().subPlan();
    }

    public Duration freeTrialRemainingTime() {
        return this.innerModel().freeTrialRemainingTime();
    }

    public PricingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}

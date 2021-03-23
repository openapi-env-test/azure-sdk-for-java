// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.implementation;

import com.azure.resourcemanager.consumption.fluent.models.ReservationRecommendationInner;
import com.azure.resourcemanager.consumption.models.ReservationRecommendation;
import java.util.Collections;
import java.util.Map;

public final class ReservationRecommendationImpl implements ReservationRecommendation {
    private ReservationRecommendationInner innerObject;

    private final com.azure.resourcemanager.consumption.ConsumptionManager serviceManager;

    ReservationRecommendationImpl(
        ReservationRecommendationInner innerObject,
        com.azure.resourcemanager.consumption.ConsumptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String location() {
        return this.innerModel().location();
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ReservationRecommendationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.ConsumptionManager manager() {
        return this.serviceManager;
    }
}

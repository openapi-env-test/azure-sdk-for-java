/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_08_31.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.consumption.v2018_08_31.ReservationRecommendation;
import rx.Observable;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import java.util.UUID;

class ReservationRecommendationImpl extends GroupableResourceCoreImpl<ReservationRecommendation, ReservationRecommendationInner, ReservationRecommendationImpl, ConsumptionManager> implements ReservationRecommendation {
    ReservationRecommendationImpl(String name, ReservationRecommendationInner inner, ConsumptionManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ReservationRecommendation> createResourceAsync() {
        ReservationRecommendationsInner client = this.manager().inner().reservationRecommendations();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<ReservationRecommendation> updateResourceAsync() {
        ReservationRecommendationsInner client = this.manager().inner().reservationRecommendations();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<ReservationRecommendationInner> getInnerAsync() {
        ReservationRecommendationsInner client = this.manager().inner().reservationRecommendations();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public BigDecimal costWithNoReservedInstances() {
        return this.inner().costWithNoReservedInstances();
    }

    @Override
    public DateTime firstUsageDate() {
        return this.inner().firstUsageDate();
    }

    @Override
    public String lookBackPeriod() {
        return this.inner().lookBackPeriod();
    }

    @Override
    public UUID meterId() {
        return this.inner().meterId();
    }

    @Override
    public BigDecimal netSavings() {
        return this.inner().netSavings();
    }

    @Override
    public BigDecimal recommendedQuantity() {
        return this.inner().recommendedQuantity();
    }

    @Override
    public String scope() {
        return this.inner().scope();
    }

    @Override
    public String sku() {
        return this.inner().sku();
    }

    @Override
    public String term() {
        return this.inner().term();
    }

    @Override
    public BigDecimal totalCostWithReservedInstances() {
        return this.inner().totalCostWithReservedInstances();
    }

}

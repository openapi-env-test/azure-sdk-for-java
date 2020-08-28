/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscription;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Amount;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Reseller;
import com.microsoft.azure.management.billing.v2019_10_01_preview.BillingSubscriptionStatusType;
import java.util.UUID;

class BillingSubscriptionImpl extends IndexableRefreshableWrapperImpl<BillingSubscription, BillingSubscriptionInner> implements BillingSubscription {
    private final BillingManager manager;
    private String billingAccountName;
    private String customerName;
    private String billingSubscriptionName;

    BillingSubscriptionImpl(BillingSubscriptionInner inner,  BillingManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.billingAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingAccounts");
        this.customerName = IdParsingUtils.getValueFromIdByName(inner.id(), "customers");
        this.billingSubscriptionName = IdParsingUtils.getValueFromIdByName(inner.id(), "billingSubscriptions");
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<BillingSubscriptionInner> getInnerAsync() {
        BillingSubscriptionsInner client = this.manager().inner().billingSubscriptions();
        return client.getByCustomerAsync(this.billingAccountName, this.customerName, this.billingSubscriptionName);
    }



    @Override
    public String billingProfileDisplayName() {
        return this.inner().billingProfileDisplayName();
    }

    @Override
    public String billingProfileId() {
        return this.inner().billingProfileId();
    }

    @Override
    public String customerDisplayName() {
        return this.inner().customerDisplayName();
    }

    @Override
    public String customerId() {
        return this.inner().customerId();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invoiceSectionDisplayName() {
        return this.inner().invoiceSectionDisplayName();
    }

    @Override
    public String invoiceSectionId() {
        return this.inner().invoiceSectionId();
    }

    @Override
    public Amount lastMonthCharges() {
        return this.inner().lastMonthCharges();
    }

    @Override
    public Amount monthToDateCharges() {
        return this.inner().monthToDateCharges();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Reseller reseller() {
        return this.inner().reseller();
    }

    @Override
    public String skuDescription() {
        return this.inner().skuDescription();
    }

    @Override
    public String skuId() {
        return this.inner().skuId();
    }

    @Override
    public BillingSubscriptionStatusType subscriptionBillingStatus() {
        return this.inner().subscriptionBillingStatus();
    }

    @Override
    public UUID subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}

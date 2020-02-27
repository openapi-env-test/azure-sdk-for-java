/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import com.microsoft.azure.management.billing.v2019_10_01_preview.Transaction;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.Amount;
import org.joda.time.DateTime;
import com.microsoft.azure.management.billing.v2019_10_01_preview.TransactionTypeKind;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ReservationType;

class TransactionImpl extends WrapperImpl<TransactionInner> implements Transaction {
    private final BillingManager manager;

    TransactionImpl(TransactionInner inner,  BillingManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BillingManager manager() {
        return this.manager;
    }



    @Override
    public Amount azureCreditApplied() {
        return this.inner().azureCreditApplied();
    }

    @Override
    public String billingCurrency() {
        return this.inner().billingCurrency();
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
    public DateTime dateProperty() {
        return this.inner().dateProperty();
    }

    @Override
    public Double discount() {
        return this.inner().discount();
    }

    @Override
    public Amount effectivePrice() {
        return this.inner().effectivePrice();
    }

    @Override
    public Double exchangeRate() {
        return this.inner().exchangeRate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String invoice() {
        return this.inner().invoice();
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
    public TransactionTypeKind kind() {
        return this.inner().kind();
    }

    @Override
    public Amount marketPrice() {
        return this.inner().marketPrice();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String orderId() {
        return this.inner().orderId();
    }

    @Override
    public String orderName() {
        return this.inner().orderName();
    }

    @Override
    public String pricingCurrency() {
        return this.inner().pricingCurrency();
    }

    @Override
    public String productDescription() {
        return this.inner().productDescription();
    }

    @Override
    public String productFamily() {
        return this.inner().productFamily();
    }

    @Override
    public String productType() {
        return this.inner().productType();
    }

    @Override
    public String productTypeId() {
        return this.inner().productTypeId();
    }

    @Override
    public Integer quantity() {
        return this.inner().quantity();
    }

    @Override
    public DateTime servicePeriodEndDate() {
        return this.inner().servicePeriodEndDate();
    }

    @Override
    public DateTime servicePeriodStartDate() {
        return this.inner().servicePeriodStartDate();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public String subscriptionName() {
        return this.inner().subscriptionName();
    }

    @Override
    public Amount subTotal() {
        return this.inner().subTotal();
    }

    @Override
    public Amount tax() {
        return this.inner().tax();
    }

    @Override
    public Amount transactionAmount() {
        return this.inner().transactionAmount();
    }

    @Override
    public ReservationType transactionType() {
        return this.inner().transactionType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String unitOfMeasure() {
        return this.inner().unitOfMeasure();
    }

    @Override
    public Double units() {
        return this.inner().units();
    }

    @Override
    public String unitType() {
        return this.inner().unitType();
    }

}

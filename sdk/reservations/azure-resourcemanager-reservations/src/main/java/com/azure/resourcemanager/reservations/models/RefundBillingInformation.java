// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** billing information. */
@Fluent
public final class RefundBillingInformation {
    /*
     * Represent the billing plans.
     */
    @JsonProperty(value = "billingPlan")
    private ReservationBillingPlan billingPlan;

    /*
     * The number of completed transactions in this reservation's payment
     */
    @JsonProperty(value = "completedTransactions")
    private Integer completedTransactions;

    /*
     * The number of total transactions in this reservation's payment
     */
    @JsonProperty(value = "totalTransactions")
    private Integer totalTransactions;

    /*
     * Pricing information containing the amount and the currency code
     */
    @JsonProperty(value = "billingCurrencyTotalPaidAmount")
    private Price billingCurrencyTotalPaidAmount;

    /*
     * Pricing information containing the amount and the currency code
     */
    @JsonProperty(value = "billingCurrencyProratedAmount")
    private Price billingCurrencyProratedAmount;

    /*
     * Pricing information containing the amount and the currency code
     */
    @JsonProperty(value = "billingCurrencyRemainingCommitmentAmount")
    private Price billingCurrencyRemainingCommitmentAmount;

    /** Creates an instance of RefundBillingInformation class. */
    public RefundBillingInformation() {
    }

    /**
     * Get the billingPlan property: Represent the billing plans.
     *
     * @return the billingPlan value.
     */
    public ReservationBillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: Represent the billing plans.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the RefundBillingInformation object itself.
     */
    public RefundBillingInformation withBillingPlan(ReservationBillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the completedTransactions property: The number of completed transactions in this reservation's payment.
     *
     * @return the completedTransactions value.
     */
    public Integer completedTransactions() {
        return this.completedTransactions;
    }

    /**
     * Set the completedTransactions property: The number of completed transactions in this reservation's payment.
     *
     * @param completedTransactions the completedTransactions value to set.
     * @return the RefundBillingInformation object itself.
     */
    public RefundBillingInformation withCompletedTransactions(Integer completedTransactions) {
        this.completedTransactions = completedTransactions;
        return this;
    }

    /**
     * Get the totalTransactions property: The number of total transactions in this reservation's payment.
     *
     * @return the totalTransactions value.
     */
    public Integer totalTransactions() {
        return this.totalTransactions;
    }

    /**
     * Set the totalTransactions property: The number of total transactions in this reservation's payment.
     *
     * @param totalTransactions the totalTransactions value to set.
     * @return the RefundBillingInformation object itself.
     */
    public RefundBillingInformation withTotalTransactions(Integer totalTransactions) {
        this.totalTransactions = totalTransactions;
        return this;
    }

    /**
     * Get the billingCurrencyTotalPaidAmount property: Pricing information containing the amount and the currency code.
     *
     * @return the billingCurrencyTotalPaidAmount value.
     */
    public Price billingCurrencyTotalPaidAmount() {
        return this.billingCurrencyTotalPaidAmount;
    }

    /**
     * Set the billingCurrencyTotalPaidAmount property: Pricing information containing the amount and the currency code.
     *
     * @param billingCurrencyTotalPaidAmount the billingCurrencyTotalPaidAmount value to set.
     * @return the RefundBillingInformation object itself.
     */
    public RefundBillingInformation withBillingCurrencyTotalPaidAmount(Price billingCurrencyTotalPaidAmount) {
        this.billingCurrencyTotalPaidAmount = billingCurrencyTotalPaidAmount;
        return this;
    }

    /**
     * Get the billingCurrencyProratedAmount property: Pricing information containing the amount and the currency code.
     *
     * @return the billingCurrencyProratedAmount value.
     */
    public Price billingCurrencyProratedAmount() {
        return this.billingCurrencyProratedAmount;
    }

    /**
     * Set the billingCurrencyProratedAmount property: Pricing information containing the amount and the currency code.
     *
     * @param billingCurrencyProratedAmount the billingCurrencyProratedAmount value to set.
     * @return the RefundBillingInformation object itself.
     */
    public RefundBillingInformation withBillingCurrencyProratedAmount(Price billingCurrencyProratedAmount) {
        this.billingCurrencyProratedAmount = billingCurrencyProratedAmount;
        return this;
    }

    /**
     * Get the billingCurrencyRemainingCommitmentAmount property: Pricing information containing the amount and the
     * currency code.
     *
     * @return the billingCurrencyRemainingCommitmentAmount value.
     */
    public Price billingCurrencyRemainingCommitmentAmount() {
        return this.billingCurrencyRemainingCommitmentAmount;
    }

    /**
     * Set the billingCurrencyRemainingCommitmentAmount property: Pricing information containing the amount and the
     * currency code.
     *
     * @param billingCurrencyRemainingCommitmentAmount the billingCurrencyRemainingCommitmentAmount value to set.
     * @return the RefundBillingInformation object itself.
     */
    public RefundBillingInformation withBillingCurrencyRemainingCommitmentAmount(
        Price billingCurrencyRemainingCommitmentAmount) {
        this.billingCurrencyRemainingCommitmentAmount = billingCurrencyRemainingCommitmentAmount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (billingCurrencyTotalPaidAmount() != null) {
            billingCurrencyTotalPaidAmount().validate();
        }
        if (billingCurrencyProratedAmount() != null) {
            billingCurrencyProratedAmount().validate();
        }
        if (billingCurrencyRemainingCommitmentAmount() != null) {
            billingCurrencyRemainingCommitmentAmount().validate();
        }
    }
}

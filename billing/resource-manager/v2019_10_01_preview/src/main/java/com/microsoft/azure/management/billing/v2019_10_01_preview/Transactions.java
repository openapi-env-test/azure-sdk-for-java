/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2019_10_01_preview.implementation.TransactionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Transactions.
 */
public interface Transactions extends HasInner<TransactionsInner> {
    /**
     * Lists the transactions by billing account name for given start and end date.
     *
     * @param billingAccountName billing Account Id.
     * @param periodStartDate Start date
     * @param periodEndDate End date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Transaction> listByBillingAccountAsync(final String billingAccountName, final String periodStartDate, final String periodEndDate);

    /**
     * Lists the transactions by billing profile name for given start date and end date.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param periodStartDate Start date
     * @param periodEndDate End date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TransactionListResult> listByBillingProfileAsync(String billingAccountName, String billingProfileName, String periodStartDate, String periodEndDate);

    /**
     * Lists the transactions by invoice section name for given start date and end date.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param periodStartDate Start date
     * @param periodEndDate End date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TransactionListResult> listByInvoiceSectionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, String periodStartDate, String periodEndDate);

    /**
     * Get the transaction.
     *
     * @param billingAccountName billing Account Id.
     * @param billingProfileName Billing Profile Id.
     * @param transactionName Transaction name.
     * @param periodStartDate Start date
     * @param periodEndDate End date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Transaction> getAsync(String billingAccountName, String billingProfileName, String transactionName, String periodStartDate, String periodEndDate);

    /**
     * Lists the transactions by customer id for given start date and end date.
     *
     * @param billingAccountName billing Account Id.
     * @param customerName Customer name.
     * @param periodStartDate Start date
     * @param periodEndDate End date
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Transaction> listByCustomerAsync(final String billingAccountName, final String customerName, final String periodStartDate, final String periodEndDate);

}

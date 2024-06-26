// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of Invoices. */
public interface Invoices {
    /**
     * Lists the invoices for a billing account for a given start date and end date. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param periodStartDate The start date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param periodEndDate The end date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingAccount(
        String billingAccountName, String periodStartDate, String periodEndDate);

    /**
     * Lists the invoices for a billing account for a given start date and end date. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param periodStartDate The start date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param periodEndDate The end date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingAccount(
        String billingAccountName, String periodStartDate, String periodEndDate, Context context);

    /**
     * Lists the invoices for a billing profile for a given start date and end date. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param periodStartDate The start date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param periodEndDate The end date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingProfile(
        String billingAccountName, String billingProfileName, String periodStartDate, String periodEndDate);

    /**
     * Lists the invoices for a billing profile for a given start date and end date. The operation is supported for
     * billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param periodStartDate The start date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param periodEndDate The end date to fetch the invoices. The date should be specified in MM-DD-YYYY format.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingProfile(
        String billingAccountName,
        String billingProfileName,
        String periodStartDate,
        String periodEndDate,
        Context context);

    /**
     * Gets an invoice by billing account name and ID. The operation is supported for billing accounts with agreement
     * type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by billing account name and ID along with {@link Response}.
     */
    Response<Invoice> getWithResponse(String billingAccountName, String invoiceName, Context context);

    /**
     * Gets an invoice by billing account name and ID. The operation is supported for billing accounts with agreement
     * type Microsoft Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by billing account name and ID.
     */
    Invoice get(String billingAccountName, String invoiceName);

    /**
     * Gets an invoice by ID. The operation is supported for billing accounts with agreement type Microsoft Partner
     * Agreement or Microsoft Customer Agreement.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by ID along with {@link Response}.
     */
    Response<Invoice> getByIdWithResponse(String invoiceName, Context context);

    /**
     * Gets an invoice by ID. The operation is supported for billing accounts with agreement type Microsoft Partner
     * Agreement or Microsoft Customer Agreement.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by ID.
     */
    Invoice getById(String invoiceName);

    /**
     * Gets a URL to download an invoice. The operation is supported for billing accounts with agreement type Microsoft
     * Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param downloadToken Download token with document source and document ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice.
     */
    DownloadUrl downloadInvoice(String billingAccountName, String invoiceName, String downloadToken);

    /**
     * Gets a URL to download an invoice. The operation is supported for billing accounts with agreement type Microsoft
     * Partner Agreement or Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param downloadToken Download token with document source and document ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice.
     */
    DownloadUrl downloadInvoice(String billingAccountName, String invoiceName, String downloadToken, Context context);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file. The
     * operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer
     * Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param downloadUrls An array of download urls for individual documents.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DownloadUrl downloadMultipleBillingProfileInvoices(String billingAccountName, List<String> downloadUrls);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file. The
     * operation is supported for billing accounts with agreement type Microsoft Partner Agreement or Microsoft Customer
     * Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param downloadUrls An array of download urls for individual documents.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DownloadUrl downloadMultipleBillingProfileInvoices(
        String billingAccountName, List<String> downloadUrls, Context context);

    /**
     * Lists the invoices for a subscription.
     *
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingSubscription(String periodStartDate, String periodEndDate);

    /**
     * Lists the invoices for a subscription.
     *
     * @param periodStartDate Invoice period start date.
     * @param periodEndDate Invoice period end date.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of invoices as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Invoice> listByBillingSubscription(String periodStartDate, String periodEndDate, Context context);

    /**
     * Gets an invoice by subscription ID and invoice ID.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by subscription ID and invoice ID along with {@link Response}.
     */
    Response<Invoice> getBySubscriptionAndInvoiceIdWithResponse(String invoiceName, Context context);

    /**
     * Gets an invoice by subscription ID and invoice ID.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an invoice by subscription ID and invoice ID.
     */
    Invoice getBySubscriptionAndInvoiceId(String invoiceName);

    /**
     * Gets a URL to download an invoice.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param downloadToken Download token with document source and document ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice.
     */
    DownloadUrl downloadBillingSubscriptionInvoice(String invoiceName, String downloadToken);

    /**
     * Gets a URL to download an invoice.
     *
     * @param invoiceName The ID that uniquely identifies an invoice.
     * @param downloadToken Download token with document source and document ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download an invoice.
     */
    DownloadUrl downloadBillingSubscriptionInvoice(String invoiceName, String downloadToken, Context context);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     *
     * @param downloadUrls An array of download urls for individual documents.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DownloadUrl downloadMultipleBillingSubscriptionInvoices(List<String> downloadUrls);

    /**
     * Gets a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     *
     * @param downloadUrls An array of download urls for individual documents.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a URL to download multiple invoice documents (invoice pdf, tax receipts, credit notes) as a zip file.
     */
    DownloadUrl downloadMultipleBillingSubscriptionInvoices(List<String> downloadUrls, Context context);
}

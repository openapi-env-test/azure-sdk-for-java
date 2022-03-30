// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of BillingPermissions. */
public interface BillingPermissions {
    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByCustomer(String billingAccountName, String customerName);

    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByCustomer(
        String billingAccountName, String customerName, Context context);

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByBillingAccount(String billingAccountName);

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByBillingAccount(String billingAccountName, Context context);

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByInvoiceSections(
        String billingAccountName, String billingProfileName, String invoiceSectionName);

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByInvoiceSections(
        String billingAccountName, String billingProfileName, String invoiceSectionName, Context context);

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByBillingProfile(
        String billingAccountName, String billingProfileName);

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of list billingPermissions a caller has on a billing account as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BillingPermissionsProperties> listByBillingProfile(
        String billingAccountName, String billingProfileName, Context context);
}

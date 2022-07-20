// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.ReservationInner;

/** An instance of this class provides access to all the operations defined in ReservationsClient. */
public interface ReservationsClient {
    /**
     * Lists the reservations for a billing account and the roll up counts of reservations group by provisioning states.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of reservations and summary of roll out count of reservations in each state as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationInner> listByBillingAccount(String billingAccountName);

    /**
     * Lists the reservations for a billing account and the roll up counts of reservations group by provisioning states.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param filter May be used to filter by reservation properties. The filter supports 'eq', 'or', and 'and'. It does
     *     not currently support 'ne', 'gt', 'le', 'ge', or 'not'.
     * @param orderby May be used to sort order by reservation properties.
     * @param refreshSummary To indicate whether to refresh the roll up counts of the reservations group by provisioning
     *     states.
     * @param selectedState The selected provisioning state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of reservations and summary of roll out count of reservations in each state as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationInner> listByBillingAccount(
        String billingAccountName,
        String filter,
        String orderby,
        String refreshSummary,
        String selectedState,
        Context context);

    /**
     * Lists the reservations for a billing profile and the roll up counts of reservations group by provisioning state.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of reservations and summary of roll out count of reservations in each state as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationInner> listByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Lists the reservations for a billing profile and the roll up counts of reservations group by provisioning state.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param filter May be used to filter by reservation properties. The filter supports 'eq', 'or', and 'and'. It does
     *     not currently support 'ne', 'gt', 'le', 'ge', or 'not'.
     * @param orderby May be used to sort order by reservation properties.
     * @param refreshSummary To indicate whether to refresh the roll up counts of the reservations group by provisioning
     *     state.
     * @param selectedState The selected provisioning state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of reservations and summary of roll out count of reservations in each state as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ReservationInner> listByBillingProfile(
        String billingAccountName,
        String billingProfileName,
        String filter,
        String orderby,
        String refreshSummary,
        String selectedState,
        Context context);
}

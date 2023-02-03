// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ReservationRecommendationDetails. */
public interface ReservationRecommendationDetails {
    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details along with {@link Response}.
     */
    Response<ReservationRecommendationDetailsModel> getWithResponse(
        String resourceScope,
        Scope scope,
        String region,
        Term term,
        LookBackPeriod lookBackPeriod,
        String product,
        Context context);

    /**
     * Details of a reservation recommendation for what-if analysis of reserved instances.
     *
     * @param resourceScope The scope associated with reservation recommendation details operations. This includes
     *     '/subscriptions/{subscriptionId}/' for subscription scope,
     *     '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for resource group scope,
     *     /providers/Microsoft.Billing/billingAccounts/{billingAccountId}' for BillingAccount scope, and
     *     '/providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}' for
     *     billingProfile scope.
     * @param scope Scope of the reservation.
     * @param region Used to select the region the recommendation should be generated for.
     * @param term Specify length of reservation recommendation term.
     * @param lookBackPeriod Filter the time period on which reservation recommendation results are based.
     * @param product Filter the products for which reservation recommendation results are generated. Examples:
     *     Standard_DS1_v2 (for VM), Premium_SSD_Managed_Disks_P30 (for Managed Disks).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return reservation recommendation details.
     */
    ReservationRecommendationDetailsModel get(
        String resourceScope, Scope scope, String region, Term term, LookBackPeriod lookBackPeriod, String product);
}

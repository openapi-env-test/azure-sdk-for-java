// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AggregatedCosts. */
public interface AggregatedCosts {
    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param filter May be used to filter aggregated cost by properties/usageStart (Utc time), properties/usageEnd (Utc
     *     time). The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or',
     *     or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response}.
     */
    Response<ManagementGroupAggregatedCostResult> getByManagementGroupWithResponse(
        String managementGroupId, String filter, Context context);

    /**
     * Provides the aggregate cost of a management group and all child management groups by current billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource.
     */
    ManagementGroupAggregatedCostResult getByManagementGroup(String managementGroupId);

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource along with {@link Response}.
     */
    Response<ManagementGroupAggregatedCostResult> getForBillingPeriodByManagementGroupWithResponse(
        String managementGroupId, String billingPeriodName, Context context);

    /**
     * Provides the aggregate cost of a management group and all child management groups by specified billing period.
     *
     * @param managementGroupId Azure Management Group ID.
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a management group aggregated cost resource.
     */
    ManagementGroupAggregatedCostResult getForBillingPeriodByManagementGroup(
        String managementGroupId, String billingPeriodName);
}

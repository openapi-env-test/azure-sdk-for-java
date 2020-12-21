// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.commerce.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.commerce.fluent.models.UsageAggregationInner;
import com.azure.resourcemanager.commerce.models.AggregationGranularity;
import java.time.OffsetDateTime;

/** An instance of this class provides access to all the operations defined in UsageAggregatesClient. */
public interface UsageAggregatesClient {
    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageAggregationInner> list(OffsetDateTime reportedStartTime, OffsetDateTime reportedEndTime);

    /**
     * Test Query aggregated Azure subscription consumption data for a date range.
     *
     * @param reportedStartTime The start of the time range to retrieve data for.
     * @param reportedEndTime The end of the time range to retrieve data for.
     * @param showDetails `True` returns usage data in instance-level detail, `false` causes server-side aggregation
     *     with fewer details. For example, if you have 3 website instances, by default you will get 3 line items for
     *     website consumption. If you specify showDetails = false, the data will be aggregated as a single line item
     *     for website consumption within the time period (for the given subscriptionId, meterId, usageStartTime and
     *     usageEndTime).
     * @param aggregationGranularity `Daily` (default) returns the data in daily granularity, `Hourly` returns the data
     *     in hourly granularity.
     * @param continuationToken Used when a continuation token string is provided in the response body of the previous
     *     call, enabling paging through a large result set. If not present, the data is retrieved from the beginning of
     *     the day/hour (based on the granularity) passed in.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Get UsageAggregates operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<UsageAggregationInner> list(
        OffsetDateTime reportedStartTime,
        OffsetDateTime reportedEndTime,
        Boolean showDetails,
        AggregationGranularity aggregationGranularity,
        String continuationToken,
        Context context);
}

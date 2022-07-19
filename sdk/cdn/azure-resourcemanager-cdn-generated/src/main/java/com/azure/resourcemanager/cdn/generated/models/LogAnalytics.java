// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.time.OffsetDateTime;
import java.util.List;

/** Resource collection API of LogAnalytics. */
public interface LogAnalytics {
    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    MetricsResponse getLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols);

    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param metrics Array of LogMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @param groupBy Array of LogMetricsGroupBy.
     * @param continents Array of Get9ItemsItem.
     * @param countryOrRegions Array of Get10ItemsItem.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile along with {@link Response}.
     */
    Response<MetricsResponse> getLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<LogMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogMetricsGranularity granularity,
        List<String> customDomains,
        List<String> protocols,
        List<LogMetricsGroupBy> groupBy,
        List<String> continents,
        List<String> countryOrRegions,
        Context context);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    RankingsResponse getLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param rankings Array of LogRanking.
     * @param metrics Array of LogRankingMetric.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param customDomains Array of String.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile along with {@link Response}.
     */
    Response<RankingsResponse> getLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<LogRanking> rankings,
        List<LogRankingMetric> metrics,
        int maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        List<String> customDomains,
        Context context);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    ContinentsResponse getLogAnalyticsLocations(String resourceGroupName, String profileName);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report along with {@link Response}.
     */
    Response<ContinentsResponse> getLogAnalyticsLocationsWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    ResourcesResponse getLogAnalyticsResources(String resourceGroupName, String profileName);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report along with {@link Response}.
     */
    Response<ResourcesResponse> getLogAnalyticsResourcesWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    WafMetricsResponse getWafLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param actions Array of WafAction.
     * @param groupBy Array of WafRankingGroupBy.
     * @param ruleTypes Array of WafRuleType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile along with {@link Response}.
     */
    Response<WafMetricsResponse> getWafLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        WafGranularity granularity,
        List<WafAction> actions,
        List<WafRankingGroupBy> groupBy,
        List<WafRuleType> ruleTypes,
        Context context);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    WafRankingsResponse getWafLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the Azure Front Door Standard or Azure Front Door Premium profile which is unique
     *     within the resource group. which is unique within the resource group.
     * @param metrics Array of WafMetric.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of WafRankingType.
     * @param actions Array of WafAction.
     * @param ruleTypes Array of WafRuleType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile along with {@link Response}.
     */
    Response<WafRankingsResponse> getWafLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<WafMetric> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        int maxRanking,
        List<WafRankingType> rankings,
        List<WafAction> actions,
        List<WafRuleType> ruleTypes,
        Context context);
}

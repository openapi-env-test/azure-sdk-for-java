// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.contoso_cdn.fluent.models.ContinentsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.MetricsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.RankingsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.ResourcesResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.WafMetricsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.WafRankingsResponseInner;
import com.azure.resourcemanager.contoso_cdn.models.Get4ItemsItem;
import com.azure.resourcemanager.contoso_cdn.models.Get5ItemsItem;
import com.azure.resourcemanager.contoso_cdn.models.Get8ItemsItem;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsActions;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsGranularity;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsGroupBy;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsRankings;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsRuleTypes;
import java.time.OffsetDateTime;
import java.util.List;

/** An instance of this class provides access to all the operations defined in LogAnalyticsClient. */
public interface LogAnalyticsClient {
    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of Get4ItemsItem.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MetricsResponseInner getLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<Get4ItemsItem> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity);

    /**
     * Get log report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of Get4ItemsItem.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param groupBy Array of Get8ItemsItem.
     * @param continents Array of Get9ItemsItem.
     * @param countryOrRegions Array of Get10ItemsItem.
     * @param customDomains Array of Get11ItemsItem.
     * @param protocols Array of Get12ItemsItem.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MetricsResponseInner> getLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<Get4ItemsItem> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity,
        List<Get8ItemsItem> groupBy,
        List<String> continents,
        List<String> countryOrRegions,
        List<String> customDomains,
        List<String> protocols,
        Context context);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of Enum35.
     * @param metrics Array of Get5ItemsItem.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RankingsResponseInner getLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<LogAnalyticsRankings> rankings,
        List<Get5ItemsItem> metrics,
        float maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd);

    /**
     * Get log analytics ranking report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param rankings Array of Enum35.
     * @param metrics Array of Get5ItemsItem.
     * @param maxRanking The maxRanking parameter.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param customDomains Array of String.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log analytics ranking report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RankingsResponseInner> getLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<LogAnalyticsRankings> rankings,
        List<Get5ItemsItem> metrics,
        float maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        List<String> customDomains,
        Context context);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContinentsResponseInner getLogAnalyticsLocations(String resourceGroupName, String profileName);

    /**
     * Get all available location names for AFD log analytics report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all available location names for AFD log analytics report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContinentsResponseInner> getLogAnalyticsLocationsWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourcesResponseInner getLogAnalyticsResources(String resourceGroupName, String profileName);

    /**
     * Get all endpoints and custom domains available for AFD log report.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all endpoints and custom domains available for AFD log report.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ResourcesResponseInner> getLogAnalyticsResourcesWithResponse(
        String resourceGroupName, String profileName, Context context);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of Constant95.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WafMetricsResponseInner getWafLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity);

    /**
     * Get Waf related log analytics report for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of Constant95.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param granularity The granularity parameter.
     * @param actions Array of Enum38.
     * @param groupBy Array of Enum39.
     * @param ruleTypes Array of Enum40.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return waf related log analytics report for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WafMetricsResponseInner> getWafLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity,
        List<LogAnalyticsActions> actions,
        List<LogAnalyticsGroupBy> groupBy,
        List<LogAnalyticsRuleTypes> ruleTypes,
        Context context);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of Constant97.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of Enum42.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WafRankingsResponseInner getWafLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        float maxRanking,
        List<LogAnalyticsRankings> rankings);

    /**
     * Get WAF log analytics charts for AFD profile.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param profileName Name of the CDN profile which is unique within the resource group.
     * @param metrics Array of Constant97.
     * @param dateTimeBegin The dateTimeBegin parameter.
     * @param dateTimeEnd The dateTimeEnd parameter.
     * @param maxRanking The maxRanking parameter.
     * @param rankings Array of Enum42.
     * @param actions Array of Enum43.
     * @param ruleTypes Array of Enum44.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return wAF log analytics charts for AFD profile.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WafRankingsResponseInner> getWafLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        float maxRanking,
        List<LogAnalyticsRankings> rankings,
        List<LogAnalyticsActions> actions,
        List<LogAnalyticsRuleTypes> ruleTypes,
        Context context);
}

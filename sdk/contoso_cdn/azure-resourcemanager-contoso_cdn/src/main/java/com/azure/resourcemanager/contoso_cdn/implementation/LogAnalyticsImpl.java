// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.contoso_cdn.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.contoso_cdn.CdnManager;
import com.azure.resourcemanager.contoso_cdn.fluent.LogAnalyticsClient;
import com.azure.resourcemanager.contoso_cdn.fluent.models.ContinentsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.MetricsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.RankingsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.ResourcesResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.WafMetricsResponseInner;
import com.azure.resourcemanager.contoso_cdn.fluent.models.WafRankingsResponseInner;
import com.azure.resourcemanager.contoso_cdn.models.ContinentsResponse;
import com.azure.resourcemanager.contoso_cdn.models.Get4ItemsItem;
import com.azure.resourcemanager.contoso_cdn.models.Get5ItemsItem;
import com.azure.resourcemanager.contoso_cdn.models.Get8ItemsItem;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalytics;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsActions;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsGranularity;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsGroupBy;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsRankings;
import com.azure.resourcemanager.contoso_cdn.models.LogAnalyticsRuleTypes;
import com.azure.resourcemanager.contoso_cdn.models.MetricsResponse;
import com.azure.resourcemanager.contoso_cdn.models.RankingsResponse;
import com.azure.resourcemanager.contoso_cdn.models.ResourcesResponse;
import com.azure.resourcemanager.contoso_cdn.models.WafMetricsResponse;
import com.azure.resourcemanager.contoso_cdn.models.WafRankingsResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;
import java.util.List;

public final class LogAnalyticsImpl implements LogAnalytics {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LogAnalyticsImpl.class);

    private final LogAnalyticsClient innerClient;

    private final CdnManager serviceManager;

    public LogAnalyticsImpl(LogAnalyticsClient innerClient, CdnManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public MetricsResponse getLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<Get4ItemsItem> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity) {
        MetricsResponseInner inner =
            this
                .serviceClient()
                .getLogAnalyticsMetrics(
                    resourceGroupName, profileName, metrics, dateTimeBegin, dateTimeEnd, granularity);
        if (inner != null) {
            return new MetricsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MetricsResponse> getLogAnalyticsMetricsWithResponse(
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
        Context context) {
        Response<MetricsResponseInner> inner =
            this
                .serviceClient()
                .getLogAnalyticsMetricsWithResponse(
                    resourceGroupName,
                    profileName,
                    metrics,
                    dateTimeBegin,
                    dateTimeEnd,
                    granularity,
                    groupBy,
                    continents,
                    countryOrRegions,
                    customDomains,
                    protocols,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetricsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RankingsResponse getLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<LogAnalyticsRankings> rankings,
        List<Get5ItemsItem> metrics,
        float maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd) {
        RankingsResponseInner inner =
            this
                .serviceClient()
                .getLogAnalyticsRankings(
                    resourceGroupName, profileName, rankings, metrics, maxRanking, dateTimeBegin, dateTimeEnd);
        if (inner != null) {
            return new RankingsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RankingsResponse> getLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<LogAnalyticsRankings> rankings,
        List<Get5ItemsItem> metrics,
        float maxRanking,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        List<String> customDomains,
        Context context) {
        Response<RankingsResponseInner> inner =
            this
                .serviceClient()
                .getLogAnalyticsRankingsWithResponse(
                    resourceGroupName,
                    profileName,
                    rankings,
                    metrics,
                    maxRanking,
                    dateTimeBegin,
                    dateTimeEnd,
                    customDomains,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RankingsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ContinentsResponse getLogAnalyticsLocations(String resourceGroupName, String profileName) {
        ContinentsResponseInner inner = this.serviceClient().getLogAnalyticsLocations(resourceGroupName, profileName);
        if (inner != null) {
            return new ContinentsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ContinentsResponse> getLogAnalyticsLocationsWithResponse(
        String resourceGroupName, String profileName, Context context) {
        Response<ContinentsResponseInner> inner =
            this.serviceClient().getLogAnalyticsLocationsWithResponse(resourceGroupName, profileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContinentsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ResourcesResponse getLogAnalyticsResources(String resourceGroupName, String profileName) {
        ResourcesResponseInner inner = this.serviceClient().getLogAnalyticsResources(resourceGroupName, profileName);
        if (inner != null) {
            return new ResourcesResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ResourcesResponse> getLogAnalyticsResourcesWithResponse(
        String resourceGroupName, String profileName, Context context) {
        Response<ResourcesResponseInner> inner =
            this.serviceClient().getLogAnalyticsResourcesWithResponse(resourceGroupName, profileName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResourcesResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WafMetricsResponse getWafLogAnalyticsMetrics(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity) {
        WafMetricsResponseInner inner =
            this
                .serviceClient()
                .getWafLogAnalyticsMetrics(
                    resourceGroupName, profileName, metrics, dateTimeBegin, dateTimeEnd, granularity);
        if (inner != null) {
            return new WafMetricsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WafMetricsResponse> getWafLogAnalyticsMetricsWithResponse(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        LogAnalyticsGranularity granularity,
        List<LogAnalyticsActions> actions,
        List<LogAnalyticsGroupBy> groupBy,
        List<LogAnalyticsRuleTypes> ruleTypes,
        Context context) {
        Response<WafMetricsResponseInner> inner =
            this
                .serviceClient()
                .getWafLogAnalyticsMetricsWithResponse(
                    resourceGroupName,
                    profileName,
                    metrics,
                    dateTimeBegin,
                    dateTimeEnd,
                    granularity,
                    actions,
                    groupBy,
                    ruleTypes,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WafMetricsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WafRankingsResponse getWafLogAnalyticsRankings(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        float maxRanking,
        List<LogAnalyticsRankings> rankings) {
        WafRankingsResponseInner inner =
            this
                .serviceClient()
                .getWafLogAnalyticsRankings(
                    resourceGroupName, profileName, metrics, dateTimeBegin, dateTimeEnd, maxRanking, rankings);
        if (inner != null) {
            return new WafRankingsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WafRankingsResponse> getWafLogAnalyticsRankingsWithResponse(
        String resourceGroupName,
        String profileName,
        List<String> metrics,
        OffsetDateTime dateTimeBegin,
        OffsetDateTime dateTimeEnd,
        float maxRanking,
        List<LogAnalyticsRankings> rankings,
        List<LogAnalyticsActions> actions,
        List<LogAnalyticsRuleTypes> ruleTypes,
        Context context) {
        Response<WafRankingsResponseInner> inner =
            this
                .serviceClient()
                .getWafLogAnalyticsRankingsWithResponse(
                    resourceGroupName,
                    profileName,
                    metrics,
                    dateTimeBegin,
                    dateTimeEnd,
                    maxRanking,
                    rankings,
                    actions,
                    ruleTypes,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WafRankingsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LogAnalyticsClient serviceClient() {
        return this.innerClient;
    }

    private CdnManager manager() {
        return this.serviceManager;
    }
}

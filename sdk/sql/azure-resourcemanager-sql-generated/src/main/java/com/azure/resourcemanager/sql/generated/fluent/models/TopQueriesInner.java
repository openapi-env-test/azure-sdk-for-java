// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.QueryAggregationFunction;
import com.azure.resourcemanager.sql.generated.models.QueryExecutionType;
import com.azure.resourcemanager.sql.generated.models.QueryObservedMetricType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** A database query. */
@Immutable
public final class TopQueriesInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TopQueriesInner.class);

    /*
     * The function that is used to aggregate each query's metrics.
     */
    @JsonProperty(value = "aggregationFunction", access = JsonProperty.Access.WRITE_ONLY)
    private QueryAggregationFunction aggregationFunction;

    /*
     * The execution type that is used to filter the query instances that are
     * returned.
     */
    @JsonProperty(value = "executionType", access = JsonProperty.Access.WRITE_ONLY)
    private QueryExecutionType executionType;

    /*
     * The duration of the interval (ISO8601 duration format).
     */
    @JsonProperty(value = "intervalType", access = JsonProperty.Access.WRITE_ONLY)
    private String intervalType;

    /*
     * The number of requested queries.
     */
    @JsonProperty(value = "numberOfTopQueries", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfTopQueries;

    /*
     * The start time for queries that are returned (ISO8601 format)
     */
    @JsonProperty(value = "observationStartTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationStartTime;

    /*
     * The end time for queries that are returned (ISO8601 format)
     */
    @JsonProperty(value = "observationEndTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationEndTime;

    /*
     * The type of metric to use for ordering the top metrics.
     */
    @JsonProperty(value = "observedMetric", access = JsonProperty.Access.WRITE_ONLY)
    private QueryObservedMetricType observedMetric;

    /*
     * The list of queries.
     */
    @JsonProperty(value = "queries", access = JsonProperty.Access.WRITE_ONLY)
    private List<QueryStatisticInner> queries;

    /**
     * Get the aggregationFunction property: The function that is used to aggregate each query's metrics.
     *
     * @return the aggregationFunction value.
     */
    public QueryAggregationFunction aggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * Get the executionType property: The execution type that is used to filter the query instances that are returned.
     *
     * @return the executionType value.
     */
    public QueryExecutionType executionType() {
        return this.executionType;
    }

    /**
     * Get the intervalType property: The duration of the interval (ISO8601 duration format).
     *
     * @return the intervalType value.
     */
    public String intervalType() {
        return this.intervalType;
    }

    /**
     * Get the numberOfTopQueries property: The number of requested queries.
     *
     * @return the numberOfTopQueries value.
     */
    public Integer numberOfTopQueries() {
        return this.numberOfTopQueries;
    }

    /**
     * Get the observationStartTime property: The start time for queries that are returned (ISO8601 format).
     *
     * @return the observationStartTime value.
     */
    public OffsetDateTime observationStartTime() {
        return this.observationStartTime;
    }

    /**
     * Get the observationEndTime property: The end time for queries that are returned (ISO8601 format).
     *
     * @return the observationEndTime value.
     */
    public OffsetDateTime observationEndTime() {
        return this.observationEndTime;
    }

    /**
     * Get the observedMetric property: The type of metric to use for ordering the top metrics.
     *
     * @return the observedMetric value.
     */
    public QueryObservedMetricType observedMetric() {
        return this.observedMetric;
    }

    /**
     * Get the queries property: The list of queries.
     *
     * @return the queries value.
     */
    public List<QueryStatisticInner> queries() {
        return this.queries;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queries() != null) {
            queries().forEach(e -> e.validate());
        }
    }
}

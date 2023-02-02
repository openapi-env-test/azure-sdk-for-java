// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.SingleQueryResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Query result. */
@Fluent
public final class QueryResultsInner {
    /*
     * Number of total records matching the query.
     */
    @JsonProperty(value = "matchingRecordsCount")
    private Long matchingRecordsCount;

    /*
     * Array containing the results of the query
     */
    @JsonProperty(value = "signatures")
    private List<SingleQueryResult> signatures;

    /** Creates an instance of QueryResultsInner class. */
    public QueryResultsInner() {
    }

    /**
     * Get the matchingRecordsCount property: Number of total records matching the query.
     *
     * @return the matchingRecordsCount value.
     */
    public Long matchingRecordsCount() {
        return this.matchingRecordsCount;
    }

    /**
     * Set the matchingRecordsCount property: Number of total records matching the query.
     *
     * @param matchingRecordsCount the matchingRecordsCount value to set.
     * @return the QueryResultsInner object itself.
     */
    public QueryResultsInner withMatchingRecordsCount(Long matchingRecordsCount) {
        this.matchingRecordsCount = matchingRecordsCount;
        return this;
    }

    /**
     * Get the signatures property: Array containing the results of the query.
     *
     * @return the signatures value.
     */
    public List<SingleQueryResult> signatures() {
        return this.signatures;
    }

    /**
     * Set the signatures property: Array containing the results of the query.
     *
     * @param signatures the signatures value to set.
     * @return the QueryResultsInner object itself.
     */
    public QueryResultsInner withSignatures(List<SingleQueryResult> signatures) {
        this.signatures = signatures;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (signatures() != null) {
            signatures().forEach(e -> e.validate());
        }
    }
}

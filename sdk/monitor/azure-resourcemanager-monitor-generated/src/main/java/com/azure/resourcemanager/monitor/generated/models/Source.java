// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specifies the log search query. */
@Fluent
public final class Source {
    /*
     * Log search query. Required for action type - AlertingAction
     */
    @JsonProperty(value = "query")
    private String query;

    /*
     * List of  Resource referred into query
     */
    @JsonProperty(value = "authorizedResources")
    private List<String> authorizedResources;

    /*
     * The resource uri over which log search query is to be run.
     */
    @JsonProperty(value = "dataSourceId", required = true)
    private String dataSourceId;

    /*
     * Set value to 'ResultCount' .
     */
    @JsonProperty(value = "queryType")
    private QueryType queryType;

    /**
     * Get the query property: Log search query. Required for action type - AlertingAction.
     *
     * @return the query value.
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query property: Log search query. Required for action type - AlertingAction.
     *
     * @param query the query value to set.
     * @return the Source object itself.
     */
    public Source withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the authorizedResources property: List of Resource referred into query.
     *
     * @return the authorizedResources value.
     */
    public List<String> authorizedResources() {
        return this.authorizedResources;
    }

    /**
     * Set the authorizedResources property: List of Resource referred into query.
     *
     * @param authorizedResources the authorizedResources value to set.
     * @return the Source object itself.
     */
    public Source withAuthorizedResources(List<String> authorizedResources) {
        this.authorizedResources = authorizedResources;
        return this;
    }

    /**
     * Get the dataSourceId property: The resource uri over which log search query is to be run.
     *
     * @return the dataSourceId value.
     */
    public String dataSourceId() {
        return this.dataSourceId;
    }

    /**
     * Set the dataSourceId property: The resource uri over which log search query is to be run.
     *
     * @param dataSourceId the dataSourceId value to set.
     * @return the Source object itself.
     */
    public Source withDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }

    /**
     * Get the queryType property: Set value to 'ResultCount' .
     *
     * @return the queryType value.
     */
    public QueryType queryType() {
        return this.queryType;
    }

    /**
     * Set the queryType property: Set value to 'ResultCount' .
     *
     * @param queryType the queryType value to set.
     * @return the Source object itself.
     */
    public Source withQueryType(QueryType queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataSourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property dataSourceId in model Source"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Source.class);
}

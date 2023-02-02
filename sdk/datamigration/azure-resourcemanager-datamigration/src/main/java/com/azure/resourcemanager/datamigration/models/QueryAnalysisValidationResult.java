// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Results for query analysis comparison between the source and target. */
@Fluent
public final class QueryAnalysisValidationResult {
    /*
     * List of queries executed and it's execution results in source and target
     */
    @JsonProperty(value = "queryResults")
    private QueryExecutionResult queryResults;

    /*
     * Errors that are part of the execution
     */
    @JsonProperty(value = "validationErrors")
    private ValidationError validationErrors;

    /** Creates an instance of QueryAnalysisValidationResult class. */
    public QueryAnalysisValidationResult() {
    }

    /**
     * Get the queryResults property: List of queries executed and it's execution results in source and target.
     *
     * @return the queryResults value.
     */
    public QueryExecutionResult queryResults() {
        return this.queryResults;
    }

    /**
     * Set the queryResults property: List of queries executed and it's execution results in source and target.
     *
     * @param queryResults the queryResults value to set.
     * @return the QueryAnalysisValidationResult object itself.
     */
    public QueryAnalysisValidationResult withQueryResults(QueryExecutionResult queryResults) {
        this.queryResults = queryResults;
        return this;
    }

    /**
     * Get the validationErrors property: Errors that are part of the execution.
     *
     * @return the validationErrors value.
     */
    public ValidationError validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validationErrors property: Errors that are part of the execution.
     *
     * @param validationErrors the validationErrors value to set.
     * @return the QueryAnalysisValidationResult object itself.
     */
    public QueryAnalysisValidationResult withValidationErrors(ValidationError validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryResults() != null) {
            queryResults().validate();
        }
        if (validationErrors() != null) {
            validationErrors().validate();
        }
    }
}

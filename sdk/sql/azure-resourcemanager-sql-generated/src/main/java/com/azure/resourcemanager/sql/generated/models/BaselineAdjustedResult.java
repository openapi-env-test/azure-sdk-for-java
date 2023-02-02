// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SQL Vulnerability Assessment baseline adjusted results. */
@Immutable
public final class BaselineAdjustedResult {
    /*
     * SQL Vulnerability Assessment baseline details
     */
    @JsonProperty(value = "baseline", access = JsonProperty.Access.WRITE_ONLY)
    private Baseline baseline;

    /*
     * SQL Vulnerability Assessment baseline status
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private RuleStatus status;

    /*
     * SQL Vulnerability Assessment results that are not in baseline
     */
    @JsonProperty(value = "resultsNotInBaseline", access = JsonProperty.Access.WRITE_ONLY)
    private List<List<String>> resultsNotInBaseline;

    /*
     * SQL Vulnerability Assessment results that are in baseline.
     */
    @JsonProperty(value = "resultsOnlyInBaseline", access = JsonProperty.Access.WRITE_ONLY)
    private List<List<String>> resultsOnlyInBaseline;

    /** Creates an instance of BaselineAdjustedResult class. */
    public BaselineAdjustedResult() {
    }

    /**
     * Get the baseline property: SQL Vulnerability Assessment baseline details.
     *
     * @return the baseline value.
     */
    public Baseline baseline() {
        return this.baseline;
    }

    /**
     * Get the status property: SQL Vulnerability Assessment baseline status.
     *
     * @return the status value.
     */
    public RuleStatus status() {
        return this.status;
    }

    /**
     * Get the resultsNotInBaseline property: SQL Vulnerability Assessment results that are not in baseline.
     *
     * @return the resultsNotInBaseline value.
     */
    public List<List<String>> resultsNotInBaseline() {
        return this.resultsNotInBaseline;
    }

    /**
     * Get the resultsOnlyInBaseline property: SQL Vulnerability Assessment results that are in baseline.
     *
     * @return the resultsOnlyInBaseline value.
     */
    public List<List<String>> resultsOnlyInBaseline() {
        return this.resultsOnlyInBaseline;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (baseline() != null) {
            baseline().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SQL Vulnerability Assessment benchmark reference. */
@Immutable
public final class BenchmarkReference {
    /*
     * SQL Vulnerability Assessment benchmark name
     */
    @JsonProperty(value = "benchmark", access = JsonProperty.Access.WRITE_ONLY)
    private String benchmark;

    /*
     * SQL Vulnerability Assessment benchmark reference.
     */
    @JsonProperty(value = "reference", access = JsonProperty.Access.WRITE_ONLY)
    private String reference;

    /** Creates an instance of BenchmarkReference class. */
    public BenchmarkReference() {
    }

    /**
     * Get the benchmark property: SQL Vulnerability Assessment benchmark name.
     *
     * @return the benchmark value.
     */
    public String benchmark() {
        return this.benchmark;
    }

    /**
     * Get the reference property: SQL Vulnerability Assessment benchmark reference.
     *
     * @return the reference value.
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

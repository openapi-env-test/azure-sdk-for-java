// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanRPOperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of operations supported by the RP. */
@Fluent
public final class ElasticSanOperationListResult {
    /*
     * An array of operations supported by the ElasticSan RP.
     */
    @JsonProperty(value = "value", required = true)
    private List<ElasticSanRPOperationInner> value;

    /*
     * URI to fetch the next section of the paginated response.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of operations supported by the ElasticSan RP.
     *
     * @return the value value.
     */
    public List<ElasticSanRPOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of operations supported by the ElasticSan RP.
     *
     * @param value the value value to set.
     * @return the ElasticSanOperationListResult object itself.
     */
    public ElasticSanOperationListResult withValue(List<ElasticSanRPOperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URI to fetch the next section of the paginated response.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URI to fetch the next section of the paginated response.
     *
     * @param nextLink the nextLink value to set.
     * @return the ElasticSanOperationListResult object itself.
     */
    public ElasticSanOperationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ElasticSanOperationListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ElasticSanOperationListResult.class);
}

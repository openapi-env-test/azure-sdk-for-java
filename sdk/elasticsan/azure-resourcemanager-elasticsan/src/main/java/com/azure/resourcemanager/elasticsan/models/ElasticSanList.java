// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Elastic Sans. */
@Fluent
public final class ElasticSanList {
    /*
     * An array of Elastic San objects.
     */
    @JsonProperty(value = "value", required = true)
    private List<ElasticSanInner> value;

    /*
     * URI to fetch the next section of the paginated response.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of Elastic San objects.
     *
     * @return the value value.
     */
    public List<ElasticSanInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of Elastic San objects.
     *
     * @param value the value value to set.
     * @return the ElasticSanList object itself.
     */
    public ElasticSanList withValue(List<ElasticSanInner> value) {
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
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ElasticSanList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ElasticSanList.class);
}

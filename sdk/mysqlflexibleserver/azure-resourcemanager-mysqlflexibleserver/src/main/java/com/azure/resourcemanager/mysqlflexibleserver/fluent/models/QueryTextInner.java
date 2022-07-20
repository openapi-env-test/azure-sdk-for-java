// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Query Text. */
@Fluent
public final class QueryTextInner extends ProxyResource {
    /*
     * The properties of a query text.
     */
    @JsonProperty(value = "properties")
    private QueryTextProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a query text.
     *
     * @return the innerProperties value.
     */
    private QueryTextProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the queryId property: Query identifier unique to the server.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.innerProperties() == null ? null : this.innerProperties().queryId();
    }

    /**
     * Set the queryId property: Query identifier unique to the server.
     *
     * @param queryId the queryId value to set.
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryId(String queryId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryTextProperties();
        }
        this.innerProperties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the queryText property: Query text.
     *
     * @return the queryText value.
     */
    public String queryText() {
        return this.innerProperties() == null ? null : this.innerProperties().queryText();
    }

    /**
     * Set the queryText property: Query text.
     *
     * @param queryText the queryText value to set.
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryText(String queryText) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QueryTextProperties();
        }
        this.innerProperties().withQueryText(queryText);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

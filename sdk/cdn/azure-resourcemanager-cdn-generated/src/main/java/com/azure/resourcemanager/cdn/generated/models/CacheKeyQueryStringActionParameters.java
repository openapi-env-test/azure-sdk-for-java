// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the parameters for the cache-key query string action. */
@Fluent
public final class CacheKeyQueryStringActionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheKeyQueryStringActionParameters.class);

    /*
     * The @odata.type property.
     */
    @JsonProperty(value = "@odata.type", required = true)
    private String odataType;

    /*
     * Caching behavior for the requests
     */
    @JsonProperty(value = "queryStringBehavior", required = true)
    private QueryStringBehavior queryStringBehavior;

    /*
     * query parameters to include or exclude (comma separated).
     */
    @JsonProperty(value = "queryParameters")
    private String queryParameters;

    /** Creates an instance of CacheKeyQueryStringActionParameters class. */
    public CacheKeyQueryStringActionParameters() {
        odataType = "#Microsoft.Azure.Cdn.Models.DeliveryRuleCacheKeyQueryStringBehaviorActionParameters";
    }

    /**
     * Get the odataType property: The @odata.type property.
     *
     * @return the odataType value.
     */
    public String odataType() {
        return this.odataType;
    }

    /**
     * Set the odataType property: The @odata.type property.
     *
     * @param odataType the odataType value to set.
     * @return the CacheKeyQueryStringActionParameters object itself.
     */
    public CacheKeyQueryStringActionParameters withOdataType(String odataType) {
        this.odataType = odataType;
        return this;
    }

    /**
     * Get the queryStringBehavior property: Caching behavior for the requests.
     *
     * @return the queryStringBehavior value.
     */
    public QueryStringBehavior queryStringBehavior() {
        return this.queryStringBehavior;
    }

    /**
     * Set the queryStringBehavior property: Caching behavior for the requests.
     *
     * @param queryStringBehavior the queryStringBehavior value to set.
     * @return the CacheKeyQueryStringActionParameters object itself.
     */
    public CacheKeyQueryStringActionParameters withQueryStringBehavior(QueryStringBehavior queryStringBehavior) {
        this.queryStringBehavior = queryStringBehavior;
        return this;
    }

    /**
     * Get the queryParameters property: query parameters to include or exclude (comma separated).
     *
     * @return the queryParameters value.
     */
    public String queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set the queryParameters property: query parameters to include or exclude (comma separated).
     *
     * @param queryParameters the queryParameters value to set.
     * @return the CacheKeyQueryStringActionParameters object itself.
     */
    public CacheKeyQueryStringActionParameters withQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryStringBehavior() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property queryStringBehavior in model CacheKeyQueryStringActionParameters"));
        }
    }
}

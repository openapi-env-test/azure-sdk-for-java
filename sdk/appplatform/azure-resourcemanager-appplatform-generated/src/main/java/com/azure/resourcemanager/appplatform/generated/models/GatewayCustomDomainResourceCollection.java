// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appplatform.generated.fluent.models.GatewayCustomDomainResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Object that includes an array of Spring Cloud Gateway custom domain resources and a possible link for next set. */
@Fluent
public final class GatewayCustomDomainResourceCollection {
    /*
     * Collection of Spring Cloud Gateway custom domain resources
     */
    @JsonProperty(value = "value")
    private List<GatewayCustomDomainResourceInner> value;

    /*
     * URL client should use to fetch the next page (per server side paging).
     * It's null for now, added for future use.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Collection of Spring Cloud Gateway custom domain resources.
     *
     * @return the value value.
     */
    public List<GatewayCustomDomainResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of Spring Cloud Gateway custom domain resources.
     *
     * @param value the value value to set.
     * @return the GatewayCustomDomainResourceCollection object itself.
     */
    public GatewayCustomDomainResourceCollection withValue(List<GatewayCustomDomainResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @param nextLink the nextLink value to set.
     * @return the GatewayCustomDomainResourceCollection object itself.
     */
    public GatewayCustomDomainResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

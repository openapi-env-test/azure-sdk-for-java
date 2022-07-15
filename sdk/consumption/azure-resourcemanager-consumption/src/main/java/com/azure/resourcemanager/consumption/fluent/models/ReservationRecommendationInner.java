// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.consumption.models.LegacyReservationRecommendation;
import com.azure.resourcemanager.consumption.models.ModernReservationRecommendation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** A reservation recommendation resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = ReservationRecommendationInner.class)
@JsonTypeName("ReservationRecommendation")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "legacy", value = LegacyReservationRecommendation.class),
    @JsonSubTypes.Type(name = "modern", value = ModernReservationRecommendation.class)
})
@Immutable
public class ReservationRecommendationInner extends ProxyResource {
    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Resource location
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource sku
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private String sku;

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the sku property: Resource sku.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

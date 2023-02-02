// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A charge summary resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = ChargeSummary.class)
@JsonTypeName("ChargeSummary")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "legacy", value = LegacyChargeSummary.class),
    @JsonSubTypes.Type(name = "modern", value = ModernChargeSummary.class)
})
@Fluent
public class ChargeSummary extends ProxyResource {
    /*
     * eTag of the resource. To handle concurrent update scenario, this field will be used to determine whether the
     * user is updating the latest version or not.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /** Creates an instance of ChargeSummary class. */
    public ChargeSummary() {
    }

    /**
     * Get the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @param etag the etag value to set.
     * @return the ChargeSummary object itself.
     */
    public ChargeSummary withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

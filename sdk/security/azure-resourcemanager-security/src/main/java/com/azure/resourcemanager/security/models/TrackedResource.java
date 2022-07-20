// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes an Azure tracked resource. */
@Fluent
public final class TrackedResource extends ProxyResource {
    /*
     * Location where the resource is stored
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Kind of the resource
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * Entity tag is used for comparing two or more entities from the same
     * requested resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * A list of key value pairs that describe the resource.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the location property: Location where the resource is stored.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location where the resource is stored.
     *
     * @param location the location value to set.
     * @return the TrackedResource object itself.
     */
    public TrackedResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the kind property: Kind of the resource.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the TrackedResource object itself.
     */
    public TrackedResource withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the etag property: Entity tag is used for comparing two or more entities from the same requested resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Entity tag is used for comparing two or more entities from the same requested resource.
     *
     * @param etag the etag value to set.
     * @return the TrackedResource object itself.
     */
    public TrackedResource withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the tags property: A list of key value pairs that describe the resource.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: A list of key value pairs that describe the resource.
     *
     * @param tags the tags value to set.
     * @return the TrackedResource object itself.
     */
    public TrackedResource withTags(Map<String, String> tags) {
        this.tags = tags;
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

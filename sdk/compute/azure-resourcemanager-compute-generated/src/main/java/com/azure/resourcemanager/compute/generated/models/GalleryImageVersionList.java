// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageVersionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Gallery Image version operation response. */
@Fluent
public final class GalleryImageVersionList {
    /*
     * A list of gallery image versions.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryImageVersionInner> value;

    /*
     * The uri to fetch the next page of gallery image versions. Call ListNext() with this to fetch the next page of
     * gallery image versions.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of GalleryImageVersionList class. */
    public GalleryImageVersionList() {
    }

    /**
     * Get the value property: A list of gallery image versions.
     *
     * @return the value value.
     */
    public List<GalleryImageVersionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of gallery image versions.
     *
     * @param value the value value to set.
     * @return the GalleryImageVersionList object itself.
     */
    public GalleryImageVersionList withValue(List<GalleryImageVersionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of gallery image versions. Call ListNext() with this to
     * fetch the next page of gallery image versions.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of gallery image versions. Call ListNext() with this to
     * fetch the next page of gallery image versions.
     *
     * @param nextLink the nextLink value to set.
     * @return the GalleryImageVersionList object itself.
     */
    public GalleryImageVersionList withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model GalleryImageVersionList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryImageVersionList.class);
}

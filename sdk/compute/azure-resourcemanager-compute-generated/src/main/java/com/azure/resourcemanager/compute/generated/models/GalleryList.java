// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Galleries operation response. */
@Fluent
public final class GalleryList {
    /*
     * A list of galleries.
     */
    @JsonProperty(value = "value", required = true)
    private List<GalleryInner> value;

    /*
     * The uri to fetch the next page of galleries. Call ListNext() with this
     * to fetch the next page of galleries.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of galleries.
     *
     * @return the value value.
     */
    public List<GalleryInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of galleries.
     *
     * @param value the value value to set.
     * @return the GalleryList object itself.
     */
    public GalleryList withValue(List<GalleryInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of galleries. Call ListNext() with this to fetch the
     * next page of galleries.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of galleries. Call ListNext() with this to fetch the
     * next page of galleries.
     *
     * @param nextLink the nextLink value to set.
     * @return the GalleryList object itself.
     */
    public GalleryList withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model GalleryList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryList.class);
}

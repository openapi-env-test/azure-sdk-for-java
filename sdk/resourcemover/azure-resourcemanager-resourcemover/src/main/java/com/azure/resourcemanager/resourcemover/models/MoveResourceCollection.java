// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resourcemover.fluent.models.MoveResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the collection of move resources. */
@Fluent
public final class MoveResourceCollection {
    /*
     * Gets the list of move resources.
     */
    @JsonProperty(value = "value")
    private List<MoveResourceInner> value;

    /*
     * Gets the value of  next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Gets or sets the list of summary items and the field on which summary is
     * done.
     */
    @JsonProperty(value = "summaryCollection")
    private SummaryCollection summaryCollection;

    /*
     * Gets the total count.
     */
    @JsonProperty(value = "totalCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalCount;

    /**
     * Get the value property: Gets the list of move resources.
     *
     * @return the value value.
     */
    public List<MoveResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of move resources.
     *
     * @param value the value value to set.
     * @return the MoveResourceCollection object itself.
     */
    public MoveResourceCollection withValue(List<MoveResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the MoveResourceCollection object itself.
     */
    public MoveResourceCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the summaryCollection property: Gets or sets the list of summary items and the field on which summary is
     * done.
     *
     * @return the summaryCollection value.
     */
    public SummaryCollection summaryCollection() {
        return this.summaryCollection;
    }

    /**
     * Set the summaryCollection property: Gets or sets the list of summary items and the field on which summary is
     * done.
     *
     * @param summaryCollection the summaryCollection value to set.
     * @return the MoveResourceCollection object itself.
     */
    public MoveResourceCollection withSummaryCollection(SummaryCollection summaryCollection) {
        this.summaryCollection = summaryCollection;
        return this;
    }

    /**
     * Get the totalCount property: Gets the total count.
     *
     * @return the totalCount value.
     */
    public Long totalCount() {
        return this.totalCount;
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
        if (summaryCollection() != null) {
            summaryCollection().validate();
        }
    }
}

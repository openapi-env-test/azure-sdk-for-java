// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.agrifood.fluent.models.FarmBeatsExtensionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Paged response contains list of requested objects and a URL link to get the next set of results. */
@Fluent
public final class FarmBeatsExtensionListResponse {
    /*
     * List of requested objects.
     */
    @JsonProperty(value = "value")
    private List<FarmBeatsExtensionInner> value;

    /*
     * Continuation link (absolute URI) to the next page of results in the list.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of FarmBeatsExtensionListResponse class. */
    public FarmBeatsExtensionListResponse() {
    }

    /**
     * Get the value property: List of requested objects.
     *
     * @return the value value.
     */
    public List<FarmBeatsExtensionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of requested objects.
     *
     * @param value the value value to set.
     * @return the FarmBeatsExtensionListResponse object itself.
     */
    public FarmBeatsExtensionListResponse withValue(List<FarmBeatsExtensionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Continuation link (absolute URI) to the next page of results in the list.
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
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}

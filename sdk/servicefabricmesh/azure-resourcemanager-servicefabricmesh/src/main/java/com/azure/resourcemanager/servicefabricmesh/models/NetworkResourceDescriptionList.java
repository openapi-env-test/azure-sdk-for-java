// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicefabricmesh.fluent.models.NetworkResourceDescriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A pageable list of network resources. */
@Fluent
public final class NetworkResourceDescriptionList {
    /*
     * One page of the list.
     */
    @JsonProperty(value = "value")
    private List<NetworkResourceDescriptionInner> value;

    /*
     * URI to fetch the next page of the list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of NetworkResourceDescriptionList class. */
    public NetworkResourceDescriptionList() {
    }

    /**
     * Get the value property: One page of the list.
     *
     * @return the value value.
     */
    public List<NetworkResourceDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: One page of the list.
     *
     * @param value the value value to set.
     * @return the NetworkResourceDescriptionList object itself.
     */
    public NetworkResourceDescriptionList withValue(List<NetworkResourceDescriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URI to fetch the next page of the list.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URI to fetch the next page of the list.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkResourceDescriptionList object itself.
     */
    public NetworkResourceDescriptionList withNextLink(String nextLink) {
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmesh.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicefabricmesh.fluent.models.SecretResourceDescriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A pageable list of secret resources. */
@Fluent
public final class SecretResourceDescriptionList {
    /*
     * One page of the list.
     */
    @JsonProperty(value = "value")
    private List<SecretResourceDescriptionInner> value;

    /*
     * URI to fetch the next page of the list.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of SecretResourceDescriptionList class. */
    public SecretResourceDescriptionList() {
    }

    /**
     * Get the value property: One page of the list.
     *
     * @return the value value.
     */
    public List<SecretResourceDescriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: One page of the list.
     *
     * @param value the value value to set.
     * @return the SecretResourceDescriptionList object itself.
     */
    public SecretResourceDescriptionList withValue(List<SecretResourceDescriptionInner> value) {
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
     * @return the SecretResourceDescriptionList object itself.
     */
    public SecretResourceDescriptionList withNextLink(String nextLink) {
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.MigrationItemInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Migration item collection. */
@Fluent
public final class MigrationItemCollection {
    /*
     * The list of migration items.
     */
    @JsonProperty(value = "value")
    private List<MigrationItemInner> value;

    /*
     * The value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of migration items.
     *
     * @return the value value.
     */
    public List<MigrationItemInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of migration items.
     *
     * @param value the value value to set.
     * @return the MigrationItemCollection object itself.
     */
    public MigrationItemCollection withValue(List<MigrationItemInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the MigrationItemCollection object itself.
     */
    public MigrationItemCollection withNextLink(String nextLink) {
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

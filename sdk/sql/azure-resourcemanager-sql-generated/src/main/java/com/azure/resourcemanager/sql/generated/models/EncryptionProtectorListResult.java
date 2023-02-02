// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.sql.generated.fluent.models.EncryptionProtectorInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of server encryption protectors. */
@Immutable
public final class EncryptionProtectorListResult {
    /*
     * Array of results.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<EncryptionProtectorInner> value;

    /*
     * Link to retrieve next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of EncryptionProtectorListResult class. */
    public EncryptionProtectorListResult() {
    }

    /**
     * Get the value property: Array of results.
     *
     * @return the value value.
     */
    public List<EncryptionProtectorInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
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

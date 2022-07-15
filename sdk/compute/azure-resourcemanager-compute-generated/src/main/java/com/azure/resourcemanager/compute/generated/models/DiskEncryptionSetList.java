// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.DiskEncryptionSetInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List disk encryption set operation response. */
@Fluent
public final class DiskEncryptionSetList {
    /*
     * A list of disk encryption sets.
     */
    @JsonProperty(value = "value", required = true)
    private List<DiskEncryptionSetInner> value;

    /*
     * The uri to fetch the next page of disk encryption sets. Call ListNext()
     * with this to fetch the next page of disk encryption sets.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of disk encryption sets.
     *
     * @return the value value.
     */
    public List<DiskEncryptionSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of disk encryption sets.
     *
     * @param value the value value to set.
     * @return the DiskEncryptionSetList object itself.
     */
    public DiskEncryptionSetList withValue(List<DiskEncryptionSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of disk encryption sets. Call ListNext() with this to
     * fetch the next page of disk encryption sets.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of disk encryption sets. Call ListNext() with this to
     * fetch the next page of disk encryption sets.
     *
     * @param nextLink the nextLink value to set.
     * @return the DiskEncryptionSetList object itself.
     */
    public DiskEncryptionSetList withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model DiskEncryptionSetList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiskEncryptionSetList.class);
}

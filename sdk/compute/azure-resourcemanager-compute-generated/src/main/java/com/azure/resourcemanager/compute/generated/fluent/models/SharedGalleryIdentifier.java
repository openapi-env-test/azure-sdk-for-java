// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The identifier information of shared gallery. */
@Fluent
public final class SharedGalleryIdentifier {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedGalleryIdentifier.class);

    /*
     * The unique id of this shared gallery.
     */
    @JsonProperty(value = "uniqueId")
    private String uniqueId;

    /**
     * Get the uniqueId property: The unique id of this shared gallery.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.uniqueId;
    }

    /**
     * Set the uniqueId property: The unique id of this shared gallery.
     *
     * @param uniqueId the uniqueId value to set.
     * @return the SharedGalleryIdentifier object itself.
     */
    public SharedGalleryIdentifier withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
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

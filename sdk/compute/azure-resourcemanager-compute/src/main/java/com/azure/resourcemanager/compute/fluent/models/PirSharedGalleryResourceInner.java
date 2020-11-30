// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.PirResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Base information about the shared gallery resource in pir. */
@JsonFlatten
@Fluent
public class PirSharedGalleryResourceInner extends PirResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PirSharedGalleryResourceInner.class);

    /*
     * The unique id of this shared gallery.
     */
    @JsonProperty(value = "identifier.uniqueId")
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
     * @return the PirSharedGalleryResourceInner object itself.
     */
    public PirSharedGalleryResourceInner withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}

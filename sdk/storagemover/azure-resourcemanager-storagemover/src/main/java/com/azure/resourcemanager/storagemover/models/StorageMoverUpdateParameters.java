// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storagemover.fluent.models.StorageMoverUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Storage Mover resource. */
@Fluent
public final class StorageMoverUpdateParameters {
    /*
     * The resource specific properties for the Storage Mover resource.
     */
    @JsonProperty(value = "properties")
    private StorageMoverUpdateProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Get the innerProperties property: The resource specific properties for the Storage Mover resource.
     *
     * @return the innerProperties value.
     */
    private StorageMoverUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the StorageMoverUpdateParameters object itself.
     */
    public StorageMoverUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the description property: A description for the Storage Mover.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description for the Storage Mover.
     *
     * @param description the description value to set.
     * @return the StorageMoverUpdateParameters object itself.
     */
    public StorageMoverUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMoverUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.resourcemover.models.Identity;
import com.azure.resourcemanager.resourcemover.models.MoveCollectionProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Define the move collection. */
@Fluent
public final class MoveCollectionInner extends Resource {
    /*
     * The etag of the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Defines the MSI properties of the Move Collection.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Defines the move collection properties.
     */
    @JsonProperty(value = "properties")
    private MoveCollectionProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the etag property: The etag of the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the identity property: Defines the MSI properties of the Move Collection.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Defines the MSI properties of the Move Collection.
     *
     * @param identity the identity value to set.
     * @return the MoveCollectionInner object itself.
     */
    public MoveCollectionInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: Defines the move collection properties.
     *
     * @return the properties value.
     */
    public MoveCollectionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Defines the move collection properties.
     *
     * @param properties the properties value to set.
     * @return the MoveCollectionInner object itself.
     */
    public MoveCollectionInner withProperties(MoveCollectionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public MoveCollectionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MoveCollectionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}

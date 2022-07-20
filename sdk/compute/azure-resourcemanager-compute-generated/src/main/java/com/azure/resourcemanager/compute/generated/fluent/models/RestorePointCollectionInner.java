// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.generated.models.RestorePointCollectionSourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Create or update Restore Point collection parameters. */
@Fluent
public final class RestorePointCollectionInner extends Resource {
    /*
     * The restore point collection properties.
     */
    @JsonProperty(value = "properties")
    private RestorePointCollectionProperties innerProperties;

    /**
     * Get the innerProperties property: The restore point collection properties.
     *
     * @return the innerProperties value.
     */
    private RestorePointCollectionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public RestorePointCollectionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RestorePointCollectionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the source property: The properties of the source resource that this restore point collection is created
     * from.
     *
     * @return the source value.
     */
    public RestorePointCollectionSourceProperties source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: The properties of the source resource that this restore point collection is created
     * from.
     *
     * @param source the source value to set.
     * @return the RestorePointCollectionInner object itself.
     */
    public RestorePointCollectionInner withSource(RestorePointCollectionSourceProperties source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RestorePointCollectionProperties();
        }
        this.innerProperties().withSource(source);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the restore point collection.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the restorePointCollectionId property: The unique id of the restore point collection.
     *
     * @return the restorePointCollectionId value.
     */
    public String restorePointCollectionId() {
        return this.innerProperties() == null ? null : this.innerProperties().restorePointCollectionId();
    }

    /**
     * Get the restorePoints property: A list containing all restore points created under this restore point collection.
     *
     * @return the restorePoints value.
     */
    public List<RestorePointInner> restorePoints() {
        return this.innerProperties() == null ? null : this.innerProperties().restorePoints();
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

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.storagemover.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Storage Mover resource, which is a container for a group of Agents, Projects, and Endpoints. */
@Fluent
public final class StorageMoverInner extends Resource {
    /*
     * The resource specific properties for the Storage Mover resource.
     */
    @JsonProperty(value = "properties")
    private StorageMoverProperties innerProperties;

    /*
     * Resource system metadata.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The resource specific properties for the Storage Mover resource.
     *
     * @return the innerProperties value.
     */
    private StorageMoverProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Resource system metadata.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public StorageMoverInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StorageMoverInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
     * @return the StorageMoverInner object itself.
     */
    public StorageMoverInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageMoverProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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

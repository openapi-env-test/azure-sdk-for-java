// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationVersionProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specifies information about the gallery Application Version that you want to update. */
@Fluent
public final class GalleryApplicationVersionUpdate extends UpdateResourceDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryApplicationVersionUpdate.class);

    /*
     * Describes the properties of a gallery image version.
     */
    @JsonProperty(value = "properties")
    private GalleryApplicationVersionProperties innerProperties;

    /**
     * Get the innerProperties property: Describes the properties of a gallery image version.
     *
     * @return the innerProperties value.
     */
    private GalleryApplicationVersionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @return the publishingProfile value.
     */
    public GalleryApplicationVersionPublishingProfile publishingProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().publishingProfile();
    }

    /**
     * Set the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @param publishingProfile the publishingProfile value to set.
     * @return the GalleryApplicationVersionUpdate object itself.
     */
    public GalleryApplicationVersionUpdate withPublishingProfile(
        GalleryApplicationVersionPublishingProfile publishingProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryApplicationVersionProperties();
        }
        this.innerProperties().withPublishingProfile(publishingProfile);
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery Application Version. The provisioning state,
     * which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryApplicationVersionPropertiesProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the replicationStatus property: This is the replication status of the gallery image version.
     *
     * @return the replicationStatus value.
     */
    public ReplicationStatus replicationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().replicationStatus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

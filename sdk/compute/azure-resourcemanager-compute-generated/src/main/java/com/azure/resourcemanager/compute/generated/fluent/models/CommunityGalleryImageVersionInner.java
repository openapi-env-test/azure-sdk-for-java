// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.generated.models.PirCommunityGalleryResource;
import com.azure.resourcemanager.compute.generated.models.SharedGalleryImageVersionStorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Specifies information about the gallery image version that you want to create or update. */
@Fluent
public final class CommunityGalleryImageVersionInner extends PirCommunityGalleryResource {
    /*
     * Describes the properties of a gallery image version.
     */
    @JsonProperty(value = "properties")
    private CommunityGalleryImageVersionProperties innerProperties;

    /** Creates an instance of CommunityGalleryImageVersionInner class. */
    public CommunityGalleryImageVersionInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a gallery image version.
     *
     * @return the innerProperties value.
     */
    private CommunityGalleryImageVersionProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public CommunityGalleryImageVersionInner withUniqueId(String uniqueId) {
        super.withUniqueId(uniqueId);
        return this;
    }

    /**
     * Get the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.innerProperties() == null ? null : this.innerProperties().publishedDate();
    }

    /**
     * Set the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @param publishedDate the publishedDate value to set.
     * @return the CommunityGalleryImageVersionInner object itself.
     */
    public CommunityGalleryImageVersionInner withPublishedDate(OffsetDateTime publishedDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageVersionProperties();
        }
        this.innerProperties().withPublishedDate(publishedDate);
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endOfLifeDate();
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the CommunityGalleryImageVersionInner object itself.
     */
    public CommunityGalleryImageVersionInner withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageVersionProperties();
        }
        this.innerProperties().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /**
     * Get the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     *
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.innerProperties() == null ? null : this.innerProperties().excludeFromLatest();
    }

    /**
     * Set the excludeFromLatest property: If set to true, Virtual Machines deployed from the latest version of the
     * Image Definition won't use this Image Version.
     *
     * @param excludeFromLatest the excludeFromLatest value to set.
     * @return the CommunityGalleryImageVersionInner object itself.
     */
    public CommunityGalleryImageVersionInner withExcludeFromLatest(Boolean excludeFromLatest) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageVersionProperties();
        }
        this.innerProperties().withExcludeFromLatest(excludeFromLatest);
        return this;
    }

    /**
     * Get the storageProfile property: Describes the storage profile of the image version.
     *
     * @return the storageProfile value.
     */
    public SharedGalleryImageVersionStorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: Describes the storage profile of the image version.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the CommunityGalleryImageVersionInner object itself.
     */
    public CommunityGalleryImageVersionInner withStorageProfile(
        SharedGalleryImageVersionStorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CommunityGalleryImageVersionProperties();
        }
        this.innerProperties().withStorageProfile(storageProfile);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.OffsetDateTime;
import java.util.List;

/** The publishing profile of a gallery image Version. */
@Fluent
public final class GalleryImageVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageVersionPublishingProfile.class);

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionPublishingProfile withTargetRegions(List<TargetRegion> targetRegions) {
        super.withTargetRegions(targetRegions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionPublishingProfile withReplicaCount(Integer replicaCount) {
        super.withReplicaCount(replicaCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionPublishingProfile withExcludeFromLatest(Boolean excludeFromLatest) {
        super.withExcludeFromLatest(excludeFromLatest);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionPublishingProfile withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        super.withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionPublishingProfile withStorageAccountType(StorageAccountType storageAccountType) {
        super.withStorageAccountType(storageAccountType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageVersionPublishingProfile withReplicationMode(ReplicationMode replicationMode) {
        super.withReplicationMode(replicationMode);
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

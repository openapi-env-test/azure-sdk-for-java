// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The publishing profile of a gallery image version. */
@Fluent
public final class GalleryApplicationVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    /*
     * The source image from which the Image Version is going to be created.
     */
    @JsonProperty(value = "source", required = true)
    private UserArtifactSource source;

    /*
     * The manageActions property.
     */
    @JsonProperty(value = "manageActions")
    private UserArtifactManage manageActions;

    /*
     * Additional settings for the VM app that contains the target package and
     * config file name when it is deployed to target VM or VM scale set.
     */
    @JsonProperty(value = "settings")
    private UserArtifactSettings settings;

    /*
     * Optional. Additional settings to pass to the vm-application-manager
     * extension. For advanced use only.
     */
    @JsonProperty(value = "advancedSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> advancedSettings;

    /*
     * Optional. Whether or not this application reports health.
     */
    @JsonProperty(value = "enableHealthCheck")
    private Boolean enableHealthCheck;

    /**
     * Get the source property: The source image from which the Image Version is going to be created.
     *
     * @return the source value.
     */
    public UserArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source image from which the Image Version is going to be created.
     *
     * @param source the source value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSource(UserArtifactSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the manageActions property: The manageActions property.
     *
     * @return the manageActions value.
     */
    public UserArtifactManage manageActions() {
        return this.manageActions;
    }

    /**
     * Set the manageActions property: The manageActions property.
     *
     * @param manageActions the manageActions value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withManageActions(UserArtifactManage manageActions) {
        this.manageActions = manageActions;
        return this;
    }

    /**
     * Get the settings property: Additional settings for the VM app that contains the target package and config file
     * name when it is deployed to target VM or VM scale set.
     *
     * @return the settings value.
     */
    public UserArtifactSettings settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Additional settings for the VM app that contains the target package and config file
     * name when it is deployed to target VM or VM scale set.
     *
     * @param settings the settings value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSettings(UserArtifactSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the advancedSettings property: Optional. Additional settings to pass to the vm-application-manager extension.
     * For advanced use only.
     *
     * @return the advancedSettings value.
     */
    public Map<String, String> advancedSettings() {
        return this.advancedSettings;
    }

    /**
     * Set the advancedSettings property: Optional. Additional settings to pass to the vm-application-manager extension.
     * For advanced use only.
     *
     * @param advancedSettings the advancedSettings value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withAdvancedSettings(Map<String, String> advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }

    /**
     * Get the enableHealthCheck property: Optional. Whether or not this application reports health.
     *
     * @return the enableHealthCheck value.
     */
    public Boolean enableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * Set the enableHealthCheck property: Optional. Whether or not this application reports health.
     *
     * @param enableHealthCheck the enableHealthCheck value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withTargetRegions(List<TargetRegion> targetRegions) {
        super.withTargetRegions(targetRegions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withReplicaCount(Integer replicaCount) {
        super.withReplicaCount(replicaCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withExcludeFromLatest(Boolean excludeFromLatest) {
        super.withExcludeFromLatest(excludeFromLatest);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        super.withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withStorageAccountType(StorageAccountType storageAccountType) {
        super.withStorageAccountType(storageAccountType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withReplicationMode(ReplicationMode replicationMode) {
        super.withReplicationMode(replicationMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withTargetExtendedLocations(
        List<GalleryTargetExtendedLocation> targetExtendedLocations) {
        super.withTargetExtendedLocations(targetExtendedLocations);
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
        if (source() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property source in model GalleryApplicationVersionPublishingProfile"));
        } else {
            source().validate();
        }
        if (manageActions() != null) {
            manageActions().validate();
        }
        if (settings() != null) {
            settings().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryApplicationVersionPublishingProfile.class);
}

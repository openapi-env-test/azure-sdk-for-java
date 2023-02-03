// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageVersionInner;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersion;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionPublishingProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionSafetyProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionStorageProfile;
import com.azure.resourcemanager.compute.generated.models.GalleryImageVersionUpdate;
import com.azure.resourcemanager.compute.generated.models.GalleryProvisioningState;
import com.azure.resourcemanager.compute.generated.models.ReplicationStatus;
import com.azure.resourcemanager.compute.generated.models.ReplicationStatusTypes;
import java.util.Collections;
import java.util.Map;

public final class GalleryImageVersionImpl
    implements GalleryImageVersion, GalleryImageVersion.Definition, GalleryImageVersion.Update {
    private GalleryImageVersionInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public GalleryImageVersionPublishingProfile publishingProfile() {
        return this.innerModel().publishingProfile();
    }

    public GalleryProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public GalleryImageVersionStorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public GalleryImageVersionSafetyProfile safetyProfile() {
        return this.innerModel().safetyProfile();
    }

    public ReplicationStatus replicationStatus() {
        return this.innerModel().replicationStatus();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public GalleryImageVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String galleryName;

    private String galleryImageName;

    private String galleryImageVersionName;

    private GalleryImageVersionUpdate updateGalleryImageVersion;

    public GalleryImageVersionImpl withExistingImage(
        String resourceGroupName, String galleryName, String galleryImageName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        this.galleryImageName = galleryImageName;
        return this;
    }

    public GalleryImageVersion create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImageVersions()
                .createOrUpdate(
                    resourceGroupName,
                    galleryName,
                    galleryImageName,
                    galleryImageVersionName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public GalleryImageVersion create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImageVersions()
                .createOrUpdate(
                    resourceGroupName,
                    galleryName,
                    galleryImageName,
                    galleryImageVersionName,
                    this.innerModel(),
                    context);
        return this;
    }

    GalleryImageVersionImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new GalleryImageVersionInner();
        this.serviceManager = serviceManager;
        this.galleryImageVersionName = name;
    }

    public GalleryImageVersionImpl update() {
        this.updateGalleryImageVersion = new GalleryImageVersionUpdate();
        return this;
    }

    public GalleryImageVersion apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImageVersions()
                .update(
                    resourceGroupName,
                    galleryName,
                    galleryImageName,
                    galleryImageVersionName,
                    updateGalleryImageVersion,
                    Context.NONE);
        return this;
    }

    public GalleryImageVersion apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImageVersions()
                .update(
                    resourceGroupName,
                    galleryName,
                    galleryImageName,
                    galleryImageVersionName,
                    updateGalleryImageVersion,
                    context);
        return this;
    }

    GalleryImageVersionImpl(
        GalleryImageVersionInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.galleryName = Utils.getValueFromIdByName(innerObject.id(), "galleries");
        this.galleryImageName = Utils.getValueFromIdByName(innerObject.id(), "images");
        this.galleryImageVersionName = Utils.getValueFromIdByName(innerObject.id(), "versions");
    }

    public GalleryImageVersion refresh() {
        ReplicationStatusTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImageVersions()
                .getWithResponse(
                    resourceGroupName,
                    galleryName,
                    galleryImageName,
                    galleryImageVersionName,
                    localExpand,
                    Context.NONE)
                .getValue();
        return this;
    }

    public GalleryImageVersion refresh(Context context) {
        ReplicationStatusTypes localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImageVersions()
                .getWithResponse(
                    resourceGroupName, galleryName, galleryImageName, galleryImageVersionName, localExpand, context)
                .getValue();
        return this;
    }

    public GalleryImageVersionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GalleryImageVersionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GalleryImageVersionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateGalleryImageVersion.withTags(tags);
            return this;
        }
    }

    public GalleryImageVersionImpl withPublishingProfile(GalleryImageVersionPublishingProfile publishingProfile) {
        if (isInCreateMode()) {
            this.innerModel().withPublishingProfile(publishingProfile);
            return this;
        } else {
            this.updateGalleryImageVersion.withPublishingProfile(publishingProfile);
            return this;
        }
    }

    public GalleryImageVersionImpl withStorageProfile(GalleryImageVersionStorageProfile storageProfile) {
        if (isInCreateMode()) {
            this.innerModel().withStorageProfile(storageProfile);
            return this;
        } else {
            this.updateGalleryImageVersion.withStorageProfile(storageProfile);
            return this;
        }
    }

    public GalleryImageVersionImpl withSafetyProfile(GalleryImageVersionSafetyProfile safetyProfile) {
        if (isInCreateMode()) {
            this.innerModel().withSafetyProfile(safetyProfile);
            return this;
        } else {
            this.updateGalleryImageVersion.withSafetyProfile(safetyProfile);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

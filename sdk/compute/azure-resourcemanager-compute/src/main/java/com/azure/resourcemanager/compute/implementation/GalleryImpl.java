// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.GalleryInner;
import com.azure.resourcemanager.compute.models.Gallery;
import com.azure.resourcemanager.compute.models.GalleryIdentifier;
import com.azure.resourcemanager.compute.models.GalleryPropertiesProvisioningState;
import com.azure.resourcemanager.compute.models.GalleryUpdate;
import com.azure.resourcemanager.compute.models.SelectPermissions;
import com.azure.resourcemanager.compute.models.SharingProfile;
import java.util.Collections;
import java.util.Map;

public final class GalleryImpl implements Gallery, Gallery.Definition, Gallery.Update {
    private GalleryInner innerObject;

    private final ComputeManager serviceManager;

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

    public String description() {
        return this.innerModel().description();
    }

    public GalleryIdentifier identifier() {
        return this.innerModel().identifier();
    }

    public GalleryPropertiesProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SharingProfile sharingProfile() {
        return this.innerModel().sharingProfile();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public GalleryInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String galleryName;

    private GalleryUpdate updateGallery;

    public GalleryImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Gallery create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleries()
                .createOrUpdate(resourceGroupName, galleryName, this.innerModel(), Context.NONE);
        return this;
    }

    public Gallery create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleries()
                .createOrUpdate(resourceGroupName, galleryName, this.innerModel(), context);
        return this;
    }

    public GalleryImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new GalleryInner();
        this.serviceManager = serviceManager;
        this.galleryName = name;
    }

    public GalleryImpl update() {
        this.updateGallery = new GalleryUpdate();
        return this;
    }

    public Gallery apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleries()
                .update(resourceGroupName, galleryName, updateGallery, Context.NONE);
        return this;
    }

    public Gallery apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleries()
                .update(resourceGroupName, galleryName, updateGallery, context);
        return this;
    }

    public GalleryImpl(GalleryInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.galleryName = Utils.getValueFromIdByName(innerObject.id(), "galleries");
    }

    public Gallery refresh() {
        SelectPermissions localSelect = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleries()
                .getByResourceGroupWithResponse(resourceGroupName, galleryName, localSelect, Context.NONE)
                .getValue();
        return this;
    }

    public Gallery refresh(Context context) {
        SelectPermissions localSelect = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleries()
                .getByResourceGroupWithResponse(resourceGroupName, galleryName, localSelect, context)
                .getValue();
        return this;
    }

    public GalleryImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GalleryImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GalleryImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateGallery.withTags(tags);
            return this;
        }
    }

    public GalleryImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateGallery.withDescription(description);
            return this;
        }
    }

    public GalleryImpl withIdentifier(GalleryIdentifier identifier) {
        if (isInCreateMode()) {
            this.innerModel().withIdentifier(identifier);
            return this;
        } else {
            this.updateGallery.withIdentifier(identifier);
            return this;
        }
    }

    public GalleryImpl withSharingProfile(SharingProfile sharingProfile) {
        if (isInCreateMode()) {
            this.innerModel().withSharingProfile(sharingProfile);
            return this;
        } else {
            this.updateGallery.withSharingProfile(sharingProfile);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

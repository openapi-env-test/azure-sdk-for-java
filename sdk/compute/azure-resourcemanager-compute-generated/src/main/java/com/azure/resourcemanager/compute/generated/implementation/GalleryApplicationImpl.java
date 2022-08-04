// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationInner;
import com.azure.resourcemanager.compute.generated.models.GalleryApplication;
import com.azure.resourcemanager.compute.generated.models.GalleryApplicationUpdate;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class GalleryApplicationImpl
    implements GalleryApplication, GalleryApplication.Definition, GalleryApplication.Update {
    private GalleryApplicationInner innerObject;

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

    public String description() {
        return this.innerModel().description();
    }

    public String eula() {
        return this.innerModel().eula();
    }

    public String privacyStatementUri() {
        return this.innerModel().privacyStatementUri();
    }

    public String releaseNoteUri() {
        return this.innerModel().releaseNoteUri();
    }

    public OffsetDateTime endOfLifeDate() {
        return this.innerModel().endOfLifeDate();
    }

    public OperatingSystemTypes supportedOSType() {
        return this.innerModel().supportedOSType();
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

    public GalleryApplicationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String galleryName;

    private String galleryApplicationName;

    private GalleryApplicationUpdate updateGalleryApplication;

    public GalleryApplicationImpl withExistingGallery(String resourceGroupName, String galleryName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        return this;
    }

    public GalleryApplication create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryApplications()
                .createOrUpdate(
                    resourceGroupName, galleryName, galleryApplicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public GalleryApplication create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryApplications()
                .createOrUpdate(resourceGroupName, galleryName, galleryApplicationName, this.innerModel(), context);
        return this;
    }

    GalleryApplicationImpl(String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new GalleryApplicationInner();
        this.serviceManager = serviceManager;
        this.galleryApplicationName = name;
    }

    public GalleryApplicationImpl update() {
        this.updateGalleryApplication = new GalleryApplicationUpdate();
        return this;
    }

    public GalleryApplication apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryApplications()
                .update(resourceGroupName, galleryName, galleryApplicationName, updateGalleryApplication, Context.NONE);
        return this;
    }

    public GalleryApplication apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryApplications()
                .update(resourceGroupName, galleryName, galleryApplicationName, updateGalleryApplication, context);
        return this;
    }

    GalleryApplicationImpl(
        GalleryApplicationInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.galleryName = Utils.getValueFromIdByName(innerObject.id(), "galleries");
        this.galleryApplicationName = Utils.getValueFromIdByName(innerObject.id(), "applications");
    }

    public GalleryApplication refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryApplications()
                .getWithResponse(resourceGroupName, galleryName, galleryApplicationName, Context.NONE)
                .getValue();
        return this;
    }

    public GalleryApplication refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryApplications()
                .getWithResponse(resourceGroupName, galleryName, galleryApplicationName, context)
                .getValue();
        return this;
    }

    public GalleryApplicationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GalleryApplicationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GalleryApplicationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateGalleryApplication.withTags(tags);
            return this;
        }
    }

    public GalleryApplicationImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateGalleryApplication.withDescription(description);
            return this;
        }
    }

    public GalleryApplicationImpl withEula(String eula) {
        if (isInCreateMode()) {
            this.innerModel().withEula(eula);
            return this;
        } else {
            this.updateGalleryApplication.withEula(eula);
            return this;
        }
    }

    public GalleryApplicationImpl withPrivacyStatementUri(String privacyStatementUri) {
        if (isInCreateMode()) {
            this.innerModel().withPrivacyStatementUri(privacyStatementUri);
            return this;
        } else {
            this.updateGalleryApplication.withPrivacyStatementUri(privacyStatementUri);
            return this;
        }
    }

    public GalleryApplicationImpl withReleaseNoteUri(String releaseNoteUri) {
        if (isInCreateMode()) {
            this.innerModel().withReleaseNoteUri(releaseNoteUri);
            return this;
        } else {
            this.updateGalleryApplication.withReleaseNoteUri(releaseNoteUri);
            return this;
        }
    }

    public GalleryApplicationImpl withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        if (isInCreateMode()) {
            this.innerModel().withEndOfLifeDate(endOfLifeDate);
            return this;
        } else {
            this.updateGalleryApplication.withEndOfLifeDate(endOfLifeDate);
            return this;
        }
    }

    public GalleryApplicationImpl withSupportedOSType(OperatingSystemTypes supportedOSType) {
        if (isInCreateMode()) {
            this.innerModel().withSupportedOSType(supportedOSType);
            return this;
        } else {
            this.updateGalleryApplication.withSupportedOSType(supportedOSType);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

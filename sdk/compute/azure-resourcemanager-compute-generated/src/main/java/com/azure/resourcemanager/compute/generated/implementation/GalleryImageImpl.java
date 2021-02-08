// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner;
import com.azure.resourcemanager.compute.generated.models.Disallowed;
import com.azure.resourcemanager.compute.generated.models.GalleryImage;
import com.azure.resourcemanager.compute.generated.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.generated.models.GalleryImagePropertiesProvisioningState;
import com.azure.resourcemanager.compute.generated.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.RecommendedMachineConfiguration;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class GalleryImageImpl implements GalleryImage, GalleryImage.Definition, GalleryImage.Update {
    private GalleryImageInner innerObject;

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

    public String eula() {
        return this.innerModel().eula();
    }

    public String privacyStatementUri() {
        return this.innerModel().privacyStatementUri();
    }

    public String releaseNoteUri() {
        return this.innerModel().releaseNoteUri();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public OperatingSystemStateTypes osState() {
        return this.innerModel().osState();
    }

    public OffsetDateTime endOfLifeDate() {
        return this.innerModel().endOfLifeDate();
    }

    public GalleryImageIdentifier identifier() {
        return this.innerModel().identifier();
    }

    public RecommendedMachineConfiguration recommended() {
        return this.innerModel().recommended();
    }

    public Disallowed disallowed() {
        return this.innerModel().disallowed();
    }

    public ImagePurchasePlan purchasePlan() {
        return this.innerModel().purchasePlan();
    }

    public GalleryImagePropertiesProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public GalleryImageInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String galleryName;

    private String galleryImageName;

    public GalleryImageImpl withExistingGallery(String resourceGroupName, String galleryName) {
        this.resourceGroupName = resourceGroupName;
        this.galleryName = galleryName;
        return this;
    }

    public GalleryImage create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImages()
                .createOrUpdate(resourceGroupName, galleryName, galleryImageName, this.innerModel(), Context.NONE);
        return this;
    }

    public GalleryImage create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImages()
                .createOrUpdate(resourceGroupName, galleryName, galleryImageName, this.innerModel(), context);
        return this;
    }

    GalleryImageImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new GalleryImageInner();
        this.serviceManager = serviceManager;
        this.galleryImageName = name;
    }

    public GalleryImageImpl update() {
        return this;
    }

    public GalleryImage apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImages()
                .createOrUpdate(resourceGroupName, galleryName, galleryImageName, this.innerModel(), Context.NONE);
        return this;
    }

    public GalleryImage apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImages()
                .createOrUpdate(resourceGroupName, galleryName, galleryImageName, this.innerModel(), context);
        return this;
    }

    GalleryImageImpl(GalleryImageInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.galleryName = Utils.getValueFromIdByName(innerObject.id(), "galleries");
        this.galleryImageName = Utils.getValueFromIdByName(innerObject.id(), "images");
    }

    public GalleryImage refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImages()
                .getWithResponse(resourceGroupName, galleryName, galleryImageName, Context.NONE)
                .getValue();
        return this;
    }

    public GalleryImage refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGalleryImages()
                .getWithResponse(resourceGroupName, galleryName, galleryImageName, context)
                .getValue();
        return this;
    }

    public GalleryImageImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public GalleryImageImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public GalleryImageImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public GalleryImageImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public GalleryImageImpl withEula(String eula) {
        this.innerModel().withEula(eula);
        return this;
    }

    public GalleryImageImpl withPrivacyStatementUri(String privacyStatementUri) {
        this.innerModel().withPrivacyStatementUri(privacyStatementUri);
        return this;
    }

    public GalleryImageImpl withReleaseNoteUri(String releaseNoteUri) {
        this.innerModel().withReleaseNoteUri(releaseNoteUri);
        return this;
    }

    public GalleryImageImpl withOsType(OperatingSystemTypes osType) {
        this.innerModel().withOsType(osType);
        return this;
    }

    public GalleryImageImpl withOsState(OperatingSystemStateTypes osState) {
        this.innerModel().withOsState(osState);
        return this;
    }

    public GalleryImageImpl withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.innerModel().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    public GalleryImageImpl withIdentifier(GalleryImageIdentifier identifier) {
        this.innerModel().withIdentifier(identifier);
        return this;
    }

    public GalleryImageImpl withRecommended(RecommendedMachineConfiguration recommended) {
        this.innerModel().withRecommended(recommended);
        return this;
    }

    public GalleryImageImpl withDisallowed(Disallowed disallowed) {
        this.innerModel().withDisallowed(disallowed);
        return this;
    }

    public GalleryImageImpl withPurchasePlan(ImagePurchasePlan purchasePlan) {
        this.innerModel().withPurchasePlan(purchasePlan);
        return this;
    }
}

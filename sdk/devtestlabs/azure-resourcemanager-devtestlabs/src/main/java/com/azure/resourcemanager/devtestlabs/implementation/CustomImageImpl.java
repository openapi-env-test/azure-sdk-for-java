// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.CustomImageInner;
import com.azure.resourcemanager.devtestlabs.models.CustomImage;
import com.azure.resourcemanager.devtestlabs.models.CustomImageFragment;
import com.azure.resourcemanager.devtestlabs.models.CustomImageOsType;
import com.azure.resourcemanager.devtestlabs.models.DataDiskStorageTypeInfo;
import com.azure.resourcemanager.devtestlabs.models.LinuxOsState;
import com.azure.resourcemanager.devtestlabs.models.WindowsOsState;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CustomImageImpl implements CustomImage, CustomImage.Definition, CustomImage.Update {
    private CustomImageInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String author() {
        return this.innerModel().author();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public String managedImageId() {
        return this.innerModel().managedImageId();
    }

    public String managedSnapshotId() {
        return this.innerModel().managedSnapshotId();
    }

    public List<DataDiskStorageTypeInfo> dataDiskStorageInfo() {
        List<DataDiskStorageTypeInfo> inner = this.innerModel().dataDiskStorageInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean isPlanAuthorized() {
        return this.innerModel().isPlanAuthorized();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String uniqueIdentifier() {
        return this.innerModel().uniqueIdentifier();
    }

    public String sourceVmId() {
        return this.innerModel().sourceVmId();
    }

    public WindowsOsState windowsOsState() {
        return this.innerModel().windowsOsState();
    }

    public LinuxOsState linuxOsState() {
        return this.innerModel().linuxOsState();
    }

    public String imageName() {
        return this.innerModel().imageName();
    }

    public Boolean sysPrep() {
        return this.innerModel().sysPrep();
    }

    public CustomImageOsType osType() {
        return this.innerModel().osType();
    }

    public String idPropertiesId() {
        return this.innerModel().idPropertiesId();
    }

    public String publisher() {
        return this.innerModel().publisher();
    }

    public String offer() {
        return this.innerModel().offer();
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

    public CustomImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String labName;

    private String name;

    private CustomImageFragment updateCustomImage;

    public CustomImageImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    public CustomImage create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomImages()
                .createOrUpdate(resourceGroupName, labName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public CustomImage create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomImages()
                .createOrUpdate(resourceGroupName, labName, name, this.innerModel(), context);
        return this;
    }

    CustomImageImpl(String name, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = new CustomImageInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public CustomImageImpl update() {
        this.updateCustomImage = new CustomImageFragment();
        return this;
    }

    public CustomImage apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomImages()
                .updateWithResponse(resourceGroupName, labName, name, updateCustomImage, Context.NONE)
                .getValue();
        return this;
    }

    public CustomImage apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomImages()
                .updateWithResponse(resourceGroupName, labName, name, updateCustomImage, context)
                .getValue();
        return this;
    }

    CustomImageImpl(
        CustomImageInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.labName = Utils.getValueFromIdByName(innerObject.id(), "labs");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "customimages");
    }

    public CustomImage refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomImages()
                .getWithResponse(resourceGroupName, labName, name, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public CustomImage refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomImages()
                .getWithResponse(resourceGroupName, labName, name, localExpand, context)
                .getValue();
        return this;
    }

    public CustomImageImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CustomImageImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CustomImageImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateCustomImage.withTags(tags);
            return this;
        }
    }

    public CustomImageImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public CustomImageImpl withAuthor(String author) {
        this.innerModel().withAuthor(author);
        return this;
    }

    public CustomImageImpl withManagedImageId(String managedImageId) {
        this.innerModel().withManagedImageId(managedImageId);
        return this;
    }

    public CustomImageImpl withManagedSnapshotId(String managedSnapshotId) {
        this.innerModel().withManagedSnapshotId(managedSnapshotId);
        return this;
    }

    public CustomImageImpl withDataDiskStorageInfo(List<DataDiskStorageTypeInfo> dataDiskStorageInfo) {
        this.innerModel().withDataDiskStorageInfo(dataDiskStorageInfo);
        return this;
    }

    public CustomImageImpl withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.innerModel().withIsPlanAuthorized(isPlanAuthorized);
        return this;
    }

    public CustomImageImpl withSourceVmId(String sourceVmId) {
        this.innerModel().withSourceVmId(sourceVmId);
        return this;
    }

    public CustomImageImpl withWindowsOsState(WindowsOsState windowsOsState) {
        this.innerModel().withWindowsOsState(windowsOsState);
        return this;
    }

    public CustomImageImpl withLinuxOsState(LinuxOsState linuxOsState) {
        this.innerModel().withLinuxOsState(linuxOsState);
        return this;
    }

    public CustomImageImpl withImageName(String imageName) {
        this.innerModel().withImageName(imageName);
        return this;
    }

    public CustomImageImpl withSysPrep(Boolean sysPrep) {
        this.innerModel().withSysPrep(sysPrep);
        return this;
    }

    public CustomImageImpl withOsType(CustomImageOsType osType) {
        this.innerModel().withOsType(osType);
        return this;
    }

    public CustomImageImpl withIdPropertiesId(String idPropertiesId) {
        this.innerModel().withIdPropertiesId(idPropertiesId);
        return this;
    }

    public CustomImageImpl withPublisher(String publisher) {
        this.innerModel().withPublisher(publisher);
        return this;
    }

    public CustomImageImpl withOffer(String offer) {
        this.innerModel().withOffer(offer);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

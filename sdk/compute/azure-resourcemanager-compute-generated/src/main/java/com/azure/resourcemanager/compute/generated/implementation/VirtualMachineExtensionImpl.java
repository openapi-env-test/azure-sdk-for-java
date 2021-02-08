// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionUpdate;
import java.util.Collections;
import java.util.Map;

public final class VirtualMachineExtensionImpl
    implements VirtualMachineExtension, VirtualMachineExtension.Definition, VirtualMachineExtension.Update {
    private VirtualMachineExtensionInner innerObject;

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

    public String forceUpdateTag() {
        return this.innerModel().forceUpdateTag();
    }

    public String publisher() {
        return this.innerModel().publisher();
    }

    public String typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public String typeHandlerVersion() {
        return this.innerModel().typeHandlerVersion();
    }

    public Boolean autoUpgradeMinorVersion() {
        return this.innerModel().autoUpgradeMinorVersion();
    }

    public Object settings() {
        return this.innerModel().settings();
    }

    public Object protectedSettings() {
        return this.innerModel().protectedSettings();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineExtensionInstanceView instanceView() {
        return this.innerModel().instanceView();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualMachineExtensionInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmName;

    private String vmExtensionName;

    private VirtualMachineExtensionUpdate updateExtensionParameters;

    public VirtualMachineExtensionImpl withExistingVirtualMachine(String resourceGroupName, String vmName) {
        this.resourceGroupName = resourceGroupName;
        this.vmName = vmName;
        return this;
    }

    public VirtualMachineExtension create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineExtensions()
                .createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualMachineExtension create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineExtensions()
                .createOrUpdate(resourceGroupName, vmName, vmExtensionName, this.innerModel(), context);
        return this;
    }

    VirtualMachineExtensionImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineExtensionInner();
        this.serviceManager = serviceManager;
        this.vmExtensionName = name;
    }

    public VirtualMachineExtensionImpl update() {
        this.updateExtensionParameters = new VirtualMachineExtensionUpdate();
        return this;
    }

    public VirtualMachineExtension apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineExtensions()
                .update(resourceGroupName, vmName, vmExtensionName, updateExtensionParameters, Context.NONE);
        return this;
    }

    public VirtualMachineExtension apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineExtensions()
                .update(resourceGroupName, vmName, vmExtensionName, updateExtensionParameters, context);
        return this;
    }

    VirtualMachineExtensionImpl(VirtualMachineExtensionInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachines");
        this.vmExtensionName = Utils.getValueFromIdByName(innerObject.id(), "extensions");
    }

    public VirtualMachineExtension refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineExtensions()
                .getWithResponse(resourceGroupName, vmName, vmExtensionName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachineExtension refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineExtensions()
                .getWithResponse(resourceGroupName, vmName, vmExtensionName, localExpand, context)
                .getValue();
        return this;
    }

    public VirtualMachineExtensionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineExtensionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineExtensionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateExtensionParameters.withTags(tags);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withForceUpdateTag(String forceUpdateTag) {
        if (isInCreateMode()) {
            this.innerModel().withForceUpdateTag(forceUpdateTag);
            return this;
        } else {
            this.updateExtensionParameters.withForceUpdateTag(forceUpdateTag);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withPublisher(String publisher) {
        if (isInCreateMode()) {
            this.innerModel().withPublisher(publisher);
            return this;
        } else {
            this.updateExtensionParameters.withPublisher(publisher);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withTypePropertiesType(String typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public VirtualMachineExtensionImpl withTypeHandlerVersion(String typeHandlerVersion) {
        if (isInCreateMode()) {
            this.innerModel().withTypeHandlerVersion(typeHandlerVersion);
            return this;
        } else {
            this.updateExtensionParameters.withTypeHandlerVersion(typeHandlerVersion);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        if (isInCreateMode()) {
            this.innerModel().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
            return this;
        } else {
            this.updateExtensionParameters.withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withSettings(Object settings) {
        if (isInCreateMode()) {
            this.innerModel().withSettings(settings);
            return this;
        } else {
            this.updateExtensionParameters.withSettings(settings);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withProtectedSettings(Object protectedSettings) {
        if (isInCreateMode()) {
            this.innerModel().withProtectedSettings(protectedSettings);
            return this;
        } else {
            this.updateExtensionParameters.withProtectedSettings(protectedSettings);
            return this;
        }
    }

    public VirtualMachineExtensionImpl withInstanceView(VirtualMachineExtensionInstanceView instanceView) {
        this.innerModel().withInstanceView(instanceView);
        return this;
    }

    public VirtualMachineExtensionImpl withType(String type) {
        this.updateExtensionParameters.withType(type);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.ComputeManager;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineImageInner;
import com.azure.resourcemanager.compute.models.AutomaticOSUpgradeProperties;
import com.azure.resourcemanager.compute.models.DataDiskImage;
import com.azure.resourcemanager.compute.models.DisallowedConfiguration;
import com.azure.resourcemanager.compute.models.HyperVGenerationTypes;
import com.azure.resourcemanager.compute.models.OSDiskImage;
import com.azure.resourcemanager.compute.models.PurchasePlan;
import com.azure.resourcemanager.compute.models.VirtualMachineImage;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualMachineImageImpl implements VirtualMachineImage {
    private VirtualMachineImageInner innerObject;

    private final ComputeManager serviceManager;

    public VirtualMachineImageImpl(VirtualMachineImageInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
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

    public PurchasePlan plan() {
        return this.innerModel().plan();
    }

    public OSDiskImage osDiskImage() {
        return this.innerModel().osDiskImage();
    }

    public List<DataDiskImage> dataDiskImages() {
        List<DataDiskImage> inner = this.innerModel().dataDiskImages();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AutomaticOSUpgradeProperties automaticOSUpgradeProperties() {
        return this.innerModel().automaticOSUpgradeProperties();
    }

    public HyperVGenerationTypes hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public DisallowedConfiguration disallowed() {
        return this.innerModel().disallowed();
    }

    public VirtualMachineImageInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}

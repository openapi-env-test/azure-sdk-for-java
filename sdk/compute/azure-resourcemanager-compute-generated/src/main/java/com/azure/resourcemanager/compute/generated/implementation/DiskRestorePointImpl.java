// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.DiskRestorePointInner;
import com.azure.resourcemanager.compute.generated.models.DiskRestorePoint;
import com.azure.resourcemanager.compute.generated.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.generated.models.Encryption;
import com.azure.resourcemanager.compute.generated.models.HyperVGeneration;
import com.azure.resourcemanager.compute.generated.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.generated.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.compute.generated.models.PurchasePlanAutoGenerated;
import com.azure.resourcemanager.compute.generated.models.SupportedCapabilities;
import java.time.OffsetDateTime;

public final class DiskRestorePointImpl implements DiskRestorePoint {
    private DiskRestorePointInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    DiskRestorePointImpl(
        DiskRestorePointInner innerObject, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public String sourceResourceId() {
        return this.innerModel().sourceResourceId();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public HyperVGeneration hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerModel().purchasePlan();
    }

    public SupportedCapabilities supportedCapabilities() {
        return this.innerModel().supportedCapabilities();
    }

    public String familyId() {
        return this.innerModel().familyId();
    }

    public String sourceUniqueId() {
        return this.innerModel().sourceUniqueId();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public Boolean supportsHibernation() {
        return this.innerModel().supportsHibernation();
    }

    public NetworkAccessPolicy networkAccessPolicy() {
        return this.innerModel().networkAccessPolicy();
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public String diskAccessId() {
        return this.innerModel().diskAccessId();
    }

    public Float completionPercent() {
        return this.innerModel().completionPercent();
    }

    public String replicationState() {
        return this.innerModel().replicationState();
    }

    public String sourceResourceLocation() {
        return this.innerModel().sourceResourceLocation();
    }

    public DiskSecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public DiskRestorePointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}

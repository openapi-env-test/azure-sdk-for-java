// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineInstanceViewInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachinePropertiesInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.ApplicationProfile;
import com.azure.resourcemanager.compute.generated.models.BillingProfile;
import com.azure.resourcemanager.compute.generated.models.CapacityReservationProfile;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.ScheduledEventsProfile;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachinePriorityTypes;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineProperties;
import java.time.OffsetDateTime;

public final class VirtualMachinePropertiesImpl implements VirtualMachineProperties {
    private VirtualMachinePropertiesInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    VirtualMachinePropertiesImpl(
        VirtualMachinePropertiesInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public HardwareProfile hardwareProfile() {
        return this.innerModel().hardwareProfile();
    }

    public StorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public OSProfile osProfile() {
        return this.innerModel().osProfile();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public SecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public SubResource availabilitySet() {
        return this.innerModel().availabilitySet();
    }

    public SubResource virtualMachineScaleSet() {
        return this.innerModel().virtualMachineScaleSet();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public VirtualMachinePriorityTypes priority() {
        return this.innerModel().priority();
    }

    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.innerModel().evictionPolicy();
    }

    public BillingProfile billingProfile() {
        return this.innerModel().billingProfile();
    }

    public SubResource host() {
        return this.innerModel().host();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualMachineInstanceView instanceView() {
        VirtualMachineInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new VirtualMachineInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public String licenseType() {
        return this.innerModel().licenseType();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public String extensionsTimeBudget() {
        return this.innerModel().extensionsTimeBudget();
    }

    public Integer platformFaultDomain() {
        return this.innerModel().platformFaultDomain();
    }

    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.innerModel().scheduledEventsProfile();
    }

    public String userData() {
        return this.innerModel().userData();
    }

    public CapacityReservationProfile capacityReservation() {
        return this.innerModel().capacityReservation();
    }

    public ApplicationProfile applicationProfile() {
        return this.innerModel().applicationProfile();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public VirtualMachinePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}

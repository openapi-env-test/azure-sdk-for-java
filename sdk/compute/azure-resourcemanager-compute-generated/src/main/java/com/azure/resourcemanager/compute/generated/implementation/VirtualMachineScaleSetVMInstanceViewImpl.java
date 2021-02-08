// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.BootDiagnosticsInstanceView;
import com.azure.resourcemanager.compute.generated.models.DiskInstanceView;
import com.azure.resourcemanager.compute.generated.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.generated.models.MaintenanceRedeployStatus;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineAgentInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineHealthStatus;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceView;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineScaleSetVMInstanceViewImpl implements VirtualMachineScaleSetVMInstanceView {
    private VirtualMachineScaleSetVMInstanceViewInner innerObject;

    private final ComputeManager serviceManager;

    VirtualMachineScaleSetVMInstanceViewImpl(
        VirtualMachineScaleSetVMInstanceViewInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Integer platformUpdateDomain() {
        return this.innerModel().platformUpdateDomain();
    }

    public Integer platformFaultDomain() {
        return this.innerModel().platformFaultDomain();
    }

    public String rdpThumbPrint() {
        return this.innerModel().rdpThumbPrint();
    }

    public VirtualMachineAgentInstanceView vmAgent() {
        return this.innerModel().vmAgent();
    }

    public MaintenanceRedeployStatus maintenanceRedeployStatus() {
        return this.innerModel().maintenanceRedeployStatus();
    }

    public List<DiskInstanceView> disks() {
        List<DiskInstanceView> inner = this.innerModel().disks();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<VirtualMachineExtensionInstanceView> extensions() {
        List<VirtualMachineExtensionInstanceView> inner = this.innerModel().extensions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineHealthStatus vmHealth() {
        return this.innerModel().vmHealth();
    }

    public BootDiagnosticsInstanceView bootDiagnostics() {
        return this.innerModel().bootDiagnostics();
    }

    public List<InstanceViewStatus> statuses() {
        List<InstanceViewStatus> inner = this.innerModel().statuses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String placementGroupId() {
        return this.innerModel().placementGroupId();
    }

    public VirtualMachineScaleSetVMInstanceViewInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}

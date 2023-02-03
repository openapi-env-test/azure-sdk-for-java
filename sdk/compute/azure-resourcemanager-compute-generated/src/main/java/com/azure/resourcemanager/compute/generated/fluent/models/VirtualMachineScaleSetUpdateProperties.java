// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.AutomaticRepairsPolicy;
import com.azure.resourcemanager.compute.generated.models.ScaleInPolicy;
import com.azure.resourcemanager.compute.generated.models.UpgradePolicy;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetUpdateVMProfile;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a Virtual Machine Scale Set. */
@Fluent
public final class VirtualMachineScaleSetUpdateProperties {
    /*
     * The upgrade policy.
     */
    @JsonProperty(value = "upgradePolicy")
    private UpgradePolicy upgradePolicy;

    /*
     * Policy for automatic repairs.
     */
    @JsonProperty(value = "automaticRepairsPolicy")
    private AutomaticRepairsPolicy automaticRepairsPolicy;

    /*
     * The virtual machine profile.
     */
    @JsonProperty(value = "virtualMachineProfile")
    private VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile;

    /*
     * Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     */
    @JsonProperty(value = "overprovision")
    private Boolean overprovision;

    /*
     * When Overprovision is enabled, extensions are launched only on the requested number of VMs which are finally
     * kept. This property will hence ensure that the extensions do not run on the extra overprovisioned VMs.
     */
    @JsonProperty(value = "doNotRunExtensionsOnOverprovisionedVMs")
    private Boolean doNotRunExtensionsOnOverprovisionedVMs;

    /*
     * When true this limits the scale set to a single placement group, of max size 100 virtual machines. NOTE: If
     * singlePlacementGroup is true, it may be modified to false. However, if singlePlacementGroup is false, it may not
     * be modified to true.
     */
    @JsonProperty(value = "singlePlacementGroup")
    private Boolean singlePlacementGroup;

    /*
     * Specifies additional capabilities enabled or disabled on the Virtual Machines in the Virtual Machine Scale Set.
     * For instance: whether the Virtual Machines have the capability to support attaching managed data disks with
     * UltraSSD_LRS storage account type.
     */
    @JsonProperty(value = "additionalCapabilities")
    private AdditionalCapabilities additionalCapabilities;

    /*
     * Specifies the policies applied when scaling in Virtual Machines in the Virtual Machine Scale Set.
     */
    @JsonProperty(value = "scaleInPolicy")
    private ScaleInPolicy scaleInPolicy;

    /*
     * Specifies information about the proximity placement group that the virtual machine scale set should be assigned
     * to. <br><br>Minimum api-version: 2018-04-01.
     */
    @JsonProperty(value = "proximityPlacementGroup")
    private SubResource proximityPlacementGroup;

    /** Creates an instance of VirtualMachineScaleSetUpdateProperties class. */
    public VirtualMachineScaleSetUpdateProperties() {
    }

    /**
     * Get the upgradePolicy property: The upgrade policy.
     *
     * @return the upgradePolicy value.
     */
    public UpgradePolicy upgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * Set the upgradePolicy property: The upgrade policy.
     *
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withUpgradePolicy(UpgradePolicy upgradePolicy) {
        this.upgradePolicy = upgradePolicy;
        return this;
    }

    /**
     * Get the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @return the automaticRepairsPolicy value.
     */
    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.automaticRepairsPolicy;
    }

    /**
     * Set the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withAutomaticRepairsPolicy(
        AutomaticRepairsPolicy automaticRepairsPolicy) {
        this.automaticRepairsPolicy = automaticRepairsPolicy;
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The virtual machine profile.
     *
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile() {
        return this.virtualMachineProfile;
    }

    /**
     * Set the virtualMachineProfile property: The virtual machine profile.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withVirtualMachineProfile(
        VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        this.virtualMachineProfile = virtualMachineProfile;
        return this;
    }

    /**
     * Get the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @return the overprovision value.
     */
    public Boolean overprovision() {
        return this.overprovision;
    }

    /**
     * Set the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @param overprovision the overprovision value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withOverprovision(Boolean overprovision) {
        this.overprovision = overprovision;
        return this;
    }

    /**
     * Get the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @return the doNotRunExtensionsOnOverprovisionedVMs value.
     */
    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.doNotRunExtensionsOnOverprovisionedVMs;
    }

    /**
     * Set the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @param doNotRunExtensionsOnOverprovisionedVMs the doNotRunExtensionsOnOverprovisionedVMs value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        this.doNotRunExtensionsOnOverprovisionedVMs = doNotRunExtensionsOnOverprovisionedVMs;
        return this;
    }

    /**
     * Get the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @return the singlePlacementGroup value.
     */
    public Boolean singlePlacementGroup() {
        return this.singlePlacementGroup;
    }

    /**
     * Set the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withSinglePlacementGroup(Boolean singlePlacementGroup) {
        this.singlePlacementGroup = singlePlacementGroup;
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.additionalCapabilities;
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withAdditionalCapabilities(
        AdditionalCapabilities additionalCapabilities) {
        this.additionalCapabilities = additionalCapabilities;
        return this;
    }

    /**
     * Get the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @return the scaleInPolicy value.
     */
    public ScaleInPolicy scaleInPolicy() {
        return this.scaleInPolicy;
    }

    /**
     * Set the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @param scaleInPolicy the scaleInPolicy value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        this.scaleInPolicy = scaleInPolicy;
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.proximityPlacementGroup;
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineScaleSetUpdateProperties object itself.
     */
    public VirtualMachineScaleSetUpdateProperties withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        this.proximityPlacementGroup = proximityPlacementGroup;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgradePolicy() != null) {
            upgradePolicy().validate();
        }
        if (automaticRepairsPolicy() != null) {
            automaticRepairsPolicy().validate();
        }
        if (virtualMachineProfile() != null) {
            virtualMachineProfile().validate();
        }
        if (additionalCapabilities() != null) {
            additionalCapabilities().validate();
        }
        if (scaleInPolicy() != null) {
            scaleInPolicy().validate();
        }
    }
}

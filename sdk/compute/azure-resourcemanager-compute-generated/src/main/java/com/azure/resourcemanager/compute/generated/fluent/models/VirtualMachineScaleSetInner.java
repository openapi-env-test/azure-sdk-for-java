// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.AutomaticRepairsPolicy;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.OrchestrationMode;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.ScaleInPolicy;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.SpotRestorePolicy;
import com.azure.resourcemanager.compute.generated.models.UpgradePolicy;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetIdentity;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine Scale Set. */
@Fluent
public final class VirtualMachineScaleSetInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetInner.class);

    /*
     * The virtual machine scale set sku.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started ->**. Enter any required information and
     * then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * Describes the properties of a Virtual Machine Scale Set.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetProperties innerProperties;

    /*
     * The identity of the virtual machine scale set, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineScaleSetIdentity identity;

    /*
     * The virtual machine scale set zones. NOTE: Availability zones can only
     * be set when you create the scale set
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The extended location of the Virtual Machine Scale Set.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * Get the sku property: The virtual machine scale set sku.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The virtual machine scale set sku.
     *
     * @param sku the sku value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine Scale Set.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity of the virtual machine scale set, if configured.
     *
     * @return the identity value.
     */
    public VirtualMachineScaleSetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the virtual machine scale set, if configured.
     *
     * @param identity the identity value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withIdentity(VirtualMachineScaleSetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the zones property: The virtual machine scale set zones. NOTE: Availability zones can only be set when you
     * create the scale set.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The virtual machine scale set zones. NOTE: Availability zones can only be set when you
     * create the scale set.
     *
     * @param zones the zones value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location of the Virtual Machine Scale Set.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the Virtual Machine Scale Set.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the upgradePolicy property: The upgrade policy.
     *
     * @return the upgradePolicy value.
     */
    public UpgradePolicy upgradePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePolicy();
    }

    /**
     * Set the upgradePolicy property: The upgrade policy.
     *
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withUpgradePolicy(UpgradePolicy upgradePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withUpgradePolicy(upgradePolicy);
        return this;
    }

    /**
     * Get the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @return the automaticRepairsPolicy value.
     */
    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().automaticRepairsPolicy();
    }

    /**
     * Set the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withAutomaticRepairsPolicy(automaticRepairsPolicy);
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The virtual machine profile.
     *
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineScaleSetVMProfile virtualMachineProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineProfile();
    }

    /**
     * Set the virtualMachineProfile property: The virtual machine profile.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withVirtualMachineProfile(
        VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @return the overprovision value.
     */
    public Boolean overprovision() {
        return this.innerProperties() == null ? null : this.innerProperties().overprovision();
    }

    /**
     * Set the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @param overprovision the overprovision value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withOverprovision(Boolean overprovision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withOverprovision(overprovision);
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
        return this.innerProperties() == null ? null : this.innerProperties().doNotRunExtensionsOnOverprovisionedVMs();
    }

    /**
     * Set the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @param doNotRunExtensionsOnOverprovisionedVMs the doNotRunExtensionsOnOverprovisionedVMs value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
        return this;
    }

    /**
     * Get the uniqueId property: Specifies the ID which uniquely identifies a Virtual Machine Scale Set.
     *
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerProperties() == null ? null : this.innerProperties().uniqueId();
    }

    /**
     * Get the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @return the singlePlacementGroup value.
     */
    public Boolean singlePlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().singlePlacementGroup();
    }

    /**
     * Set the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withSinglePlacementGroup(Boolean singlePlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withSinglePlacementGroup(singlePlacementGroup);
        return this;
    }

    /**
     * Get the zoneBalance property: Whether to force strictly even Virtual Machine distribution cross x-zones in case
     * there is zone outage. zoneBalance property can only be set if the zones property of the scale set contains more
     * than one zone. If there are no zones or only one zone specified, then zoneBalance property should not be set.
     *
     * @return the zoneBalance value.
     */
    public Boolean zoneBalance() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneBalance();
    }

    /**
     * Set the zoneBalance property: Whether to force strictly even Virtual Machine distribution cross x-zones in case
     * there is zone outage. zoneBalance property can only be set if the zones property of the scale set contains more
     * than one zone. If there are no zones or only one zone specified, then zoneBalance property should not be set.
     *
     * @param zoneBalance the zoneBalance value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withZoneBalance(Boolean zoneBalance) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withZoneBalance(zoneBalance);
        return this;
    }

    /**
     * Get the platformFaultDomainCount property: Fault Domain count for each placement group.
     *
     * @return the platformFaultDomainCount value.
     */
    public Integer platformFaultDomainCount() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomainCount();
    }

    /**
     * Set the platformFaultDomainCount property: Fault Domain count for each placement group.
     *
     * @param platformFaultDomainCount the platformFaultDomainCount value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroup();
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withProximityPlacementGroup(proximityPlacementGroup);
        return this;
    }

    /**
     * Get the hostGroup property: Specifies information about the dedicated host group that the virtual machine scale
     * set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @return the hostGroup value.
     */
    public SubResource hostGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().hostGroup();
    }

    /**
     * Set the hostGroup property: Specifies information about the dedicated host group that the virtual machine scale
     * set resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01.
     *
     * @param hostGroup the hostGroup value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withHostGroup(SubResource hostGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withHostGroup(hostGroup);
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
        return this.innerProperties() == null ? null : this.innerProperties().additionalCapabilities();
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withAdditionalCapabilities(additionalCapabilities);
        return this;
    }

    /**
     * Get the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @return the scaleInPolicy value.
     */
    public ScaleInPolicy scaleInPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleInPolicy();
    }

    /**
     * Set the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @param scaleInPolicy the scaleInPolicy value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withScaleInPolicy(scaleInPolicy);
        return this;
    }

    /**
     * Get the orchestrationMode property: Specifies the orchestration mode for the virtual machine scale set.
     *
     * @return the orchestrationMode value.
     */
    public OrchestrationMode orchestrationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().orchestrationMode();
    }

    /**
     * Set the orchestrationMode property: Specifies the orchestration mode for the virtual machine scale set.
     *
     * @param orchestrationMode the orchestrationMode value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withOrchestrationMode(OrchestrationMode orchestrationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withOrchestrationMode(orchestrationMode);
        return this;
    }

    /**
     * Get the spotRestorePolicy property: Specifies the Spot Restore properties for the virtual machine scale set.
     *
     * @return the spotRestorePolicy value.
     */
    public SpotRestorePolicy spotRestorePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().spotRestorePolicy();
    }

    /**
     * Set the spotRestorePolicy property: Specifies the Spot Restore properties for the virtual machine scale set.
     *
     * @param spotRestorePolicy the spotRestorePolicy value to set.
     * @return the VirtualMachineScaleSetInner object itself.
     */
    public VirtualMachineScaleSetInner withSpotRestorePolicy(SpotRestorePolicy spotRestorePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetProperties();
        }
        this.innerProperties().withSpotRestorePolicy(spotRestorePolicy);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}

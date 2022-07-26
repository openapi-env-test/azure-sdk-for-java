// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachinePropertiesInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of VirtualMachineProperties. */
public interface VirtualMachineProperties {
    /**
     * Gets the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @return the hardwareProfile value.
     */
    HardwareProfile hardwareProfile();

    /**
     * Gets the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * Gets the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     *
     * @return the additionalCapabilities value.
     */
    AdditionalCapabilities additionalCapabilities();

    /**
     * Gets the osProfile property: Specifies the operating system settings used while creating the virtual machine.
     * Some of the settings cannot be changed once VM is provisioned.
     *
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * Gets the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * Gets the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @return the securityProfile value.
     */
    SecurityProfile securityProfile();

    /**
     * Gets the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value.
     */
    DiagnosticsProfile diagnosticsProfile();

    /**
     * Gets the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For
     * more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently,
     * a VM can only be added to availability set at creation time. The availability set to which the VM is being added
     * should be under the same resource group as the availability set resource. An existing VM cannot be added to an
     * availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
     * properties.virtualMachineScaleSet reference.
     *
     * @return the availabilitySet value.
     */
    SubResource availabilitySet();

    /**
     * Gets the virtualMachineScaleSet property: Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are
     * allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale
     * set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This
     * property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum
     * api‐version: 2019‐03‐01.
     *
     * @return the virtualMachineScaleSet value.
     */
    SubResource virtualMachineScaleSet();

    /**
     * Gets the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    SubResource proximityPlacementGroup();

    /**
     * Gets the priority property: Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01.
     *
     * @return the priority value.
     */
    VirtualMachinePriorityTypes priority();

    /**
     * Gets the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @return the evictionPolicy value.
     */
    VirtualMachineEvictionPolicyTypes evictionPolicy();

    /**
     * Gets the billingProfile property: Specifies the billing related details of a Azure Spot virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the billingProfile value.
     */
    BillingProfile billingProfile();

    /**
     * Gets the host property: Specifies information about the dedicated host that the virtual machine resides in.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @return the host value.
     */
    SubResource host();

    /**
     * Gets the hostGroup property: Specifies information about the dedicated host group that the virtual machine
     * resides in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify
     * both host and hostGroup properties.
     *
     * @return the hostGroup value.
     */
    SubResource hostGroup();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the instanceView property: The virtual machine instance view.
     *
     * @return the instanceView value.
     */
    VirtualMachineInstanceView instanceView();

    /**
     * Gets the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    String licenseType();

    /**
     * Gets the vmId property: Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in
     * all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     *
     * @return the vmId value.
     */
    String vmId();

    /**
     * Gets the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @return the extensionsTimeBudget value.
     */
    String extensionsTimeBudget();

    /**
     * Gets the platformFaultDomain property: Specifies the scale set logical fault domain into which the Virtual
     * Machine will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that
     * best maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the
     * 'virtualMachineScaleSet' property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is
     * referenced, must have 'platformFaultDomainCount' &amp;gt; 1.&lt;li&gt;This property cannot be updated once the
     * Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance
     * View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01.
     *
     * @return the platformFaultDomain value.
     */
    Integer platformFaultDomain();

    /**
     * Gets the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @return the scheduledEventsProfile value.
     */
    ScheduledEventsProfile scheduledEventsProfile();

    /**
     * Gets the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     *
     * @return the userData value.
     */
    String userData();

    /**
     * Gets the capacityReservation property: Specifies information about the capacity reservation that is used to
     * allocate virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-04-01.
     *
     * @return the capacityReservation value.
     */
    CapacityReservationProfile capacityReservation();

    /**
     * Gets the applicationProfile property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     *
     * @return the applicationProfile value.
     */
    ApplicationProfile applicationProfile();

    /**
     * Gets the timeCreated property: Specifies the time at which the Virtual Machine resource was
     * created.&lt;br&gt;&lt;br&gt;Minimum api-version: 2022-03-01.
     *
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachinePropertiesInner object.
     *
     * @return the inner object.
     */
    VirtualMachinePropertiesInner innerModel();
}

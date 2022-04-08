// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a virtual machine scale set data disk. */
@Fluent
public final class VirtualMachineScaleSetDataDisk {
    /*
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /*
     * Specifies the caching requirements. <br><br> Possible values are:
     * <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br>
     * Default: **None for Standard storage. ReadOnly for Premium storage**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * The create option.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOptionTypes createOption;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can
     * be used to overwrite the size of the disk in a virtual machine image.
     * <br><br> This value cannot be larger than 1023 GB
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /*
     * Specifies the Read-Write IOPS for the managed disk. Should be used only
     * when StorageAccountType is UltraSSD_LRS. If not specified, a default
     * value would be assigned based on diskSizeGB.
     */
    @JsonProperty(value = "diskIOPSReadWrite")
    private Long diskIopsReadWrite;

    /*
     * Specifies the bandwidth in MB per second for the managed disk. Should be
     * used only when StorageAccountType is UltraSSD_LRS. If not specified, a
     * default value would be assigned based on diskSizeGB.
     */
    @JsonProperty(value = "diskMBpsReadWrite")
    private Long diskMBpsReadWrite;

    /**
     * Get the name property: The disk name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The disk name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the lun property: Specifies the logical unit number of the data disk. This value is used to identify data
     * disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Specifies the logical unit number of the data disk. This value is used to identify data
     * disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @param lun the lun value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @param caching the caching value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the createOption property: The create option.
     *
     * @return the createOption value.
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: The create option.
     *
     * @param createOption the createOption value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     *
     * @return the managedDisk value.
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the diskIopsReadWrite property: Specifies the Read-Write IOPS for the managed disk. Should be used only when
     * StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     *
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Set the diskIopsReadWrite property: Specifies the Read-Write IOPS for the managed disk. Should be used only when
     * StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on diskSizeGB.
     *
     * @param diskIopsReadWrite the diskIopsReadWrite value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDiskIopsReadWrite(Long diskIopsReadWrite) {
        this.diskIopsReadWrite = diskIopsReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: Specifies the bandwidth in MB per second for the managed disk. Should be used
     * only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on
     * diskSizeGB.
     *
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: Specifies the bandwidth in MB per second for the managed disk. Should be used
     * only when StorageAccountType is UltraSSD_LRS. If not specified, a default value would be assigned based on
     * diskSizeGB.
     *
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the VirtualMachineScaleSetDataDisk object itself.
     */
    public VirtualMachineScaleSetDataDisk withDiskMBpsReadWrite(Long diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (createOption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property createOption in model VirtualMachineScaleSetDataDisk"));
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineScaleSetDataDisk.class);
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The vm size property. */
@Fluent
public final class VmSizeProperty {
    /*
     * The vm size name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The number of cores that the vm size has.
     */
    @JsonProperty(value = "cores")
    private Integer cores;

    /*
     * The data disk storage tier of the vm size.
     */
    @JsonProperty(value = "dataDiskStorageTier")
    private String dataDiskStorageTier;

    /*
     * The label of the vm size.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The max data disk count of the vm size.
     */
    @JsonProperty(value = "maxDataDiskCount")
    private Long maxDataDiskCount;

    /*
     * The memory whose unit is MB of the vm size.
     */
    @JsonProperty(value = "memoryInMb")
    private Long memoryInMb;

    /*
     * This indicates this vm size is supported by virtual machines or not
     */
    @JsonProperty(value = "supportedByVirtualMachines")
    private Boolean supportedByVirtualMachines;

    /*
     * The indicates this vm size is supported by web worker roles or not
     */
    @JsonProperty(value = "supportedByWebWorkerRoles")
    private Boolean supportedByWebWorkerRoles;

    /*
     * The virtual machine resource disk size whose unit is MB of the vm size.
     */
    @JsonProperty(value = "virtualMachineResourceDiskSizeInMb")
    private Long virtualMachineResourceDiskSizeInMb;

    /*
     * The web worker resource disk size whose unit is MB of the vm size.
     */
    @JsonProperty(value = "webWorkerResourceDiskSizeInMb")
    private Long webWorkerResourceDiskSizeInMb;

    /**
     * Get the name property: The vm size name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The vm size name.
     *
     * @param name the name value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the cores property: The number of cores that the vm size has.
     *
     * @return the cores value.
     */
    public Integer cores() {
        return this.cores;
    }

    /**
     * Set the cores property: The number of cores that the vm size has.
     *
     * @param cores the cores value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    /**
     * Get the dataDiskStorageTier property: The data disk storage tier of the vm size.
     *
     * @return the dataDiskStorageTier value.
     */
    public String dataDiskStorageTier() {
        return this.dataDiskStorageTier;
    }

    /**
     * Set the dataDiskStorageTier property: The data disk storage tier of the vm size.
     *
     * @param dataDiskStorageTier the dataDiskStorageTier value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withDataDiskStorageTier(String dataDiskStorageTier) {
        this.dataDiskStorageTier = dataDiskStorageTier;
        return this;
    }

    /**
     * Get the label property: The label of the vm size.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: The label of the vm size.
     *
     * @param label the label value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the maxDataDiskCount property: The max data disk count of the vm size.
     *
     * @return the maxDataDiskCount value.
     */
    public Long maxDataDiskCount() {
        return this.maxDataDiskCount;
    }

    /**
     * Set the maxDataDiskCount property: The max data disk count of the vm size.
     *
     * @param maxDataDiskCount the maxDataDiskCount value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withMaxDataDiskCount(Long maxDataDiskCount) {
        this.maxDataDiskCount = maxDataDiskCount;
        return this;
    }

    /**
     * Get the memoryInMb property: The memory whose unit is MB of the vm size.
     *
     * @return the memoryInMb value.
     */
    public Long memoryInMb() {
        return this.memoryInMb;
    }

    /**
     * Set the memoryInMb property: The memory whose unit is MB of the vm size.
     *
     * @param memoryInMb the memoryInMb value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withMemoryInMb(Long memoryInMb) {
        this.memoryInMb = memoryInMb;
        return this;
    }

    /**
     * Get the supportedByVirtualMachines property: This indicates this vm size is supported by virtual machines or not.
     *
     * @return the supportedByVirtualMachines value.
     */
    public Boolean supportedByVirtualMachines() {
        return this.supportedByVirtualMachines;
    }

    /**
     * Set the supportedByVirtualMachines property: This indicates this vm size is supported by virtual machines or not.
     *
     * @param supportedByVirtualMachines the supportedByVirtualMachines value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withSupportedByVirtualMachines(Boolean supportedByVirtualMachines) {
        this.supportedByVirtualMachines = supportedByVirtualMachines;
        return this;
    }

    /**
     * Get the supportedByWebWorkerRoles property: The indicates this vm size is supported by web worker roles or not.
     *
     * @return the supportedByWebWorkerRoles value.
     */
    public Boolean supportedByWebWorkerRoles() {
        return this.supportedByWebWorkerRoles;
    }

    /**
     * Set the supportedByWebWorkerRoles property: The indicates this vm size is supported by web worker roles or not.
     *
     * @param supportedByWebWorkerRoles the supportedByWebWorkerRoles value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withSupportedByWebWorkerRoles(Boolean supportedByWebWorkerRoles) {
        this.supportedByWebWorkerRoles = supportedByWebWorkerRoles;
        return this;
    }

    /**
     * Get the virtualMachineResourceDiskSizeInMb property: The virtual machine resource disk size whose unit is MB of
     * the vm size.
     *
     * @return the virtualMachineResourceDiskSizeInMb value.
     */
    public Long virtualMachineResourceDiskSizeInMb() {
        return this.virtualMachineResourceDiskSizeInMb;
    }

    /**
     * Set the virtualMachineResourceDiskSizeInMb property: The virtual machine resource disk size whose unit is MB of
     * the vm size.
     *
     * @param virtualMachineResourceDiskSizeInMb the virtualMachineResourceDiskSizeInMb value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withVirtualMachineResourceDiskSizeInMb(Long virtualMachineResourceDiskSizeInMb) {
        this.virtualMachineResourceDiskSizeInMb = virtualMachineResourceDiskSizeInMb;
        return this;
    }

    /**
     * Get the webWorkerResourceDiskSizeInMb property: The web worker resource disk size whose unit is MB of the vm
     * size.
     *
     * @return the webWorkerResourceDiskSizeInMb value.
     */
    public Long webWorkerResourceDiskSizeInMb() {
        return this.webWorkerResourceDiskSizeInMb;
    }

    /**
     * Set the webWorkerResourceDiskSizeInMb property: The web worker resource disk size whose unit is MB of the vm
     * size.
     *
     * @param webWorkerResourceDiskSizeInMb the webWorkerResourceDiskSizeInMb value to set.
     * @return the VmSizeProperty object itself.
     */
    public VmSizeProperty withWebWorkerResourceDiskSizeInMb(Long webWorkerResourceDiskSizeInMb) {
        this.webWorkerResourceDiskSizeInMb = webWorkerResourceDiskSizeInMb;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}

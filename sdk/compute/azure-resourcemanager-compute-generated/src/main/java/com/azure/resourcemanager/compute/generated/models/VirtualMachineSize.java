// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineSizeInner;

/** An immutable client-side representation of VirtualMachineSize. */
public interface VirtualMachineSize {
    /**
     * Gets the name property: The name of the virtual machine size.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the numberOfCores property: The number of cores supported by the virtual machine size. For Constrained vCPU
     * capable VM sizes, this number represents the total vCPUs of quota that the VM uses. For accurate vCPU count,
     * please refer to https://docs.microsoft.com/azure/virtual-machines/constrained-vcpu or
     * https://docs.microsoft.com/rest/api/compute/resourceskus/list.
     *
     * @return the numberOfCores value.
     */
    Integer numberOfCores();

    /**
     * Gets the osDiskSizeInMB property: The OS disk size, in MB, allowed by the virtual machine size.
     *
     * @return the osDiskSizeInMB value.
     */
    Integer osDiskSizeInMB();

    /**
     * Gets the resourceDiskSizeInMB property: The resource disk size, in MB, allowed by the virtual machine size.
     *
     * @return the resourceDiskSizeInMB value.
     */
    Integer resourceDiskSizeInMB();

    /**
     * Gets the memoryInMB property: The amount of memory, in MB, supported by the virtual machine size.
     *
     * @return the memoryInMB value.
     */
    Integer memoryInMB();

    /**
     * Gets the maxDataDiskCount property: The maximum number of data disks that can be attached to the virtual machine
     * size.
     *
     * @return the maxDataDiskCount value.
     */
    Integer maxDataDiskCount();

    /**
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineSizeInner object.
     *
     * @return the inner object.
     */
    VirtualMachineSizeInner innerModel();
}

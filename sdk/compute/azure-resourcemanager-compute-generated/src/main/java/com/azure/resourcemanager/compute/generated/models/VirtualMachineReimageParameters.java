// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters for Reimaging Virtual Machine. NOTE: Virtual Machine OS disk will always be reimaged. */
@Fluent
public class VirtualMachineReimageParameters {
    /*
     * Specifies whether to reimage temp disk. Default value: false. Note: This temp disk reimage parameter is only
     * supported for VM/VMSS with Ephemeral OS disk.
     */
    @JsonProperty(value = "tempDisk")
    private Boolean tempDisk;

    /*
     * Specifies in decimal number, the version the OS disk should be reimaged to. If exact version is not provided,
     * the OS disk is reimaged to the existing version of OS Disk.
     */
    @JsonProperty(value = "exactVersion")
    private String exactVersion;

    /*
     * Specifies information required for reimaging the non-ephemeral OS disk.
     */
    @JsonProperty(value = "osProfile")
    private OSProfileProvisioningData osProfile;

    /** Creates an instance of VirtualMachineReimageParameters class. */
    public VirtualMachineReimageParameters() {
    }

    /**
     * Get the tempDisk property: Specifies whether to reimage temp disk. Default value: false. Note: This temp disk
     * reimage parameter is only supported for VM/VMSS with Ephemeral OS disk.
     *
     * @return the tempDisk value.
     */
    public Boolean tempDisk() {
        return this.tempDisk;
    }

    /**
     * Set the tempDisk property: Specifies whether to reimage temp disk. Default value: false. Note: This temp disk
     * reimage parameter is only supported for VM/VMSS with Ephemeral OS disk.
     *
     * @param tempDisk the tempDisk value to set.
     * @return the VirtualMachineReimageParameters object itself.
     */
    public VirtualMachineReimageParameters withTempDisk(Boolean tempDisk) {
        this.tempDisk = tempDisk;
        return this;
    }

    /**
     * Get the exactVersion property: Specifies in decimal number, the version the OS disk should be reimaged to. If
     * exact version is not provided, the OS disk is reimaged to the existing version of OS Disk.
     *
     * @return the exactVersion value.
     */
    public String exactVersion() {
        return this.exactVersion;
    }

    /**
     * Set the exactVersion property: Specifies in decimal number, the version the OS disk should be reimaged to. If
     * exact version is not provided, the OS disk is reimaged to the existing version of OS Disk.
     *
     * @param exactVersion the exactVersion value to set.
     * @return the VirtualMachineReimageParameters object itself.
     */
    public VirtualMachineReimageParameters withExactVersion(String exactVersion) {
        this.exactVersion = exactVersion;
        return this;
    }

    /**
     * Get the osProfile property: Specifies information required for reimaging the non-ephemeral OS disk.
     *
     * @return the osProfile value.
     */
    public OSProfileProvisioningData osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies information required for reimaging the non-ephemeral OS disk.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineReimageParameters object itself.
     */
    public VirtualMachineReimageParameters withOsProfile(OSProfileProvisioningData osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osProfile() != null) {
            osProfile().validate();
        }
    }
}

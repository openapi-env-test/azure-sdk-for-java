// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the storage profile. */
@Fluent
public final class RestorePointSourceVMStorageProfile {
    /*
     * Gets the OS disk of the VM captured at the time of the restore point creation.
     */
    @JsonProperty(value = "osDisk")
    private RestorePointSourceVmosDisk osDisk;

    /*
     * Gets the data disks of the VM captured at the time of the restore point creation.
     */
    @JsonProperty(value = "dataDisks")
    private List<RestorePointSourceVMDataDisk> dataDisks;

    /** Creates an instance of RestorePointSourceVMStorageProfile class. */
    public RestorePointSourceVMStorageProfile() {
    }

    /**
     * Get the osDisk property: Gets the OS disk of the VM captured at the time of the restore point creation.
     *
     * @return the osDisk value.
     */
    public RestorePointSourceVmosDisk osDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Gets the OS disk of the VM captured at the time of the restore point creation.
     *
     * @param osDisk the osDisk value to set.
     * @return the RestorePointSourceVMStorageProfile object itself.
     */
    public RestorePointSourceVMStorageProfile withOsDisk(RestorePointSourceVmosDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }

    /**
     * Get the dataDisks property: Gets the data disks of the VM captured at the time of the restore point creation.
     *
     * @return the dataDisks value.
     */
    public List<RestorePointSourceVMDataDisk> dataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: Gets the data disks of the VM captured at the time of the restore point creation.
     *
     * @param dataDisks the dataDisks value to set.
     * @return the RestorePointSourceVMStorageProfile object itself.
     */
    public RestorePointSourceVMStorageProfile withDataDisks(List<RestorePointSourceVMDataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDisk() != null) {
            osDisk().validate();
        }
        if (dataDisks() != null) {
            dataDisks().forEach(e -> e.validate());
        }
    }
}

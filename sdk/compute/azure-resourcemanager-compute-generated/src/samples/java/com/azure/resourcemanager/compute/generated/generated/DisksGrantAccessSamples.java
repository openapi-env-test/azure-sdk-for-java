// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.AccessLevel;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

/** Samples for Disks GrantAccess. */
public final class DisksGrantAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2022-07-02/examples/diskExamples/Disk_BeginGetAccess.json
     */
    /**
     * Sample code: Get a sas on a managed disk.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getASasOnAManagedDisk(com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .grantAccess(
                "myResourceGroup",
                "myDisk",
                new GrantAccessData().withAccess(AccessLevel.READ).withDurationInSeconds(300),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2022-07-02/examples/diskExamples/Disk_BeginGetAccess_WithVMGuestState.json
     */
    /**
     * Sample code: Get sas on managed disk and VM guest state.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void getSasOnManagedDiskAndVMGuestState(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .disks()
            .grantAccess(
                "myResourceGroup",
                "myDisk",
                new GrantAccessData()
                    .withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withGetSecureVMGuestStateSas(true),
                Context.NONE);
    }
}

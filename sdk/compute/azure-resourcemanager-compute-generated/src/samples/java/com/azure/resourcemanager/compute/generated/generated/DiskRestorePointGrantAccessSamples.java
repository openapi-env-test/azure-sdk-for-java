// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.models.AccessLevel;
import com.azure.resourcemanager.compute.generated.models.GrantAccessData;

/** Samples for DiskRestorePoint GrantAccess. */
public final class DiskRestorePointGrantAccessSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/BeginGetAccessDiskRestorePoint.json
     */
    /**
     * Sample code: Grants access to a diskRestorePoint.
     *
     * @param manager Entry point to ComputeManager.
     */
    public static void grantsAccessToADiskRestorePoint(
        com.azure.resourcemanager.compute.generated.ComputeManager manager) {
        manager
            .diskRestorePoints()
            .grantAccess(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                new GrantAccessData().withAccess(AccessLevel.READ).withDurationInSeconds(300),
                Context.NONE);
    }
}

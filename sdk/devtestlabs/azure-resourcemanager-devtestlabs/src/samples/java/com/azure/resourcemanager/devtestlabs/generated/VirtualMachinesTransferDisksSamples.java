// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.Context;

/** Samples for VirtualMachines TransferDisks. */
public final class VirtualMachinesTransferDisksSamples {
    /*
     * x-ms-original-file: specification/devtestlabs/resource-manager/Microsoft.DevTestLab/stable/2021-09-01/examples/VirtualMachines_TransferDisks.json
     */
    /**
     * Sample code: VirtualMachines_TransferDisks.
     *
     * @param manager Entry point to DevTestLabsManager.
     */
    public static void virtualMachinesTransferDisks(com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager) {
        manager.virtualMachines().transferDisks("resourceGroupName", "{labName}", "{virtualmachineName}", Context.NONE);
    }
}

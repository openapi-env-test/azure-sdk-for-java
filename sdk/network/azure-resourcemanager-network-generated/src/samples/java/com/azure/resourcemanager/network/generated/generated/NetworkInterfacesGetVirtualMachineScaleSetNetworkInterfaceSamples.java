// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces GetVirtualMachineScaleSetNetworkInterface. */
public final class NetworkInterfacesGetVirtualMachineScaleSetNetworkInterfaceSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VmssNetworkInterfaceGet.json
     */
    /**
     * Sample code: Get virtual machine scale set network interface.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVirtualMachineScaleSetNetworkInterface(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .networkInterfaces()
            .getVirtualMachineScaleSetNetworkInterfaceWithResponse("rg1", "vmss1", "1", "nic1", null, Context.NONE);
    }
}

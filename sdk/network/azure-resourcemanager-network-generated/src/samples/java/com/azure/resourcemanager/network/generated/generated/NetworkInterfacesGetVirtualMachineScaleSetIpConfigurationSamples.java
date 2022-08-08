// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces GetVirtualMachineScaleSetIpConfiguration. */
public final class NetworkInterfacesGetVirtualMachineScaleSetIpConfigurationSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VmssNetworkInterfaceIpConfigGet.json
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
            .getVirtualMachineScaleSetIpConfigurationWithResponse(
                "rg1", "vmss1", "2", "nic1", "ip1", null, Context.NONE);
    }
}

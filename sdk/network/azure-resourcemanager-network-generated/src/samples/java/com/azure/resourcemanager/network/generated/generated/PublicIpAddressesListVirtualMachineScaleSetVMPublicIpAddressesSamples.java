// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses ListVirtualMachineScaleSetVMPublicIpAddresses. */
public final class PublicIpAddressesListVirtualMachineScaleSetVMPublicIpAddressesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VmssVmPublicIpList.json
     */
    /**
     * Sample code: ListVMSSVMPublicIP.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listVMSSVMPublicIP(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .publicIpAddresses()
            .listVirtualMachineScaleSetVMPublicIpAddresses("vmss-tester", "vmss1", "1", "nic1", "ip1", Context.NONE);
    }
}

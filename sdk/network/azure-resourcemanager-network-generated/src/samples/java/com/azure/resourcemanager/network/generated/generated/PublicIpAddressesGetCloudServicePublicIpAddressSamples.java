// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses GetCloudServicePublicIpAddress. */
public final class PublicIpAddressesGetCloudServicePublicIpAddressSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/CloudServicePublicIpGet.json
     */
    /**
     * Sample code: GetVMSSPublicIP.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVMSSPublicIP(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .publicIpAddresses()
            .getCloudServicePublicIpAddressWithResponse(
                "cs-tester", "cs1", "Test_VM_0", "nic1", "ip1", "pub1", null, Context.NONE);
    }
}

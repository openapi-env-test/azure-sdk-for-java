// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VpnSiteLinkConnections Get. */
public final class VpnSiteLinkConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VpnSiteLinkConnectionGet.json
     */
    /**
     * Sample code: VpnSiteLinkConnectionGet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void vpnSiteLinkConnectionGet(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .vpnSiteLinkConnections()
            .getWithResponse("rg1", "gateway1", "vpnConnection1", "Connection-Link1", Context.NONE);
    }
}

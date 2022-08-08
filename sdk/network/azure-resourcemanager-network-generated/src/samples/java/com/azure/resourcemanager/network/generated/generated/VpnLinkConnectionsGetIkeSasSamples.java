// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for VpnLinkConnections GetIkeSas. */
public final class VpnLinkConnectionsGetIkeSasSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/VpnSiteLinkConnectionGetIkeSas.json
     */
    /**
     * Sample code: GetVpnLinkConnectionIkeSa.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getVpnLinkConnectionIkeSa(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vpnLinkConnections().getIkeSas("rg1", "gateway1", "vpnConnection1", "Connection-Link1", Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for VpnSiteLinks ListByVpnSite. */
public final class VpnSiteLinksListByVpnSiteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/VpnSiteLinkListByVpnSite.json
     */
    /**
     * Sample code: VpnSiteLinkListByVpnSite.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void vpnSiteLinkListByVpnSite(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.vpnSiteLinks().listByVpnSite("rg1", "vpnSite1", com.azure.core.util.Context.NONE);
    }
}

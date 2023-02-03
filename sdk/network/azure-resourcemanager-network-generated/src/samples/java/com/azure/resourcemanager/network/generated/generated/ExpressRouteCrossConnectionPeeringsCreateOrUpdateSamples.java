// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import com.azure.resourcemanager.network.generated.models.Ipv6ExpressRouteCircuitPeeringConfig;

/** Samples for ExpressRouteCrossConnectionPeerings CreateOrUpdate. */
public final class ExpressRouteCrossConnectionPeeringsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/ExpressRouteCrossConnectionBgpPeeringCreate.json
     */
    /**
     * Sample code: ExpressRouteCrossConnectionBgpPeeringCreate.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void expressRouteCrossConnectionBgpPeeringCreate(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .expressRouteCrossConnectionPeerings()
            .createOrUpdate(
                "CrossConnection-SiliconValley",
                "<circuitServiceKey>",
                "AzurePrivatePeering",
                new ExpressRouteCrossConnectionPeeringInner()
                    .withPeerAsn(200L)
                    .withPrimaryPeerAddressPrefix("192.168.16.252/30")
                    .withSecondaryPeerAddressPrefix("192.168.18.252/30")
                    .withVlanId(200)
                    .withIpv6PeeringConfig(
                        new Ipv6ExpressRouteCircuitPeeringConfig()
                            .withPrimaryPeerAddressPrefix("3FFE:FFFF:0:CD30::/126")
                            .withSecondaryPeerAddressPrefix("3FFE:FFFF:0:CD30::4/126")),
                Context.NONE);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.RoutingPolicy;
import java.util.Arrays;

/** Samples for RoutingIntent CreateOrUpdate. */
public final class RoutingIntentCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/RoutingIntentPut.json
     */
    /**
     * Sample code: RouteTablePut.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void routeTablePut(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .routingIntents()
            .define("Intent1")
            .withExistingVirtualHub("rg1", "virtualHub1")
            .withRoutingPolicies(
                Arrays
                    .asList(
                        new RoutingPolicy()
                            .withName("InternetTraffic")
                            .withDestinations(Arrays.asList("Internet"))
                            .withNextHop(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/azureFirewalls/azfw1"),
                        new RoutingPolicy()
                            .withName("PrivateTrafficPolicy")
                            .withDestinations(Arrays.asList("PrivateTraffic"))
                            .withNextHop(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/azureFirewalls/azfw1")))
            .create();
    }
}

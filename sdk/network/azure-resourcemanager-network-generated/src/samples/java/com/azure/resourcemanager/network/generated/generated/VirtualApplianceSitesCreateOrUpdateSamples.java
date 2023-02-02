// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.BreakOutCategoryPolicies;
import com.azure.resourcemanager.network.generated.models.Office365PolicyProperties;

/** Samples for VirtualApplianceSites CreateOrUpdate. */
public final class VirtualApplianceSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkVirtualApplianceSitePut.json
     */
    /**
     * Sample code: Create Network Virtual Appliance Site.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createNetworkVirtualApplianceSite(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualApplianceSites()
            .define("site1")
            .withExistingNetworkVirtualAppliance("rg1", "nva")
            .withAddressPrefix("192.168.1.0/24")
            .withO365Policy(
                new Office365PolicyProperties()
                    .withBreakOutCategories(
                        new BreakOutCategoryPolicies().withAllow(true).withOptimize(true).withDefaultProperty(true)))
            .create();
    }
}

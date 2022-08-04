// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.NetworkManagerSecurityGroupItem;
import java.util.Arrays;

/** Samples for AdminRuleCollections CreateOrUpdate. */
public final class AdminRuleCollectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerAdminRuleCollectionPut.json
     */
    /**
     * Sample code: Create or Update an admin rule collection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createOrUpdateAnAdminRuleCollection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .adminRuleCollections()
            .define("testRuleCollection")
            .withExistingSecurityAdminConfiguration("rg1", "testNetworkManager", "myTestSecurityConfig")
            .withDescription("A sample policy")
            .withAppliesToGroups(
                Arrays
                    .asList(
                        new NetworkManagerSecurityGroupItem()
                            .withNetworkGroupId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager/networkGroups/testGroup")))
            .create();
    }
}

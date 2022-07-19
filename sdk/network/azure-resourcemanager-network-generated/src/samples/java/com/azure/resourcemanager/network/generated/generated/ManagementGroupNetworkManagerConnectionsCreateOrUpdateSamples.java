// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner;

/** Samples for ManagementGroupNetworkManagerConnections CreateOrUpdate. */
public final class ManagementGroupNetworkManagerConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerConnectionManagementGroupPut.json
     */
    /**
     * Sample code: Create or Update Management Group Network Manager Connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createOrUpdateManagementGroupNetworkManagerConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .managementGroupNetworkManagerConnections()
            .createOrUpdateWithResponse(
                "managementGroupA",
                "TestNMConnection",
                new NetworkManagerConnectionInner()
                    .withNetworkManagerId(
                        "/subscriptions/subscriptionC/resourceGroup/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager"),
                Context.NONE);
    }
}

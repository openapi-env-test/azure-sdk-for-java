// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ScopeConnections CreateOrUpdate. */
public final class ScopeConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/NetworkManagerScopeConnectionPut.json
     */
    /**
     * Sample code: Create or Update Network Manager Scope Connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createOrUpdateNetworkManagerScopeConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .scopeConnections()
            .define("TestScopeConnection")
            .withExistingNetworkManager("rg1", "testNetworkManager")
            .withTenantId("6babcaad-604b-40ac-a9d7-9fd97c0b779f")
            .withResourceId("subscriptions/f0dc2b34-dfad-40e4-83e0-2309fed8d00b")
            .withDescription("This is a scope connection to a cross tenant subscription.")
            .create();
    }
}

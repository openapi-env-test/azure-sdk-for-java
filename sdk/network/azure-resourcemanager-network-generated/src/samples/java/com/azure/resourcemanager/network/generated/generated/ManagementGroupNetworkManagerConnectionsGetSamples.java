// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ManagementGroupNetworkManagerConnections Get. */
public final class ManagementGroupNetworkManagerConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkManagerConnectionManagementGroupGet.json
     */
    /**
     * Sample code: Get Management Group Network Manager Connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getManagementGroupNetworkManagerConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .managementGroupNetworkManagerConnections()
            .getWithResponse("managementGroupA", "TestNMConnection", com.azure.core.util.Context.NONE);
    }
}

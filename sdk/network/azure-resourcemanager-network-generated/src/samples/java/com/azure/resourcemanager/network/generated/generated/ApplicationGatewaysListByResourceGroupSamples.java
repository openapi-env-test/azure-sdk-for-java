// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

/** Samples for ApplicationGateways ListByResourceGroup. */
public final class ApplicationGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ApplicationGatewayList.json
     */
    /**
     * Sample code: Lists all application gateways in a resource group.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void listsAllApplicationGatewaysInAResourceGroup(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.applicationGateways().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}

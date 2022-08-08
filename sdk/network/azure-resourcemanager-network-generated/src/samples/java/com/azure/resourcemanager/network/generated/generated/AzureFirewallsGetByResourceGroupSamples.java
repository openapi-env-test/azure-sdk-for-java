// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.util.Context;

/** Samples for AzureFirewalls GetByResourceGroup. */
public final class AzureFirewallsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AzureFirewallGetWithAdditionalProperties.json
     */
    /**
     * Sample code: Get Azure Firewall With Additional Properties.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAzureFirewallWithAdditionalProperties(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().getByResourceGroupWithResponse("rg1", "azurefirewall", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AzureFirewallGetWithIpGroups.json
     */
    /**
     * Sample code: Get Azure Firewall With IpGroups.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAzureFirewallWithIpGroups(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().getByResourceGroupWithResponse("rg1", "azurefirewall", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AzureFirewallGetWithZones.json
     */
    /**
     * Sample code: Get Azure Firewall With Zones.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAzureFirewallWithZones(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().getByResourceGroupWithResponse("rg1", "azurefirewall", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AzureFirewallGetWithMgmtSubnet.json
     */
    /**
     * Sample code: Get Azure Firewall With management subnet.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAzureFirewallWithManagementSubnet(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().getByResourceGroupWithResponse("rg1", "azurefirewall", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/AzureFirewallGet.json
     */
    /**
     * Sample code: Get Azure Firewall.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void getAzureFirewall(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.azureFirewalls().getByResourceGroupWithResponse("rg1", "azurefirewall", Context.NONE);
    }
}

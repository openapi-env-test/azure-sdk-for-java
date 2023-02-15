// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.PrivateEndpointIpConfiguration;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnection;
import java.util.Arrays;

/** Samples for PrivateEndpoints CreateOrUpdate. */
public final class PrivateEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PrivateEndpointCreateWithASG.json
     */
    /**
     * Sample code: Create private endpoint with application security groups.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createPrivateEndpointWithApplicationSecurityGroups(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .privateEndpoints()
            .define("testPe")
            .withRegion("eastus2euap")
            .withExistingResourceGroup("rg1")
            .withSubnet(
                new SubnetInner()
                    .withId(
                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))
            .withPrivateLinkServiceConnections(
                Arrays
                    .asList(
                        new PrivateLinkServiceConnection()
                            .withPrivateLinkServiceId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                            .withGroupIds(Arrays.asList("groupIdFromResource"))
                            .withRequestMessage("Please approve my connection.")))
            .withApplicationSecurityGroups(
                Arrays
                    .asList(
                        new ApplicationSecurityGroupInner()
                            .withId(
                                "/subscriptions/subId/resourceGroups/rg1/provders/Microsoft.Network/applicationSecurityGroup/asg1")))
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PrivateEndpointCreate.json
     */
    /**
     * Sample code: Create private endpoint.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createPrivateEndpoint(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .privateEndpoints()
            .define("testPe")
            .withRegion("eastus2euap")
            .withExistingResourceGroup("rg1")
            .withSubnet(
                new SubnetInner()
                    .withId(
                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))
            .withPrivateLinkServiceConnections(
                Arrays
                    .asList(
                        new PrivateLinkServiceConnection()
                            .withPrivateLinkServiceId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                            .withGroupIds(Arrays.asList("groupIdFromResource"))
                            .withRequestMessage("Please approve my connection.")))
            .withIpConfigurations(
                Arrays
                    .asList(
                        new PrivateEndpointIpConfiguration()
                            .withName("pestaticconfig")
                            .withGroupId("file")
                            .withMemberName("file")
                            .withPrivateIpAddress("192.168.0.6")))
            .withCustomNetworkInterfaceName("testPeNic")
            .create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/PrivateEndpointCreateForManualApproval.json
     */
    /**
     * Sample code: Create private endpoint with manual approval connection.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createPrivateEndpointWithManualApprovalConnection(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .privateEndpoints()
            .define("testPe")
            .withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withSubnet(
                new SubnetInner()
                    .withId(
                        "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/myVnet/subnets/mySubnet"))
            .withManualPrivateLinkServiceConnections(
                Arrays
                    .asList(
                        new PrivateLinkServiceConnection()
                            .withPrivateLinkServiceId(
                                "/subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/privateLinkServices/testPls")
                            .withGroupIds(Arrays.asList("groupIdFromResource"))
                            .withRequestMessage("Please manually approve my connection.")))
            .withIpConfigurations(
                Arrays
                    .asList(
                        new PrivateEndpointIpConfiguration()
                            .withName("pestaticconfig")
                            .withGroupId("file")
                            .withMemberName("file")
                            .withPrivateIpAddress("192.168.0.5")))
            .withCustomNetworkInterfaceName("testPeNic")
            .create();
    }
}

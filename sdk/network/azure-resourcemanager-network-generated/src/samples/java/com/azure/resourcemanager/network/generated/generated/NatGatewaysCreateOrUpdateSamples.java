// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.NatGatewaySku;
import com.azure.resourcemanager.network.generated.models.NatGatewaySkuName;
import java.util.Arrays;

/** Samples for NatGateways CreateOrUpdate. */
public final class NatGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/NatGatewayCreateOrUpdate.json
     */
    /**
     * Sample code: Create nat gateway.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createNatGateway(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .natGateways()
            .define("test-natgateway")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withSku(new NatGatewaySku().withName(NatGatewaySkuName.STANDARD))
            .withPublicIpAddresses(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/PublicIpAddress1")))
            .withPublicIpPrefixes(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPPrefixes/PublicIpPrefix1")))
            .create();
    }
}

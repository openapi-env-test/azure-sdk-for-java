// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleType;
import java.util.Arrays;

/** Samples for VirtualNetworkGatewayNatRules CreateOrUpdate. */
public final class VirtualNetworkGatewayNatRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-05-01/examples/VirtualNetworkGatewayNatRulePut.json
     */
    /**
     * Sample code: VirtualNetworkGatewayNatRulePut.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void virtualNetworkGatewayNatRulePut(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualNetworkGatewayNatRules()
            .define("natRule1")
            .withExistingVirtualNetworkGateway("rg1", "gateway1")
            .withTypePropertiesType(VpnNatRuleType.STATIC)
            .withMode(VpnNatRuleMode.EGRESS_SNAT)
            .withInternalMappings(
                Arrays.asList(new VpnNatRuleMapping().withAddressSpace("10.4.0.0/24").withPortRange("200-300")))
            .withExternalMappings(
                Arrays.asList(new VpnNatRuleMapping().withAddressSpace("192.168.21.0/24").withPortRange("300-400")))
            .withIpConfigurationId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/gateway1/ipConfigurations/default")
            .create();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.resourcemanager.network.generated.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.generated.models.VpnNatRuleType;
import java.util.Arrays;

/** Samples for NatRules CreateOrUpdate. */
public final class NatRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NatRulePut.json
     */
    /**
     * Sample code: NatRulePut.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void natRulePut(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .natRules()
            .define("natRule1")
            .withExistingVpnGateway("rg1", "gateway1")
            .withTypePropertiesType(VpnNatRuleType.STATIC)
            .withMode(VpnNatRuleMode.EGRESS_SNAT)
            .withInternalMappings(Arrays.asList(new VpnNatRuleMapping().withAddressSpace("10.4.0.0/24")))
            .withExternalMappings(Arrays.asList(new VpnNatRuleMapping().withAddressSpace("192.168.21.0/24")))
            .withIpConfigurationId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/cloudnet1-VNG/ipConfigurations/default")
            .create();
    }
}

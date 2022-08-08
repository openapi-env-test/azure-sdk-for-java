// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.LocalNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkGatewayInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.GatewayCustomBgpIpAddressIpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionMode;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayConnectionType;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySkuName;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySkuTier;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.generated.models.VpnType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualNetworkGatewayConnections CreateOrUpdate. */
public final class VirtualNetworkGatewayConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualNetworkGatewayConnectionCreate.json
     */
    /**
     * Sample code: CreateVirtualNetworkGatewayConnection_S2S.
     *
     * @param manager Entry point to NetworkManager.
     */
    public static void createVirtualNetworkGatewayConnectionS2S(
        com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager
            .virtualNetworkGatewayConnections()
            .define("connS2S")
            .withRegion("centralus")
            .withExistingResourceGroup("rg1")
            .withVirtualNetworkGateway1(
                new VirtualNetworkGatewayInner()
                    .withLocation("centralus")
                    .withTags(mapOf())
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw")
                    .withIpConfigurations(
                        Arrays
                            .asList(
                                new VirtualNetworkGatewayIpConfiguration()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw/ipConfigurations/gwipconfig1")
                                    .withName("gwipconfig1")
                                    .withPrivateIpAllocationMethod(IpAllocationMethod.DYNAMIC)
                                    .withSubnet(
                                        new SubResource()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/GatewaySubnet"))
                                    .withPublicIpAddress(
                                        new SubResource()
                                            .withId(
                                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/gwpip"))))
                    .withGatewayType(VirtualNetworkGatewayType.VPN)
                    .withVpnType(VpnType.ROUTE_BASED)
                    .withEnableBgp(false)
                    .withActive(false)
                    .withSku(
                        new VirtualNetworkGatewaySku()
                            .withName(VirtualNetworkGatewaySkuName.VPN_GW1)
                            .withTier(VirtualNetworkGatewaySkuTier.VPN_GW1))
                    .withBgpSettings(
                        new BgpSettings().withAsn(65514L).withBgpPeeringAddress("10.0.1.30").withPeerWeight(0)))
            .withConnectionType(VirtualNetworkGatewayConnectionType.IPSEC)
            .withLocalNetworkGateway2(
                new LocalNetworkGatewayInner()
                    .withLocation("centralus")
                    .withTags(mapOf())
                    .withId(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/localNetworkGateways/localgw")
                    .withLocalNetworkAddressSpace(new AddressSpace().withAddressPrefixes(Arrays.asList("10.1.0.0/16")))
                    .withGatewayIpAddress("x.x.x.x"))
            .withIngressNatRules(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw/natRules/natRule1")))
            .withEgressNatRules(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw/natRules/natRule2")))
            .withConnectionProtocol(VirtualNetworkGatewayConnectionProtocol.IKEV2)
            .withRoutingWeight(0)
            .withDpdTimeoutSeconds(30)
            .withConnectionMode(VirtualNetworkGatewayConnectionMode.DEFAULT)
            .withSharedKey("Abc123")
            .withEnableBgp(false)
            .withGatewayCustomBgpIpAddresses(
                Arrays
                    .asList(
                        new GatewayCustomBgpIpAddressIpConfiguration()
                            .withIpConfigurationId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw/ipConfigurations/default")
                            .withCustomBgpIpAddress("169.254.21.1"),
                        new GatewayCustomBgpIpAddressIpConfiguration()
                            .withIpConfigurationId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw/ipConfigurations/ActiveActive")
                            .withCustomBgpIpAddress("169.254.21.3")))
            .withUsePolicyBasedTrafficSelectors(false)
            .withIpsecPolicies(Arrays.asList())
            .withTrafficSelectorPolicies(Arrays.asList())
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
